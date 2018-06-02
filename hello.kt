//基本语法
import java.lang.Integer.parseInt

//定义函数
fun sum(a:Int,b:Int):Int {
	return a + b
}
//一句话函数
fun sum1(a:Int,b:Int)=a+b
//没有返回值
fun printSum(a:Int,b:Int):Unit{
	println("sum of $a and $b is ${a+b}")
}
//if表达式
fun maxOf(a:Int,b:Int)=if(a>b)a else b
//空判断
fun printProduct(arg1:String,arg2:String){
	val x=parseInt(arg1)
	val y=parseInt(arg2)

	// 直接使用 `x * y` 会导致编译错误，因为他们可能为 null
	if (x!=null && y!=null){
		// 在空检测后，x 和 y 会自动转换为非空值（non-nullable）
		println(x*y)
	}
	else {
		println("either '$arg1' or '$arg2' is not a number")
	}
}
//空判断
fun printProduct1(arg1:String,arg2:String){
	val x=parseInt(arg1)
	val y=parseInt(arg2)

	// ……
	if (x == null) {
	    println("Wrong number format in arg1: '$arg1'")
	    return
	}
	if (y == null) {
	    println("Wrong number format in arg2: '$arg2'")
	    return
	}

	// 在空检测后，x 和 y 会自动转换为非空值
	println(x * y)
}
//类型转换
fun getStringLength(obj:Any):Int?{
	if (obj is String){
		return obj.length
	}
	return null
}
fun getStringLength1(obj:Any):Int?{
	if (obj !is String) return null
	return obj.length
}
fun getStringLength2(obj:Any):Int?{
	if (obj is String && obj.length>0) {
		return obj.length
	}
	return null
}


fun main(args: Array<String>) {
//循环
val items = listOf("apple","banana","kiwifruit")
for (index in items.indices) {
	println("item at $index is ${items[index]}")
}

}