package com.example.myapplication

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.example.myapplication.cart.Cart
import com.example.myapplication.models.CartProduct
import com.example.myapplication.models.Product
import com.google.android.material.floatingactionbutton.FloatingActionButton

class ProductActivity : AppCompatActivity() {

    lateinit var product: Product


    lateinit var textName: TextView
    lateinit var textDescription: TextView
    lateinit var imageView: ImageView
    lateinit var button: Button
    lateinit var minus: Button
    lateinit var plus: Button
    lateinit var cartbtn: FloatingActionButton

    var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product)
        product = intent.getSerializableExtra("product") as Product

        textName = findViewById(R.id.textName)
        textDescription = findViewById(R.id.textDescription)
        imageView = findViewById(R.id.imageView)
        textName.text = product.name
        textDescription.text = product.descriptor

        Glide.with(this).load(product.image).into(imageView)
        button = findViewById(R.id.add_cart_btn)
        minus = findViewById(R.id.minus)
        cartbtn = findViewById(R.id.cartbtn)
        plus = findViewById(R.id.plus)

        button.setOnClickListener {
            addProduct(product)
            Log.d("сart", "Корзина: Название Продукта ${Cart.addedProducts.size} кол-во: ${Cart.addedProducts.size}")
        }

        minus.setOnClickListener {
            if (counter <= 0) return@setOnClickListener
            counter--
            button.text = "Добавить в коризну (${counter}) "

        }
        plus.setOnClickListener {
            counter++
            button.text = "Добавить в коризну (${counter})"
        }
    }

    fun addProduct(product: Product) {
        if (counter <= 0) return
        val cartProduct = CartProduct(product, counter)
        if (Cart.addedProducts.isEmpty()) {
            Cart.addedProducts.add(cartProduct)
            Log.d("CART", "Cart.addedProducts.add(product)")
        } else {
            if (!Cart.addedProducts.contains(cartProduct)) {
                Cart.addedProducts.add(cartProduct)
                Log.d("CART", "Добавить")
            } else {
                Log.d("CART", "Такой продукт уже есть")
            }
        }
    }
}
