package com.randyahx.core_ui.components.bottomnavbar

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.slideInVertically
import androidx.compose.animation.slideOutVertically
import androidx.compose.foundation.layout.Column
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.compose.currentBackStackEntryAsState
import com.randyahx.core_ui.LocalSpacing
import com.randyahx.core_ui.components.bottomnavbar.BottomNavItem
import com.randyahx.core_ui.theme.LightRed
import com.randyahx.core_ui.theme.LightestRed
import com.randyahx.core_ui.theme.MediumRed

@Composable
fun BottomNavBar (
    items: List<BottomNavItem>,
    visible: Boolean = false,
    navController: NavController,
    modifier: Modifier = Modifier,
    onItemClick: (BottomNavItem) -> Unit
) {
    val spacing = LocalSpacing.current
    val backStackEntry = navController.currentBackStackEntryAsState()

    if (visible) {
        AnimatedVisibility(
            visible = visible,
            enter = slideInVertically(initialOffsetY = {it}),
            exit = slideOutVertically(targetOffsetY = {it}),
            content = {
                BottomNavigation(
                    modifier = modifier,
                    backgroundColor = Color.DarkGray,
                    elevation = spacing.spaceSmall,
                ) {
                    items.forEach { item ->
                        val selected = item.route == backStackEntry.value?.destination?.route

                        BottomNavigationItem(
                            selected = selected,
//                        onClick = { onItemClick(item)},
                            onClick  = {
                                navController.navigate(item.route) {
                                    launchSingleTop = true
                                    popUpTo(navController.graph.findStartDestination().id) {
                                        saveState = true
                                    }
                                    restoreState = true
                                }
                            },
                            selectedContentColor = LightestRed,
                            unselectedContentColor = Color.Gray,
                            icon = {
                                Column(horizontalAlignment = CenterHorizontally) {
                                    if (item.badgeCount > 0) {
                                        BadgedBox(
                                            badge = {
                                                Text(text = item.badgeCount.toString())
                                            }
                                        ) {
                                            Icon(imageVector = item.icon, contentDescription = item.name)
                                        }
                                    } else {
                                        Icon(imageVector = item.icon, contentDescription = item.name)
                                    }

                                    if (selected) {
                                        Text(
                                            text = item.name,
                                            textAlign = TextAlign.Center,
                                            fontSize = 10.sp
                                        )
                                    }
                                }
                            }
                        )
                    }
                }
            }
        )
    }
}