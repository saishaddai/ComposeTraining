package com.saishaddai.composetraining.routes

import androidx.navigation3.runtime.NavKey
import kotlinx.serialization.Serializable

object Routes {

    @Serializable
    data object Home: NavKey

    @Serializable
    data class BirthdayCard(val name: String): NavKey

    @Serializable
    data object ArticleRoute: NavKey

    @Serializable
    data object TaskFinished: NavKey

    @Serializable
    data object Quadrant: NavKey

    @Serializable
    data object BusinessCard: NavKey

    @Serializable
    data object Taximeter: NavKey

    @Serializable
    data object BasicDashboard: NavKey

    @Serializable
    data object DiceRoller: NavKey

    @Serializable
    data object MagicCard: NavKey

    @Serializable
    data object Lemonade: NavKey

    @Serializable
    data object Masonry: NavKey

    @Serializable
    data object TipCalculator: NavKey

    @Serializable
    data object GroupedList: NavKey

    @Serializable
    data object News: NavKey

    @Serializable
    data object Error: NavKey

}
