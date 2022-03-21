package com.randyahx.login_data.remote

import com.randyahx.core.data.BasicApiResponse
import com.randyahx.login_data.dto.LoginRequest
import com.randyahx.login_data.dto.LoginResponse
import com.randyahx.login_domain.model.JWT
import retrofit2.http.*

interface LoginApi {
    @FormUrlEncoded
    @POST("/api/login")
    suspend fun loginEmail(@Body loginRequest: LoginRequest): BasicApiResponse<LoginResponse>

    companion object {
        const val BASE_URL = "http://10.0.2.2:9101/"
    }
}