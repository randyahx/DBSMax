package com.randyahx.dbsmax

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.randyahx.core.navigation.Route
import com.randyahx.core_ui.theme.DBSMaxTheme
import com.randyahx.dbsmax.navigation.navigate
import com.randyahx.onboarding_presentation.welcome.WelcomeScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DBSMaxTheme {
                val navController = rememberNavController()

                NavHost(
                    navController = navController,
                    startDestination = Route.WELCOME
                ) {
                    composable(Route.WELCOME) {
                        WelcomeScreen(onNavigate = navController::navigate)
                    }
                    composable(Route.ACTIVITY) {

                    }
                    composable(Route.AGE) {

                    }
                    composable(Route.GENDER) {

                    }
                    composable(Route.GOAL) {

                    }
                    composable(Route.HEIGHT) {

                    }
                    composable(Route.WEIGHT) {

                    }
                    composable(Route.NUTRIENT_GOAL) {

                    }
                    composable(Route.SEARCH) {

                    }
                    composable(Route.TRACKER_OVERVIEW) {

                    }
                }

            }
        }
    }
}


