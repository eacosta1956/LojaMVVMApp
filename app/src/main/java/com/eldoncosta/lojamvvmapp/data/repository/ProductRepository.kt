package com.eldoncosta.lojamvvmapp.data.repository

import com.eldoncosta.lojamvvmapp.data.api.RetrofitClient
import com.eldoncosta.lojamvvmapp.data.model.Product

class ProductRepository {

    suspend fun getProducts(): List<Product> {
        return RetrofitClient.apiService.getProducts().products
    }

}