package maps

fun main() {

    val pensTopToBottom = mapOf("red pen" to 1, "blue pen" to 2, "black pen" to 3, "green pen" to 4)
    var pen = "blue pen"
    if(pensTopToBottom.containsKey(pen)) {
        println("Yes, it contains pen $pen")
    } else {
        println("No, it does not contain pen $pen")
    }
    val value = 5
    if(pensTopToBottom.containsValue(value)) {
        println("Yes, it contains value $value")
    } else {
        println("No, it does not contain value $value")
    }
}