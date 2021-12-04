@file:Suppress("NAME_SHADOWING")

package basic.kotlin.practice

// contoh Break
fun main() {
    var i = 0
    while (true) {
        println("Perulangan ke $i")
        i++
        if (i > 1000)
            break
    }

    // contoh Continue
    for (i in 1..1000) {
        if (i % 2 == 0) {
            continue
        }
        println("Angka $i")
    }
}