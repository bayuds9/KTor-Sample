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
public final class MainRepository_Factory implements Factory<MainRepository> {
  private final Provider<KtorService> serviceProvider;

  public MainRepository_Factory(Provider<KtorService> serviceProvider) {
    this.serviceProvider = serviceProvider;
  }

  @Override
  public MainRepository get() {
    return newInstance(serviceProvider.get());
  }

  public static MainRepository_Factory create(Provider<KtorService> serviceProvider) {
    return new MainRepository_Factory(serviceProvider);
  }

  public static MainRepository newInstance(KtorService service) {
    return new MainRepository(service);
  }
}
