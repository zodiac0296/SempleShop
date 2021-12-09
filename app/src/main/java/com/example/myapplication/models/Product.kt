package com.example.myapplication.models

import android.os.Parcelable
import java.io.FileDescriptor
import java.io.Serializable

data class Product(
    var name: String,
    var image: String,
    var price: Double,
    var descriptor: String,
    var amount: Int
) : Serializable
