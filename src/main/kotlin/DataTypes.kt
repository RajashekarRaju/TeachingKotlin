/** DataTypes
 * In Kotlin No need to Specify the Data Type Explicity while declaring the variable
 * Kotlin figured out the types for us, based on how we used them.
 * This is Known as "Type Interface"
 */
 private fun main() {

    //Declaring a variable by giving Datatype Explicitly
    //Integers
    val i: Int = 10

    //strings
    val s: String = "hello"

    //Double
    val d: Double = 17.1

    //while Declaring a Float variable we need to Specify the F at the end of the value as Shown below
    //Float
    val f: Float = 17.1010010101001001010F

    //Char
    val c: Char = 'c'

    //Boolean
    val b: Boolean = true

    //String
    val Multilinestring: String = """
        Welcome  
        To 
        All"""

    println("Print the integer value i:$i")
    println("Print the string value s:$s")
    println("Print the Double value d:$d")
    println("Print the Float value f:$f")
    println("Print the Char value c:$c")
    println("Print the boolean value b:$b")
    println("Print the string value s:$Multilinestring")
}