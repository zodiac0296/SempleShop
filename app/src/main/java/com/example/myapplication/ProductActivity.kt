package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.example.myapplication.models.Product
import com.example.myapplication.models.ProductAdapter

class ProductActivity : AppCompatActivity() {

    lateinit var Product: Product


    lateinit var textView: TextView
    lateinit var textView2: TextView
    lateinit var imageView: ImageView
    lateinit var button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product)

        textView = findViewById(R.id.textView)
        textView2 = findViewById(R.id.textView2)
        imageView = findViewById(R.id.imageView)
        button = findViewById(R.id.button)

        Product = intent.getSerializableExtra("Product") as Product


    }
}