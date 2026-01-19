package com.saishaddai.composetraining.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.saishaddai.composetraining.R

@Composable
fun DiceRollerScreen() {
    val image = painterResource(R.drawable.ic_task_completed)
    Column(modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {
        Image(
            painter = image,
            contentDescription = null
        )
        Button(
            onClick = {},
            modifier = Modifier.height(50.dp).padding(top = 16.dp)
        ) {
            Text(stringResource(R.string.dice_roller_roll), fontSize = 16.sp)
        }
    }
}

@Preview
@Composable
fun DiceRollerScreenPreview() {
    DiceRollerScreen()
}
