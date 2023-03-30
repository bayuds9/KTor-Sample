package com.flowerencee9.marketplace.model.networking.networkingsupport;

import android.content.Context;
import com.flowerencee9.marketplace.model.networking.repositories.TransactionRepository;
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
public final class Injection_ProvideTransactionFactory implements Factory<TransactionRepository> {
  private final Provider<Context> contextProvider;

  public Injection_ProvideTransactionFactory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public TransactionRepository get() {
    return provideTransaction(contextProvider.get());
  }

  public static Injection_ProvideTransactionFactory create(Provider<Context> contextProvider) {
    return new Injection_ProvideTransactionFactory(contextProvider);
  }

  public static TransactionRepository provideTransaction(Context context) {
    return Preconditions.checkNotNullFromProvides(Injection.INSTANCE.provideTransaction(context));
  }
}
