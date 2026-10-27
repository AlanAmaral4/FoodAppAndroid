package br.com.foodapp.dao

import android.util.Log
import br.com.foodapp.model.Product

class ProductDao {
    companion object {
        private val products = mutableListOf<Product>()
    }

    fun products() = products

    fun save(prod: Product) {
        products.add(prod)
        Log.d("ProductDao", prod.toString())
    }


}