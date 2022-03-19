package com.randyahx.login_presentation.login

import com.randyahx.login_domain.model.JWT

data class JWTState(
    val isLoading: Boolean = false,
    val jwt: JWT? = null,
    val error: String = ""
)