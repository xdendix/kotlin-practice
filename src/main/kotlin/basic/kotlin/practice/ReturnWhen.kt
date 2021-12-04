package basic.kotlin.practice

fun main() {
    fun sayHello(name: String = ""): String {
        return when (name) {
            "" -> "Hello Bro"
            else -> "Hello $name"
        }
    }

    println(sayHello())
    println(sayHello("Dendi Prayogo"))
}

