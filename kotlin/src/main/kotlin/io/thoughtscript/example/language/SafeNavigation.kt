package io.thoughtscript.example.language

// akin to Ruby on Rails Safe Navigation
// Safe Call Operator
fun safeCall(arg: Any?): Unit {
    arg?.let {
        // if not-null then execute this block
        // with reference to obj via 'it'
        println("safeCall: $it")
    }
}

// Note Null has Nothing type when checked for it
fun elvis(arg: Any?): Unit {
    // if null then execute block
    arg?:run {
        println("elvis: Null found")
    }
}

fun chainedSafeElvis(arg: Any?): Unit {
    // if null then execute block
    arg?.let {
        // if not-null then execute this block
        // with reference to obj via 'it'
        println("chainedSafeElvis: $it")
    } ?:run {
        println("chainedSafeElvis: Null found")
    }
}

fun nullableExample(): Unit {
    var name: String? = "I'm not Null"
    name = null

    name?:run {
        println("nullableExample: Null assigned to String")
    }
}


/******************
 *  Run Examples  *
 ******************/

fun safeNavigationExamples(): Unit {
    println("======================== Running safeNavigationExamples ========================")

    val testA: String = "testA"
    safeCall(testA)
    elvis(testA)
    chainedSafeElvis(testA)

    // Use Type? to set Null
    val testB: String? = null
    safeCall(testB)
    elvis(testB)
    chainedSafeElvis(testB)

    nullableExample()
}