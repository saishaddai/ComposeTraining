package com.saishaddai.composetraining.navigation

import androidx.compose.animation.core.tween
import androidx.compose.animation.slideInHorizontally
import androidx.compose.animation.slideOutHorizontally
import androidx.compose.animation.togetherWith
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import androidx.navigation3.runtime.entryProvider
import androidx.navigation3.runtime.rememberNavBackStack
import androidx.navigation3.ui.NavDisplay
import com.saishaddai.composetraining.routes.Routes.BirthdayCard
import com.saishaddai.composetraining.routes.Routes.Error
import com.saishaddai.composetraining.routes.Routes.Home
import com.saishaddai.composetraining.screens.BirthdayScreen
import com.saishaddai.composetraining.screens.HomeScreen

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
                    backStack.navigateTo(BirthdayCard(it))
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
        },
        transitionSpec = {
            slideInHorizontally(
                initialOffsetX = { it },
                animationSpec = tween(1000)
            ) togetherWith slideOutHorizontally(
                targetOffsetX = { -it },
                animationSpec = tween(1000)
            )
        },
        popTransitionSpec = {
            slideInHorizontally(
                initialOffsetX = { -it },
                animationSpec = tween(500)
            ) togetherWith slideOutHorizontally(
                targetOffsetX = { it },
                animationSpec = tween(500)
            )
        },
        predictivePopTransitionSpec = {
            slideInHorizontally(
                initialOffsetX = { -it },
                animationSpec = tween(500)
            ) togetherWith slideOutHorizontally(
                targetOffsetX = { it },
                animationSpec = tween(500)
            )
        }
    )

}