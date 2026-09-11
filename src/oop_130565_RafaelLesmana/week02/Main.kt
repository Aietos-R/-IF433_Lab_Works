package oop_130565_RafaelLesmana.week02

import java.util.Scanner

fun main(){
    val scanner = Scanner(System.`in`)
    println(" --- Aplikasi PMB UMN --- ")

    println("Masukkan Nama : ")
    val name = scanner.nextline()

    println("Masukkan NIM (Wajib5 Karakter) : ")
    val nim = scanner.next()

    scanner.nextLine()

    if(nim.length != 5){
        println("Error : Pendaftaran dibatalkan. NIM harus 5 karakter !")
    } else {
        println("Masukkan Jurusan : ")
        val major = scanner.nextLine()
        val s1 = Student(name, nim, major)
        println("Status : Pendaftaran Selesai.")
    }
}