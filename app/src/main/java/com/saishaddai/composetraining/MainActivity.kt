package com.saishaddai.composetraining

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.saishaddai.composetraining.navigation.NavigationWrapper
import com.saishaddai.composetraining.ui.theme.ComposeTrainingTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeTrainingTheme {
                NavigationWrapper()
            }
        }
    }
}
