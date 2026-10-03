package oop_130565_RafaelLesmana.Week06.TM1_SmartHome

fun main() {
    val lampu = SmartLamp(id = "L01", name = "Ruang Tamu")
    val speaker = SmartSpeaker(id = "S01", name = "Google Nest Dapur")
    val cctv = SmartCCTV(id = "C01", name = "Ezviz Garasi")

    val hub = SmartHomeHub()
    hub.addDevice(lampu)
    hub.addDevice(speaker)
    hub.addDevice(cctv)

    println("=== Mengaktifkan Security Mode ===")
    hub.activateSecurityMode()

    println("\n=== Mematikan Semua Perangkat ===")
    hub.turnOffAllSwitches()
}