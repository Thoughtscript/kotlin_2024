package io.thoughtscript.example.language

// Should just use == or ===
// == by default leverages [Java's] .equals() which has limited referential equality checking
// However, many Kotlin classes will override that and so to gaurantee strictness just use ===
// https://kotlinlang.org/docs/equality.html#structural-equality

fun structuralEqualityTest(a: Any?, b: Any?): Unit {
    // Value Comparison only
    if (a == b) println("$a == $b")
}

fun referetialEqualityTest(a: Any?, b: Any?): Unit {
    // Stricter Referential Equality/Comparison
    if (a === b) println("$a == $b")
}

fun arrayEqualityTest(a: Array<String>, b: Array<String>): Unit {
   if (a.contentEquals(b)) println("Array A has the same elements as Array B")
}

/******************
 *  Run Examples  *
 ******************/

fun comparisonExamples(): Unit {
    println("======================== Running comparisonExamples ========================")

    structuralEqualityTest("a", "a")
    structuralEqualityTest("a", "b")
    structuralEqualityTest("a", null) // no errors are thrown
    structuralEqualityTest(null, null)

    referetialEqualityTest("a", "a")
    referetialEqualityTest("a", "b")
    referetialEqualityTest("a", null) // no errors are thrown
    referetialEqualityTest(null, null)

    arrayEqualityTest(arrayOf("a", "b", "c"), arrayOf("a", "b", "c"))
}
