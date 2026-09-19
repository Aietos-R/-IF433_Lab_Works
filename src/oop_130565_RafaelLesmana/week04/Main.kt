package oop_130565_RafaelLesmana.week04

fun main() {
    println("--- Testing Vehicle ---")
    val generableVehicle = Vehicle("Sepeda onthel")
    generableVehicle.honk()
    generableVehicle.accelerate()

    println("\n --- Testing Car --- ")
    val myCar = Car("Toyota", 4)
    myCar.openTrunk()
    myCar.honk()
    myCar.accelerate()
}