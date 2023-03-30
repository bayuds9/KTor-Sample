package com.flowerencee9.marketplace.screens.auth.createpassword;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0012R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068F\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00068F\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\t\u00a8\u0006\u0013"}, d2 = {"Lcom/flowerencee9/marketplace/screens/auth/createpassword/CreatePasswordViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/flowerencee9/marketplace/model/networking/repositories/AuthRepository;", "(Lcom/flowerencee9/marketplace/model/networking/repositories/AuthRepository;)V", "loading", "Landroidx/lifecycle/LiveData;", "", "getLoading", "()Landroidx/lifecycle/LiveData;", "status", "Lcom/flowerencee9/marketplace/model/data/response/StatusResponse;", "getStatus", "changePassword", "", "pwd", "Lcom/flowerencee9/marketplace/model/data/request/ChangePasswordRequest;", "createPassword", "Lcom/flowerencee9/marketplace/model/data/request/CreatePasswordRequest;", "app_debug"})
public final class CreatePasswordViewModel extends androidx.lifecycle.ViewModel {
    private final com.flowerencee9.marketplace.model.networking.repositories.AuthRepository repository = null;
    
    @javax.inject.Inject
    public CreatePasswordViewModel(@org.jetbrains.annotations.NotNull
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
    
    public final void createPassword(@org.jetbrains.annotations.NotNull
    com.flowerencee9.marketplace.model.data.request.CreatePasswordRequest pwd) {
    }
    
    public final void changePassword(@org.jetbrains.annotations.NotNull
    com.flowerencee9.marketplace.model.data.request.ChangePasswordRequest pwd) {
    }
}