package com.eldoncosta.lojamvvmapp.ui.carts

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.eldoncosta.lojamvvmapp.databinding.ActivityCartsBinding
import com.eldoncosta.lojamvvmapp.viewmodel.CartViewModel

class CartsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCartsBinding
    private lateinit var viewModel: CartViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityCartsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel = ViewModelProvider(this)[CartViewModel::class.java]

        binding.recyclerViewCarts.layoutManager = LinearLayoutManager(this)

        viewModel.carts.observe(this) { carts ->
            binding.recyclerViewCarts.adapter = CartAdapter(carts)
        }
    }
}