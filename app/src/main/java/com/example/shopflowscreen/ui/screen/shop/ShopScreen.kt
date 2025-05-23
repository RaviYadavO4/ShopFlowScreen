package com.example.shopflowscreen.ui.screen.shop

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.shopflowscreen.constanse.products
import com.example.shopflowscreen.ui.screen.shop.banner.BannerSlider
import com.example.shopflowscreen.ui.screen.shop.category.CategoriesLayout
import com.example.shopflowscreen.ui.screen.shop.header.HeaderLayout
import com.example.shopflowscreen.ui.screen.shop.products.ProductsLayout
import com.example.shopflowscreen.ui.screen.shop.topbar.ShopTopAppBar
import com.example.shopflowscreen.ui.theme.BackgroundColor
import com.example.shopflowscreen.ui.theme.ShopFlowScreenTheme

@Composable
fun ShopScreen() {

    Scaffold(
        topBar = {
            ShopTopAppBar()
        },
        containerColor = BackgroundColor
    ) { paddingValues ->
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
        ) {
            item {
                BannerSlider()
            }

            item {
                CategoriesLayout()

            }
            item {
                HeaderLayout("New products")
            }
            items(products) { product ->
                ProductsLayout(product = product)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewShopScreen() {
    ShopFlowScreenTheme {
        ShopScreen()
    }
}