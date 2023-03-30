package com.flowerencee9.marketplace.model.networking.repositories;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000  2\u00020\u0001:\u0001 B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J \u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000b2\u0006\u0010\u001d\u001a\u00020\u000fH\u0002J\u0006\u0010\u001e\u001a\u00020\u001fR$\u0010\u0007\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000b0\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\'\u0010\u0012\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000b0\u00138F\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\r0\u00138F\u00a2\u0006\u0006\u001a\u0004\b\u0017\u0010\u0015R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00138F\u00a2\u0006\u0006\u001a\u0004\b\u0019\u0010\u0015R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00110\u00138F\u00a2\u0006\u0006\u001a\u0004\b\u001b\u0010\u0015\u00a8\u0006!"}, d2 = {"Lcom/flowerencee9/marketplace/model/networking/repositories/UserRepository;", "", "service", "Lcom/flowerencee9/marketplace/model/networking/ktor/KtorService;", "context", "Landroid/content/Context;", "(Lcom/flowerencee9/marketplace/model/networking/ktor/KtorService;Landroid/content/Context;)V", "_listProfile", "Landroidx/lifecycle/MutableLiveData;", "Ljava/util/ArrayList;", "Lcom/flowerencee9/marketplace/model/data/objects/PlainItem;", "Lkotlin/collections/ArrayList;", "_loadingStates", "", "_profileData", "Lcom/flowerencee9/marketplace/model/data/response/ProfileData;", "_statusResponse", "Lcom/flowerencee9/marketplace/model/data/response/StatusResponse;", "listProfile", "Landroidx/lifecycle/LiveData;", "getListProfile", "()Landroidx/lifecycle/LiveData;", "loadingStates", "getLoadingStates", "profileData", "getProfileData", "statusResponse", "getStatusResponse", "generateUserData", "data", "getDummyUser", "", "Companion", "app_debug"})
public final class UserRepository {
    private final com.flowerencee9.marketplace.model.networking.ktor.KtorService service = null;
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull
    public static final com.flowerencee9.marketplace.model.networking.repositories.UserRepository.Companion Companion = null;
    private static final java.lang.String TAG = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> _loadingStates = null;
    private final androidx.lifecycle.MutableLiveData<com.flowerencee9.marketplace.model.data.response.StatusResponse> _statusResponse = null;
    private androidx.lifecycle.MutableLiveData<com.flowerencee9.marketplace.model.data.response.ProfileData> _profileData;
    private androidx.lifecycle.MutableLiveData<java.util.ArrayList<com.flowerencee9.marketplace.model.data.objects.PlainItem>> _listProfile;
    
    @javax.inject.Inject
    public UserRepository(@org.jetbrains.annotations.NotNull
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
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.flowerencee9.marketplace.model.data.response.ProfileData> getProfileData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.ArrayList<com.flowerencee9.marketplace.model.data.objects.PlainItem>> getListProfile() {
        return null;
    }
    
    public final void getDummyUser() {
    }
    
    private final java.util.ArrayList<com.flowerencee9.marketplace.model.data.objects.PlainItem> generateUserData(com.flowerencee9.marketplace.model.data.response.ProfileData data) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/flowerencee9/marketplace/model/networking/repositories/UserRepository$Companion;", "", "()V", "TAG", "", "kotlin.jvm.PlatformType", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}