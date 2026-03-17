package com.eldoncosta.lojamvvmapp.ui.carts

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.eldoncosta.lojamvvmapp.data.model.Cart
import com.eldoncosta.lojamvvmapp.databinding.ItemCartBinding

class CartAdapter(
    private val carts: List<Cart>
) : RecyclerView.Adapter<CartAdapter.CartViewHolder>() {

    class CartViewHolder(val binding: ItemCartBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CartViewHolder {

        val binding = ItemCartBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )

        return CartViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CartViewHolder, position: Int) {

        val cart = carts[position]

        holder.binding.textCartId.text = "Cart #${cart.id}"
        holder.binding.textTotal.text = "Total: $${cart.total}"
        holder.binding.textProducts.text = "${cart.totalProducts} products"
    }

    override fun getItemCount() = carts.size
}