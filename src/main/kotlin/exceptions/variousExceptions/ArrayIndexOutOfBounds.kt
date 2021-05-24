package exceptions


fun main() {
    var list = listOf(1,2,3)
    //println(list[4])
    try{
        println(list[4])
    }catch (e:ArrayIndexOutOfBoundsException){
        println(e)
    }
}