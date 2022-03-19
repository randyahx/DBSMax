package com.randyahx.login_data.remote

import com.randyahx.login_domain.model.JWT
import retrofit2.http.*

interface LoginApi {
    @FormUrlEncoded
    @POST("login")
    suspend fun loginEmail(@Field("username") username: String, @Field("password") password: String): JWT

    companion object {
        const val BASE_URL = "http://localhost:9091/api/"
    }
}