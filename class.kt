//类
fun main(args:Array<String>) {
	val triangle = Triangle(3.0,4.0,5.0)
	println(triangle.calculateArea())
}

//虚类 求和
abstract class Shape(val sides:List<Double>){
	val perimeter:Double get() = sides.sum()
	abstract fun calculateArea():Double
}

class Triangle(
	var sideA:Double,
	var sideB:Double,
	var sideC:Double
) : Shape(listOf(sideA,sideB,sideC)){
	override fun calculateArea():Double{
		val s = perimeter / 2
		//差值平方
		return Math.sqrt(s*(s-sideA)*(s-sideB)*(s-sideC))
	}
}