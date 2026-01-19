package com.saishaddai.composetraining.routes

import androidx.navigation3.runtime.NavKey
import kotlinx.serialization.Serializable

sealed class Routes : NavKey {
    @Serializable
    data object Home : Routes()

    @Serializable
    data class BirthdayCard(val name: String) : Routes()

    @Serializable
    data object ArticleRoute : Routes()

    @Serializable
    data object TaskFinished : Routes()

    @Serializable
    data object Quadrant : Routes()

    @Serializable
    data object BusinessCard : Routes()

    @Serializable
    data object Taximeter : Routes()

    @Serializable
    data object EasyDashboard : Routes()

    @Serializable
    data object DiceRoller : Routes()

    @Serializable
    data object Error : Routes()
}