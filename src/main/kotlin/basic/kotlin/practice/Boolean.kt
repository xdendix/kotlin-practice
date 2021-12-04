package basic.kotlin.practice

fun main() {

    val myTrue = true
    val myFalse = false

    // contoh Logical AND
    println(myTrue && myFalse)
    println(myTrue && myTrue)
    println(myFalse && myTrue)
    println(myFalse && myFalse)

    // contoh Logical OR
    println(myTrue || myFalse)
    println(myTrue || myTrue)
    println(myFalse || myTrue)
    println(myFalse || myFalse)

    // contoh Logical
    println(!myTrue)
    println(!myFalse)
}