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
import com.saishaddai.composetraining.routes.Routes.DiceRoller
import com.saishaddai.composetraining.routes.Routes.EasyDashboard
import com.saishaddai.composetraining.routes.Routes.Error
import com.saishaddai.composetraining.routes.Routes.Home
import com.saishaddai.composetraining.routes.Routes.Quadrant
import com.saishaddai.composetraining.routes.Routes.TaskFinished
import com.saishaddai.composetraining.routes.Routes.Taximeter
import com.saishaddai.composetraining.screens.ArticleScreen
import com.saishaddai.composetraining.screens.BirthdayScreen
import com.saishaddai.composetraining.screens.BusinessCardScreen
import com.saishaddai.composetraining.screens.BasicDashboardScreen
import com.saishaddai.composetraining.screens.ErrorScreen
import com.saishaddai.composetraining.screens.HomeScreen
import com.saishaddai.composetraining.screens.QuadrantScreen
import com.saishaddai.composetraining.screens.TaskManagerScreen
import com.saishaddai.composetraining.screens.TaximeterScreen

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
                        "3" -> backStack.navigateTo(Quadrant)
                        "4" -> backStack.navigateTo(BusinessCard)
                        "5" -> backStack.navigateTo(Taximeter)
                        "6" -> backStack.navigateTo(EasyDashboard)
                        "7" -> backStack.navigateTo(DiceRoller)
                        else -> backStack.navigateTo(Error)
                    }
                }
            }
            entry<BirthdayCard> {
                BirthdayScreen()
            }
            entry<ArticleRoute> {
                ArticleScreen()
            }
            entry<TaskFinished> {
                TaskManagerScreen()
            }
            entry<Quadrant> {
                QuadrantScreen()
            }
            entry<BusinessCard> {
                BusinessCardScreen()
            }
            entry<Taximeter> {
                TaximeterScreen()
            }
            entry<EasyDashboard> {
                BasicDashboardScreen()
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