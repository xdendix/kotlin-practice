package basic.kotlin.practice

/**
 * contoh Higher-Order Function
 */

fun main() {
    fun hello(name: String, transformer: (String) -> String): String {
        val nameTransform = transformer(name)
        return "Hello $nameTransform"
    }

    val lambdaUpper = { value: String -> value.uppercase() }
    println(hello("Dendi", lambdaUpper))

    println(hello("Dendi", { value: String -> value.lowercase() }))

    val value1 = hello("Prayogo Hidayat", { value: String -> value.uppercase() })
    val value2 = hello("Hidayat Prayogo") { value: String ->
        value.lowercase() // contoh menggunakan Trailing Lambda
    }

    println(value1)
    println(value2)
}