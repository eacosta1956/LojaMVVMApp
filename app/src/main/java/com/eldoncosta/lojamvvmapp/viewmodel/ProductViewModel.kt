package com.eldoncosta.lojamvvmapp.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import com.eldoncosta.lojamvvmapp.data.model.Product
import com.eldoncosta.lojamvvmapp.data.repository.ProductRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class ProductViewModel : ViewModel() {

    private val repository = ProductRepository()

    private val _product = MutableLiveData<Product>()
    val product: LiveData<Product> = _product

    val products = liveData(Dispatchers.IO) {
        val data = repository.getProducts()
        emit(data)
    }

    fun getProductById(id: Int) {
        viewModelScope.launch {
            try {
                val result = repository.getProductById(id)
                _product.value = result
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
    }
}