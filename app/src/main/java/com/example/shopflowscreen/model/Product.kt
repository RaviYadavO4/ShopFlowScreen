package com.example.shopflowscreen.model

data class Product(
    val id: String,
    val name: String,
    val description: String,
    val currentPrice: String,
    val oldPrice: String?,
    val rating: Float,
    val reviewsCount: Int,
    val imageUrl: Int
)