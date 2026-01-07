package com.saishaddai.composetraining.navigation

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavEntry
import androidx.navigation3.runtime.NavKey
import androidx.navigation3.runtime.rememberNavBackStack
import androidx.navigation3.ui.NavDisplay
import com.saishaddai.composetraining.screens.BirthdayScreen
import com.saishaddai.composetraining.screens.HomeScreen
import kotlinx.serialization.Serializable

@Serializable
data object Home : NavKey

@Serializable
data class BirthdayCard(val name: String) : NavKey

@Serializable
data object Error : NavKey


@Composable
fun NavigationWrapper() {
    val backStack: NavBackStack<NavKey> = rememberNavBackStack(Home)

    NavDisplay(
        backStack = backStack,
        onBack = { backStack.removeLastOrNull() },
        entryProvider = { key ->
            when (key) {
                is Home -> NavEntry(key) {
                    HomeScreen {
                        //TODO send the right screen
                        backStack.add(BirthdayCard(it))
                    }
                }

                is BirthdayCard -> NavEntry(key) {
                    BirthdayScreen(
                        message = "Happy Birthday ${key.name}!",
                        from = "from Sai"
                    )
                }

                else -> NavEntry(key = Error) {
                    Text("Error")
                }
            }
        }
    )

}