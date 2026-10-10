package oop_130565_RafaelLesmana.Week07.TM_GameRPGSederhana

fun processEvent(event: BattleState) {
    when (event) {
        is BattleState.MonsterEncounter -> {
            println("Peringatan: Kamu dihadang oleh monster ${event.monsterName}!")
        }
        is BattleState.LootDropped -> {
            val (name, dmg, rarity) = event.item
            println("Selamat! Kamu mendapatkan Loot: $name | Damage: $dmg | Rarity: $rarity")
        }
        is BattleState.GameOver -> {
            println("GAME OVER! Alasan: ${event.reason}")
        }
        is BattleState.SafeZone -> {
            println("Kamu berada di Safe Zone. Tempat yang aman untuk beristirahat.")
        }
    }
}