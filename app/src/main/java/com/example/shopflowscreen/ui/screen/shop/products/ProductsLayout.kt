package com.example.shopflowscreen.ui.screen.shop.products

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.outlined.ShoppingCart
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.shopflowscreen.R
import com.example.shopflowscreen.constanse.products
import com.example.shopflowscreen.model.Product
import com.example.shopflowscreen.ui.theme.ShopFlowScreenTheme


@Composable
fun ProductsLayout(product: Product) {
    val tangerineFont = FontFamily(Font(R.font.tangerine))
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight()
                .padding(vertical = 8.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.card_grey_bg_png),
                contentDescription = "Card Background",
                modifier = Modifier
                    .fillMaxWidth()
                    .matchParentSize()
                    .align(Alignment.TopStart),
                contentScale = ContentScale.FillBounds
            )

            Column {
                IconButton(onClick = { /* Handle search */ }, modifier = Modifier.padding(start = 10.dp, end = 10.dp, bottom = 10.dp).background(Color.Black, shape = CircleShape)) {
                    Icon(
                        Icons.Filled.FavoriteBorder, contentDescription = "Favorites", modifier = Modifier.size(30.dp),
                        tint = colorResource(id = R.color.light_purple)
                    )
                }
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 20.dp, bottom = 40.dp, start = 16.dp, end = 16.dp)
                ) {

                    // Product Image
                    Image(
                        painter = painterResource(id = product.imageUrl),
                        contentDescription = product.name,
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(180.dp)
                            .clip(RoundedCornerShape(8.dp)),
                        contentScale = ContentScale.Crop
                    )

                    Spacer(modifier = Modifier.height(20.dp))

                    // Box to wrap text content with background
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                    ) {
                        // Background image for text content
                        Image(
                            painter = painterResource(id = R.drawable.card_black_shape), // <-- Add your second background here
                            contentDescription = "Text Background",
                            modifier = Modifier
                                .matchParentSize()
                                .clip(RoundedCornerShape(8.dp)),
                            contentScale = ContentScale.FillBounds
                        )

                        // Text content with padding
                        Column(modifier = Modifier.padding(12.dp)) {
                            Row {
                                Text(
                                    text = product.name,
                                    color = colorResource(id = R.color.lime_green),
                                    fontFamily = tangerineFont,
                                    fontSize = 24.sp,
                                    fontWeight = FontWeight.Bold
                                )
                                Spacer(modifier = Modifier.weight(1f))

                                Text(
                                    text = "${product.reviewsCount} reviews",
                                    color = colorResource(id = R.color.lime_green),
                                    fontFamily = tangerineFont,
                                    fontSize = 12.sp
                                )
                            }

                            Spacer(modifier = Modifier.height(4.dp))
                            Text(
                                text = product.description,
                                color = Color(0xFFC0C0C0),
                                fontFamily = tangerineFont,
                                fontSize = 12.sp
                            )
                            Text(
                                text = "Skin Tightness + Dry & Dehydrated Skin",
                                color = Color(0xFFC0C0C0),
                                fontFamily = tangerineFont,
                                fontSize = 12.sp
                            )
                            Spacer(modifier = Modifier.height(8.dp))

                            Row(verticalAlignment = Alignment.CenterVertically) {
                                Text(
                                    text = product.currentPrice,
                                    color = colorResource(id = R.color.light_purple),
                                    fontSize = 16.sp,
                                    fontFamily = tangerineFont,
                                    fontWeight = FontWeight.Bold
                                )
                                product.oldPrice?.let {
                                    Spacer(modifier = Modifier.width(8.dp))
                                    Text(
                                        text = it,
                                        color = colorResource(id = R.color.grey_text),
                                        fontSize = 12.sp,
                                        fontFamily = tangerineFont,
                                        textDecoration = TextDecoration.LineThrough
                                    )
                                }
                            }

                            Spacer(modifier = Modifier.height(4.dp))

                            Row(verticalAlignment = Alignment.CenterVertically) {
                                repeat(product.rating.toInt()) {
                                    Icon(
                                        painter = painterResource(id = R.drawable.ic_star),
                                        contentDescription = "Star",
                                        tint = colorResource(id = R.color.sun_yellow),
                                        modifier = Modifier.size(16.dp)
                                    )
                                }
                                if (product.rating % 1 != 0f) {
                                    Icon(
                                        painter = painterResource(id = R.drawable.ic_star_half),
                                        contentDescription = "Half Star",
                                        tint = colorResource(id = R.color.sun_yellow),
                                        modifier = Modifier.size(16.dp)
                                    )
                                }
                                Spacer(modifier = Modifier.width(4.dp))
                                Text(
                                    text = "${product.reviewsCount} reviews",
                                    color = Color.White,
                                    fontSize = 12.sp
                                )
                                Spacer(modifier = Modifier.weight(1f))
                                IconButton(
                                    onClick = { /* Handle add to cart */ },
                                    modifier = Modifier
                                        .size(40.dp)
                                        .clip(RoundedCornerShape(8.dp))
                                        .border(width = 2.dp, color = colorResource(id = R.color.lime_green), shape = CircleShape)
                                ) {
                                    Icon(
                                        imageVector = Icons.Outlined.ShoppingCart,
                                        contentDescription = "Add to Cart",
                                        tint = colorResource(id = R.color.lime_green)
                                    )
                                }
                            }
                        }
                    }
                }
            }

        }
    }

@Preview(showBackground = true)
@Composable
fun PreviewProductsView() {
    ShopFlowScreenTheme {
        ProductsLayout(product = products[0])
    }
}