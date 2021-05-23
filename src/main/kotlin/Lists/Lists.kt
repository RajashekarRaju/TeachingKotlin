package Lists

/**
 * Atomic Kotlin - 126
 * Kotlin in Action  - 44
 *a list is a collection at which an object that holds other objects.
 * lists are the part of an standard kotlin pacakage.so they dont reqiure any import.
 */

fun main(){
    val numbers = listOf<Int>(1,2,3,4,5)
    val string = mutableListOf("one","two","three","four")
    val list = listOf(1,2,3,"rufi","latha","manju")
    println(numbers)
    println(string)
    println(list)
    println(list.size)
    println(list.indexOf("rufi"))
    string.removeAt(2)
    val stringvalue = listOf<String>("list of string elements","first","second")
    println(stringvalue)
    val charvalue  = listOf<Char>('s','r','a','v','a','n','t','h','i')
    println(charvalue)



}

