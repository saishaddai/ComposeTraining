package com.saishaddai.composetraining.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ErrorScreen(modifier: Modifier = Modifier, navigateToScreen: () -> Unit) {
    Column(
        modifier = modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text("No screen found"
            , fontSize = 40.sp
            , modifier = modifier.padding(bottom = 10.dp))
        Button(
            onClick = { navigateToScreen() }
        ) {
            Text(text = "Back",
                fontSize = 26.sp,
                modifier = modifier.padding(top = 10.dp, bottom = 10.dp))
        }
    }
}

@Preview
@Composable
fun ErrorScreenPreview() {
    ErrorScreen(navigateToScreen = {})
}