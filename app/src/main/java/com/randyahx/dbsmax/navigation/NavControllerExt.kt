package com.randyahx.authenticator2fa.navigation

import androidx.navigation.NavController
import com.randyahx.core.utils.UiEvent

fun NavController.navigate(event: UiEvent.Navigate) {
    this.navigate(event.route)
}