package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.models.Product
import com.example.myapplication.models.ProductAdapter

class MainActivity : AppCompatActivity() {

    val ListProduct = arrayListOf<Product>()
    lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)

        ListProduct.add(
            Product(
                "блич",
                "https://w7.pngwing.com/pngs/417/220/png-transparent-ichigo-kurosaki-bleach-versus-crusade-anime-bleach-manga-cartoon-fictional-character.png",
                500.0,
                "имя героя",
                55
            )
        )

        ListProduct.add(
            Product(
                "блич",
                "https://upload.wikimedia.org/wikipedia/ru/5/51/Renji_Abarai.jpg",
                500.0,
                "имя героя",
                12
            )
        )

        ListProduct.add(
            Product(
                "блич",
                "https://animecult.org/uploads/attachment/cover/10513/characters_8354.jpg",
                500.0,
                "имя героя",
                66

            )
        )

        ListProduct.add(
            Product(
                "блич",
                "https://w7.pngwing.com/pngs/983/904/png-transparent-undertale-brazil-mangaka-ulquiorra-cifer-ken-games-ulquiorra-mammal-black-hair-text-thumbnail.png",
                500.0,
                "имя героя",
                77

            )
        )

        ListProduct.add(
            Product(
                "блич",
                "https://fanfics.me/images/fandoms_heroes/13534-1564167491.jpg",
                500.0,
                "имя героя",
                88
            )
        )

        recyclerView.adapter = ProductAdapter(ListProduct)

    }
}