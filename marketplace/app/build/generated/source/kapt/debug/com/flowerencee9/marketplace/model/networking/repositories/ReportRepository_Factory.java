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
public final class ReportRepository_Factory implements Factory<ReportRepository> {
  private final Provider<KtorService> serviceProvider;

  public ReportRepository_Factory(Provider<KtorService> serviceProvider) {
    this.serviceProvider = serviceProvider;
  }

  @Override
  public ReportRepository get() {
    return newInstance(serviceProvider.get());
  }

  public static ReportRepository_Factory create(Provider<KtorService> serviceProvider) {
    return new ReportRepository_Factory(serviceProvider);
  }

  public static ReportRepository newInstance(KtorService service) {
    return new ReportRepository(service);
  }
}
