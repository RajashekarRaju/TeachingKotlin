/**
 * Kotlin in Action book - Refer page 18.
 * Atomic Kotlin book - Refer page 26.
 */

// A class with single function named printSomething()
class HelloWorld {

    // In kotlin we use keyword 'fun' for writing a function.
    fun printSomething() {
        println("Hello Kotlin!")
    }
}

// Default main() function for this class.
// This is like entry point, other functions can be invoked by calling inside this function. private fun main() {

    // Access printSomething() function from HelloWorld class
private fun main(){
    // Calling functions from Class - One Way
    HelloWorld().printSomething()

    // Calling functions from Class - Another Way
    val myWorld = HelloWorld()
    myWorld.printSomething()
}

