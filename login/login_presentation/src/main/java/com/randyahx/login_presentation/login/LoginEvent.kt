package com.randyahx.login_presentation.login

sealed class LoginEvent {
    object Login : LoginEvent()
}