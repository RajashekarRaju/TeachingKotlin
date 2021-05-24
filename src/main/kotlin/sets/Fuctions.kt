package sets

fun main() {
    val numberSet = setOf(2,4,6,8,10,12)
    val integerSet = setOf(4,8,12,16,20)
    val dataSet = setOf(2,4,5,6,7,8,9,10)
    println(numberSet)
    println(integerSet)

    //count() function returns the number of elements in the set.
    println(numberSet.count())

    //sum() function return the sum of elements in the set.
    println(numberSet.sum())

    //average() function return the average value of the elements in the set.
    println(numberSet.average())

    //sorted() method returns a list of all elements sorted according to their natural sort order.
    println(numberSet.sorted())

    //sortedDescending() method
    // returns a list of all elements sorted descending according to their natural sort order.
    println(numberSet.sortedDescending())

    //reversed() method returns a list with elements in reversed order.
    println(numberSet.reversed())

    //The union operation returns a set containing all distinct elements from both collections.
    val unionSet = numberSet.union(integerSet)
    println("UnionSet : "+unionSet)

    //mapping operation returns a modified list by applying a transform function on each element of the set.
    val mapSet = numberSet.map { e -> e * 2 }
    println("mapSet: "+mapSet)

    //GroupBy method
    val result = dataSet.groupBy { if (it % 2 == 0) "even" else "odd" }
    println(result)

    val nameSet = setOf("Bob", "Rohit", "Madhu", "Richa", "Jessy")
    //Filter
    val filteredValues = nameSet.filter {it.equals("Richa")
    }

    println(filteredValues)
}