package oop_130565_RafaelLesmana.Week05.TM2_SistemPembayaran

class CreditCard(accountName: String, val limit: Double): PaymentMethod(accountName) {
    var usedAmount: Double = 0.0

    override fun processPayment(amount: Double) {
        if (usedAmount + amount <= limit) {
            usedAmount += amount
            println("[$accountName] Pembayaran Kartu Kredit sebesar Rp $amount Berhasil" +
                    "\n Total tagihan : Rp $usedAmount / limit : Rp $limit")
        }else {
            println("[$accountName] Pembayaran Kartu Kredit sebesar : Rp $amount ditolak, Melebihi limit kartu")
        }
    }
}