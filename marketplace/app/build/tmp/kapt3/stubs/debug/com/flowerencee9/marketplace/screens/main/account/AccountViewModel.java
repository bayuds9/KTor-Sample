package com.flowerencee9.marketplace.screens.main.account;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0015\u001a\u00020\u0016R\'\u0010\u0005\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t0\u00068F\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00068F\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000bR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00068F\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u00068F\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u000b\u00a8\u0006\u0017"}, d2 = {"Lcom/flowerencee9/marketplace/screens/main/account/AccountViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/flowerencee9/marketplace/model/networking/repositories/UserRepository;", "(Lcom/flowerencee9/marketplace/model/networking/repositories/UserRepository;)V", "listProfile", "Landroidx/lifecycle/LiveData;", "Ljava/util/ArrayList;", "Lcom/flowerencee9/marketplace/model/data/objects/PlainItem;", "Lkotlin/collections/ArrayList;", "getListProfile", "()Landroidx/lifecycle/LiveData;", "loadingStates", "", "getLoadingStates", "profileData", "Lcom/flowerencee9/marketplace/model/data/response/ProfileData;", "getProfileData", "statusResponse", "Lcom/flowerencee9/marketplace/model/data/response/StatusResponse;", "getStatusResponse", "getUser", "", "app_debug"})
public final class AccountViewModel extends androidx.lifecycle.ViewModel {
    private final com.flowerencee9.marketplace.model.networking.repositories.UserRepository repository = null;
    
    @javax.inject.Inject
    public AccountViewModel(@org.jetbrains.annotations.NotNull
    com.flowerencee9.marketplace.model.networking.repositories.UserRepository repository) {
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
    public final androidx.lifecycle.LiveData<com.flowerencee9.marketplace.model.data.response.ProfileData> getProfileData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.ArrayList<com.flowerencee9.marketplace.model.data.objects.PlainItem>> getListProfile() {
        return null;
    }
    
    public final void getUser() {
    }
}