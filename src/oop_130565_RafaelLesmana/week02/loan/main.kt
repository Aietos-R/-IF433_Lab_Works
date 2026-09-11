package oop_130565_RafaelLesmana.week02.loan

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    println(" --- Library Fine System --- ")

    println("Masukkan Nama Peminjam : ")
    val borrowerName = scanner.nextLine()

    println("Masukkan Judul Buku : ")
    val bookTitle = scanner.nextLine()

    println("Masukkan Lama Peminjaman (hari) : ")
    var loanduration = scanner.nextInt()

    if(loanduration < -1)
        loanduration = 1
    println("Lama Pemimjaman tidak boleh ada minus")

    val loan = Loan(bookTitle, borrowerName, loanduration)
    val denda = loan.calculateFine()

    println("Peminjam: ${loan.borrowerName}")
    println("Judul Buku: ${loan.bookTitle}")
    println("Lama Peminjaman: ${loan.loanduration} hari")
    if (denda > 0) {
        println("Denda yang harus dibayar: Rp $denda")
    } else {
        println("Tidak ada denda.")
    }
}