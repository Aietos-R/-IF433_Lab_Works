package oop_130565_RafaelLesmana.Week08.TM_ECommerce


sealed class Product {
    data class Electronic(val id: String, val name: String, val warrantyMonths: Int) : Product()
    data class Clothing(val id: String, val name: String, val size: String) : Product()
}