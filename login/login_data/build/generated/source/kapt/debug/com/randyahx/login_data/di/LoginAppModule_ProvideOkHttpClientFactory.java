// Generated by Dagger (https://dagger.dev).
package com.randyahx.login_data.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import okhttp3.OkHttpClient;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class LoginAppModule_ProvideOkHttpClientFactory implements Factory<OkHttpClient> {
  private final LoginAppModule module;

  public LoginAppModule_ProvideOkHttpClientFactory(LoginAppModule module) {
    this.module = module;
  }

  @Override
  public OkHttpClient get() {
    return provideOkHttpClient(module);
  }

  public static LoginAppModule_ProvideOkHttpClientFactory create(LoginAppModule module) {
    return new LoginAppModule_ProvideOkHttpClientFactory(module);
  }

  public static OkHttpClient provideOkHttpClient(LoginAppModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideOkHttpClient());
  }
}
