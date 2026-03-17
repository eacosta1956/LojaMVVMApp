package com.eldoncosta.lojamvvmapp.data.model

data class Cart(
    val id: Int,
    val userId: Int,
    val total: Double,
    val discountedTotal: Double,
    val totalProducts: Int,
    val totalQuantity: Int,
    val products: List<CartProduct>
)