package com.saishaddai.composetraining.navigation

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.snapshots.SnapshotStateList
import androidx.navigation3.runtime.NavEntry
import androidx.navigation3.ui.NavDisplay
import com.saishaddai.composetraining.screens.HomeScreen

data object Home
data class BirthdayCard(val name: String)


@Composable
fun NavigationWrapper() {
    val backStack: SnapshotStateList<Any> = remember { mutableStateListOf(Home) }

    NavDisplay(
        backStack = backStack,
        onBack = { backStack.removeLastOrNull() },
        entryProvider = { key ->
            when (key) {
                is Home -> NavEntry(key) {
                    HomeScreen {
                        backStack.add(BirthdayCard(it))
                    }
                }
                is BirthdayCard -> NavEntry(key) {
                    HomeScreen {
                        backStack.add(BirthdayCard(it))
                    }
                }
                else -> NavEntry(key = Unit) {
                    Text("Error")
                }
            }
        }
    )

}