package oop_130565_RafaelLesmana.Week08

fun main() {
    println("=== TEST SAFE CALLS & ELVIS ===")
    val emptyOrder = Order(null, null)

    val destination = emptyOrder.deliveryDetails?.address?.city?.name ?: "Kota Tidak Diketahui"
    println("Tujuan Pengiriman: $destination")

    println("=== TEST NULL BLOCK ===")
    val validOrder = Order(null, 250000)
    val receipt = validOrder.totalprice?.let { price ->
        val tax = price * 0.11
        " Transaksi Valid. Harga: Rp$price, Pajak: Rp$tax"
    } ?: "Transaksi Invalid: Harga belum di-set !"

    println(receipt)
}