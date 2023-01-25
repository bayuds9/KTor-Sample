package com.flowerencee9.marketplace.model.networking.networkingsupport;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u0007"}, d2 = {"Lcom/flowerencee9/marketplace/model/networking/networkingsupport/Injection;", "", "()V", "provideMain", "Lcom/flowerencee9/marketplace/model/networking/repositories/MainRepository;", "context", "Landroid/content/Context;", "app_debug"})
@dagger.Module
public final class Injection {
    @org.jetbrains.annotations.NotNull
    public static final com.flowerencee9.marketplace.model.networking.networkingsupport.Injection INSTANCE = null;
    
    private Injection() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    public final com.flowerencee9.marketplace.model.networking.repositories.MainRepository provideMain(@org.jetbrains.annotations.NotNull
    @dagger.hilt.android.qualifiers.ApplicationContext
    android.content.Context context) {
        return null;
    }
}