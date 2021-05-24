package sets

fun main() {
    //Declaring a mutableset with all types
    val mutableSet = mutableSetOf(1, "a", "Developers", 12.3)

    println("Display the values in set")

    //lets print the elements in the set
    println(mutableSet)

    //using add() function you can add elements from mutable set.
    mutableSet.add(2)
    mutableSet.add(3)
    println(mutableSet)

    //using remove() fuction you can remove elements from mutable set
    mutableSet.remove(12.3)
    println(mutableSet)

    //using list of function to add elements to the mutableset.
    mutableSet += listOf(4, 5)
    println(mutableSet)
}