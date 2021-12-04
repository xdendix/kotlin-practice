package basic.kotlin.practice

fun main() {
    tailrec fun recursiveTailrec(value: Int, total: Int = 1): Int {
        return when (value) {
            1 -> total
            else -> recursiveTailrec(value - 1, total * value)
        }
    }
    println(recursiveTailrec(10000))
}