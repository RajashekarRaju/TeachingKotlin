package exceptions.variousExceptions

fun main() {
    // Empty list of strings
    // NoSuchElement
    val animals = listOf<String>()
    val animalIterator = animals.iterator()
    animalIterator.next()

}