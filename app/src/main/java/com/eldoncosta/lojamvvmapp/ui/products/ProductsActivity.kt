package com.eldoncosta.lojamvvmapp.ui.products

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.eldoncosta.lojamvvmapp.databinding.ActivityProductsBinding
import com.eldoncosta.lojamvvmapp.viewmodel.ProductViewModel

class ProductsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityProductsBinding

    private val viewModel: ProductViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityProductsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.recyclerProducts.layoutManager = LinearLayoutManager(this)

        viewModel.products.observe(this) { products ->

            val adapter = ProductAdapter(products)
            binding.recyclerProducts.adapter = adapter

        }
    }
}