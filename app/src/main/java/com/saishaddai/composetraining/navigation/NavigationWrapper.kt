package com.saishaddai.composetraining.navigation

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavEntry
import androidx.navigation3.runtime.NavKey
import androidx.navigation3.runtime.entryProvider
import androidx.navigation3.runtime.rememberNavBackStack
import androidx.navigation3.ui.NavDisplay
import com.saishaddai.composetraining.screens.BirthdayScreen
import com.saishaddai.composetraining.screens.HomeScreen
import kotlinx.serialization.Serializable
import com.saishaddai.composetraining.routes.Routes
import com.saishaddai.composetraining.routes.Routes.*
import java.util.Map.entry

@Composable
fun NavigationWrapper() {
    val backStack: NavBackStack<NavKey> = rememberNavBackStack(Home)

    NavDisplay(
        backStack = backStack,
        onBack = { backStack.removeLastOrNull() },
        entryProvider = entryProvider {
            entry<Home> {
                HomeScreen {
                    //TODO send the right screen
                    backStack.add(BirthdayCard(it))
                }
            }
            entry<BirthdayCard> {
                BirthdayScreen(
                    message = "Happy Birthday ${it.name}!",
                    from = "from Sai"
                )
            }
            entry<Error> {
                Text("Error")
            }
        }
    )

}