package sets

/**
 * Atomic kotlin - 145
 *
 * Set is a generic unordered collection of elements that does not support duplicate elements.
 *
 */

fun main() {

    //Declaring a set with all types
    val mySet1: Set<Any> = setOf(1,3.123,"S","Hello")

    println("Display the values in set")

    //lets print the elements in the set
    for (elemnts in mySet1){
        println(elemnts)
    }

    //Set stores only unique Elements.
    val mySet2: Set<Int> = setOf(1,2,3,3,4,4,4)

    //lets print the elements in the set
    println("Set stores unique elements : ")
    for(elements in mySet2){
        println("$elements  ")
    }

    //let's see some fuctions

    //contains Function
    println("mySet2 contain the element 2 or not :" +mySet2.contains(2))

    //containsall Fuction
    println("myset1 contain the all the elements in the myset2 :")
    println(mySet1.containsAll(mySet2))

    //isEmpty Function
    println("Is myset2 is empty : " +mySet2.isEmpty())

    //
}



