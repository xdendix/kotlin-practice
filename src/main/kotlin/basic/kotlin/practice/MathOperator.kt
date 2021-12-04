package basic.kotlin.practice

fun main() {

    val value = 10 / 2
    println(value)

    val value2 = 10 + 10 / 2
    println(value2)

    // contoh Augmented Assignment
    var total = 300

    val barang1 = 100
    total += barang1

    val barang2 = 200
    total += barang2

    val barang3 = 300
    total += barang3

    println(total)

    // contoh Unary Operator
    total++ // total = total + 1
    total++ // total = total + 1
    total-- // total = total - 1
    println(total)
}