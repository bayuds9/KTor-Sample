package com.flowerencee9.marketplace.screens.auth.forgotpassword;

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
public final class ForgotPasswordViewModel_Factory implements Factory<ForgotPasswordViewModel> {
  private final Provider<AuthRepository> repositoryProvider;

  public ForgotPasswordViewModel_Factory(Provider<AuthRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public ForgotPasswordViewModel get() {
    return newInstance(repositoryProvider.get());
  }

  public static ForgotPasswordViewModel_Factory create(
      Provider<AuthRepository> repositoryProvider) {
    return new ForgotPasswordViewModel_Factory(repositoryProvider);
  }

  public static ForgotPasswordViewModel newInstance(AuthRepository repository) {
    return new ForgotPasswordViewModel(repository);
  }
}
