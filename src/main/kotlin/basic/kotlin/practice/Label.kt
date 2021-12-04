package basic.kotlin.practice

// contoh Label Break
fun labelBreak() {
    loopI@ for (i in 1..10) {
        loopJ@ for (j in 1..10) {
            if (j > 5) {
                break@loopI
            }
            println("$i * $j = ${i * j}")
        }
    }
}

// contoh Label Continue
fun labelContinue() {
    loopI@ for (i in 1..10) {
        loopJ@ for (j in 1..10) {
            if (j == 5) {
                continue@loopI
            }
            println("$i * $j = ${i * j}")
        }
    }
}

// contoh Label Return
fun main() {

    fun test(name: String, operation: (String) -> Unit): Unit = operation(name)

    test("") test@{
        if (it == "") {
            return@test
        } else {
            println("Dendi")
        }
    }

}