package oop_130565_RafaelLesmana.week04

class ElectricCar(brand: String, numberOfDoors: Int, val batteryCapacity: Int) : Car(brand, numberOfDoors) {

    final override fun honk() {
        super.honk()
    }
    final override fun openTrunk() {
        println("Mobil $brand mempunyai $numberOfDoors pintu dibuka")
    }
     final override fun accelerate() {
        println("$brand berakselerasi dalam sunyi. Kapasitas baterai: $batteryCapacity %.")
    }
}