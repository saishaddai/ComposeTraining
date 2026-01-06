package com.saishaddai.composetraining.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier


@Composable
fun HomeScreen(navigateToScreen: (String) -> Unit) {
    Scaffold { paddingValues ->
        LazyColumn(Modifier.padding(paddingValues)) {
            items(20) {
                Box(
                    modifier = Modifier
                        .clickable {
                            navigateToScreen(it.toString())
                        }
                ) {
                    Text("position $it")
                }
            }
        }
    }
}