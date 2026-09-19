package oop_130565_RafaelLesmana.week04

class ElectricCar(brand: String, val numberOfDoors: Int, val batteryCapacity: Int) : Vehicle(brand) {
     final override fun accelerate() {
        println("$brand berakselerasi dalam sunyi. Kapasitas baterai: $batteryCapacity %.")
    }
}