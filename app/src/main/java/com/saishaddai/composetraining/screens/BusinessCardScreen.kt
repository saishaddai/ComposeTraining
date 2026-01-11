package com.saishaddai.composetraining.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.saishaddai.composetraining.R

@Composable
fun BusinessCardScreen() {
    val image = painterResource(R.drawable.android_logo)
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFD5E8D4))
    ) {
        Column(
            modifier = Modifier.align(Alignment.Center),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = image,
                contentDescription = null,
                modifier = Modifier
                    .size(130.dp)
                    .background(Color(0xFF073042))
            )
            Text(
                text = stringResource(R.string.bcard_name),
                fontSize = 50.sp,
                modifier = Modifier
                    .padding(top = 16.dp, bottom = 8.dp)
            )
            Text(
                text = stringResource(R.string.bcard_position),
                fontSize = 16.sp
            )
        }

        Text(
            text = "Test information in teh bottom of the screen", //stringResource(R.string.nice_work),
            fontSize = 12.sp,
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .padding(bottom = 24.dp)
        )
    }
}

@Preview
@Composable
fun BusinessCardScreenPreview() {
    BusinessCardScreen()
}
