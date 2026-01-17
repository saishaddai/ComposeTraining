package com.saishaddai.composetraining.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Bookmark
import androidx.compose.material.icons.filled.CompassCalibration
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Badge
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarDefaults
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.material3.carousel.HorizontalMultiBrowseCarousel
import androidx.compose.material3.carousel.rememberCarouselState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun BasicDashboardScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFD5E8D4))
    ) {
        DashboardHeader()
        DashboardGenericTitle("News", 6, viewAll = {})
        DashboardCarouselContent()
        DashboardGenericTitle("Users", 4, viewAll = {})
        DashboardCarouselContent()
        Spacer(modifier = Modifier.weight(1f))
        DashboardFooter()
    }
}

@Composable
fun DashboardHeader() {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 24.dp, start = 16.dp, end = 16.dp, bottom = 16.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color(0xFFB4C5B4)
        )
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Text(
                text = "Frank Lodges (Online)", fontSize = 22.sp
            )
            Icon(Icons.Filled.Settings, null, Modifier.size(30.dp))
        }
    }
}

@Composable
fun DashboardGenericTitle(title: String, newItemsCount: Int = 0, viewAll: () -> Unit) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Row(
            horizontalArrangement = Arrangement.spacedBy(8.dp), verticalAlignment = Alignment.Bottom
        ) {
            Text(
                text = title,
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold,
            )
            Badge(modifier = Modifier.offset(y = (-8).dp)) { Text(newItemsCount.toString()) }
        }

        Text(
            text = "View All", fontSize = 16.sp, modifier = Modifier.clickable { viewAll() })
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DashboardCarouselContent() {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 0.dp, start = 16.dp, end = 16.dp, bottom = 16.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color(0xFFB4C5B4)
        )
    ) {
        Icon(
            imageVector = Icons.Filled.Share,
            contentDescription = null,
            modifier = Modifier
                .align(Alignment.End)
                .padding(top = 8.dp, end = 8.dp, bottom = 8.dp)
                .clickable { })

        val state = rememberCarouselState(itemCount = { 5 }, initialItem = 0)

        Column(verticalArrangement = Arrangement.Center) {
            HorizontalMultiBrowseCarousel(
                state = state,
                preferredItemWidth = 250.dp,
                modifier = Modifier.height(160.dp),
                itemSpacing = 20.dp
            ) { page ->
                Box(
                    modifier = Modifier
                        .padding(10.dp)
                        .background(Color(0xFFD5E8D4))
                        .fillMaxSize()
                        .aspectRatio(0.5f),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = page.toString(),
                        fontSize = 32.sp,
                        color = Color(0xFFB4C5B4))
                }
            }
        }
    }
}

@Composable
fun DashboardFooter() {
    NavigationBar(
        containerColor = Color(0xFFB4C5B4), windowInsets = NavigationBarDefaults.windowInsets
    ) {
        NavigationBarItem(
            selected = true,
            onClick = { },
            icon = { Icon(Icons.Filled.Home, null) },
        )
        NavigationBarItem(
            selected = false,
            onClick = { },
            icon = { Icon(Icons.Filled.CompassCalibration, null) },
        )
        NavigationBarItem(
            selected = false,
            onClick = { },
            icon = { Icon(Icons.Filled.Bookmark, null) },
        )
        NavigationBarItem(
            selected = false,
            onClick = { },
            icon = { Icon(Icons.Filled.Person, null) },
        )
    }
}

@Preview
@Composable
fun BasicDashboardScreenPreview() {
    BasicDashboardScreen()
}
