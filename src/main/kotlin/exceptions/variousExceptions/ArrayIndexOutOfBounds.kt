package exceptions

fun ArrayIndexOutOfBounds() {
    var list = listOf(1,2,3)
    //println(list[4])
    try{
        println(list[4])
    }catch (e:ArrayIndexOutOfBoundsException){
        println(e)
    }
}
fun main() {
    ArrayIndexOutOfBounds()
}