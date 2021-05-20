package exceptions

fun main(){
    try {
        // "Test" is not a number
        val n = "Test".toInt()
        println(n)
    } catch (e: NumberFormatException) {
        println("Number format exception")
    }
}