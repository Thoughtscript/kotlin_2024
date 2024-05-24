package io.thoughtscript.example.language

// no Return
// Unit is the relevant Void equivalent:
// https://www.baeldung.com/kotlin/void-type#:~:text=Nothing%20is%20a%20special%20type,the%20default%20return%20type%20Unit.
fun exampleA(arg: String): Unit {
    println("exampleA: $arg")
}
// Return required with non-Unit Return Type
fun exampleB(arg: String): String {
    return "exampleB: $arg"
}

// No Return required
fun exampleC(arg: String) {
    println("exampleC: $arg")
}

// https://dev.to/nfrankel/the-pitfall-of-implicit-returns-41ln
// Without Braces will implicit Return
fun implicitReturn(arg: String): String = "implicitReturn: $arg"

// Higher Order Functions example
var blockCall = {
    println("blockCall")
}

fun higherOrder( l: () -> Unit) {
    l()
}

/******************
 *  Run Examples  *
 ******************/

fun functionExamples(): Unit {
    println("======================== Running functionExamples ========================")

    exampleA("Unit is Void-like")
    println(exampleB("I am returned"))
    exampleC("I am not returned")
    implicitReturn("I am returned")
    higherOrder(blockCall)
}
