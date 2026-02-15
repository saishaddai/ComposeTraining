package com.saishaddai.composetraining.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowForward
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.BarChart
import androidx.compose.material.icons.filled.Bookmark
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.WbSunny
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.saishaddai.composetraining.R

@Composable
fun NewsScreen() {
    Scaffold(
        modifier = Modifier.background(Color(0xFF121212)),
        bottomBar = { BottomNavigationBar() }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .background(Color(0xFF121212))
                .verticalScroll(rememberScrollState())
        ) {
            Header()
            FeaturedStory()
            QuickAccess()
            LatestNews()
        }
    }
}

@Composable
fun BottomNavigationBar() {
    BottomAppBar(
        containerColor = Color(0xFF1F1F1F),
        contentColor = Color.White,
        actions = {
            IconButton(onClick = { /* do something */ }) {
                Icon(Icons.Filled.Home, contentDescription = "Home", tint = Color(0xFFC659FF))
            }
            IconButton(onClick = { /* do something */ }) {
                Icon(Icons.Filled.Search, contentDescription = "Search", tint = Color.Gray)
            }
            Spacer(modifier = Modifier.weight(1f))
            IconButton(onClick = { /* do something */ }) {
                Icon(Icons.Filled.Bookmark, contentDescription = "Bookmark", tint = Color.Gray)
            }
            IconButton(onClick = { /* do something */ }) {
                Icon(Icons.Filled.Person, contentDescription = "Profile", tint = Color.Gray)
            }
        },
        floatingActionButton = {
            FloatingActionButton(
                onClick = { /* do something */ },
                containerColor = Color(0xFFC659FF),
                shape = CircleShape,
            ) {
                Icon(Icons.Filled.Add, "Add", tint = Color.White)
            }
        }
    )
}

@Composable
fun Header() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Image(
                imageVector = Icons.Default.Person,
                contentDescription = "User Avatar",
                modifier = Modifier
                    .size(48.dp)
                    .clip(CircleShape)
                    .background(Color.Gray)
            )
            Column(modifier = Modifier.padding(start = 8.dp)) {
                Text(
                    text = "GOOD MORNING",
                    style = MaterialTheme.typography.bodySmall,
                    color = Color.Gray
                )
                Text(
                    text = "Alex",
                    style = MaterialTheme.typography.titleMedium,
                    color = Color.White
                )
            }
        }
        Icon(
            imageVector = Icons.Default.DateRange,
            contentDescription = "Calendar",
            tint = Color.White
        )
    }
}

@Composable
fun FeaturedStory() {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        shape = RoundedCornerShape(16.dp)
    ) {
        Box(modifier = Modifier.height(200.dp)) {
            Image(
                painter = painterResource(id = R.drawable.bg_compose_background),
                contentDescription = "Featured Story Background",
                contentScale = ContentScale.Crop,
                modifier = Modifier.fillMaxSize()
            )
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp),
                verticalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = "FEATURED STORY",
                    color = Color.White,
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .background(Color(0x80000000), RoundedCornerShape(4.dp))
                        .padding(horizontal = 8.dp, vertical = 4.dp)
                )
                Column {
                    Text(
                        text = "The Future of AI Design",
                        style = MaterialTheme.typography.headlineMedium,
                        color = Color.White
                    )
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Text(
                            text = "Exploring how generative...",
                            color = Color.White,
                            modifier = Modifier.weight(1f)
                        )
                        Button(
                            onClick = { /*TODO*/ },
                            shape = CircleShape,
                            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFC659FF)),
                            modifier = Modifier.size(56.dp)
                        ) {
                            Icon(
                                Icons.AutoMirrored.Filled.ArrowForward,
                                contentDescription = "Read Now",
                                tint = Color.White
                            )
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun QuickAccess() {
    Column(modifier = Modifier.padding(16.dp)) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "Quick Access",
                style = MaterialTheme.typography.titleMedium,
                color = Color.White
            )
            Text(text = "Edit", color = Color.Gray)
        }
        Spacer(modifier = Modifier.height(16.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            QuickAccessItem(icon = Icons.Default.WbSunny, text = "Weather")
            QuickAccessItem(icon = Icons.Default.DateRange, text = "To-Do")
            QuickAccessItem(icon = Icons.Default.BarChart, text = "Stats")
            QuickAccessItem(icon = Icons.Default.Notifications, text = "Alerts")
        }
    }
}

@Composable
fun QuickAccessItem(icon: ImageVector, text: String) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Box(
            modifier = Modifier
                .size(64.dp)
                .clip(CircleShape)
                .background(Color(0xFF2A2A2A)),
            contentAlignment = Alignment.Center
        ) {
            Icon(imageVector = icon, contentDescription = text, tint = Color.White)
        }
        Spacer(modifier = Modifier.height(8.dp))
        Text(text = text, color = Color.White, fontSize = 12.sp)
    }
}

@Composable
fun LatestNews() {
    Column(modifier = Modifier.padding(16.dp)) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "Latest News",
                style = MaterialTheme.typography.titleMedium,
                color = Color.White
            )
            Text(text = "View All", color = Color.Gray)
        }
        Spacer(modifier = Modifier.height(16.dp))
        Column {
            NewsArticle(
                "AEROSPACE",
                "SpaceX Starship prepares for next orbital flight test",
                "2h ago",
                "4 min read"
            )
            Spacer(modifier = Modifier.height(16.dp))
            NewsArticle(
                "DEVELOPMENT",
                "Understanding the new CSS Scroll-Driven Animations",
                "5h ago",
                "8 min read"
            )
            Spacer(modifier = Modifier.height(16.dp))
            NewsArticle(
                "FINANCE",
                "Global markets rally as inflation data stabilizes",
                "8h ago",
                "3 min read"
            )
        }
    }
}

@Composable
fun NewsArticle(category: String, title: String, time: String, readTime: String) {
    Row(verticalAlignment = Alignment.CenterVertically) {
        Image(
            painter = painterResource(id = R.drawable.androidparty),
            contentDescription = title,
            modifier = Modifier
                .size(80.dp)
                .clip(RoundedCornerShape(8.dp))
        )
        Column(modifier = Modifier.padding(start = 16.dp)) {
            Text(
                text = category,
                color = Color(0xFFC659FF),
                style = MaterialTheme.typography.bodySmall
            )
            Text(text = title, style = MaterialTheme.typography.titleMedium, color = Color.White)
            Row {
                Text(text = time, color = Color.Gray, style = MaterialTheme.typography.bodySmall)
                Text(
                    text = " • $readTime",
                    color = Color.Gray,
                    style = MaterialTheme.typography.bodySmall
                )
            }
        }
    }
}

@Preview(showBackground = true, backgroundColor = 0xFF121212)
@Composable
fun NewsScreenPreview() {
    NewsScreen()
}
