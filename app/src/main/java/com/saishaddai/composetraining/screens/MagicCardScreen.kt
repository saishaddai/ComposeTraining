package com.saishaddai.composetraining.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.saishaddai.composetraining.R

@Composable
fun MagicCardScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF1a1a1a)),
        contentAlignment = Alignment.Center
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth(0.9f)
                .clip(RoundedCornerShape(16.dp))
                .border(1.dp, Color.Black, RoundedCornerShape(16.dp))
                .background(Color(0xFFc7432a))
        ) {
            MagicCardHeader("Soldier")
            MagicCardImage("https://cards.scryfall.io/art_crop/front/b/4/b454581c-2c96-43b8-b1b4-53b505b38779.jpg")
            MagicCardType("Token Creature - Soldier")
            MagicCardDescription("Firebending 1 (Whenever this token attacks, add {R}. This mana lasts until end of combat.)")
            MagicCardFooter()
        }
    }
}

@Composable
fun MagicCardHeader(title: String) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(text = title, color = Color.White, fontSize = 18.sp, fontWeight = FontWeight.Bold)
    }
}

@Composable
fun MagicCardImage(imageUrl: String) {
    // AsyncImage(model = imageUrl, contentDescription = null, modifier = Modifier.fillMaxWidth().height(200.dp), contentScale = ContentScale.Crop)
    // Using a placeholder until Coil is added
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(200.dp)
            .background(Color.DarkGray)
    ) {
        Text(
            "Image loading from API here",
            color = Color.White,
            modifier = Modifier.align(Alignment.Center)
        )
    }
}

@Composable
fun MagicCardType(type: String) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 8.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(text = type, color = Color.White, fontSize = 16.sp, fontWeight = FontWeight.Bold)
        Image(
            painter = painterResource(id = R.drawable.ic_launcher_foreground),
            contentDescription = null,
            modifier = Modifier.size(24.dp)
        )
    }
}

@Composable
fun MagicCardDescription(description: String) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
            .background(Color(0xFFd3a088), RoundedCornerShape(8.dp))
            .padding(16.dp)
    ) {
        Text(text = description, color = Color.Black, fontSize = 14.sp)
    }
}

@Composable
fun MagicCardFooter() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 8.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(text = "T 0011 TLA-EN Io Cordisco", color = Color.White, fontSize = 10.sp)
        Box(
            modifier = Modifier
                .background(Color(0xFFd3a088), RoundedCornerShape(4.dp))
                .padding(horizontal = 8.dp, vertical = 4.dp)
        ) {
            Text(text = "2/2", color = Color.Black, fontWeight = FontWeight.Bold)
        }
    }
    Text(
        text = "©2025 Viacom. TM & © 2025 Wizards of the Coast",
        color = Color.White,
        fontSize = 8.sp,
        textAlign = TextAlign.Center,
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 8.dp)
    )

}

@Preview
@Composable
fun MagicCardScreenPreview() {
    MagicCardScreen()
}
