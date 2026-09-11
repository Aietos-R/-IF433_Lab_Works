package oop_130565_RafaelLesmana.week02.mini_rpg

class Hero (
    val name: String,
    val baseDamage: Int,
    var hp: Int = 100
) {
    fun attack(targetName: String) {
        println("$name menyerang $targetName dengan damage $baseDamage")
    }

    fun takeDamage(damage: Int) {
        hp -= damage
        if (hp < 0) hp = 0
    }

    fun isAlive(): Boolean {
        return hp > 0
    }
}