package com.flowerencee9.marketplace.model.networking.networkingsupport;

import android.content.Context;
import com.flowerencee9.marketplace.model.networking.repositories.AuthRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata("dagger.hilt.android.qualifiers.ApplicationContext")
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class Injection_ProvideAuthFactory implements Factory<AuthRepository> {
  private final Provider<Context> contextProvider;

  public Injection_ProvideAuthFactory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public AuthRepository get() {
    return provideAuth(contextProvider.get());
  }

  public static Injection_ProvideAuthFactory create(Provider<Context> contextProvider) {
    return new Injection_ProvideAuthFactory(contextProvider);
  }

  public static AuthRepository provideAuth(Context context) {
    return Preconditions.checkNotNullFromProvides(Injection.INSTANCE.provideAuth(context));
  }
}