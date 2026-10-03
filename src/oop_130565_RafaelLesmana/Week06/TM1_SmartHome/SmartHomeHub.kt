package oop_130565_RafaelLesmana.Week06.TM1_SmartHome

class SmartHomeHub {
    val devices = mutableListOf<SmartDevice>()
    fun addDevice(device: SmartDevice) {
        devices.add(device)
        println("Perangkat ${device.name} berhasil ditambahkan ke Smart Home Hub")
    }

    fun turnOffAllSwitches() {
        for (device in devices) {
            if (device is Switchable) {
                device.turnOff()
            }
        }
    }
    fun activateSecurityMode() {
        for (device in devices) {
            if (device is Recordable) {
                device.startRecord()
            }
            if (device is SmartSpeaker) {
                device.playMusic("Security Alert")
            }
        }
    }
}