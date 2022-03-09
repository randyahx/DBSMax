package com.randyahx.core_ui.components.bottomnavbar

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Settings
import androidx.compose.runtime.compositionLocalOf
import com.randyahx.core_ui.Dimensions


object BottomNavItemList {
    val items : List<BottomNavItem> = listOf(
        BottomNavItem(
            name = "My QR",
            route = "myqr",
            icon = Icons.Default.Home
        ),
        BottomNavItem(
            name = "History",
            route = "history",
            icon = Icons.Default.Notifications
        ),
        BottomNavItem(
            name = "Settings",
            route = "settings",
            icon = Icons.Default.Settings
        )
    )
}

