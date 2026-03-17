package com.eldoncosta.lojamvvmapp.ui.home

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.eldoncosta.lojamvvmapp.databinding.ActivityHomeBinding
import com.eldoncosta.lojamvvmapp.ui.products.ProductsActivity
import com.eldoncosta.lojamvvmapp.ui.carts.CartsActivity

class HomeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.cardProducts.setOnClickListener {
            startActivity(Intent(this, ProductsActivity::class.java))
        }

        binding.cardCarts.setOnClickListener {
            startActivity(Intent(this, CartsActivity::class.java))
        }
    }
}