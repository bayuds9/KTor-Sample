package com.flowerencee9.marketplace.screens.auth.register;

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
public final class RegisterViewModel_Factory implements Factory<RegisterViewModel> {
  private final Provider<AuthRepository> repositoryProvider;

  public RegisterViewModel_Factory(Provider<AuthRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public RegisterViewModel get() {
    return newInstance(repositoryProvider.get());
  }

  public static RegisterViewModel_Factory create(Provider<AuthRepository> repositoryProvider) {
    return new RegisterViewModel_Factory(repositoryProvider);
  }

  public static RegisterViewModel newInstance(AuthRepository repository) {
    return new RegisterViewModel(repository);
  }
}
