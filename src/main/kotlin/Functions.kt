/**
 * Kotlin in Action book - Refer page 18.
 * Atomic Kotlin book - Refer page 26.
 *
 *
 * Difference between arguments and parameters.
 *
 * If you are creating a new function, you are adding parameters.
 * If your are calling or invoking a function, then you have to pass arguments.
 */

class Functions {

    // Function with name 'person' with a single parameter 'name' of type String.
    fun person(name: String) {
        println(name)
    }

    // Function with name 'alien' with two parameters of type Int and Boolean.
    fun alien(numberOfLegs: Int, hasMouth: Boolean) {
        println("Number of legs are " + numberOfLegs)
        println("Does alien has mouth? " + hasMouth)
    }

    // Let's find total number of ancestors and let function return them with type Int
    fun simpleAncestors(): Int {
        val totalAncestorsFound = 365
        return totalAncestorsFound
    }

    // Not every ancestor is cool, but we should find them using a function which will
    // return a string which has information about those we found.
    fun ancestors(didTheyExist: Boolean, areTheyCool: Boolean): String {
        if (didTheyExist && areTheyCool) {
            return "They were existed and they are cool."
        } else {
            return "They never existed and they are not cool."
        }
    }
}

private fun main() {

    // Now Function class is used as an object. Initialized to variable functions.
    // We use this initialized function variable to call properties from it's class.
    val functions = Functions()

    // Call function 'person' which needs argument of type String.
    functions.person("Raj")

    // Call function 'alien' which needs arguments of type Int and Boolean.
    functions.alien(12, false)

    // Call function 'simpleAncestors' and assign it to another variable.
    // Variable 'ancestors' has the functions return value which is Int.
    val ancestors = functions.simpleAncestors()
    println(ancestors)

    // Call function 'ancestors' and assign it to another variable.
    // Variable 'ancestorsInformation' has the functions return value which is String.
    val ancestorsInformation = functions.ancestors(true, true)
    println(ancestorsInformation)
}