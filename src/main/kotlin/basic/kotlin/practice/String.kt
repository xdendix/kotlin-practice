package basic.kotlin.practice

fun main() {

    val firstName = "Dendi"
    val middleName = "Prayogo"
    val lastName = "Hidayat"
    val address = """
        Jl. Pitara Raya, Gg. Bakti No. 66 Rt.123 Rw.123,
        Pancoran Mas,
        Jawa Barat,
        Indonesia
    """.trimIndent()

    val fullname = "$firstName $middleName $lastName"

    println(fullname)
    println(address)

    val desc: String = "total $fullname char = ${fullname.length}"
    println(desc)
}