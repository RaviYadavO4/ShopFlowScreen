package com.example.shopflowscreen.ui.screen.shop.banner

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.shopflowscreen.R
import com.example.shopflowscreen.constanse.banners
import com.example.shopflowscreen.ui.theme.ShopFlowScreenTheme
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.rememberPagerState

@OptIn(ExperimentalPagerApi::class)
@Composable
fun BannerSlider() {
    val tangerineFont = FontFamily(Font(R.font.tangerine))
    val pagerState = rememberPagerState()



    Box(modifier = Modifier.fillMaxWidth()) {
        HorizontalPager(count = banners.size, state = pagerState)
        { page ->
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(250.dp) // Adjust height as needed
            ) {
                Image(
                    painter = painterResource(id = banners[page]),
                    contentDescription = "Discount Banner",
                    modifier = Modifier.fillMaxWidth(),
                    contentScale = ContentScale.FillBounds
                )

                // Content on top of the background image
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(30.dp)
                        .align(Alignment.CenterStart)
                ) {
                    Text(
                        "GET 20% OFF",
                        color = Color.White,
                        fontFamily = tangerineFont,
                        fontSize = 24.sp,
                        fontWeight = FontWeight.ExtraBold
                    )
                    Spacer(modifier = Modifier.height(4.dp))
                    Text(
                        "Get 20% off",
                        color = Color(0xFFC0C0C0),
                        fontFamily = tangerineFont,
                        fontSize = 14.sp
                    )
                    Spacer(modifier = Modifier.height(8.dp))

                    Row(
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Box(
                            modifier = Modifier
                                .background(
                                    color = colorResource(id = R.color.lime_green),
                                    shape = RoundedCornerShape(20.dp)
                                )
                                .padding(horizontal = 20.dp, vertical = 1.dp)
                        ) {
                            Text(
                                text = "12-16 October",
                                color = Color.Black,
                                fontSize = 12.sp
                            )
                        }
                        Spacer(modifier = Modifier.weight(1f))
                        IconButton(onClick = { /* Handle favorites */ }) {
                            Icon(Icons.Filled.Notifications, tint = Color.White, contentDescription = "Notifications")
                        }
                    }
                }
            }
        }

        LinePagerIndicator(
            pagerState = pagerState,
            pageCount = banners.size,
            modifier = Modifier
                .align(Alignment.BottomStart)
                .padding(start = 70.dp,bottom = 10.dp),
            activeColor = colorResource(id = R.color.lime_green),
            inactiveColor = Color.LightGray
        )
    }


}

@Preview(showBackground = true)
@Composable
fun PreviewBannerSlider() {
    ShopFlowScreenTheme {
        BannerSlider()
    }
}
