package oop_130565_RafaelLesmana.week02

class Student( new*
    val name: String,
    val nim: String,
    var major: String
) {
    init {
        new *
                if (nim.length != 5) {
                    println("Warning : Objek tercipta dengan NIM ($nim) yang tidak valid !")
                    println("Data mahasiswa $name mungkin akan bermasalah di sistem.")
                } else {
                    println("Log : Objek student $name berhasil dialokasikan di Memory.")
                }
    }
}

