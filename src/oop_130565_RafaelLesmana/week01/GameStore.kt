package oop_130565_RafaelLesmana.week01

fun main() {
    val gameTitle = "Resident Evil Requiem"
    val price = 900000.0

    calculateDiscount(price)
}

fun calculateDiscount(price: Double) : Double {
    if (price < 500000.0) {
        return price - (price * 0.2)
    }else {
        return price - (price * 0.1)
    }
}
