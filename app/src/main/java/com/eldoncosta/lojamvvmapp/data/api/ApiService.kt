package com.eldoncosta.lojamvvmapp.data.api

import com.eldoncosta.lojamvvmapp.data.model.ProductResponse
import retrofit2.http.GET

interface ApiService {

    @GET("products")
    suspend fun getProducts(): ProductResponse

}