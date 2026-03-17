package com.eldoncosta.lojamvvmapp.data.api

import com.eldoncosta.lojamvvmapp.data.model.CartResponse
import com.eldoncosta.lojamvvmapp.data.model.Product
import com.eldoncosta.lojamvvmapp.data.model.ProductResponse
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {

    @GET("products")
    suspend fun getProducts(): ProductResponse

    @GET("products/{id}")
    suspend fun getProductById(
        @Path("id") id: Int
    ): Product

    @GET("carts")
    suspend fun getCarts(): CartResponse
}