package com.flowerencee9.marketplace.model.networking.repositories;

import android.content.Context;
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
public final class AuthRepository_Factory implements Factory<AuthRepository> {
  private final Provider<KtorService> serviceProvider;

  private final Provider<Context> contextProvider;

  public AuthRepository_Factory(Provider<KtorService> serviceProvider,
      Provider<Context> contextProvider) {
    this.serviceProvider = serviceProvider;
    this.contextProvider = contextProvider;
  }

  @Override
  public AuthRepository get() {
    return newInstance(serviceProvider.get(), contextProvider.get());
  }

  public static AuthRepository_Factory create(Provider<KtorService> serviceProvider,
      Provider<Context> contextProvider) {
    return new AuthRepository_Factory(serviceProvider, contextProvider);
  }

  public static AuthRepository newInstance(KtorService service, Context context) {
    return new AuthRepository(service, context);
  }
}
