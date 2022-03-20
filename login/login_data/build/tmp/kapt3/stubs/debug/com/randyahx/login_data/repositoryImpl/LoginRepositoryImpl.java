package com.randyahx.login_data.repositoryImpl;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J!\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000b"}, d2 = {"Lcom/randyahx/login_data/repositoryImpl/LoginRepositoryImpl;", "Lcom/randyahx/login_domain/repository/LoginRepository;", "api", "Lcom/randyahx/login_data/remote/LoginApi;", "(Lcom/randyahx/login_data/remote/LoginApi;)V", "loginEmail", "Lcom/randyahx/login_domain/model/JWT;", "username", "", "password", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "login_data_debug"})
public final class LoginRepositoryImpl implements com.randyahx.login_domain.repository.LoginRepository {
    private final com.randyahx.login_data.remote.LoginApi api = null;
    
    @javax.inject.Inject()
    public LoginRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.randyahx.login_data.remote.LoginApi api) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object loginEmail(@org.jetbrains.annotations.NotNull()
    java.lang.String username, @org.jetbrains.annotations.NotNull()
    java.lang.String password, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.randyahx.login_domain.model.JWT> continuation) {
        return null;
    }
}