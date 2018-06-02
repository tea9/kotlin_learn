//习惯用法
//https://www.kotlincn.net/docs/reference/idioms.html
//创建DTOs
data class Customer(val name:String,val email:String)
//https://www.kotlincn.net/docs/reference/idioms.html
/**
-getters setters
-equals()
-hashCode()
-toString()
-copy()
-component1 component2
**/
//函数的默认参数
fun foo(a:Int = 0,b:String=""){}
//过滤list
val positives = list.filter{x->x>0}
val positives = list.fileter{it >0}
//字符串模版
println("Name $name")
//类型判断
when(x){
	is Foo 
	is Bar
	else
}
fun describe(obj:Any):String = 
when(obj){
	1 -> "One"
	"Hello"->"Greeting"
	is Long -> "Long"
	!is String->"Not a string"
	else->"Unknown"
}
//循环
for ((k,v) in map){
	println('$k -> $v')
}
//区间
for(i in 1..100){} //包含100
for(i in 1 until 100){}//不包含100
for(x in 2..10 step 2){}
for(x in 10 downTo 1){}
if(x in 1..10){}
//只读list
val list = listOf("a","b","c")
//只读map
val map = mapOf("a" to 1,"b" to 2,"c" to 3)
//访问map
println(map["map"])
map["key"]=value
//延迟属性
val p:String by lazy{
	//计算该字符串
}
//扩展函数
fun String.spaceToCamelCase(){}
"Convert this to camelcase".spaceToCamelCase()
//创建单例
object Resource{
	val name = "Name"
}
//非空判断
val files =File("Test").listFiles()
println(files?.size)
//非空判断判断
println(files?.size?:"empty")

//空移除
val values = ...
val email = values["email"]?:throw IllegalStateException("Email is missing!")
//空集合取第一个
val emails = ...//可能空
val mainEmail = emails.firstOrNull()?:""
//不为空执行
val value = ...
value?.let{
	//如果data不空就会执行到这里
}
//map可空的 如果空就默认值
val value = ...
val mapped = value?.let{transformValue(it)}?:defaultvalueIsNull

//返回when
fun transform(color:String):Int{
	return when(color){
		"Red" -> 0
		"Green"->1
		"Blue"->2
		else->throw IllegalArgumentException("Invalid color param value")
	}
}
//异常
fun test() {
	val result = try{
		count()
	} catch(e:ArithmeticException){
		throw IllegalStateException(e)
	}
}
//if
fun foo(param:Int){
	val result = if(param==1){
		"one"
	}else if(param==2){
		"two"
	} else{
		"three"
	}
}
//Builder风格返回Unit 
fun arrayOfMinusOnes(size:Int):IntArray{
	return IntArray(size).apply{fill(-1)}
}
//函数简写
fun theAnswer()=42
fun theAnswer():Int{
	return 42
}
//和when简写
fun transform(color:String):Int=when(color){
	"Red"->0
	"Green"->1
	"Blue"->2
	else->throw IllegalArgumentException("Invalid color param value")
}
//with 内部调用方法
class Turtle{
	fun penDown()
	fun penUp()
	fun turn(degrees:Double)
	fun forward(pixels:Double)
}
val myTurtle = Turtle()
with(myTurtle){//画一个100像素的正方形
	penDown()
	for(i in 1..4){
		forward(100.0)
		turn(90.0)
	}
	penUp()
}
//java7资源处理
val stream = Files.newInputStream(Paths.get("/some/file.txt"))
stream.buffered().reader().use{
	reader ->
	println(reader.readText())
}
//泛型
//java
//public final class Gson {
//	public <T> T fromJson(JsonElement json,Class<T> classOfT) throws
//JsonSyntaxException{

//kotlin
inline fun <reified T:Any>Gson.fromJson(json:JsonElement):T=this.fromJson(json,T::class.java)

//可空布尔
val b:Boolean?=...
if(b == true){

	} else{
		//'b'是false 或者 null
	}














