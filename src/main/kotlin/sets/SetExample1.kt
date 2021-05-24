package sets

fun main() {
//Declaring a set with all types
    val mySet: Set<Any> = setOf(1,3.123,"S","Hello",1)

    println("Display the values in set")

    //lets print the elements in the set
    //Set removes duplicate values
    for (elements in mySet){
        println(elements)
    }

    //read-only set is created with setOf() function.
    val numbers = setOf(10, 12, 22, 14, 18, 20)
    println(numbers)


}