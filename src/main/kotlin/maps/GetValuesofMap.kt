package maps

fun main() {

    val ranks = mapOf(1 to "K V R", 2 to "Indus", 3 to "St Joseph's", 4 to    "Keshava Redddy")
    // method 1
    println("School having rank #1 is: "+ranks[1])
    // method 2
    println("School having rank #3 is: "+ranks.getValue(3))
    // method 3
    println("School having rank #4 is: "+ranks.getOrDefault(4, 0.toString()))
    // method 4
    val school = ranks.getOrElse(2, {0})
    println(school)
}