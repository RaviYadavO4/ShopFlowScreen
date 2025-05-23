package com.example.shopflowscreen.ui.screen.shop.header

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.shopflowscreen.R
import com.example.shopflowscreen.ui.theme.ShopFlowScreenTheme

@Composable
fun HeaderLayout(title:String) {
     val tangerineFont = FontFamily(Font(R.font.tangerine))
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 8.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = title,
            color = Color.White,
            fontFamily = tangerineFont,
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )
        TextButton(onClick = { /* Handle See all */ }) {
            Text("See all",fontFamily = tangerineFont, color = Color.White)
        }
    }

}

@Preview(showBackground = true)
@Composable
fun PreviewHeaderView() {
    ShopFlowScreenTheme {
        HeaderLayout("New products")
    }
}