package com.flowerencee9.marketplace.screens.auth.login;

import com.flowerencee9.marketplace.model.networking.repositories.AuthRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class LoginViewModel_Factory implements Factory<LoginViewModel> {
  private final Provider<AuthRepository> repositoryProvider;

  public LoginViewModel_Factory(Provider<AuthRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public LoginViewModel get() {
    return newInstance(repositoryProvider.get());
  }

  public static LoginViewModel_Factory create(Provider<AuthRepository> repositoryProvider) {
    return new LoginViewModel_Factory(repositoryProvider);
  }

  public static LoginViewModel newInstance(AuthRepository repository) {
    return new LoginViewModel(repository);
  }
}
