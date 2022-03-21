package com.randyahx.login_data.repositoryImpl

import androidx.annotation.StringRes
import com.randyahx.core.utils.Resource
import com.randyahx.core.utils.SimpleResource
import com.randyahx.core.R
import com.randyahx.login_data.dto.LoginRequest
import com.randyahx.login_data.remote.LoginApi
import com.randyahx.login_domain.repository.LoginRepository
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class LoginRepositoryImpl @Inject constructor(
    private val api: LoginApi
): LoginRepository {
    override suspend fun loginEmail(email: String, password: String): SimpleResource {
        val request = LoginRequest(email, password)

        return try {
            val response = api.loginEmail(request)

            if (response.successful) {
                Resource.Success(Unit)
            } else {
                response.message?.let { msg ->
                    Resource.Error(msg)
                } ?: Resource.Error("Error")
            }
        } catch (e: IOException) {
            Resource.Error("Error")
        } catch (e: HttpException) {
            Resource.Error("Error")
        }
    }
}