package oop_130565_RafaelLesmana.Week07.TM_GameRPGSederhana

fun main() {
    println("\n=== TUGAS: SINGLETON ENGINE ===")
    GameManager.startGame()
    GameManager.startGame()

    println("\n=== TUGAS: FACTORY & ENUM ===")
    println("Drop chance LEGENDARY: ${ItemRarity.LEGENDARY.dropChance}%")

    val myStarterWeapon = Weapon.forgeStarterSword()
    println("Senjata awal dibuat: ${myStarterWeapon.item.name} dengan durability ${myStarterWeapon.durability}")
}