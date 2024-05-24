package io.example.domain

import kotlinx.serialization.Serializable

@Serializable
data class Example(val id: String, val comment: String)

// Define an in-memory store
// https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-list/#kotlin.collections.MutableList
val exampleStorage = mutableListOf<Example>()