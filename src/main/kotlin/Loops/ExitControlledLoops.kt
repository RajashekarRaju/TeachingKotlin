package Loops

/**
 * A loop is a programming structure that repeats a sequence of instructions until a specific condition is met.
 * Entry controlled Loop vs Exit controlled Loop
 * In entry controlled loop the test condition is checked first and if condition is true then block of code will be executed
 * While in exit controlled loop first executes the body of the loop and checks the condition at last
 */

private fun main(){
    var i = 1
    /**
     * A do..while is similar to while loop except that the condition is always executed after the body of the loop
     * The body of the loop is executed first,then it checks the condition.
     * If the condition is true,then it will again execute the body of loop
     * otherwise control is transferred out of the loop
     */
    do{
        println("Number $i")
        ++i
    }while (i <= 5)
}