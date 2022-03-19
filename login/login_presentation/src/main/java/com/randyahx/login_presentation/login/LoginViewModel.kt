package com.randyahx.login_presentation.login

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.randyahx.login_domain.di.Resource
import com.randyahx.login_domain.use_cases.LoginEmailUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

@HiltViewModel
class LoginViewModel @Inject constructor(
    private val loginEmailUseCase: LoginEmailUseCase,
    savedStateHandle: SavedStateHandle
): ViewModel() {
    private val _orgIdText = mutableStateOf("")
    val orgIdText: State<String> = _orgIdText

    private val _usernameText = mutableStateOf("")
    val usernameText: State<String> = _usernameText

    private val _emailText = mutableStateOf("")
    val emailText: State<String> = _emailText

    private val _passwordText = mutableStateOf("")
    val passwordText: State<String> = _passwordText

    fun setOrgIdText(orgId: String) {
        _orgIdText.value = orgId
    }

    fun setUsernameText(username: String) {
        _usernameText.value = username
    }

    fun setEmailText(email: String) {
        _emailText.value = email
    }

    fun setPasswordText(password: String) {
        _passwordText.value = password
    }

    private val _jwtState = mutableStateOf(JWTState())
    val jwtState: State<JWTState> = _jwtState

    fun onEvent(event: LoginEvent) {
        when(event) {
            is LoginEvent.Login -> {
                loginEmail()
            }
        }
    }

    private fun loginEmail() {
        loginEmailUseCase(_emailText.value, _passwordText.value).onEach { result ->
            when (result) {
                is Resource.Success -> {
                    _jwtState.value = JWTState(jwt = result.data)
                    System.out.println((_jwtState.value.jwt).toString())
                }
                is Resource.Error -> {
                    _jwtState.value = JWTState(
                        error = result.message ?: "An unexpected error occured"
                    )
                }
                is Resource.Loading -> {
                    _jwtState.value = JWTState(isLoading = true)
                }
            }
        }.launchIn(viewModelScope)
    }
}