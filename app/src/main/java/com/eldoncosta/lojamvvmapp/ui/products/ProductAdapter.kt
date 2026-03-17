package com.eldoncosta.lojamvvmapp.ui.products

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.eldoncosta.lojamvvmapp.data.model.Product
import com.eldoncosta.lojamvvmapp.databinding.ItemProductBinding
import com.bumptech.glide.Glide

class ProductAdapter(
    private val products: List<Product>
) : RecyclerView.Adapter<ProductAdapter.ProductViewHolder>() {

    class ProductViewHolder(val binding: ItemProductBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {

        val binding = ItemProductBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )

        return ProductViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {

        val product = products[position]

        holder.binding.textTitle.text = product.title
        holder.binding.textPrice.text = "$${product.price}"

        Glide.with(holder.itemView.context)
            .load(product.thumbnail)
            .into(holder.binding.imageProduct)
    }

    override fun getItemCount(): Int {
        return products.size
    }
}