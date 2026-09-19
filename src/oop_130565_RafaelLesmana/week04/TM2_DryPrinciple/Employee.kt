package oop_130565_RafaelLesmana.week04.TM2_DryPrinciple

open class Employee(
    val name: String,
    val baseSalary: Int
) {

    open fun work() {
        println("$name sedang bekerja")
    }

    open fun calculateBonus(): Int{
        return (baseSalary * 0.1).toInt()
    }
}