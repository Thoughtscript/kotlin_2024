package io.thoughtscript.example.language

// Just Interfaces no Abstract Classes here
// By default 'open'
interface ExampleInterfaceA {
    fun testA() // Abstract Method

    // Can define a full Method Body like Java's Abstract Class
    // Can't define state or embellish a constructor though
    fun testB() {
        println("I'm printing $textVal")
    }

    // And define what fields are required
    // Can't initialize these however
    val textVal: String
}

// Inherits
interface ExampleInterfaceB : ExampleInterfaceA {
    fun testC() // Abstract Method

    var textVar: String
}

class ExampleImplementation : ExampleInterfaceB {
    override val textVal: String = "textVal"
    override var textVar: String = "textVar"

    override fun testC() {
        println("I'm printing $textVar")
    }

    override fun testA() {
        println("I'm printing both $textVal and $textVar")
    }
}

/******************
 *  Run Examples  *
 ******************/

fun interfacesExamples(): Unit {
    println("======================== Running interfacesExamples ========================")

    val X = ExampleImplementation()
    X.testA()
    X.testB()
    X.testC()
}
