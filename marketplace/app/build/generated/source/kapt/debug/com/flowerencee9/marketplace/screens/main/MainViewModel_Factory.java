package com.flowerencee9.marketplace.screens.main;

import com.flowerencee9.marketplace.model.networking.repositories.MainRepository;
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
public final class MainViewModel_Factory implements Factory<MainViewModel> {
  private final Provider<MainRepository> repositoryProvider;

  public MainViewModel_Factory(Provider<MainRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public MainViewModel get() {
    return newInstance(repositoryProvider.get());
  }

  public static MainViewModel_Factory create(Provider<MainRepository> repositoryProvider) {
    return new MainViewModel_Factory(repositoryProvider);
  }

  public static MainViewModel newInstance(MainRepository repository) {
    return new MainViewModel(repository);
  }
}
