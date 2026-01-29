package com.saishaddai.composetraining.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid
import androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells
import androidx.compose.foundation.lazy.staggeredgrid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.saishaddai.composetraining.R
import kotlin.random.Random

@Composable
fun MasonryScreen() {
    val imageItems = listOf(
        R.drawable.bg_compose_background,
        R.drawable.androidparty,
        R.drawable.bg_red,
    ).let { list ->
        List(30) { list.random() }
    }

    LazyVerticalStaggeredGrid(
        columns = StaggeredGridCells.Adaptive(minSize = 150.dp),
        modifier = Modifier.fillMaxSize(),
        contentPadding = PaddingValues(8.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        verticalItemSpacing = 8.dp
    ) {
        items(imageItems) { item ->
            val randomHeight = Random.nextInt(150, 300).dp
            Image(
                painter = painterResource(id = item),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(randomHeight)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MasonryScreenPreview() {
    MasonryScreen()
}