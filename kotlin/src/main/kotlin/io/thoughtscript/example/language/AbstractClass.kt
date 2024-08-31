package io.thoughtscript.example.language

// No Interfaces here
// By default 'open'
// Can have constructor
abstract class ExampleAbstractClass(a: String, b: String) {
    // Can define state
    var stringVariableA: String = a
    var stringVariableB: String = "stringVariableB - I'm initialized!"
    val stringValue: String = b

    // Method - Function on Class
    fun testA(): Unit {
        println("stringVariable: $stringVariableA, stringValue: $stringValue")
    }
}

// Inherits
class ExampleConcreteClass(a: String, b: String, c: String) : ExampleAbstractClass(a, b) {
    var stringVariableC: String = c

    fun testB(): Unit {
        println("stringVariableB: $stringVariableB, stringVariableC: $stringVariableC")
    }
}

/******************
 *  Run Examples  *
 ******************/

fun abstractClassesExamples(): Unit {
    println("======================== Running abstractClassesExamples ========================")

    val X = ExampleConcreteClass("ExampleConcreteClass.stringVariableA", "ExampleConcreteClass.stringValue", "ExampleConcreteClass.stringVariableC")
    X.testA()
    X.testB()
}
