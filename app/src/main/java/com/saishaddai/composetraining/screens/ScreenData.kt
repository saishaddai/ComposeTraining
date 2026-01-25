package com.saishaddai.composetraining.screens

data class ScreenInfo(
    val id: String,
    val title: String,
    val description: String,
)

val screens = listOf(
    ScreenInfo(
        "0",
        "Birthday Card",
        "A very simply screen showing a birthday card. From Google Devs Training"
    ),
    ScreenInfo(
        "1",
        "Article",
        "Basic Article with a title, abstract, and body.  From Google Devs Training"
    ),
    ScreenInfo(
        "2",
        "All tasks completed",
        "A screen showing a completed task. From Google Devs Training"
    ),
    ScreenInfo(
        "3",
        "Quadrants",
        "Basic exercise to show info in four quadrants. From Google Devs Training."
    ),
    ScreenInfo(
        "4",
        "Business Card",
        "A business card that includes contact information. From Google Devs Training."
    ),
    ScreenInfo(
        "5",
        "Taximeter",
        "A screen showing a taximeter. Design created with Google Stitch and implemented by me."
    ),
    ScreenInfo(
        "6",
        "Basic Dashboard",
        "Not the best design but I was playing with different composables from Material 3."
    ),
    ScreenInfo(
        "7",
        "Dice Roller",
        "From Google Devs Jetpack Compose Training. Not an actual functional demo. Just the design"
    ),
    ScreenInfo(
        "8",
        "Error Screen",
        "Very simple error screen. Originally to show in case of screen not found"
    ),
    ScreenInfo(
        "9",
        "Magic Card",
        "A screen that shows a Magic: The Gathering card. Based on a mockup provided by the user."
    ),
)
