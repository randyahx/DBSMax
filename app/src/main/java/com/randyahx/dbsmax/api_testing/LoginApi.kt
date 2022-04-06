package com.randyahx.onboarding_presentation.welcome.api_testing

import com.randyahx.dbsmax.api_testing.JWT
import com.randyahx.dbsmax.api_testing.LoginInfo
import retrofit2.http.Body
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface LoginApi {
    @FormUrlEncoded
    @POST("/auth/login")
    suspend fun login(@Field("username") username: String, @Field("password") password: String): JWT
}