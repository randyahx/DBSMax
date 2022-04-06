// Generated by Dagger (https://dagger.dev).
package com.randyahx.onboarding_presentation.welcome.api_testing;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class LoginRepository_Factory implements Factory<LoginRepository> {
  private final Provider<LoginApi> loginApiProvider;

  public LoginRepository_Factory(Provider<LoginApi> loginApiProvider) {
    this.loginApiProvider = loginApiProvider;
  }

  @Override
  public LoginRepository get() {
    return newInstance(loginApiProvider.get());
  }

  public static LoginRepository_Factory create(Provider<LoginApi> loginApiProvider) {
    return new LoginRepository_Factory(loginApiProvider);
  }

  public static LoginRepository newInstance(LoginApi loginApi) {
    return new LoginRepository(loginApi);
  }
}
