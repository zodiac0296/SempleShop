package com.example.myapplication.models

import java.io.Serializable

data class Product(
    var id : Int,
    var name: String,
    var image: String,
    var price: Double,
    var descriptor: String,
    var amount: Int
) : Serializable
