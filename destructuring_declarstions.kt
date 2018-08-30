/**
 * This example introduces a concept that we call destructuring declarations.
 * It creates multiple variable at once. Anything can be on the right-hand
 * side of a destructuring declaration, as long as the required number of component
 * functions can be called on it.
 * See http://kotlinlang.org/docs/reference/multi-declarations.html#multi-declarations
 */

fun main(args: Array<String>) {
    val pair = Pair(1, "one")

    val (num, name) = pair // 这个语法很神奇之前没用过

    println("num = $num, name = $name")
}

// 一个参数对应一个component1
class Pair<K, V>(val first: K, val second: V) {
    operator fun component1(): K {
        return first
    }

    operator fun component2(): V {
        return second
    }
}