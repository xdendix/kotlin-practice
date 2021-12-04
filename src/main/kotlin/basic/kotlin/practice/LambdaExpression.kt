package basic.kotlin.practice

/**
 * contoh Lambda Expression di Variable
 */

fun upper(value: String): String = value.uppercase()
fun lower(value: String): String = value.lowercase()

fun main() {
    val contohLambda: (String, String) -> String = { firstName: String, lastName: String ->
        val result = "$firstName $lastName"
        result
    }

    val result = contohLambda("Dendi", "Prayogo")
    println(result)

    // contoh Lambda it (berfungsi jika parameter Lambda nya hanya satu)
    val sayHello: (String) -> String = {
        "Hello $it"
    }

    println(sayHello("Hidayat"))

    // contoh Lambda Methode References
    val upperCase: (String) -> String = ::upper
    println(upperCase("Prayogo Hidayat"))

    val lowerCase: (String) -> String = ::lower
    println(lowerCase("Hidayat Prayogo"))
}