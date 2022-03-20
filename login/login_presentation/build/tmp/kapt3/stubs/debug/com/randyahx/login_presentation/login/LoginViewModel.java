package com.randyahx.login_presentation.login;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u001b\u001a\u00020\u001cH\u0002J\u000e\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001fJ\u000e\u0010 \u001a\u00020\u001c2\u0006\u0010!\u001a\u00020\tJ\u000e\u0010\"\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020\tJ\u000e\u0010$\u001a\u00020\u001c2\u0006\u0010%\u001a\u00020\tJ\u000e\u0010&\u001a\u00020\u001c2\u0006\u0010\'\u001a\u00020\tR\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\t0\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\t0\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\t0\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012\u00a8\u0006("}, d2 = {"Lcom/randyahx/login_presentation/login/LoginViewModel;", "Landroidx/lifecycle/ViewModel;", "loginEmailUseCase", "Lcom/randyahx/login_domain/use_cases/LoginEmailUseCase;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "(Lcom/randyahx/login_domain/use_cases/LoginEmailUseCase;Landroidx/lifecycle/SavedStateHandle;)V", "_emailText", "Landroidx/compose/runtime/MutableState;", "", "_jwtState", "Lcom/randyahx/login_presentation/login/JWTState;", "_orgIdText", "_passwordText", "_usernameText", "emailText", "Landroidx/compose/runtime/State;", "getEmailText", "()Landroidx/compose/runtime/State;", "jwtState", "getJwtState", "orgIdText", "getOrgIdText", "passwordText", "getPasswordText", "usernameText", "getUsernameText", "loginEmail", "", "onEvent", "event", "Lcom/randyahx/login_presentation/login/LoginEvent;", "setEmailText", "email", "setOrgIdText", "orgId", "setPasswordText", "password", "setUsernameText", "username", "login_presentation_debug"})
public final class LoginViewModel extends androidx.lifecycle.ViewModel {
    private final com.randyahx.login_domain.use_cases.LoginEmailUseCase loginEmailUseCase = null;
    private final androidx.compose.runtime.MutableState<java.lang.String> _orgIdText = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.runtime.State<java.lang.String> orgIdText = null;
    private final androidx.compose.runtime.MutableState<java.lang.String> _usernameText = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.runtime.State<java.lang.String> usernameText = null;
    private final androidx.compose.runtime.MutableState<java.lang.String> _emailText = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.runtime.State<java.lang.String> emailText = null;
    private final androidx.compose.runtime.MutableState<java.lang.String> _passwordText = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.runtime.State<java.lang.String> passwordText = null;
    private final androidx.compose.runtime.MutableState<com.randyahx.login_presentation.login.JWTState> _jwtState = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.runtime.State<com.randyahx.login_presentation.login.JWTState> jwtState = null;
    
    @javax.inject.Inject()
    public LoginViewModel(@org.jetbrains.annotations.NotNull()
    com.randyahx.login_domain.use_cases.LoginEmailUseCase loginEmailUseCase, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.SavedStateHandle savedStateHandle) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.compose.runtime.State<java.lang.String> getOrgIdText() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.compose.runtime.State<java.lang.String> getUsernameText() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.compose.runtime.State<java.lang.String> getEmailText() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.compose.runtime.State<java.lang.String> getPasswordText() {
        return null;
    }
    
    public final void setOrgIdText(@org.jetbrains.annotations.NotNull()
    java.lang.String orgId) {
    }
    
    public final void setUsernameText(@org.jetbrains.annotations.NotNull()
    java.lang.String username) {
    }
    
    public final void setEmailText(@org.jetbrains.annotations.NotNull()
    java.lang.String email) {
    }
    
    public final void setPasswordText(@org.jetbrains.annotations.NotNull()
    java.lang.String password) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.compose.runtime.State<com.randyahx.login_presentation.login.JWTState> getJwtState() {
        return null;
    }
    
    public final void onEvent(@org.jetbrains.annotations.NotNull()
    com.randyahx.login_presentation.login.LoginEvent event) {
    }
    
    private final void loginEmail() {
    }
}