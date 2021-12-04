package basic.kotlin.practice

fun hallo(firstName: String, lastName: String = "") {
    println("Hallo $firstName $lastName")
}

fun main() {
    hallo("Dendi")
    hallo("Dendi", "Prayogo")
    hallo("Hidayat")
}