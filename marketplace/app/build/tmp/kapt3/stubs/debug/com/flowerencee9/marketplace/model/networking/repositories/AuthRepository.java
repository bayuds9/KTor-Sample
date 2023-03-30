package com.flowerencee9.marketplace.model.networking.repositories;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0017J\u000e\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u001aJ\u000e\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u001cJ\u000e\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u001fJ\u000e\u0010 \u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020!R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\r8F\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\r8F\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u000f\u00a8\u0006#"}, d2 = {"Lcom/flowerencee9/marketplace/model/networking/repositories/AuthRepository;", "", "service", "Lcom/flowerencee9/marketplace/model/networking/ktor/KtorService;", "context", "Landroid/content/Context;", "(Lcom/flowerencee9/marketplace/model/networking/ktor/KtorService;Landroid/content/Context;)V", "_loadingStates", "Landroidx/lifecycle/MutableLiveData;", "", "_statusResponse", "Lcom/flowerencee9/marketplace/model/data/response/StatusResponse;", "loadingStates", "Landroidx/lifecycle/LiveData;", "getLoadingStates", "()Landroidx/lifecycle/LiveData;", "statusResponse", "getStatusResponse", "dummyChangePassword", "", "pwd", "Lcom/flowerencee9/marketplace/model/data/request/ChangePasswordRequest;", "dummyCreatePassword", "Lcom/flowerencee9/marketplace/model/data/request/CreatePasswordRequest;", "dummyForgotPassword", "request", "Lcom/flowerencee9/marketplace/model/data/request/ForgotPasswordRequest;", "dummyLogin", "Lcom/flowerencee9/marketplace/model/data/request/LoginRequest;", "dummyOtp", "value", "", "dummyRegister", "Lcom/flowerencee9/marketplace/model/data/request/RegisterRequest;", "Companion", "app_debug"})
public final class AuthRepository {
    private final com.flowerencee9.marketplace.model.networking.ktor.KtorService service = null;
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull
    public static final com.flowerencee9.marketplace.model.networking.repositories.AuthRepository.Companion Companion = null;
    private static final java.lang.String TAG = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> _loadingStates = null;
    private final androidx.lifecycle.MutableLiveData<com.flowerencee9.marketplace.model.data.response.StatusResponse> _statusResponse = null;
    
    @javax.inject.Inject
    public AuthRepository(@org.jetbrains.annotations.NotNull
    com.flowerencee9.marketplace.model.networking.ktor.KtorService service, @org.jetbrains.annotations.NotNull
    android.content.Context context) {
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
    
    public final void dummyLogin(@org.jetbrains.annotations.NotNull
    com.flowerencee9.marketplace.model.data.request.LoginRequest request) {
    }
    
    public final void dummyRegister(@org.jetbrains.annotations.NotNull
    com.flowerencee9.marketplace.model.data.request.RegisterRequest request) {
    }
    
    public final void dummyForgotPassword(@org.jetbrains.annotations.NotNull
    com.flowerencee9.marketplace.model.data.request.ForgotPasswordRequest request) {
    }
    
    public final void dummyOtp(@org.jetbrains.annotations.NotNull
    java.lang.String value) {
    }
    
    public final void dummyCreatePassword(@org.jetbrains.annotations.NotNull
    com.flowerencee9.marketplace.model.data.request.CreatePasswordRequest pwd) {
    }
    
    public final void dummyChangePassword(@org.jetbrains.annotations.NotNull
    com.flowerencee9.marketplace.model.data.request.ChangePasswordRequest pwd) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/flowerencee9/marketplace/model/networking/repositories/AuthRepository$Companion;", "", "()V", "TAG", "", "kotlin.jvm.PlatformType", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}