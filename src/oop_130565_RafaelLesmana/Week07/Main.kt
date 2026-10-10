package oop_130565_RafaelLesmana.Week07

fun main() {
    println("=== Test Singleton ===")
    println("Status : ${DatabaseManager.connectionStatus}")
    DatabaseManager.connect()

    println("\n=== Test Companion Object ===")
    val client = NetworkClient.createClient()
    client.connect()
}