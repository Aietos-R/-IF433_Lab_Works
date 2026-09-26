package oop_130565_RafaelLesmana.Week05.TM2_SistemPembayaran

fun main() {
    val eWallet = EWallet("E-Wallet Rafael", balance = 50000.0)
    val creditCard = CreditCard("Kartu Kredit Rafael", limit = 100000.0)

    val daftarPembayaran: List<PaymentMethod> = listOf(eWallet, creditCard)

    for (payment in daftarPembayaran) {
        println("--- Memproses Pembayaran ---")
        payment.processPayment(75000.00)

        if(payment is EWallet) {
            println("=> Saldo kurang, melakukan auto TopUp ....")
            payment.topUp(50000.0)
            println("=> Mencoba ulang pembayaran setelah TopUp :")
            payment.processPayment(75000.0)
        }
        println()
    }
}