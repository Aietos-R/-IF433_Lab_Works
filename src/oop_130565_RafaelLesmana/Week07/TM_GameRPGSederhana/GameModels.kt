package oop_130565_RafaelLesmana.Week07.TM_GameRPGSederhana

enum class ItemRarity(val dropChance: Int) {
    COMMON(70),
    UNCOMMON(20),
    RARE(9),
    EPIC(5),
    LEGENDARY(1)
}

data class GameItem(val name: String, val damage: Int, val rarity: ItemRarity)