package io.thoughtscript.example

// no Return
// Unit is the relevant Void equivalent:
// https://www.baeldung.com/kotlin/void-type#:~:text=Nothing%20is%20a%20special%20type,the%20default%20return%20type%20Unit.
fun exampleA(arg: String): Unit {
    println(arg)
}

fun exampleC(arg: String) {
    println(arg)
}

// Return required
fun exampleB(arg: String): String {
    return arg
}

// https://dev.to/nfrankel/the-pitfall-of-implicit-returns-41ln
fun returnExample(who: String): String {
    return "Hello $who"
}

// Without Braces will implicit Return
fun implicitReturnA(who: String): String = "Hello $who"

var blockCall = {
    println("test")
}

fun higherOrder( l: () -> Unit) {
    l()
}