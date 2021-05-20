package exceptions

fun main() {
    Finally()
}
fun Finally(){
    try {
        val a: Int = 10
        val b: Int = 5
        println("Division of $a and $b results in: ${a/b}")
    }catch (exception: ArithmeticException) {
        println("Division by zero!!")
    }
    finally {
        println("Finally block is always executed.")
    }
}