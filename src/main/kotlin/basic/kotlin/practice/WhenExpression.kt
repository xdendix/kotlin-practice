package basic.kotlin.practice

fun main() {

    val nilaiUjian = 'D'
    when (nilaiUjian) {
        'A' -> println("Great")
        'B' -> println("Good")
        'C' -> println("Not Bad")
        else -> println("Try Again")
    }

    // contoh When Expression Multiple Option
    when (nilaiUjian) {
        'A', 'B', 'C' -> {
            println("Pass")
        }
        else -> {
            println("Not Pass")
        }
    }

    // contoh When Expression In
    val nilaiAkhir = 'D'
    val nilaiLulus = arrayOf('A', 'B', 'C')
    when (nilaiAkhir) {
        in nilaiLulus -> println("Pass")
        !in nilaiLulus -> println("Not Pass")
    }

    // contoh When Expression Is
    val name = "Dendi"
    when (name) {
        is String -> println("Name is String")
        !is String -> println("Name is Not String")
    }

    // contoh When tanda Variable
    val finalValue = 90
    when {
        finalValue > 90 -> println("Great")
        finalValue > 80 -> println("Good")
        finalValue > 60 -> println("Not Bad")
        else -> println("Try Again!")
    }
}