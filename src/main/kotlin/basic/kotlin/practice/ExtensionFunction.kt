package basic.kotlin.practice

fun String.hello(): String = "Hello $this"

fun String.middleName(): String = this

fun main() {
    val name = "Dendi"
    println(name.hello())

    val middleName = "Prayogo"
    println(middleName.middleName())
}