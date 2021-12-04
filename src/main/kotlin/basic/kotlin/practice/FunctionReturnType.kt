package basic.kotlin.practice

fun value(a: Int, b: Int): Int {
    val total = a + b
    return total
}

// contoh untuk pembagian nol (0)
fun bagi(a: Int, b: Int): Int {
    return if (b == 0) {
        0
    } else {
        val result = a / b
        result
    }
}

fun main() {
    println(value(100, 100))

    val result = value(300, 300)
    println(result)

    println(bagi(100, 0))
}
