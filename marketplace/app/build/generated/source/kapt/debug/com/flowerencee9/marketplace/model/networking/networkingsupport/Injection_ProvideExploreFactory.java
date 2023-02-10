package com.flowerencee9.marketplace.model.networking.networkingsupport;

import android.content.Context;
import com.flowerencee9.marketplace.model.networking.repositories.ExploreRepository;
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
public final class Injection_ProvideExploreFactory implements Factory<ExploreRepository> {
  private final Provider<Context> contextProvider;

  public Injection_ProvideExploreFactory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public ExploreRepository get() {
    return provideExplore(contextProvider.get());
  }

  public static Injection_ProvideExploreFactory create(Provider<Context> contextProvider) {
    return new Injection_ProvideExploreFactory(contextProvider);
  }

  public static ExploreRepository provideExplore(Context context) {
    return Preconditions.checkNotNullFromProvides(Injection.INSTANCE.provideExplore(context));
  }
}
