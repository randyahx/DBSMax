package com.randyahx.splashscreen_presentation

import android.view.animation.OvershootInterpolator
import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavController
import com.randyahx.core.utils.UiEvent
import kotlinx.coroutines.delay

@Composable
fun SplashscreenScreen(
    navController: NavController,
    icon: Int,
    delayDuration: Long = 3000L,
    nextScreen: String = "login"
) {
    // Animation
    val scale = remember { Animatable(0f) }
    val overshootInterpolator = remember { OvershootInterpolator(2f) }

    LaunchedEffect(key1 = true) {
        scale.animateTo(
            targetValue = 0.5f,
            animationSpec = tween(
                durationMillis = 500,
                easing = { overshootInterpolator.getInterpolation(it) }
            )
        )
        // Route to next screen and remove this screen from the stack (Prevents user from clicking back into the splashscreen)
        delay(delayDuration)
        navController.popBackStack()
        navController.navigate(nextScreen)
    }

    // UI Elements
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Image(
            painter = painterResource(id = icon),
            contentDescription = "Logo",
            modifier = Modifier.scale(scale.value)
        )
    }
}