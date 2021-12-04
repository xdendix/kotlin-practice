package basic.kotlin.practice

fun main() {
    tailrec fun display(value: Int) {
        println("Recursive $value")
        if (value > 0) {
            display(value - 1)
        }
    }
    display(10000)
}

