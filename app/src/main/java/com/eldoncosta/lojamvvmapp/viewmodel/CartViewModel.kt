package com.eldoncosta.lojamvvmapp.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.eldoncosta.lojamvvmapp.data.repository.CartRepository
import kotlinx.coroutines.Dispatchers

class CartViewModel : ViewModel() {

    private val repository = CartRepository()

    val carts = liveData(Dispatchers.IO) {
        val data = repository.getCarts()
        emit(data)
    }
}