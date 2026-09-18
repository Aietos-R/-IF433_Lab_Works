package oop_130565_RafaelLesmana.week03.Toko_Senjata

fun main() {
    val weapon = Weapon("Excalibur")

    weapon.damage = -50
    println("Damage : ${weapon.damage}")

    weapon.damage = 9999
    println("Damage : ${weapon.damage}")
    println("Tier senjata: ${weapon.tier}")
}