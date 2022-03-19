package com.randyahx.login_presentation

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import androidx.navigation.NavGraph.Companion.findStartDestination
import com.randyahx.core.navigation.Route
import com.randyahx.core.utils.UiEvent
import com.randyahx.core_ui.LocalSpacing
import com.randyahx.core_ui.components.textfield.CustomOutlinedTextField
import com.randyahx.core_ui.theme.DarkRed
import com.randyahx.core_ui.theme.LightRed
import com.randyahx.core_ui.theme.TextWhite
import com.randyahx.login_presentation.login.LoginViewModel

@Composable
fun LoginOrgIdScreen(
//    onNavigate: (UiEvent.Navigate) -> Unit,
    navController: NavController,
    viewModel: LoginViewModel = hiltViewModel()
) {
    val spacing = LocalSpacing.current

    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(
                start = spacing.spaceLarge,
                end = spacing.spaceLarge,
                top = spacing.spaceLarge,
                bottom = 50.dp
            )
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .align(Alignment.Center),
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = "Login",
                style = MaterialTheme.typography.h1
            )
            Spacer(
                modifier=Modifier.height(spacing.spaceMedium)
            )
            CustomOutlinedTextField(
                value = viewModel.orgIdText.value,
                placeholder = "Org ID",
                onValueChange = { viewModel.setOrgIdText(it) }
            )
            Spacer(modifier = Modifier.height(spacing.spaceMedium))
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
            Spacer(modifier = Modifier.height(spacing.spaceMedium))
            Button(
                onClick = {
                    navController.navigate(Route.MYQR) {
                        popUpTo(navController.graph.findStartDestination().id) {
                            saveState = true
                        }
                        restoreState = true
                    }
                },
                modifier = Modifier.align(Alignment.End)
            ) {
                Text(
                    text = "Login",
                    color = TextWhite
                )
            }
        }

        Text(
            text = buildAnnotatedString {
                append("Login via")
                append(" ")

                val loginMethodText = "Email Address"
                withStyle(
                    style = SpanStyle(
                        color = LightRed
                    )
                ) {
                    append(loginMethodText)
                }
            },
            style = MaterialTheme.typography.body1,
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .clickable {
                navController.navigate(Route.LOGINEMAIL)
            }
        )
    }
}
