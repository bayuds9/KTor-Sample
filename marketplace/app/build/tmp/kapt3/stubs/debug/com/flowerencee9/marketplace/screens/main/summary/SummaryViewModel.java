package com.flowerencee9.marketplace.screens.main.summary;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0016\u001a\u00020\u0017R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068F\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00068F\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\tR\'\u0010\r\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u000f0\u000ej\b\u0012\u0004\u0012\u00020\u000f`\u00100\u00068F\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\tR\'\u0010\u0012\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u000f0\u000ej\b\u0012\u0004\u0012\u00020\u000f`\u00100\u00068F\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\tR\'\u0010\u0014\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u000f0\u000ej\b\u0012\u0004\u0012\u00020\u000f`\u00100\u00068F\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\t\u00a8\u0006\u0018"}, d2 = {"Lcom/flowerencee9/marketplace/screens/main/summary/SummaryViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/flowerencee9/marketplace/model/networking/repositories/TransactionRepository;", "(Lcom/flowerencee9/marketplace/model/networking/repositories/TransactionRepository;)V", "loadingStates", "Landroidx/lifecycle/LiveData;", "", "getLoadingStates", "()Landroidx/lifecycle/LiveData;", "statusResponse", "Lcom/flowerencee9/marketplace/model/data/response/StatusResponse;", "getStatusResponse", "tFinished", "Ljava/util/ArrayList;", "Lcom/flowerencee9/marketplace/model/data/objects/TParent;", "Lkotlin/collections/ArrayList;", "getTFinished", "tProgress", "getTProgress", "tWaiting", "getTWaiting", "getSummary", "", "app_debug"})
public final class SummaryViewModel extends androidx.lifecycle.ViewModel {
    private final com.flowerencee9.marketplace.model.networking.repositories.TransactionRepository repository = null;
    
    @javax.inject.Inject
    public SummaryViewModel(@org.jetbrains.annotations.NotNull
    com.flowerencee9.marketplace.model.networking.repositories.TransactionRepository repository) {
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
    public final androidx.lifecycle.LiveData<java.util.ArrayList<com.flowerencee9.marketplace.model.data.objects.TParent>> getTProgress() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.ArrayList<com.flowerencee9.marketplace.model.data.objects.TParent>> getTWaiting() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.ArrayList<com.flowerencee9.marketplace.model.data.objects.TParent>> getTFinished() {
        return null;
    }
    
    public final void getSummary() {
    }
}