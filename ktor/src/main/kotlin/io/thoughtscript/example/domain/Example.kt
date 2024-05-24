package io.thoughtscript.example.domain

import kotlinx.serialization.Serializable

@Serializable
// var and val inside a data class also restrict mutability
// (even with automatically generated getters and setters)
// As such, not exactly a Java Record either (since it can be mutable)
data class Example(var id: String, var comment: String)

// Define an in-memory store
// https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-list/#kotlin.collections.MutableList
val exampleStorage = mutableListOf<Example>()