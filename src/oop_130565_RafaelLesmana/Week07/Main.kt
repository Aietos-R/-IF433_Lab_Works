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

    println("\n--- Test Data Class ---")
    val data1 = DataUser("Alice", 22)
    val data2 = DataUser("Alice", 22)
    println(data1)
    println("Sama ? ${data1 == data2}")

    val data3 = data1.copy(age = 23)
    println("Hasil Copy : $data3")

    val (userName, userAge) =  data1
    println("Destructuring : $userName berumur $userAge")
}