package com.flowerencee9.marketplace.model.networking.networkingsupport;

import android.content.Context;
import com.flowerencee9.marketplace.model.networking.repositories.MainRepository;
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
public final class Injection_ProvideMainFactory implements Factory<MainRepository> {
  private final Provider<Context> contextProvider;

  public Injection_ProvideMainFactory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public MainRepository get() {
    return provideMain(contextProvider.get());
  }

  public static Injection_ProvideMainFactory create(Provider<Context> contextProvider) {
    return new Injection_ProvideMainFactory(contextProvider);
  }

  public static MainRepository provideMain(Context context) {
    return Preconditions.checkNotNullFromProvides(Injection.INSTANCE.provideMain(context));
  }
}
