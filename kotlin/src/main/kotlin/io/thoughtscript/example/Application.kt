package io.thoughtscript.example

import io.thoughtscript.example.*

fun main() {
    // This is automatically bound to Docker console
    println("Hello world!")

    exampleA("exampleA")
    println(exampleB("exampleB"))
    safeCall("safeCall")

    val testA: String = "testA"
    elvis(testA)

    // Use Type? to set Null
    val testB: String? = null
    elvis(testB)

    labeledLoopReturn()
    returnExample("returnExample")
    implicitReturnA("implicitReturnA")

    exampleC("exampleC")
    higherOrder(blockCall)
}