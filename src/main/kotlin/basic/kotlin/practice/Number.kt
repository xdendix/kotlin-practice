package basic.kotlin.practice

fun main() {
    // contoh Tipe Data Integer Number
    val age: Byte = 28
    val height = 200
    val distance: Short = 3000
    val balance = 9000000L

    println(age)
    println(height)
    println(distance)
    println(balance)

    // contoh Tipe Data Floating Point
    val value = 30.30F // gunakan tanda F dibelakang nilai untuk Tipe Data Float
    val radius = 123123.123123 // tanpa tanda apapun untuk Tipe Data Double

    println(value)
    println(radius)

    // contoh Literals
    val decimal = 300
    val hexadecimal = 0xFF // gunakan tanda 0x untuk Hexadecimal
    val binary = 0b0101001 // gunakan tanda 0b untuk binary

    println(decimal)
    println(hexadecimal)
    println(binary)

    // contoh Underscore (tanda sebagai pemisah diantara angka satu dengan yang lainnya)
    val value1: Byte = 3_0
    val value2 = 3_00
    val value3: Short = 3_000
    val value4 = 3_000_000_000L

    println(value1)
    println(value2)
    println(value3)
    println(value4)

    // contoh Conversion
    val binary1 = 0b01010101
    println(binary1)

    val price = 9_000_000_000L
    println(price)

    val priceInt: Int = price.toInt()
    println(priceInt)

    val doubleBinary: Double = binary.toDouble()
    println(doubleBinary)
}