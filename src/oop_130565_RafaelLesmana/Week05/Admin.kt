package oop_130565_RafaelLesmana.Week05

class Admin(name: String) : Pegawai(name) {
    override fun bekerja() {
        println("[$name] sedang duduk di depan komputer melayani administrasi")
    }

    fun doAdminWork() {
        println("[$name] sedang merekap data absensi mahasiswa")
    }
}