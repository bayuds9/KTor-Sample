package com.flowerencee9.marketplace.screens.main.summary;

import com.flowerencee9.marketplace.model.networking.repositories.TransactionRepository;
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
public final class SummaryViewModel_Factory implements Factory<SummaryViewModel> {
  private final Provider<TransactionRepository> repositoryProvider;

  public SummaryViewModel_Factory(Provider<TransactionRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public SummaryViewModel get() {
    return newInstance(repositoryProvider.get());
  }

  public static SummaryViewModel_Factory create(
      Provider<TransactionRepository> repositoryProvider) {
    return new SummaryViewModel_Factory(repositoryProvider);
  }

  public static SummaryViewModel newInstance(TransactionRepository repository) {
    return new SummaryViewModel(repository);
  }
}
