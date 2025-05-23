package com.example.shopflowscreen.ui.screen.shop.banner

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.shape.RoundedCornerShape
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.PagerState

@OptIn(ExperimentalPagerApi::class)
@Composable
fun LinePagerIndicator(
    pagerState: PagerState,
    pageCount: Int,
    modifier: Modifier = Modifier,
    activeColor: Color = Color.White,
    inactiveColor: Color = Color.Gray,
    indicatorWidth: Dp = 20.dp,
    indicatorHeight: Dp = 4.dp,
    spacing: Dp = 6.dp
) {
    Row(
        horizontalArrangement = Arrangement.spacedBy(spacing),
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier
    ) {
        repeat(pageCount) { index ->
            Box(
                modifier = Modifier
                    .width(indicatorWidth)
                    .height(indicatorHeight)
                    .background(
                        color = if (pagerState.currentPage == index) activeColor else inactiveColor,
                        shape = RoundedCornerShape(2.dp)
                    )
            )
        }
    }
}
