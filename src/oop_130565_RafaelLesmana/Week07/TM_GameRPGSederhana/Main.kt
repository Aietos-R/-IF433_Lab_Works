package oop_130565_RafaelLesmana.Week07.TM_GameRPGSederhana

fun main() {
    println("\n=== TUGAS: SINGLETON ENGINE ===")
    GameManager.startGame()
    GameManager.startGame()

    println("\n=== TUGAS: FACTORY & ENUM ===")
    println("Drop chance LEGENDARY: ${ItemRarity.LEGENDARY.dropChance}%")

    val myStarterWeapon = Weapon.forgeStarterSword()
    println("Senjata awal dibuat: ${myStarterWeapon.item.name} dengan durability ${myStarterWeapon.durability}")

    println("\n=== TUGAS: BATTLE SIMULATION & IMMUTABILITY ===")
    val upgradedItem = myStarterWeapon.item.copy(damage = 25)

    processEvent(BattleState.SafeZone)
    processEvent(BattleState.MonsterEncounter("Goblin Nakal"))
    processEvent(BattleState.LootDropped(upgradedItem))
    processEvent(BattleState.GameOver("Terkena jebakan racun"))
}