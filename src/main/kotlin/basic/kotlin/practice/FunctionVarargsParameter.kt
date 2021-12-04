package basic.kotlin.practice

fun hitungTotal(vararg values: Int): Int {
    var total = 0

    for (value in values) {
        total += value
    }

    return total
}

fun main() {
    val result = hitungTotal(10, 10, 10)
    println(result)
}