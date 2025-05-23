package com.example.shopflowscreen.constanse

import com.example.shopflowscreen.R
import com.example.shopflowscreen.model.Category
import com.example.shopflowscreen.model.Product

val banners = listOf(
    R.drawable.shopflowcard1,
    R.drawable.shopflowcard1,
    R.drawable.shopflowcard1
)

val categories = listOf(
    Category(name = "Cosmetics", iconUrl = R.drawable.categorysample),
    Category(name = "Serum", iconUrl = R.drawable.categorysample),
    Category(name = "Moisturizer", iconUrl = R.drawable.categorysample),
    Category(name = "Sunscreen", iconUrl = R.drawable.categorysample)
)

val products = listOf(
    Product(
        id = "clencera_001",
        name = "clencera",
        description = "Facial clay and algae powered cleanser",
        currentPrice = "RS. 350.00",
        oldPrice = "RS. 550.00",
        rating = 4.5f,
        reviewsCount = 216,
        imageUrl = R.drawable.product_image // Assuming clencera.png is in your drawables
    ),
    Product(
        id = "glow_001",
        name = "glow",
        description = "Facial clay and algae powered cleanser",
        currentPrice = "RS. 350.00",
        oldPrice = "RS. 550.00",
        rating = 4.5f,
        reviewsCount = 216,
        imageUrl = R.drawable.product_image // Assuming glow.png is in your drawables
    ),
    Product(
        id = "afterglow_001",
        name = "afterglow",
        description = "Facial clay and algae powered cleanser",
        currentPrice = "RS. 350.00",
        oldPrice = "RS. 550.00",
        rating = 4.5f,
        reviewsCount = 216,
        imageUrl = R.drawable.product_image // Assuming afterglow.png is in your drawables
    )
)