package com.flowerencee9.marketplace.screens.auth.createpassword;

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
public final class CreatePasswordViewModel_Factory implements Factory<CreatePasswordViewModel> {
  private final Provider<AuthRepository> repositoryProvider;

  public CreatePasswordViewModel_Factory(Provider<AuthRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public CreatePasswordViewModel get() {
    return newInstance(repositoryProvider.get());
  }

  public static CreatePasswordViewModel_Factory create(
      Provider<AuthRepository> repositoryProvider) {
    return new CreatePasswordViewModel_Factory(repositoryProvider);
  }

  public static CreatePasswordViewModel newInstance(AuthRepository repository) {
    return new CreatePasswordViewModel(repository);
  }
}
