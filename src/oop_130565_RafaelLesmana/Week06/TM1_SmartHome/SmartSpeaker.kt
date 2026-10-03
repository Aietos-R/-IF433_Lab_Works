package oop_130565_RafaelLesmana.Week06.TM1_SmartHome

class SmartSpeaker(override val id: String, override val name: String) : SmartDevice, Switchable {
    override fun turnOn() {
        println("[$name] Speaker dinyalakan")
    }

    override fun turnOff() {
        println("[$name] Speaker dimatikan")
    }

    fun playMusic(song: String) {
        println("Memutar lagu $song dari Spotify")
    }
}