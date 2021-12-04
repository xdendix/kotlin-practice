package basic.kotlin.practice

fun fullName(name: String?): Unit {
    if (name == null) {
        println("Hello Bro")
    } else {
        println("Hello $name")
    }
}

fun main() {
    fullName(null)
}