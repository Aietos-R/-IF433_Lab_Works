package oop_130565_RafaelLesmana.week04.TM2_DryPrinciple

fun main () {

    println("Instansiasi Manager")
    val manager1 = Manager("Rafael", 20000000)
    manager1.work()
    println("Bonus ${manager1.name} : Rp ${manager1.calculateBonus()}")

    println("\nInstansiasi Developer")
    val dev1 = Developer("Rafael", 20000000, "Kotlin")
    dev1.work()
    println("Bonus ${dev1.name} : Rp ${dev1.calculateBonus()}")
}



