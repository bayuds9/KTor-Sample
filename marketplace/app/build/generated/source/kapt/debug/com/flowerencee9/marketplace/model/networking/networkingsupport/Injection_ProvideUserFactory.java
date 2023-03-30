package com.flowerencee9.marketplace.model.networking.networkingsupport;

import android.content.Context;
import com.flowerencee9.marketplace.model.networking.repositories.UserRepository;
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
public final class Injection_ProvideUserFactory implements Factory<UserRepository> {
  private final Provider<Context> contextProvider;

  public Injection_ProvideUserFactory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public UserRepository get() {
    return provideUser(contextProvider.get());
  }

  public static Injection_ProvideUserFactory create(Provider<Context> contextProvider) {
    return new Injection_ProvideUserFactory(contextProvider);
  }

  public static UserRepository provideUser(Context context) {
    return Preconditions.checkNotNullFromProvides(Injection.INSTANCE.provideUser(context));
  }
}
