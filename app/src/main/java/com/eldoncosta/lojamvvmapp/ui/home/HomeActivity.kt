package com.eldoncosta.lojamvvmapp.ui.home

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.eldoncosta.lojamvvmapp.R
import com.eldoncosta.lojamvvmapp.ui.products.ProductsActivity
import com.google.android.material.card.MaterialCardView

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val cardProducts = findViewById<MaterialCardView>(R.id.cardProducts)

        cardProducts.setOnClickListener {

            val intent = Intent(this, ProductsActivity::class.java)
            startActivity(intent)

        }
    }
}