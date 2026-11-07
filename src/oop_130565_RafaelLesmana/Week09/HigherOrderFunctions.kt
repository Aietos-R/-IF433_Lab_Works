package oop_130565_RafaelLesmana.Week09

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8)
    println("Original Data: $numbers")
    println("\n==== HOF Filter ===")
    val evens = numbers.filter { it % 2 == 0 }
    println("Evens only: $evens")

    println("\n==== HOF: Map ===")
    val multiplied = evens.map { it * 2 }
    val asStrings = multiplied.map { "Rp ${it}k" }
    println("Multiplied: $multiplied")
    println("Formatted: $asStrings")

}