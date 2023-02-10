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
public final class ExploreRepository_Factory implements Factory<ExploreRepository> {
  private final Provider<KtorService> serviceProvider;

  public ExploreRepository_Factory(Provider<KtorService> serviceProvider) {
    this.serviceProvider = serviceProvider;
  }

  @Override
  public ExploreRepository get() {
    return newInstance(serviceProvider.get());
  }

  public static ExploreRepository_Factory create(Provider<KtorService> serviceProvider) {
    return new ExploreRepository_Factory(serviceProvider);
  }

  public static ExploreRepository newInstance(KtorService service) {
    return new ExploreRepository(service);
  }
}
