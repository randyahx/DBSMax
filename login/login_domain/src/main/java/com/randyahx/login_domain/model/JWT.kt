package com.randyahx.login_domain.model

data class JWT(
    val access_token: String,
    val refresh_token: String
)