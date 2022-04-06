package com.randyahx.dbsmax.api_testing

import com.randyahx.onboarding_presentation.welcome.api_testing.LoginApi
import javax.inject.Inject

class LoginRepository @Inject constructor(
    private val loginApi: LoginApi
){
    suspend fun login(username: String, password: String): JWT {
        return loginApi.login(username, password)
    }
}