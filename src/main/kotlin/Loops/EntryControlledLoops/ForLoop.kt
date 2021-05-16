package Loops.EntryControlledLoops

/**
 * A loop is a programming structure that repeats a sequence of instructions until a specific condition is met.
 * Entry controlled Loop vs Exit controlled Loop
 * In entry controlled loop the test condition is checked first and if condition is true then block of code will be executed
 * While in exit controlled loop first executes the body of the loop and checks the condition at last
 */

private fun main() {

    val array = arrayOf(1,2,3,4,5)
    /**
     * The for loop used only when we already knew the number of iterations
     * If condition is evaluated "True" body of for loop is executed and again condition is evaluated
     * If condition is evaluated "False" the for loop is terminated
     */
    // looping Numbers using for loop
    for(i in array) {
        println("NUmber $i")
    }

    // looping Characters using for loop
    val string = "Loop"
    for (i in string)
        println(i)

}