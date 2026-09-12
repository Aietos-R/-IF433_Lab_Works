package oop_130565_RafaelLesmana.week03

fun main() {
    val e = Employee("Rafael")

    e.salary = -1000
    e.salary = 5000000
    println("Gaji : ${e.salary}")

    e.increasePerformance()
    println("Pajak yang harus di bayar : ${e.tax}")
}