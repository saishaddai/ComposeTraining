package com.saishaddai.composetraining.data


//TODO Add a new value to the class for the screenshot image (R.drawable.xxx)
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
        "Magic Card",
        "This is a hard design. It's a Magic: The Gathering® card"
    ),
    ScreenInfo(
        "9",
        "Lemonade",
        "This is a part of the Android Dev Training for Compose. This one is fully functional"
    ),
    ScreenInfo(
        "10",
        "Masonry List",
        "This is a masonry image list. It mimics the way Pinterest shows the images with random heights"
    ),
    ScreenInfo(
        "11",
        "Tip Calculator",
        "Also part of the Android Dev Training for Compose. This is a simple tip calculator. Fully functional too"
    ),
    ScreenInfo(
        "12",
        "Grouped List",
        "This is a list of elements grouped by date"
    ),
    ScreenInfo(
        "13",
        "News Dashboard",
        "This is a news more complicated dashboard. I asked Google Stitch to set up this challenge"
    ),
    ScreenInfo(
        "999",
        "Error Screen",
        "Very simple error screen. Originally to show in case of screen not found"
    ),
)
