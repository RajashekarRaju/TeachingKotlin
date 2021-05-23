package exceptions.variousExceptions

fun age(age:Int){
    if(age<0){
        throw IllegalArgumentException("Age must be greater than 0")
    }
    else{
        println("The age you entered is $age")
    }
}
fun main() {
    age(-21)
}
