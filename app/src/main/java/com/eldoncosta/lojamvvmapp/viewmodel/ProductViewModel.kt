package com.eldoncosta.lojamvvmapp.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.eldoncosta.lojamvvmapp.data.repository.ProductRepository
import kotlinx.coroutines.Dispatchers

class ProductViewModel : ViewModel() {

    private val repository = ProductRepository()

    val products = liveData(Dispatchers.IO) {
        val data = repository.getProducts()
        emit(data)
    }

}