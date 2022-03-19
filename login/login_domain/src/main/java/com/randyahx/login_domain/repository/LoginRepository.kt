package com.randyahx.login_domain.repository

import com.randyahx.login_domain.model.JWT

interface LoginRepository {
    suspend fun loginEmail(username: String, password: String): JWT
}