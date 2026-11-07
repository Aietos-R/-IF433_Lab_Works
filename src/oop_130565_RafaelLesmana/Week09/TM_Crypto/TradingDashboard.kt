package oop_130565_RafaelLesmana.Week09.TM_Crypto

fun main() {
    val tradeHistory = listOf(
        TradeLog("BTCUSDT", "LONG", 20, 15.5, "CLOSED"),
        TradeLog("ETHUSDT", "SHORT", 10, -5.2, "CLOSED"),
        TradeLog("BTCUSDT", "SHORT", 50, 120.0, "OPEN"),
        TradeLog("SOLUSDT", "LONG", 15, -12.5, "CLOSED"),
        TradeLog("BTCUSDT", "SHORT", 25, 45.0, "CLOSED"),
        TradeLog("ETHUSDT", "LONG", 5, 2.0, "OPEN")
    )

    val closedTrades = tradeHistory.filter { it.status == "CLOSED" }
}