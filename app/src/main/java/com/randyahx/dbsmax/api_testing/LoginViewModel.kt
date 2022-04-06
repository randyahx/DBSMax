package com.randyahx.dbsmax.api_testing

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.randyahx.dbsmax.api_testing.JWT
import com.randyahx.dbsmax.api_testing.LoginInfo
import com.randyahx.dbsmax.api_testing.LoginRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class LoginViewModel @Inject constructor(
    private val loginRepository: LoginRepository
): ViewModel() {
    private val jwt: JWT = JWT("", "")
    private val _state = MutableStateFlow(jwt)
        val state: StateFlow<JWT>
    get() = _state

    init {
        viewModelScope.launch {
            val token = loginRepository.login("superadmin", "password")
            _state.value = token
        }
    }
}