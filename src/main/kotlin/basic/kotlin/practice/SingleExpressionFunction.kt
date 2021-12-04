package basic.kotlin.practice

fun perkalian(a: Int): Int = a * 2 // contoh untuk Number

fun hello(name: String): Unit = println("Hello $name") // contoh untuk String

fun main() {
    println(perkalian(10))
    hello("Dendi")
}