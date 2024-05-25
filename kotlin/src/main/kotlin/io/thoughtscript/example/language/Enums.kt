package io.thoughtscript.example.language

// https://kotlinlang.org/docs/enum-classes.html#implementing-interfaces-in-enum-classes
enum class ParameterizedEnumExample(val text: String) {
    A("AA"),
    B("BB"),
    C("CC")
}

enum class EnumExample{
    A, B, C
}

/******************
 *  Run Examples  *
 ******************/

fun enumExamples(): Unit {
    println("======================== Running enumExamples ========================")

    println("Iterating Through EnumExample:")
    for (entries in EnumExample.entries) println(entries.toString())

    println("Iterating Through ParameterizedEnumExample:")
    for (entries in ParameterizedEnumExample.entries) println(entries.text)

    // println(ParameterizedEnumExample.valueOf("AA")) // won't lookup by Text value
    println("ParameterizedEnumExample.valueOf(): " + ParameterizedEnumExample.valueOf("A"))
    println("ParameterizedEnumExample.A.name: " + ParameterizedEnumExample.A.name)

    println("EnumExample.valueOf(): " + EnumExample.valueOf("A"))
    println("EnumExample.A.name: " + EnumExample.A.name)
}
