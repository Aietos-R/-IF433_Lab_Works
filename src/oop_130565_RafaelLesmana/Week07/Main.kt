package oop_130565_RafaelLesmana.Week07

fun main() {
    println("=== Test Singleton ===")
    println("Status : ${DatabaseManager.connectionStatus}")
    DatabaseManager.connect()

    println("\n=== Test Companion Object ===")
    val client = NetworkClient.createClient()
    client.connect()

    println("\n--- Test Reguler Class ---")
    val req1 = RegulerUser("Alice", 22)
    val req2 = RegulerUser("Alice", 22)
    println(req1)
    println("Sama ? ${req1 == req2}")
}