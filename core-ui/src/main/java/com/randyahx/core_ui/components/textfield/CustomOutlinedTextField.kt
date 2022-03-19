package com.randyahx.core_ui.components.textfield

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ModifierInfo
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.toLowerCase
import com.randyahx.core_ui.R
import com.randyahx.core_ui.theme.DarkRed
import com.randyahx.core_ui.theme.LightRed
import com.randyahx.core_ui.theme.LightestGray
import com.randyahx.core_ui.theme.TextWhite

@Composable
fun CustomOutlinedTextField(
//    label: String,
    modifier: Modifier = Modifier,
    value: String,
    placeholder: String = "",
    onValueChange: (String) -> Unit,
    isError: Boolean = false,
    singleLine: Boolean = true,
    visualTransformation: VisualTransformation = VisualTransformation.None,
    keyboardOptions: KeyboardType = KeyboardType.Text,
//    validate: Boolean = true
) {
    var isPassword by remember { mutableStateOf(keyboardOptions == KeyboardType.Password) }
    var isPasswordVisible by remember { mutableStateOf(false) }

//    fun validateInput(input: String): Boolean {
//        if (input.trim().lowercase() == "email") {
//            if (value.contains("@")) {
//                return true
//            }
//        }
//        return false
//    }

    Column(
        modifier = modifier.fillMaxWidth()
    ) {
        OutlinedTextField(
            value = value,
            onValueChange = onValueChange,
            placeholder = { Text(text = placeholder, style = MaterialTheme.typography.body1) },
            isError = isError,
            //        label = { Text(text = label) },
            visualTransformation = if (!isPasswordVisible && isPassword) {
                PasswordVisualTransformation()
            } else {
                VisualTransformation.None
            },
            keyboardOptions = KeyboardOptions(keyboardType = keyboardOptions),
            singleLine = singleLine,
            trailingIcon = {
                if (isPassword) {
                    IconButton(onClick = {
                        isPasswordVisible = !isPasswordVisible
                    }) {
                        Icon(
                            imageVector = if (isPasswordVisible) {
                                Icons.Filled.VisibilityOff
                            } else {
                                Icons.Filled.Visibility
                            },
                            contentDescription = if (isPasswordVisible) {
                                stringResource(id = R.string.login_passwordPlaceholderVisible)
                            } else {
                                stringResource(id = R.string.login_passwordPlaceholderHidden)
                            },
                            tint = LightestGray
                        )
                    }
                }
            },
            modifier = Modifier.fillMaxWidth(),
            colors = TextFieldDefaults.outlinedTextFieldColors(
                focusedBorderColor = TextWhite
            )
        )
    }
}

// CustomOutlinedTextField("password", PasswordVisualTransformation(), KeyboardOptions(keyboardType = KeyboardType.Password)