package com.randyahx.login_presentation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.randyahx.core.utils.UiEvent
import com.randyahx.core_ui.LocalSpacing

@Composable
fun LoginScreen(
//    onNavigate: (UiEvent.Navigate) -> Unit,
    navController: NavController
) {
    // :core-ui/Dimensions.kt for spacing values (2dp - 64dp)
    val spacing = LocalSpacing.current

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Login Screen")
    }
}