package com.randyahx.dbsmax

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.randyahx.core_ui.components.bottomnavbar.BottomNavBar
import com.randyahx.core_ui.components.bottomnavbar.BottomNavItemList
import com.randyahx.core_ui.theme.DBSMaxTheme
import com.randyahx.dbsmax.navigation.BottomNavRoutes
import com.randyahx.dbsmax.navigation.Navigation
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            // Content wrapped in surface theme -> Wrapped in scaffold for bottom navbar -> Navigation to other screens
            DBSMaxTheme {
                Surface(
                    color = MaterialTheme.colors.background,
                    modifier = Modifier.fillMaxSize()
                ) {
                    // Bottom Navbar
                    val navController = rememberNavController()
                    val navBackStackEntry by navController.currentBackStackEntryAsState()

                    Scaffold(
                        bottomBar = {
                            BottomNavBar(
                                items = BottomNavItemList.items,
                                visible = navBackStackEntry?.destination?.route in BottomNavRoutes.items,
                                navController = navController,
                                onItemClick = { navController.navigate(it.route) }
                            )
                        }
                    ) {
                        Navigation(navController = navController)
                    }
                }
            }
        }
    }
}