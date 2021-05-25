package maps

fun main() {

    val animals = mapOf(1 to "Lion", 2 to "Tiger", 3 to "Elephant", 4 to "Rabbit")

    animals.forEach { t, u ->
        println("Map $t to the $u")
    }
}