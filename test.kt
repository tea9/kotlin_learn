import java.io.File;

fun main(args:Array<String>){
val files = File("Test").listFiles()
println(files?.size)
}