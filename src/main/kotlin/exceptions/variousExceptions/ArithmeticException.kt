package exceptions



fun main() {
    //val i=10/0
    try{
        val i = 10/0

    }catch (e:ArithmeticException){
        println("Number cannot be divided by zero")
    }
}