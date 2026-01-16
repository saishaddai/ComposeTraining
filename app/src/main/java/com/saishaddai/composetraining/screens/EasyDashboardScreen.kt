package com.saishaddai.composetraining.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Bookmark
import androidx.compose.material.icons.filled.CompassCalibration
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarDefaults
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun EasyDashboardScreen(modifier: Modifier = Modifier) {
    Column(modifier = modifier.fillMaxSize()) {
        Text(text = "Hello world")
        DashboardFooter()
    }
}


@Composable
fun DashboardFooter() {
    NavigationBar(
        windowInsets = NavigationBarDefaults.windowInsets
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
            selected = true,
            onClick = { },
            icon = { Icon(Icons.Filled.Person, null) },
        )
    }
}

@Preview
@Composable
fun EasyDashboardScreenPreview() {
    EasyDashboardScreen()
}