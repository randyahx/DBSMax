package com.randyahx.login_domain.use_cases

import com.randyahx.login_domain.di.Resource
import com.randyahx.login_domain.model.JWT
import com.randyahx.login_domain.repository.LoginRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class LoginEmailUseCase @Inject constructor(
    private val repository: LoginRepository
) {
    operator fun invoke(username: String, password: String): Flow<Resource<JWT>> = flow {
        try {
            emit(Resource.Loading<JWT>())
            val jwt = repository.loginEmail(username, password)
            emit(Resource.Success<JWT>(jwt))
        } catch(e: HttpException) {
            emit(Resource.Error<JWT>(e.localizedMessage ?: "An unexpected error occured"))
        } catch(e: IOException) {
            emit(Resource.Error<JWT>("Couldn't reach server. Check your internet connection."))
        }
    }
}