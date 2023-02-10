package com.flowerencee9.marketplace.model.networking.repositories;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u001a\u001a\u00020\u001b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0006R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\b\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\f0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t8F\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00158F\u00a2\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00100\u00158F\u00a2\u0006\u0006\u001a\u0004\b\u0019\u0010\u0017\u00a8\u0006\u001d"}, d2 = {"Lcom/flowerencee9/marketplace/model/networking/repositories/ExploreRepository;", "", "service", "Lcom/flowerencee9/marketplace/model/networking/ktor/KtorService;", "(Lcom/flowerencee9/marketplace/model/networking/ktor/KtorService;)V", "TAG", "", "kotlin.jvm.PlatformType", "_discoverListResponse", "Landroidx/lifecycle/MutableLiveData;", "Ljava/util/ArrayList;", "Lcom/flowerencee9/marketplace/model/data/response/Product;", "Lkotlin/collections/ArrayList;", "_loadingStates", "", "_statusResponse", "Lcom/flowerencee9/marketplace/model/data/response/StatusResponse;", "discoverListResponse", "getDiscoverListResponse", "()Landroidx/lifecycle/MutableLiveData;", "loadingStates", "Landroidx/lifecycle/LiveData;", "getLoadingStates", "()Landroidx/lifecycle/LiveData;", "statusResponse", "getStatusResponse", "discoverProduct", "", "merchantId", "app_debug"})
public final class ExploreRepository {
    private final com.flowerencee9.marketplace.model.networking.ktor.KtorService service = null;
    private final java.lang.String TAG = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> _loadingStates = null;
    private final androidx.lifecycle.MutableLiveData<com.flowerencee9.marketplace.model.data.response.StatusResponse> _statusResponse = null;
    private final androidx.lifecycle.MutableLiveData<java.util.ArrayList<com.flowerencee9.marketplace.model.data.response.Product>> _discoverListResponse = null;
    
    @javax.inject.Inject()
    public ExploreRepository(@org.jetbrains.annotations.NotNull()
    com.flowerencee9.marketplace.model.networking.ktor.KtorService service) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getLoadingStates() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.flowerencee9.marketplace.model.data.response.StatusResponse> getStatusResponse() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.ArrayList<com.flowerencee9.marketplace.model.data.response.Product>> getDiscoverListResponse() {
        return null;
    }
    
    public final void discoverProduct(@org.jetbrains.annotations.Nullable()
    java.lang.String merchantId) {
    }
}