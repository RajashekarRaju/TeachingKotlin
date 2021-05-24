package exceptions.variousExceptions
fun main(){
    // Adding elements
    val numbers = mutableListOf(1, 2, 3)
// Looping through a list [1]
    for (item in numbers) {
// Trying make changes to that list [2]
        numbers.removeAt(1)
    }
}
