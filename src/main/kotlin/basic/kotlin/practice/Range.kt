package basic.kotlin.practice

fun main() {

    val jumlah = 1..100

    println(jumlah.count())
    println(jumlah.contains(30))
    println(jumlah.contains(200))
    println(jumlah.first)
    println(jumlah.last)
    println(jumlah.step)

    // contoh Range (DownTo/Kebalikan)
    val jumlah2 = 100 downTo 1

    println(jumlah2.count())
    println(jumlah2.contains(30))
    println(jumlah2.contains(300))
    println(jumlah2.first)
    println(jumlah2.last)
    println(jumlah2.step)

    // contoh Range dengan Step
    val value = 1..300 step 3

    println(value.count())
    println(value.contains(90))
    println(value.contains(400))
    println(value.first)
    println(value.last)
    println(value.step)

    // contoh Range DownTo dengan Step
    val value2 = 300 downTo 1 step 5

    println(value2.count())
    println(value2.contains(150))
    println(value2.contains(300))
    println(value2.first)
    println(value2.last)
    println(value2.step)
}