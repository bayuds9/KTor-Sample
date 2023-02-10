package com.flowerencee9.marketplace.screens.main.explore;

import com.flowerencee9.marketplace.model.networking.repositories.ExploreRepository;
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
public final class ExploreViewModel_Factory implements Factory<ExploreViewModel> {
  private final Provider<ExploreRepository> repositoryProvider;

  public ExploreViewModel_Factory(Provider<ExploreRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public ExploreViewModel get() {
    return newInstance(repositoryProvider.get());
  }

  public static ExploreViewModel_Factory create(Provider<ExploreRepository> repositoryProvider) {
    return new ExploreViewModel_Factory(repositoryProvider);
  }

  public static ExploreViewModel newInstance(ExploreRepository repository) {
    return new ExploreViewModel(repository);
  }
}
