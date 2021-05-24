package exceptions

fun main() {
    try {
        try {
            var a: Int = Integer.parseInt(readLine())
            var b: Int = Integer.parseInt(readLine())
            println("Result of division is: ${a / b}")
        } catch (exception: NumberFormatException) {
            println("Enter valid inputs!!")
        }
    } catch (exception: ArithmeticException) {
        println("Division by zero is not allowed!!")
    }
}


