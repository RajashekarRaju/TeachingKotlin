package Loops.EntryControlledLoops

/**
 * A loop is a programming structure that repeats a sequence of instructions until a specific condition is met.
 * Entry controlled Loop vs Exit controlled Loop
 * In entry controlled loop the test condition is checked first and if condition is true then block of code will be executed
 * While in exit controlled loop first executes the body of the loop and checks the condition at last
 */

private fun main() {

    var i = 1
    /**
     * The while loop used only when the number of iterations are not exactly known
     * If condition is evaluated "True" body of for loop is executed and again condition is evaluated
     * If condition is evaluated "False" the control goes out of the loop
     */
    while (i <= 5) {
        println("Number $i")
        ++i
    }

}