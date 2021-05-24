package sets

/**
 * Set Indexing
 */
fun main() {

    val players = mutableSetOf(
        "Kieron Pollard", "Trent Boult", "Surya Kumar Yadav", "Malinga",
        "Rohit"
    )

    //Returns the First value in the list
    val w1 = players.elementAt(0)
    println(w1)

    //The indexOf() returns the index of the first players of the word in the set.
    val i1 = players.indexOf("Trent Boult")
    println("The first index of Trent Boult is $i1")

    //The lastIndexOf() returns the index of the last players of the word in the set.
    val i2 = players.lastIndexOf("Trent Boult")
    println("The last index of Trent Boult is $i2")

    println("First element of set players : "+players.first())
    println("Last element of set players : "+players.last())

}