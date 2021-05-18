package DataType

/**
 * DataTypes
 * In Kotlin No need to Specify the Data Type Explicity while declaring the variable
 * Kotlin figured out the types for us, based on how we used them.
 * This is Known as "Type Interface"
 */
private fun main() {
    //Declaring a variable by giving Datatype Explicitly

    //Integers
    val integer: Int = 10

    //strings
    val string: String = "hello"

    //Double
    val double: Double = 17.1

    //while Declaring a Float variable we need to Specify the F at the end of the value as Shown below
    //Float
    val float: Float = 17.1010010101001001010F

    //Char
    val character: Char = 'c'

    //Boolean
    val boolean: Boolean = true

    //String
    val multiLineString: String = """
        Welcome  
        To 
        All"""

    println("Print the integer value integer:$integer")
    println("Print the string value string:$string")
    println("Print the Double value double:$double")
    println("Print the Float value float:$float")
    println("Print the Char value character:$character")
    println("Print the boolean value boolean:$boolean")
    println("Print the string value multiLineString:$multiLineString")
}
