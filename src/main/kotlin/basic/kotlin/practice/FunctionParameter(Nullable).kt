package basic.kotlin.practice

fun hello(firstName: String, lastName: String?) {
    if (lastName == null) {
        println("Hallo $firstName")
    } else {
        println("Hallo $firstName $lastName")
    }
}

fun main() {
    hello("Dendi", "Prayogo")
    hello("Dendi", null)
    hello("Dendi", "Hidayat")
}