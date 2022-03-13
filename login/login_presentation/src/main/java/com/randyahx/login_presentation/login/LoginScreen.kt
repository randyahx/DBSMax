package com.randyahx.login_presentation

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.VisualTransformation
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.randyahx.core.utils.UiEvent
import com.randyahx.core_ui.LocalSpacing
import com.randyahx.core_ui.components.textfield.CustomOutlinedTextField
import com.randyahx.login_presentation.login.LoginViewModel

@Composable
fun LoginScreen(
//    onNavigate: (UiEvent.Navigate) -> Unit,
    navController: NavController,
    viewModel: LoginViewModel = hiltViewModel()
) {
    val spacing = LocalSpacing.current

    Box(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(spacing.spaceMedium)
                .align(Alignment.Center)
        ) {
            Text(
                text = "Login",
                style = MaterialTheme.typography.h1
            )
            Spacer(
                modifier=Modifier.height(spacing.spaceMedium)
            )
            CustomOutlinedTextField(
                value = viewModel.usernameText.value,
                placeholder = "Username",
                onValueChange = { viewModel.setUsernameText(it) }
            )
            Spacer(modifier = Modifier.height(spacing.spaceMedium))
            CustomOutlinedTextField(
                value = viewModel.passwordText.value,
                placeholder = "Password",
                onValueChange = { viewModel.setPasswordText(it) },
                keyboardOptions = KeyboardType.Password
            )
        }
    }
}
