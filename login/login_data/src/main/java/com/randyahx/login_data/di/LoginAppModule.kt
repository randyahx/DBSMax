package com.randyahx.login_data.di

import com.randyahx.login_data.remote.LoginApi
import com.randyahx.login_data.repositoryImpl.LoginRepositoryImpl
import com.randyahx.login_domain.repository.LoginRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class LoginAppModule {
    @Provides
    @Singleton
    fun provideOkHttpClient(): OkHttpClient {
        return OkHttpClient.Builder()
            .addInterceptor(
                HttpLoggingInterceptor().apply {
                    level = HttpLoggingInterceptor.Level.BODY
                }
            )
            .build()
    }

    @Provides
    @Singleton
    fun provideLoginApi(client: OkHttpClient): LoginApi {
        return Retrofit.Builder()
            .baseUrl(LoginApi.BASE_URL)
            .addConverterFactory(MoshiConverterFactory.create())
            .build()
            .create(LoginApi::class.java)
    }

    @Provides
    @Singleton
    fun provideCoinRepository(api: LoginApi): LoginRepository {
        return LoginRepositoryImpl(api)
    }
}