package com.saishaddai.composetraining.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.saishaddai.composetraining.R

data class QuadrantType(
    val title: String = "Title",
    val description: String = "Description",
    val color: Color = Color.White
)

@Composable
fun QuadrantScreen(modifier: Modifier = Modifier) {
    Column(modifier = modifier.fillMaxSize()) {
        Row(modifier = Modifier.weight(1f)) {
            QuadrantEntry(
                modifier = Modifier.weight(1f),
                quadrantType = QuadrantType(
                    stringResource(R.string.quadrants_text1),
                    stringResource(R.string.quadrants_description1),
                    Color(0xFFEADDFF)
                )
            )
            QuadrantEntry(
                modifier = Modifier.weight(1f),
                quadrantType = QuadrantType(
                    stringResource(R.string.quadrants_text2),
                    stringResource(R.string.quadrants_description2),
                    Color(0xFFD0BCFF)
                )
            )
        }
        Row(modifier = Modifier.weight(1f)) {
            QuadrantEntry(
                modifier = Modifier.weight(1f),
                quadrantType = QuadrantType(
                    stringResource(R.string.quadrants_text3),
                    stringResource(R.string.quadrants_description3),
                    Color(0xFFB69DF8)
                )
            )
            QuadrantEntry(
                modifier = Modifier.weight(1f),
                quadrantType = QuadrantType(
                    stringResource(R.string.quadrants_text4),
                    stringResource(R.string.quadrants_description4),
                    Color(0xFFF6EDFF)
                )
            )
        }
    }
}


@Composable
fun QuadrantEntry(modifier: Modifier = Modifier, quadrantType: QuadrantType = QuadrantType()) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = modifier
            .fillMaxSize()
            .background(quadrantType.color)
            .padding(16.dp),
    ) {
        Text(
            text = quadrantType.title,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 16.dp),
        )
        Text(
            text = quadrantType.description,
            textAlign = TextAlign.Justify,
        )
    }
}


@Preview
@Composable
fun QuadrantScreenPreview() {
    QuadrantScreen()
}