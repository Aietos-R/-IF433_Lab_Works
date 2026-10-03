package oop_130565_RafaelLesmana.Week06.TM1_SmartHome

interface SmartDevice {
    val id: String
    val name: String
}

interface Switchable {
    fun turnOn()
    fun turnOff()
}

interface Recordable {
    fun startRecord()
    fun stopRecord(){
        println("Perekaman dihentikan dan disimpan ke Cloud")
    }
}