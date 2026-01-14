package com.saishaddai.composetraining.screens

import android.content.res.Configuration
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Adjust
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.icons.filled.Stop
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TaximeterScreen() {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        TaximeterHeader()
        TaximeterTariffs()
        Spacer(Modifier.weight(1f))
        TaximeterBody()
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
        Text("Taximeter", fontSize = 24.sp)
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
        Button(
            onClick = {},
            modifier = Modifier.height(50.dp)
        ) {
            Text("Standard", fontSize = 16.sp)
        }
        Button(onClick = {}, modifier = Modifier.height(50.dp)) {
            Text("Night", fontSize = 16.sp)
        }
        Button(onClick = {}, modifier = Modifier.height(50.dp)) {
            Text("Premium", fontSize = 16.sp)
        }
    }
}

@Composable
fun TaximeterBody(modifier: Modifier = Modifier) {
    Card(
        modifier = modifier
            .fillMaxWidth()
            .padding(16.dp)
            .height(260.dp),
        shape = CardDefaults.outlinedShape,
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceAround
        ) {
            Icon(
                imageVector = Icons.Default.Share,
                contentDescription = "Share",
                modifier = Modifier
                    .align(Alignment.End)
                    .padding(top = 16.dp, end = 16.dp)
            )
            Text(
                text = "Fare",
                fontSize = 16.sp
            )
            Text(
                text = "$25.50",
                fontSize = 60.sp,
                fontWeight = FontWeight.Bold
            )
            Button(
                onClick = {},
            ) {
                Icon(
                    Icons.Default.Adjust,
                    contentDescription = "Adjust", modifier = Modifier.padding(end = 8.dp)
                )
                Text("In Progress")
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(16.dp, Alignment.CenterHorizontally),
            ) {
                InfoCard(
                    title = "Distance",
                    value = "5.2km",
                )
                InfoCard(
                    title = "ETA",
                    value = "12min",
                )
            }
        }
    }
}

@Composable
fun InfoCard(title: String, value: String) {
    Card {
        Column(
            modifier = Modifier.padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = title,
                fontSize = 16.sp
            )
            Text(
                text = value,
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold
            )
        }
    }
}

@Composable
fun TaximeterBottomButton() {
    Button(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 16.dp, bottom = 24.dp, end = 16.dp)
            .height(54.dp),
        onClick = {}) {
        Icon(
            imageVector = Icons.Filled.Stop,
            contentDescription = "",
            modifier = Modifier.padding(end = 8.dp)
        )
        Text("Stop Ride")
    }
}

@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES, showBackground = true)
@Composable
fun TaximeterScreenPreview() {
    TaximeterScreen()
}
