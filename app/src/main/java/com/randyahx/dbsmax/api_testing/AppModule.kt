package com.randyahx.dbsmax.api_testing

import com.randyahx.onboarding_presentation.welcome.api_testing.LoginApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Provides
    @Singleton
    fun provideApi(builder: Retrofit.Builder): LoginApi {
        return builder.build().create(LoginApi::class.java)
    }

    @Provides
    @Singleton
    fun provideRetrofit(): Retrofit.Builder {
        return Retrofit.Builder().baseUrl("http://192.168.80.188").addConverterFactory(MoshiConverterFactory.create())
    }
}