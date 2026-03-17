package com.eldoncosta.lojamvvmapp.data.repository

import com.eldoncosta.lojamvvmapp.data.api.RetrofitClient
import com.eldoncosta.lojamvvmapp.data.model.Cart

class CartRepository {

    suspend fun getCarts(): List<Cart> {
        return RetrofitClient.apiService.getCarts().carts
    }

}