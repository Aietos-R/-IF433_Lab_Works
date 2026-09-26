package oop_130565_RafaelLesmana.Week05.TM2_SistemPembayaran

abstract class PaymentMethod(val accountName: String) {
    abstract fun processPayment(amount: Double)
}