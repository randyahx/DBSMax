// Generated by Dagger (https://dagger.dev).
package com.randyahx.login_data.repositoryImpl;

import com.randyahx.login_data.remote.LoginApi;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class LoginRepositoryImpl_Factory implements Factory<LoginRepositoryImpl> {
  private final Provider<LoginApi> apiProvider;

  public LoginRepositoryImpl_Factory(Provider<LoginApi> apiProvider) {
    this.apiProvider = apiProvider;
  }

  @Override
  public LoginRepositoryImpl get() {
    return newInstance(apiProvider.get());
  }

  public static LoginRepositoryImpl_Factory create(Provider<LoginApi> apiProvider) {
    return new LoginRepositoryImpl_Factory(apiProvider);
  }

  public static LoginRepositoryImpl newInstance(LoginApi api) {
    return new LoginRepositoryImpl(api);
  }
}