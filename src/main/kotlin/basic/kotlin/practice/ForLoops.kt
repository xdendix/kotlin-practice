package basic.kotlin.practice

// contoh For Array
fun main() {

    val names = arrayOf("Dendi", "Prayogo", "Hidayat")

    var total = 0
    for (name in names) {
        println(name)
        total++ // menghitung total Nilai Array
    }
    println("Total Perulang = $total")

    // contoh For Range (Increment/Kenaikan)
    for (value in 1..100) {
        println(value)
    }

    // contoh For Range (Decrement/Penurunan dengan Step)
    for (value in 100 downTo 0 step 2) {
        println(value)
    }

    // contoh For Range Combine dengan Array
    val ukuranArray = names.size -1
    for (i in 0..ukuranArray) {
        println("Index $i = ${names[i]}")
    }
}