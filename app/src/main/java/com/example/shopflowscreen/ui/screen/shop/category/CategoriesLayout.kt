package com.example.shopflowscreen.ui.screen.shop.category

import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.shopflowscreen.constanse.categories
import com.example.shopflowscreen.ui.screen.shop.header.HeaderLayout
import com.example.shopflowscreen.ui.theme.ShopFlowScreenTheme

@Composable
fun CategoriesLayout() {
    HeaderLayout("Categories")

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .horizontalScroll(rememberScrollState())
            .padding(horizontal = 16.dp, vertical = 8.dp),
        horizontalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        categories.forEach { category ->
            CategoryItemLayout(category = category)
        }
    }
    Spacer(modifier = Modifier.height(16.dp))
}

@Preview(showBackground = true)
@Composable
fun PreviewCategoriesView() {
    ShopFlowScreenTheme {
        CategoriesLayout()
    }
}