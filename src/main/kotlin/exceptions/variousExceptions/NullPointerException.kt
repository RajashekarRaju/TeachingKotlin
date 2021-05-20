package exceptions

fun main() {
    try {
        val a1: String? = null // null value
        println(a1!![0])
    } catch (e: NullPointerException) {
        println("NullPointerException is found in the program.")
    }
}