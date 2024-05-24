package io.thoughtscript.example.language

fun arrayIteration(): Unit {
    // Size is fixed
    // Uses size
    val numArr = arrayOf(1, 2, 3, 4)

    for (i in 0..numArr.size-1) {
        // Using "numArr: $numArr[i]" won't print the element
        println("numArr: " + numArr[i])
    }
}

fun listIteration(): Unit {
    // Size isn't fixed with mutableListOf
    // Uses size (same as Array)
    var numList = mutableListOf(1, 2, 3, 4)
    numList.add(5)

    for (i in 0..numList.size-1) {
        // Using "numList: numList[i]" won't print the element
        println("numList: " + numList[i])
    }
}

fun findInList(arg: String): String {
    // Fixed size
    val stringList = listOf("1", "2", "3")

    // Lists also support more complex find operations (Predicates)
    // https://www.baeldung.com/kotlin/lists
    // https://www.baeldung.com/kotlin/finding-element-in-list
    stringList.find{ a -> a.equals(arg) }?.let {
        return "findInList: $it found"
    } ?: run {
        return "findInList: no match found"
    }
}

/******************
 *  Run Examples  *
 ******************/

fun arrayAndListExamples(): Unit {
    println("======================== Running arrayAndListExamples ========================")

    arrayIteration()
    listIteration()
    println(findInList("3"))
    println(findInList("5"))
}
