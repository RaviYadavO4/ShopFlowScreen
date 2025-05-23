package com.example.shopflowscreen.ui.screen.shop.topbar

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.outlined.ArrowBack
import androidx.compose.material.icons.outlined.ShoppingCart
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.shopflowscreen.R
import com.example.shopflowscreen.ui.theme.ShopFlowScreenTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ShopTopAppBar() {
    val tangerineFont = FontFamily(Font(R.font.tangerine))
    TopAppBar(
        title = {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Icon(Icons.Outlined.ArrowBack, contentDescription = "Back")
                Spacer(Modifier.width(8.dp))
                Text("Shop", style = MaterialTheme.typography.headlineSmall.copy(fontWeight = FontWeight.Bold),fontFamily = tangerineFont,)
            }
        },
        actions = {
            IconButton(onClick = { /* Handle search */ }) {
                Icon(Icons.Filled.Search, contentDescription = "Search")
            }
            IconButton(onClick = { /* Handle favorites */ }) {
                Icon(Icons.Filled.FavoriteBorder, contentDescription = "Favorites")
            }
            IconButton(onClick = { /* Handle cart */ }) {
                Icon(Icons.Outlined.ShoppingCart, contentDescription = "Shopping Cart")
            }
        },
        colors = TopAppBarDefaults.topAppBarColors(containerColor = Color(0xFF1E1E1E), titleContentColor = Color.White, actionIconContentColor = Color.White)
    )
}

@Preview(showBackground = true)
@Composable
fun PreviewTopAppBar() {
    ShopFlowScreenTheme {
        ShopTopAppBar()
    }
}