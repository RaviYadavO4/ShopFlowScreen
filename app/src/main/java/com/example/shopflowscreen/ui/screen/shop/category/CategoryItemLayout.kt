package com.example.shopflowscreen.ui.screen.shop.category

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.shopflowscreen.R
import com.example.shopflowscreen.constanse.categories
import com.example.shopflowscreen.model.Category
import com.example.shopflowscreen.ui.theme.ShopFlowScreenTheme


@Composable
fun CategoryItemLayout(category: Category) {
    val tangerineFont = FontFamily(Font(R.font.tangerine))
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .width(80.dp)
            .background(Color.Transparent) // Adjust as needed
    ) {
        Image(
            painter = painterResource(id = category.iconUrl),
            contentDescription = category.name,
            modifier = Modifier
                .size(60.dp) // Make the size of the circle
                .clip(CircleShape) // Clip the image in a circular shape
                .background(Color.Black) // Set the background to black
                .padding(8.dp), // Add some padding around the image
            contentScale = ContentScale.Crop // Ensure the image scales properly
        )
        Spacer(modifier = Modifier.height(4.dp))
        Text(
            text = category.name,
            color = Color.White,
            fontFamily = tangerineFont,
            fontSize = 12.sp
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewCategoryItemView() {
    ShopFlowScreenTheme {
        CategoryItemLayout(categories[0])
    }
}