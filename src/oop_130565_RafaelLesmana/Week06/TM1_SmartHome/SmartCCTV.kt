package oop_130565_RafaelLesmana.Week06.TM1_SmartHome

class SmartCCTV ( override val id: String, override val name: String) : SmartDevice, Switchable, Recordable {
    override fun turnOn() {
        println("[$name] CCTV dinyalakan")
        startRecord()
    }

    override fun turnOff() {
        println("[$name] CCTV dimatikan")
        stopRecord()
    }

    override fun startRecord() {
        println("[$name] CCTV mulai merekam dan menyimpan ke Cloud")
    }
}