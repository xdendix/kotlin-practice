package basic.kotlin.practice

fun main() {

    val nilaiUjian = 90
    val nilaiAbsen = 80
    val nilaiTambahan = 50

    val apakahLulusUjian = nilaiUjian >= 80
    val apakahLulusAbsen = nilaiAbsen >= 80
    val apakahLulusTambahan = nilaiTambahan >= 80

    val apakahLulus = apakahLulusUjian && apakahLulusAbsen && apakahLulusTambahan
    println(apakahLulus)
}