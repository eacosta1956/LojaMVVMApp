package com.eldoncosta.lojamvvmapp.ui.products

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.eldoncosta.lojamvvmapp.databinding.ActivityProductDetailBinding
import com.eldoncosta.lojamvvmapp.viewmodel.ProductViewModel

class ProductDetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityProductDetailBinding
    private lateinit var viewModel: ProductViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityProductDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel = ViewModelProvider(this)[ProductViewModel::class.java]

        val productId = intent.getIntExtra("product_id", -1)

        if (productId != -1) {
            viewModel.getProductById(productId)
        }

        observeProduct()
    }

    private fun observeProduct() {

        viewModel.product.observe(this) { product ->

            binding.productTitle.text = product.title
            binding.productPrice.text = "$${product.price}"
            binding.productDescription.text = product.description

            Glide.with(this)
                .load(product.thumbnail)
                .into(binding.productImage)
        }
    }
}