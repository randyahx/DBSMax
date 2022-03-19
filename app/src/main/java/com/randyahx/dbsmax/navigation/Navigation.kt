package com.randyahx.dbsmax.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.randyahx.core.navigation.Route
import com.randyahx.dbsmax.R
import com.randyahx.history_presentation.HistoryScreen
import com.randyahx.login_presentation.LoginEmailScreen
import com.randyahx.login_presentation.LoginOrgIdScreen
import com.randyahx.myqr_presentation.MyQRScreen
import com.randyahx.settings_presentation.SettingsScreen
import com.randyahx.splashscreen_presentation.SplashscreenScreen

@Composable
fun Navigation(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = Route.LOGINEMAIL
    ) {
        composable(Route.SPLASHSCREEN) {
            SplashscreenScreen(
                navController = navController,
                icon = R.drawable.dbsmaxlogo,
                nextScreen = Route.LOGINORGID
            )
        }
        composable(Route.LOGINORGID) {
            LoginOrgIdScreen(navController = navController)
        }
        composable(Route.LOGINEMAIL) {
            LoginEmailScreen(navController = navController)
        }
        composable(Route.MYQR) {
            MyQRScreen(navController = navController)
        }
        composable(Route.HISTORY) {
            HistoryScreen(navController = navController)
        }
        composable(Route.SETTINGS) {
            SettingsScreen(navController = navController)
        }
    }
}