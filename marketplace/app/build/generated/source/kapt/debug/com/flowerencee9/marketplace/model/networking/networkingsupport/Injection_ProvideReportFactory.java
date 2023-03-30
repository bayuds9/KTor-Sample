package com.flowerencee9.marketplace.model.networking.networkingsupport;

import android.content.Context;
import com.flowerencee9.marketplace.model.networking.repositories.ReportRepository;
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
public final class Injection_ProvideReportFactory implements Factory<ReportRepository> {
  private final Provider<Context> contextProvider;

  public Injection_ProvideReportFactory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public ReportRepository get() {
    return provideReport(contextProvider.get());
  }

  public static Injection_ProvideReportFactory create(Provider<Context> contextProvider) {
    return new Injection_ProvideReportFactory(contextProvider);
  }

  public static ReportRepository provideReport(Context context) {
    return Preconditions.checkNotNullFromProvides(Injection.INSTANCE.provideReport(context));
  }
}
