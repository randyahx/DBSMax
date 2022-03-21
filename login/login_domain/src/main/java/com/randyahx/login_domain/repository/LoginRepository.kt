package com.randyahx.login_domain.repository

import com.randyahx.core.utils.SimpleResource

interface LoginRepository {
    suspend fun loginEmail(email: String, password: String): SimpleResource
}