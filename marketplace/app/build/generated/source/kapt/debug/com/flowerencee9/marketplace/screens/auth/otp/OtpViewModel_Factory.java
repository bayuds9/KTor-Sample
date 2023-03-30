package com.flowerencee9.marketplace.screens.auth.otp;

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
public final class OtpViewModel_Factory implements Factory<OtpViewModel> {
  private final Provider<AuthRepository> repositoryProvider;

  public OtpViewModel_Factory(Provider<AuthRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public OtpViewModel get() {
    return newInstance(repositoryProvider.get());
  }

  public static OtpViewModel_Factory create(Provider<AuthRepository> repositoryProvider) {
    return new OtpViewModel_Factory(repositoryProvider);
  }

  public static OtpViewModel newInstance(AuthRepository repository) {
    return new OtpViewModel(repository);
  }
}
