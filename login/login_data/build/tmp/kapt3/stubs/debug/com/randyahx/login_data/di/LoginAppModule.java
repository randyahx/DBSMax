package com.randyahx.login_data.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0007J\b\u0010\n\u001a\u00020\tH\u0007\u00a8\u0006\u000b"}, d2 = {"Lcom/randyahx/login_data/di/LoginAppModule;", "", "()V", "provideCoinRepository", "Lcom/randyahx/login_domain/repository/LoginRepository;", "api", "Lcom/randyahx/login_data/remote/LoginApi;", "provideLoginApi", "client", "Lokhttp3/OkHttpClient;", "provideOkHttpClient", "login_data_debug"})
@dagger.Module()
public final class LoginAppModule {
    
    public LoginAppModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final okhttp3.OkHttpClient provideOkHttpClient() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.randyahx.login_data.remote.LoginApi provideLoginApi(@org.jetbrains.annotations.NotNull()
    okhttp3.OkHttpClient client) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.randyahx.login_domain.repository.LoginRepository provideCoinRepository(@org.jetbrains.annotations.NotNull()
    com.randyahx.login_data.remote.LoginApi api) {
        return null;
    }
}