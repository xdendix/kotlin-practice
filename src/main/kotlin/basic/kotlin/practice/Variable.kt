package basic.kotlin.practice

// contoh Variable Constant
const val APPLICATION = "Kotlin Practice Basic"
const val VERSION = "0.0.1"

fun main() {
    // contoh Mutable (data bisa diubah)
    var firstName = "Dendi"
    var middleName = "Prayogo"
    var lastName = "Hidayat"

    middleName = "Prayoga"

    println(firstName)
    println(middleName)
    println(lastName)

    // contoh Immutable (data tidak bisa diubah)
    val namaPertama = "Dendy"
    val namaTengah = "Prayogo"
    val namaBelakang = "Hidayat"

    val fullName = "$namaPertama $namaTengah $namaBelakang"
    println(fullName)

    // contoh Nullable
    var nama: String? = "Saya"
    nama = null

    println(nama?.length)

    // contoh Variable Constant
    println("$APPLICATION $VERSION")
}