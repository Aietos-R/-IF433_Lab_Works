package oop_130565_RafaelLesmana.Week05.TM1_CompileTIme

fun main() {
    val math = MathHelper()

    val luasPersegi = math.hitungLuas(5)
    val luasPersegiPanjang = math.hitungLuas(10, 4)
    val luasLingkaran = math.hitungLuas(7, 0)

    println("Luas Persegi : $luasPersegi" +
            "\nLuas Persegi Panjang : $luasPersegiPanjang" +
            "\nLuas Lingkaran : $luasLingkaran")
}