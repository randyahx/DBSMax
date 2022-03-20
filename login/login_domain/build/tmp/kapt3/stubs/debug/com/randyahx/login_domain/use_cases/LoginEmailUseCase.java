package com.randyahx.login_domain.use_cases;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J%\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0086\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/randyahx/login_domain/use_cases/LoginEmailUseCase;", "", "repository", "Lcom/randyahx/login_domain/repository/LoginRepository;", "(Lcom/randyahx/login_domain/repository/LoginRepository;)V", "invoke", "Lkotlinx/coroutines/flow/Flow;", "Lcom/randyahx/login_domain/di/Resource;", "Lcom/randyahx/login_domain/model/JWT;", "username", "", "password", "login_domain_debug"})
public final class LoginEmailUseCase {
    private final com.randyahx.login_domain.repository.LoginRepository repository = null;
    
    @javax.inject.Inject()
    public LoginEmailUseCase(@org.jetbrains.annotations.NotNull()
    com.randyahx.login_domain.repository.LoginRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<com.randyahx.login_domain.di.Resource<com.randyahx.login_domain.model.JWT>> invoke(@org.jetbrains.annotations.NotNull()
    java.lang.String username, @org.jetbrains.annotations.NotNull()
    java.lang.String password) {
        return null;
    }
}