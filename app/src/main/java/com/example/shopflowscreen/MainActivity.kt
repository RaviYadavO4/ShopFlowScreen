package com.example.shopflowscreen

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.outlined.ArrowBack
import androidx.compose.material.icons.outlined.ShoppingCart
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.shopflowscreen.constanse.products
import com.example.shopflowscreen.ui.screen.shop.ShopScreen
import com.example.shopflowscreen.ui.screen.shop.banner.BannerSlider
import com.example.shopflowscreen.ui.screen.shop.category.CategoriesLayout
import com.example.shopflowscreen.ui.screen.shop.header.HeaderLayout
import com.example.shopflowscreen.ui.screen.shop.products.ProductsLayout
import com.example.shopflowscreen.ui.theme.ShopFlowScreenTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ShopFlowScreenTheme {
                ShopScreen()
            }
        }
    }
}



