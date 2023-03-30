package com.flowerencee9.marketplace.model.networking.repositories;

import com.flowerencee9.marketplace.model.networking.ktor.KtorService;
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
public final class TransactionRepository_Factory implements Factory<TransactionRepository> {
  private final Provider<KtorService> serviceProvider;

  public TransactionRepository_Factory(Provider<KtorService> serviceProvider) {
    this.serviceProvider = serviceProvider;
  }

  @Override
  public TransactionRepository get() {
    return newInstance(serviceProvider.get());
  }

  public static TransactionRepository_Factory create(Provider<KtorService> serviceProvider) {
    return new TransactionRepository_Factory(serviceProvider);
  }

  public static TransactionRepository newInstance(KtorService service) {
    return new TransactionRepository(service);
  }
}
