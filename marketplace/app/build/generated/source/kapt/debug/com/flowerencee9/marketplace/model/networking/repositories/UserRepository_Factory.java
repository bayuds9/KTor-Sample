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
public final class UserRepository_Factory implements Factory<UserRepository> {
  private final Provider<KtorService> serviceProvider;

  private final Provider<Context> contextProvider;

  public UserRepository_Factory(Provider<KtorService> serviceProvider,
      Provider<Context> contextProvider) {
    this.serviceProvider = serviceProvider;
    this.contextProvider = contextProvider;
  }

  @Override
  public UserRepository get() {
    return newInstance(serviceProvider.get(), contextProvider.get());
  }

  public static UserRepository_Factory create(Provider<KtorService> serviceProvider,
      Provider<Context> contextProvider) {
    return new UserRepository_Factory(serviceProvider, contextProvider);
  }

  public static UserRepository newInstance(KtorService service, Context context) {
    return new UserRepository(service, context);
  }
}
