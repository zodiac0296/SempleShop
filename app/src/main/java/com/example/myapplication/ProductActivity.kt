package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.example.myapplication.models.Product
import com.example.myapplication.models.ProductAdapter

class ProductActivity : AppCompatActivity() {

    lateinit var Product: Product


    lateinit var textName: TextView
    lateinit var textDescription: TextView
    lateinit var imageView: ImageView
    lateinit var button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product)
        Product = intent.getSerializableExtra("Product") as Product

        textName = findViewById(R.id.textName)
        textDescription = findViewById(R.id.textDescription)
        imageView = findViewById(R.id.imageView)
        button = findViewById(R.id.button)
        textName.text = Product.name
        textDescription.text = Product.descriptor



        Glide.with(this,).load(Product.image).into(imageView)
    }
}