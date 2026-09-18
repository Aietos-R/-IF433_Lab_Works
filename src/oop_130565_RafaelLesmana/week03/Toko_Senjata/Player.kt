package oop_130565_RafaelLesmana.week03.Toko_Senjata

class Player(val username: String) {
    private var xp: Int = 0
    val level: Int
        get() = (xp / 100) + 1

    fun addXp(amount: Int) {
        if (amount > 0) {
            val previousLevel = level
            xp += amount
            if (level > previousLevel) {
                println("Level Up! Selamat $username naik ke level $level")
            }
        } else {
            println("XP harus angka positif!")
        }
    }
}