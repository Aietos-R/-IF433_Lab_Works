package oop_130565_RafaelLesmana.Week09.TM_Crypto

data class TradeLog(
    val pair: String,
    val position: String,
    val leverage: Int,
    val roe: Double,
    val status: String
)