package io.thoughtscript.example.language

fun exampleA(): Unit {
    // Can't be val
    lateinit var msg: String  // Can't be initialized
    msg = "My initialization comment" // Placeholder for lengthy or asynchronous assignment
    println("exampleA - I'm initialized with $msg")
}

class Example() {
    lateinit var msg: String  // Can't be initialized

    // Method - Function on Class
    fun isInitializedExample(): Unit {
        msg = "I'm initialized" // Placeholder for lengthy or asynchronous assignment

        // Supports :: and .isInitialized in Classes
        if (::msg.isInitialized) {
            println("exampleB - I'm initialized with $msg")

        } else {
            println("var name is not initialized yet")

        }
    }
}


/******************
 *  Run Examples  *
 ******************/

fun lazyInitializationExamples(): Unit {
    println("======================== Running lazyInitializationExamples ========================")
    exampleA()
    exampleA()

    val exampleB = Example()
    exampleB.isInitializedExample()
}