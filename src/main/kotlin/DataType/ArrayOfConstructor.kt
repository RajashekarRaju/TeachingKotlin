package DataType

fun main()
{
    val arrayName = Array(5, {i->i*1})
    for(i in 0..arrayName.size-1)
    {
        println(arrayName[i])
    }
}
