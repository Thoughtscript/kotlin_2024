package io.thoughtscript.example

// akin to Ruby on Rails Safe Call Operator
fun safeCall(arg: Any): Unit {
    arg?.let {
        // if not-null then execute this block
        // with reference to obj via 'it'
        println(it)
    }
}

// Note Null has Nothing type when checked for it
fun elvis(arg: Any?): Unit {
    // if null then execute block
    arg?:run {
        println("Null found")
    }
}