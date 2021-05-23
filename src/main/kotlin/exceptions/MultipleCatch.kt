package exceptions

fun main() {
    try {
        val a: Int = Integer.parseInt(readLine())
        val b: Int = Integer.parseInt(readLine())
        println("The Division of $a and $b is: ${a / b}")
    } catch (exception: NumberFormatException) {
        println("Numbers entered are invalid!!")
    } catch (exception: ArithmeticException) {
        println("Divided by zero!!")
    }

}




