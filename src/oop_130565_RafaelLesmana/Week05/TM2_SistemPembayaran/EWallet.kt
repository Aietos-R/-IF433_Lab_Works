package oop_130565_RafaelLesmana.Week05.TM2_SistemPembayaran

class EWallet(accountName: String, var balance: Double): PaymentMethod(accountName) {

    override fun processPayment(amount: Double){
        if(balance >= amount) {
            balance -= amount
            println("[$accountName] Pembayaran E-Wallet sebesar Rp $amount Berhasil, sisa Saldo : Rp $balance")
        }else {
            println("[$accountName] Pembayaran E-Wallet sebesar Rp $amount Gagal, Saldo tidak cukup (Saldo : Rp $balance)")
        }
    }
    fun topUp(amount: Double) {
        balance += amount
        println("[$accountName] Top Up sebesat Rp $amount Berhasil, saldo sekarang Rp $balance")
    }
}