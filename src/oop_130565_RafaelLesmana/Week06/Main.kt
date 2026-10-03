package oop_130565_RafaelLesmana.Week06

fun processCheckout(method: PaymentMethod, amount: Double) {
    println("-> Memulai checkout...")
    method.pay(amount)
}

fun main() {
    val myWatch = Smartwatch()
    myWatch.showTime()

    val myPhone = Smartphone()
    myPhone.turnOn()

    val pay1 = Gopay()
    val pay2 = CreditCard()

    println("\n=== Testing Checkout ===")
    processCheckout(pay1, 100000.0)
    processCheckout(pay2, 150000.0)
}