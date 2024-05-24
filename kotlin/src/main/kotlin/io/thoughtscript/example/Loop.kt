package io.thoughtscript.example

// https://www.geeksforgeeks.org/returns-jumps-and-labels-in-kotlin/
fun labeledLoopReturn(): Unit {
    val twoDimensional = mutableListOf(
            mutableListOf("1", "2", "3", "4", "5"),
            mutableListOf("6", "7", "8", "9", "10"),
            mutableListOf("11", "12", "13", "14", "15"),
            mutableListOf("16", "17", "18", "19", "20")
    )

    // Define a Label as a "breakpoint"
    outerloop@ for (a in twoDimensional) {
        for (b in a) {
            if (b.equals("19")) {
                println("value found breaking to labeled point")
                // Breaks two loops up not one
                break@outerloop
            }
        }
    }
}



