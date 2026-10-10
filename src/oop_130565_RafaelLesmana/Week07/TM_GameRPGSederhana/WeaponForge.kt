package oop_130565_RafaelLesmana.Week07.TM_GameRPGSederhana

class Weapon private constructor(val item: GameItem, val durability: Int) {
    companion object {
        fun forgeStarterSword(): Weapon {
            val starterItem = GameItem("Pedang Kayu Bapuk", 5, ItemRarity.COMMON)
            return Weapon(starterItem, 50)
        }

        fun forgeEpicSword(): Weapon {
            val epicItem = GameItem("Pedang Keadilan", 100, ItemRarity.EPIC)
            return Weapon(epicItem, 300)
        }
    }
}