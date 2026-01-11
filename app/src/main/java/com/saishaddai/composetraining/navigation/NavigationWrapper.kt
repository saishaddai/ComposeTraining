package com.saishaddai.composetraining.navigation

import androidx.compose.animation.core.tween
import androidx.compose.animation.slideInHorizontally
import androidx.compose.animation.slideOutHorizontally
import androidx.compose.animation.togetherWith
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import androidx.navigation3.runtime.entryProvider
import androidx.navigation3.runtime.rememberNavBackStack
import androidx.navigation3.ui.NavDisplay
import com.saishaddai.composetraining.routes.Routes.ArticleRoute
import com.saishaddai.composetraining.routes.Routes.BirthdayCard
import com.saishaddai.composetraining.routes.Routes.BusinessCard
import com.saishaddai.composetraining.routes.Routes.Cuadrant
import com.saishaddai.composetraining.routes.Routes.Error
import com.saishaddai.composetraining.routes.Routes.Home
import com.saishaddai.composetraining.routes.Routes.TaskFinished
import com.saishaddai.composetraining.screens.ArticleScreen
import com.saishaddai.composetraining.screens.BirthdayScreen
import com.saishaddai.composetraining.screens.BusinessCardScreen
import com.saishaddai.composetraining.screens.ErrorScreen
import com.saishaddai.composetraining.screens.HomeScreen
import com.saishaddai.composetraining.screens.QuadrantScreen
import com.saishaddai.composetraining.screens.TaskManagerScreen

@Composable
fun NavigationWrapper() {
    val backStack: NavBackStack<NavKey> = rememberNavBackStack(Home)

    NavDisplay(
        backStack = backStack,
        onBack = { backStack.removeLastOrNull() },
        entryProvider = entryProvider {
            entry<Home> {
                HomeScreen {
                    when (it) {
                        //TODO Improve this part to depend on a sealed class instead of the index as String
                        "0" -> backStack.navigateTo(BirthdayCard(it))
                        "1" -> backStack.navigateTo(ArticleRoute)
                        "2" -> backStack.navigateTo(TaskFinished)
                        "3" -> backStack.navigateTo(Cuadrant)
                        "4" -> backStack.navigateTo(BusinessCard)
                        else -> backStack.navigateTo(Error)
                    }
                }
            }
            entry<BirthdayCard> {
                BirthdayScreen(
                    message = "Happy Birthday ${it.name}!",
                    from = "from Sai"
                )
            }
            entry<ArticleRoute> {
                ArticleScreen(
                    title = "Title of article",
                    articleAbstract = "Abstract of article",
                    articleText = "Article Text",
                )
            }
            entry<TaskFinished> {
                TaskManagerScreen()
            }
            entry<Cuadrant> {
                QuadrantScreen()
            }
            entry<BusinessCard> {
                BusinessCardScreen()
            }
            entry<Error> {
                ErrorScreen { backStack.navigateBack() }
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