package com.flowerencee9.marketplace.model.networking.networkingsupport;

import android.content.Context;
import com.flowerencee9.marketplace.model.networking.repositories.CartRepository;
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
public final class Injection_ProvideCartFactory implements Factory<CartRepository> {
  private final Provider<Context> contextProvider;

  public Injection_ProvideCartFactory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public CartRepository get() {
    return provideCart(contextProvider.get());
  }

  public static Injection_ProvideCartFactory create(Provider<Context> contextProvider) {
    return new Injection_ProvideCartFactory(contextProvider);
  }

  public static CartRepository provideCart(Context context) {
    return Preconditions.checkNotNullFromProvides(Injection.INSTANCE.provideCart(context));
  }
}
