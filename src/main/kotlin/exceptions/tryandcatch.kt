package exceptions

fun main() {
    tryandcatch()
    tryandcatchasExpression()

}
fun tryandcatch(){
    val a: Int = 101
    val b: Int = 0
    try {
        println("Division of $a and $b is: ${a/b}")
    }catch (exception: ArithmeticException){
        println("$a and $b cannot be divided!!")
    }
}
fun tryandcatchasExpression(){
    val a: Int = 100
    val b: Int = 10
    val res: Int = try {
        a/b
    }catch (exception: ArithmeticException){
        -1
    }
    println("The result is: $res")
}