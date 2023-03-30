package com.flowerencee9.marketplace.screens.auth.register;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068F\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00068F\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\t\u00a8\u0006\u0011"}, d2 = {"Lcom/flowerencee9/marketplace/screens/auth/register/RegisterViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/flowerencee9/marketplace/model/networking/repositories/AuthRepository;", "(Lcom/flowerencee9/marketplace/model/networking/repositories/AuthRepository;)V", "loading", "Landroidx/lifecycle/LiveData;", "", "getLoading", "()Landroidx/lifecycle/LiveData;", "status", "Lcom/flowerencee9/marketplace/model/data/response/StatusResponse;", "getStatus", "registerUser", "", "request", "Lcom/flowerencee9/marketplace/model/data/request/RegisterRequest;", "app_debug"})
public final class RegisterViewModel extends androidx.lifecycle.ViewModel {
    private final com.flowerencee9.marketplace.model.networking.repositories.AuthRepository repository = null;
    
    @javax.inject.Inject
    public RegisterViewModel(@org.jetbrains.annotations.NotNull
    com.flowerencee9.marketplace.model.networking.repositories.AuthRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getLoading() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.flowerencee9.marketplace.model.data.response.StatusResponse> getStatus() {
        return null;
    }
    
    public final void registerUser(@org.jetbrains.annotations.NotNull
    com.flowerencee9.marketplace.model.data.request.RegisterRequest request) {
    }
}