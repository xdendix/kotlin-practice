package basic.kotlin.practice

fun hai(firstName: String, lastName: String? = null) {
    if (lastName == null) {
        println("Hai $firstName")
    } else {
        println("Hai $firstName $lastName")
    }
}

fun main() {
    hai("Dendi")
    hai("Dendi", "Prayogo")
    hai("Hidayat")
}