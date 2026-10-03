package oop_130565_RafaelLesmana.Week06.TM1_SmartHome

class SmartLamp(override val id: String, override val name: String) : SmartDevice, Switchable {
    override fun turnOn() {
        println("[$name] Lampu dinyalakan")
    }

    override fun turnOff() {
        println("[$name] Lampu dimatikan")
    }
}