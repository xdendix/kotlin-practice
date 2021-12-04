package basic.kotlin.practice

fun main() {

    fun hello(name: String, transformer: (String) -> String): String {
        val nameTransform = transformer(name)
        return "Hello $nameTransform"
    }

    val upper = fun(value: String): String {
        return if (value == "") {
            "UPS"
        } else {
            value.uppercase()
        }
    }

    println(hello("Anonymous", upper))
    println(hello("", upper))

    // Anonymous Function as Parameter
    println(hello("Anonymous Function", fun(value: String): String {
        return value.lowercase()
    }))
}