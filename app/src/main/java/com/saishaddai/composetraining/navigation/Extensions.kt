package com.saishaddai.composetraining.navigation

import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey

fun NavBackStack<NavKey>.navigateTo(screen: NavKey) = add(screen)

fun NavBackStack<NavKey>.navigateBack() = removeLastOrNull()



