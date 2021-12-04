package basic.kotlin.practice

fun main() {

    val jumlahNama: Array<String> = arrayOf("Dendi", "Prayogo", "Hidayat")
    val jumlahAngka: Array<Int> = arrayOf(10, 20, 30)
    var totalGaji: Array<Int> = arrayOf(3_000_000, 4_000_000, 5_000_000)

    totalGaji.set(2, 7_000_000) // cara merubah Data Index Array

    println(jumlahNama[0])
    println(jumlahAngka[2])
    println(totalGaji[2])

    // contoh Array Nullable
    val names: Array<String?> = arrayOfNulls(5)
    names[0] = "Dendi"
    names[1] = "Prayogo"
    names[2] = "Hidayat"
    names[3] = null
    names[4] = "Andi"

    println(names.size)
}