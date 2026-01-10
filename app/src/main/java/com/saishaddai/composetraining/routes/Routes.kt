package com.saishaddai.composetraining.routes

import androidx.navigation3.runtime.NavKey
import kotlinx.serialization.Serializable

sealed class Routes: NavKey {
    @Serializable
    data object Home : Routes()

    @Serializable
    data class BirthdayCard(val name: String) : Routes()

    @Serializable
    data object ArticleRoute : Routes()

    @Serializable
    data object TaskFinished : Routes()

    @Serializable
    data object Cuadrant : Routes()

    @Serializable
    data object Error : Routes()
}