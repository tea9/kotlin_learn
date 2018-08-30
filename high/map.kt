/**
 *  Kotlin Standard Library provide component functions for Map.Entry
 */

fun main(args:Array<String>) {
	var map = hashMapOf<String,Int>()
	map.put("hh",1)
	map.put("aa",2)
	map.put("zz",3)

	for ((key,value) in map){
		println("key $key value $value")
	}
}