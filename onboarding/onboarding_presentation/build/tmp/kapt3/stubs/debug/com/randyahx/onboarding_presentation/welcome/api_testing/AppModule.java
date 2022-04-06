package com.randyahx.onboarding_presentation.welcome.api_testing;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\b\u0010\u0007\u001a\u00020\u0006H\u0007\u00a8\u0006\b"}, d2 = {"Lcom/randyahx/onboarding_presentation/welcome/api_testing/AppModule;", "", "()V", "provideApi", "Lcom/randyahx/onboarding_presentation/welcome/api_testing/LoginApi;", "builder", "Lretrofit2/Retrofit$Builder;", "provideRetrofit", "onboarding_presentation_debug"})
@dagger.Module()
public final class AppModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.randyahx.onboarding_presentation.welcome.api_testing.AppModule INSTANCE = null;
    
    private AppModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.randyahx.onboarding_presentation.welcome.api_testing.LoginApi provideApi(@org.jetbrains.annotations.NotNull()
    retrofit2.Retrofit.Builder builder) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final retrofit2.Retrofit.Builder provideRetrofit() {
        return null;
    }
}