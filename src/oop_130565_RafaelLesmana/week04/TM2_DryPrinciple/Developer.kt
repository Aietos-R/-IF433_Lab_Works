package oop_130565_RafaelLesmana.week04.TM2_DryPrinciple

class Developer(
    name: String,
    baseSalary: Int,
    val progammingLanguage: String
): Employee(name, baseSalary) {

    override fun work() {
        println("$name sedang ngoding menggunakan $progammingLanguage")
    }
}