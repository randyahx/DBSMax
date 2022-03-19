package com.randyahx.login_data.repositoryImpl

import com.randyahx.login_data.dto.JWTDto
import com.randyahx.login_data.remote.LoginApi
import com.randyahx.login_domain.model.JWT
import com.randyahx.login_domain.repository.LoginRepository
import javax.inject.Inject

class LoginRepositoryImpl @Inject constructor(
    private val api: LoginApi
): LoginRepository {
    override suspend fun loginEmail(username: String, password: String): JWT {
        return api.loginEmail(username, password)
    }
}