package exceptions.variousExceptions

fun main() {
    // Can never add more elements
    val numbers: List<String> = listOf("one", "two", "three")
    val moreNumbers = numbers as MutableList<String>
    numbers.add("four")
    println(moreNumbers)
}