package io.thoughtscript.example.language

// By default all Classes can't be inherited from.
// Add the open keyword to allow that.

// Note the constructor in parentheticals
open class ExampleA(a: String, b: String) {
    var stringVariable: String = a
    val stringValue: String = b

    // Method - Function on Class
    fun testA(): Unit {
        println("stringVariable: $stringVariable, stringValue: $stringValue")
    }
}

class ExampleB(a: String, b: String, c: String): ExampleA(a, b) {
    var additionalStringVariable: String = c

    fun testB(): Unit {
        println("stringVariable: $stringVariable, stringValue: $stringValue, additionalStringVariable: $additionalStringVariable")
    }

    // Inner class
    inner class ExampleC(d: String) {
        val additionalStringValue: String = d
        fun testC(): Unit {
            println("stringVariable: $stringVariable, stringValue: $stringValue, additionalStringVariable: $additionalStringVariable, additionalStringValue: $additionalStringValue")
        }
    }
}

open class ImplicitGettersAndSetters() {
    var stringVariable: String = ""
    val stringValue: String = "I'm set already as a val"

    // Method - Function on Class
    fun getFields(): Unit {
        println("stringVariable: $stringVariable, stringValue: $stringValue")
    }
}

/******************
 *  Run Examples  *
 ******************/

fun classExamples(): Unit {
    println("======================== Running classExamples ========================")

    val exampleA = ImplicitGettersAndSetters()
    // Implicit Getters and Setters
    exampleA.stringVariable = "exampleA.stringVariable1"
    exampleA.stringVariable = "exampleA.stringVariable2"

    // Can't set val fields again
    //exampleA.stringValue = "exampleA.stringValue1"
    //exampleA.stringValue = "exampleA.stringValue2"
    exampleA.getFields()

    // Can't call statically like this:
    // ExampleA.getFields()
    // https://www.baeldung.com/kotlin/static-methods
    // Use  @JvmStatic and companion object per: https://github.com/Thoughtscript/cockroachdb-kotlin-client
    ImplicitGettersAndSetters().getFields() // But can call like this - basically a throwaway non-static object

    val exampleB = ExampleA("exampleB.stringVariable", "exampleB.stringValue")
    exampleB.testA()

    val exampleC = ExampleB("exampleC.stringVariable", "exampleC.stringValue", "exampleC.additionalStringVariable")
    exampleC.testA()
    exampleC.testB()

    val exampleD = exampleC.ExampleC("exampleD.additionalStringValue")
    // Doesn't have access to these
    // exampleD.testA() // this doesn't get inherited by exampleD
    // exampleD.testB() // this throws an error

    // https://www.geeksforgeeks.org/kotlin-nested-class-and-inner-class/?ref=lbp this says they have access to Members and Functions
    // But, https://kotlinlang.org/docs/nested-classes.html#inner-classes only says Members
    exampleD.testC()
}


