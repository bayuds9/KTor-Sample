package com.flowerencee9.marketplace.model.networking.repositories;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u001f\u001a\u00020 R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\r\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u000f0\u000ej\b\u0012\u0004\u0012\u00020\u000f`\u00100\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R$\u0010\u0011\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u000f0\u000ej\b\u0012\u0004\u0012\u00020\u000f`\u00100\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R$\u0010\u0012\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u000f0\u000ej\b\u0012\u0004\u0012\u00020\u000f`\u00100\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\u00148F\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\f0\u00148F\u00a2\u0006\u0006\u001a\u0004\b\u0018\u0010\u0016R\'\u0010\u0019\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u000f0\u000ej\b\u0012\u0004\u0012\u00020\u000f`\u00100\u00148F\u00a2\u0006\u0006\u001a\u0004\b\u001a\u0010\u0016R\'\u0010\u001b\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u000f0\u000ej\b\u0012\u0004\u0012\u00020\u000f`\u00100\u00148F\u00a2\u0006\u0006\u001a\u0004\b\u001c\u0010\u0016R\'\u0010\u001d\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u000f0\u000ej\b\u0012\u0004\u0012\u00020\u000f`\u00100\u00148F\u00a2\u0006\u0006\u001a\u0004\b\u001e\u0010\u0016\u00a8\u0006!"}, d2 = {"Lcom/flowerencee9/marketplace/model/networking/repositories/TransactionRepository;", "", "service", "Lcom/flowerencee9/marketplace/model/networking/ktor/KtorService;", "(Lcom/flowerencee9/marketplace/model/networking/ktor/KtorService;)V", "TAG", "", "kotlin.jvm.PlatformType", "_loadingStates", "Landroidx/lifecycle/MutableLiveData;", "", "_statusResponse", "Lcom/flowerencee9/marketplace/model/data/response/StatusResponse;", "_tParentDataFinished", "Ljava/util/ArrayList;", "Lcom/flowerencee9/marketplace/model/data/objects/TParent;", "Lkotlin/collections/ArrayList;", "_tParentDataProgress", "_tParentDataWaiting", "loadingStates", "Landroidx/lifecycle/LiveData;", "getLoadingStates", "()Landroidx/lifecycle/LiveData;", "statusResponse", "getStatusResponse", "tParentDataFinished", "getTParentDataFinished", "tParentDataProgress", "getTParentDataProgress", "tParentDataWaiting", "getTParentDataWaiting", "getDummySummary", "", "app_debug"})
public final class TransactionRepository {
    private final com.flowerencee9.marketplace.model.networking.ktor.KtorService service = null;
    private final java.lang.String TAG = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> _loadingStates = null;
    private final androidx.lifecycle.MutableLiveData<com.flowerencee9.marketplace.model.data.response.StatusResponse> _statusResponse = null;
    private androidx.lifecycle.MutableLiveData<java.util.ArrayList<com.flowerencee9.marketplace.model.data.objects.TParent>> _tParentDataWaiting;
    private androidx.lifecycle.MutableLiveData<java.util.ArrayList<com.flowerencee9.marketplace.model.data.objects.TParent>> _tParentDataFinished;
    private androidx.lifecycle.MutableLiveData<java.util.ArrayList<com.flowerencee9.marketplace.model.data.objects.TParent>> _tParentDataProgress;
    
    @javax.inject.Inject
    public TransactionRepository(@org.jetbrains.annotations.NotNull
    com.flowerencee9.marketplace.model.networking.ktor.KtorService service) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getLoadingStates() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.flowerencee9.marketplace.model.data.response.StatusResponse> getStatusResponse() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.ArrayList<com.flowerencee9.marketplace.model.data.objects.TParent>> getTParentDataWaiting() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.ArrayList<com.flowerencee9.marketplace.model.data.objects.TParent>> getTParentDataFinished() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.ArrayList<com.flowerencee9.marketplace.model.data.objects.TParent>> getTParentDataProgress() {
        return null;
    }
    
    public final void getDummySummary() {
    }
}