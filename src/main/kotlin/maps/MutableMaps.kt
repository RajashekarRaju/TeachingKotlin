package maps

fun main() {

    // creating a general map using mapOf() function
    val generalMap = mapOf("Rank" to 1, 1 to "First", 'A' to "Excellent")

    // creating a specific map using mapOf<K, V>() function
    val specificMap = mapOf<String, Int>("Java" to 90, "C++" to 70, "Python" to 80)
    println(generalMap)
    println(specificMap)
}