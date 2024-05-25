package io.thoughtscript.example.language

import kotlinx.coroutines.channels.*
import kotlinx.coroutines.*

// function to be launched
suspend fun suspendedFunctionExampleA(text: String): String {
    println("I'm in the returned suspended function with $text")
    return "I'm done: $text"
}

suspend fun suspendedFunctionExampleB(text: String) = coroutineScope {
    println("I'm in the suspended function with no return: $text")
    // No return
}

// https://kotlinlang.org/docs/coroutines-overview.html
// Coroutines are Kotlin's approach to Threading and Asynchronous operations
// Akin to Java's Lightweight Virtual Threads

// See also Scope builder notation: https://kotlinlang.org/docs/coroutines-basics.html#scope-builder
fun spawnExecExample() = runBlocking {

    println("I'm in the blocking scope")

    // Define a Channel like in go
    val channel = Channel<String>()

    // Declare a coroutine block (like a go routine)
    // Spawns a light-weight virtual thread
    // is a Job

    // Use GlobalScope.launch now
    GlobalScope.launch {
        println("I'm in a coroutine")

        // https://kotlinlang.org/docs/composing-suspending-functions.html#concurrent-using-async
        // Conceptually very similar to Launch except it's deferred and can use .await()
        val resultA = async { suspendedFunctionExampleA("exampleA") }.await()
        println("I'm awaited at resultA: $resultA")

        // Concurrent launching - not blocking!
        val resultB = async { suspendedFunctionExampleA("exampleB") }.await()
        val resultC = async { suspendedFunctionExampleA("exampleC") }.await()
        // The documention shows an example where async operations are composed
        // but using the .await() is required to print a returned a value like in the below

        async { suspendedFunctionExampleB("exampleD") }

        // IPC send to channel
        async {
            for (x in 1..10) channel.send("$x")
            channel.close() // close channel
        }

        // Can compose the above without using promises
        println("I'm composed: $resultA, $resultB, $resultC")
    }

    for (y in channel) println("Channel received: $y")
    // Commenting out this line will prevent the blocking scope from printing everything!!
}

/******************
 *  Run Examples  *
 ******************/

fun asynchronousExamples(): Unit {
    println("======================== Running asynchronousExamples ========================")

    spawnExecExample()
}
