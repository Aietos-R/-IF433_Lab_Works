package oop_130565_RafaelLesmana.week02.mini_rpg

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("---- Mini RPG Game ---")
    print("Masukkan nama hero : ")
    val heroName = scanner.nextLine()

    print("Masukan Damage Hero : ")
    val baseDamage = scanner.nextInt()
    val hero = Hero(heroName, baseDamage)

    var enemyHp = 100
    val enemyName = "voldemort"

    println("\nHero ${hero.name} telah dibuat dengan HP ${hero.hp} dan damage ${hero.baseDamage}")

    while (hero.isAlive() && enemyHp > 0) {
        println("\n-- HP: ${hero.name} (${hero.hp}) | $enemyName ($enemyHp) --")
        print("Pilih Aksi (1. Serang, 2. Kabur): ")
        val choice = scanner.nextInt()

        if (choice == 1) {
            hero.attack(enemyName)
            enemyHp -= hero.baseDamage
            println("Sisa HP $enemyName: $enemyHp")

            if (enemyHp > 0) {
                val enemyAttackDmg = (10..20).random()
                println("\n$enemyName membalas serangan!")
                hero.takeDamage(enemyAttackDmg)
                println("${hero.name} terkena $enemyAttackDmg damage. Sisa HP: ${hero.hp}")
            }
        } else if (choice == 2) {
            println("${hero.name} kabur dari pertempuran!")
            break
        } else {
            println("Pilihan tidak valid.")
        }
    }

    if (!hero.isAlive()) {
        println("\n--- Game Over ---")
        println("${hero.name} telah kalah dalam pertarungan!")
    } else if (enemyHp <= 0) {
        println("\n--- Selamat ---")
        println("${hero.name} berhasil mengalahkan $enemyName!")
    }
}