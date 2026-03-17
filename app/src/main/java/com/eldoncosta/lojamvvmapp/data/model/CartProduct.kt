package com.eldoncosta.lojamvvmapp.data.model

data class CartProduct(
    val id: Int,
    val title: String,
    val price: Double,
    val quantity: Int,
    val total: Double,
    val thumbnail: String
)