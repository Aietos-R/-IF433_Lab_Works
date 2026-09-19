package oop_130565_RafaelLesmana.week04

open class Vehicle(val brand: String) {
    var speed: Int = 0

    open fun accelarate() {
        speed += 10
        println("$brand melaju, kecepatan : $speed km/jam")
    }

    open fun honk() {
        println("Beep Beep 1")
    }
}