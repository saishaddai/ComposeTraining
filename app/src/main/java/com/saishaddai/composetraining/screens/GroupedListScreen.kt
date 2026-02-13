package com.saishaddai.composetraining.screens

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.Locale

data class ListItem(val text: String, val date: LocalDate)

fun LocalDate.toHeaderText(): String {
    return if (this == LocalDate.now()) {
        "Today"
    } else {
        val formatter = DateTimeFormatter.ofPattern("MMM dd, yyyy", Locale.getDefault())
        this.format(formatter)
    }
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun GroupedListScreen() {
    val items = listOf(
        ListItem("Strawberry 1 Box 300g", LocalDate.now()),
        ListItem("Avocado", LocalDate.now()),
        ListItem("Frozen Pineapple", LocalDate.now().minusDays(1)),
        ListItem("Orange Juice", LocalDate.now().minusDays(1)),
        ListItem("Lettuce Bag", LocalDate.now().minusDays(2)),
        ListItem("Strawberry 1 Box 500g", LocalDate.now().minusDays(3)),
        ListItem("Avocado Salad", LocalDate.now().minusDays(4)),
        ListItem("Cut Fruits", LocalDate.now().minusDays(4)),
        ListItem("Pineapple Slices", LocalDate.now().minusDays(4)),
        ListItem("Orange By Piece", LocalDate.now().minusDays(4)),
        ListItem("Organic Lettuce Box", LocalDate.now().minusDays(4)),
        ListItem("Tomato Box w/6", LocalDate.now().minusDays(5)),
        ListItem("Grape Bags 1Kg", LocalDate.now().minusDays(5))
    )

    val groupedItems = items.groupBy { it.date }

    Column(Modifier.fillMaxSize()) {
        Spacer(modifier = Modifier.height(56.dp))
        Text(
            text = "List of audited products",
            style = MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
        )
        LazyColumn(modifier = Modifier.fillMaxSize()) {
            groupedItems.forEach { (date, items) ->
                stickyHeader {
                    Text(
                        text = date.toHeaderText(),
                        modifier = Modifier
                            .fillMaxWidth()
                            .background(Color.LightGray)
                            .padding(8.dp)
                    )
                }
                items(items) { item ->
                    Text(
                        text = item.text,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 16.dp, end = 16.dp, top = 8.dp, bottom = 8.dp)
                    )
                }
            }
        }
    }
}

@Composable
@Preview
fun GroupedListPreview() {
    GroupedListScreen()
}
