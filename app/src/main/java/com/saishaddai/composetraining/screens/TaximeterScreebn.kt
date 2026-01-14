package com.saishaddai.composetraining.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Stop
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun TaximeterScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        TaximeterHeader()
        TaximeterTariffs()
        Spacer(Modifier.weight(1f))
        TaximeterBottomButton()
    }
}

@Composable
fun TaximeterHeader(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(16.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text("Taximeter")
        Icon(Icons.Default.Settings, contentDescription = "Settings")
    }
}

@Composable
fun TaximeterTariffs() {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(16.dp, Alignment.CenterHorizontally),
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth()
    ) {
        Button(onClick = {}) {
            Text("Standard")
        }
        Button(onClick = {}) {
            Text("Night")
        }
        Button(onClick = {}) {
            Text("Premium")
        }
    }
}

@Composable
fun TaximeterBottomButton() {
    Button(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 16.dp, bottom = 24.dp, end = 16.dp),
        onClick = {}) {
        Icon(
            imageVector = Icons.Filled.Stop,
            contentDescription = "",
            modifier = Modifier.padding(end = 8.dp)
        )
        Text("Stop Ride")
    }
}

@Preview
@Composable
fun TaximeterScreenPreview() {
    TaximeterScreen()
}
