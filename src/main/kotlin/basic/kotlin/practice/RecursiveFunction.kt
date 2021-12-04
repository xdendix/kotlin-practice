package basic.kotlin.practice

// contoh Rcursive Function
fun main() {
    fun factorialRecursive(value: Int): Int {
        return when (value) {
            1 -> 1
            else -> value * factorialRecursive(value - 1)
        }
    }
    println(factorialRecursive(10))

    // contoh dengan menggunakan perulangan For
    fun factorialLoop(value: Int): Int {
        var result = 1
        for (i in value downTo 1) {
            result *= i
        }
        return result
    }
    println(factorialLoop(10))
}