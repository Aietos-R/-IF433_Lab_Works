package oop_130565_RafaelLesmana.week04.TM2_DryPrinciple

class Manager(name: String, baseSalary: Int): Employee(name, baseSalary) {

    override fun work() {
        println("$name sedang memimpin rapat divisi")
    }
    override fun calculateBonus(): Int {
        return super.calculateBonus() + 500000
    }
}