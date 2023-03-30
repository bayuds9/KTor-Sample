package com.flowerencee9.marketplace.screens.main.account;

import com.flowerencee9.marketplace.model.networking.repositories.UserRepository;
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
public final class AccountViewModel_Factory implements Factory<AccountViewModel> {
  private final Provider<UserRepository> repositoryProvider;

  public AccountViewModel_Factory(Provider<UserRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public AccountViewModel get() {
    return newInstance(repositoryProvider.get());
  }

  public static AccountViewModel_Factory create(Provider<UserRepository> repositoryProvider) {
    return new AccountViewModel_Factory(repositoryProvider);
  }

  public static AccountViewModel newInstance(UserRepository repository) {
    return new AccountViewModel(repository);
  }
}
