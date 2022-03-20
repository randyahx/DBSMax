package com.randyahx.login_data.remote;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u0000 \b2\u00020\u0001:\u0001\bJ%\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\t"}, d2 = {"Lcom/randyahx/login_data/remote/LoginApi;", "", "loginEmail", "Lcom/randyahx/login_domain/model/JWT;", "username", "", "password", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "login_data_debug"})
public abstract interface LoginApi {
    @org.jetbrains.annotations.NotNull()
    public static final com.randyahx.login_data.remote.LoginApi.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String BASE_URL = "http://localhost:9091/api/";
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "login")
    @retrofit2.http.FormUrlEncoded()
    public abstract java.lang.Object loginEmail(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "username")
    java.lang.String username, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "password")
    java.lang.String password, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.randyahx.login_domain.model.JWT> continuation);
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/randyahx/login_data/remote/LoginApi$Companion;", "", "()V", "BASE_URL", "", "login_data_debug"})
    public static final class Companion {
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String BASE_URL = "http://localhost:9091/api/";
        
        private Companion() {
            super();
        }
    }
}