package oop_130565_RafaelLesmana.week02

import java.util.Scanner

fun main(){
    val scanner = Scanner(System.`in`)
    println(" --- Aplikasi PMB UMN --- ")

    println("Masukkan Nama : ")
    val name = scanner.nextLine()

    println("Masukkan NIM (Wajib5 Karakter) : ")
    val nim = scanner.next()

    scanner.nextLine()

    if(nim.length != 5){
        println("Error : Pendaftaran dibatalkan. NIM harus 5 karakter !")
    } else {
        println("Pilih Jalur (1. Reguler, 2. Umum) : ")
        val type = scanner.nextInt()
        scanner.nextLine()

        if (type == 1) {
            println("Masukkan Jurusan : ")
            val major = scanner.nextLine()
            val s1 = Student(name, nim, major = major)
            println("Terdaftar di : ${s1.major} dengan GPA awal ${s1.gpa}")
        } else if (type == 2) {
            val s1 = Student(name, nim)
            println("Terdaftar di : ${s1.major} dengan GPA awal ${s1.gpa}")
        }else {
            println("Pilihan ngawur, pendafataran di batalkan!")
        }
    }
}