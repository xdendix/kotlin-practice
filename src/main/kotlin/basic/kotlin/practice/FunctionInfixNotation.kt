package basic.kotlin.practice

infix fun String.to(type: String): String {
    return if (type == "UP") {
        this.uppercase()
    } else {
        this.lowercase()
    }
}

fun main() {
    val result = "Dendi Prayogo" to "UP"
    println(result)
}