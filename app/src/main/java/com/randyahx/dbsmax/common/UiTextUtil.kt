package com.randyahx.dbsmax.common

import android.content.Context
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource

@Composable
fun UiText.uiText(uiText: UiText): String {
            return when(uiText) {
            is UiText.DynamicString -> uiText.value
            is UiText.StringResource -> stringResource(id = uiText.id)
        }
}