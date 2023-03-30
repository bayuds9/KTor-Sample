package com.flowerencee9.marketplace.model.networking.repositories;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b8F\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\u000b8F\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\r\u00a8\u0006\u0011"}, d2 = {"Lcom/flowerencee9/marketplace/model/networking/repositories/ReportRepository;", "", "service", "Lcom/flowerencee9/marketplace/model/networking/ktor/KtorService;", "(Lcom/flowerencee9/marketplace/model/networking/ktor/KtorService;)V", "_loadingStates", "Landroidx/lifecycle/MutableLiveData;", "", "_statusResponse", "Lcom/flowerencee9/marketplace/model/data/response/StatusResponse;", "loadingStates", "Landroidx/lifecycle/LiveData;", "getLoadingStates", "()Landroidx/lifecycle/LiveData;", "statusResponse", "getStatusResponse", "Companion", "app_debug"})
public final class ReportRepository {
    private final com.flowerencee9.marketplace.model.networking.ktor.KtorService service = null;
    @org.jetbrains.annotations.NotNull
    public static final com.flowerencee9.marketplace.model.networking.repositories.ReportRepository.Companion Companion = null;
    private static final java.lang.String AG = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> _loadingStates = null;
    private final androidx.lifecycle.MutableLiveData<com.flowerencee9.marketplace.model.data.response.StatusResponse> _statusResponse = null;
    
    @javax.inject.Inject
    public ReportRepository(@org.jetbrains.annotations.NotNull
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
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/flowerencee9/marketplace/model/networking/repositories/ReportRepository$Companion;", "", "()V", "AG", "", "kotlin.jvm.PlatformType", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}