package oop_130565_RafaelLesmana.Week05

class Dosen(name: String, val nidn: String) : Pegawai(name) {
    override fun bekerja() {
        println("[$name] sedang menyiapkan materi perkuliahan dan merevisi RKPS")
    }

    fun mengajar(){
        println("[$name] sedang mengajar mahasiswa di kelas")
    }
}
