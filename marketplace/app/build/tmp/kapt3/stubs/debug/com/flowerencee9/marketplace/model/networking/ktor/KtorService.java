package com.flowerencee9.marketplace.model.networking.ktor;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u0000 \n2\u00020\u0001:\u0001\nJ\u001b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J#\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0001H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000b"}, d2 = {"Lcom/flowerencee9/marketplace/model/networking/ktor/KtorService;", "", "callGetHttp", "Lio/ktor/client/statement/HttpResponse;", "httpRequestBuilder", "Lio/ktor/client/request/HttpRequestBuilder;", "(Lio/ktor/client/request/HttpRequestBuilder;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "callPostHttp", "request", "(Lio/ktor/client/request/HttpRequestBuilder;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "app_debug"})
public abstract interface KtorService {
    @org.jetbrains.annotations.NotNull
    public static final com.flowerencee9.marketplace.model.networking.ktor.KtorService.Companion Companion = null;
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object callGetHttp(@org.jetbrains.annotations.NotNull
    io.ktor.client.request.HttpRequestBuilder httpRequestBuilder, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super io.ktor.client.statement.HttpResponse> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object callPostHttp(@org.jetbrains.annotations.NotNull
    io.ktor.client.request.HttpRequestBuilder httpRequestBuilder, @org.jetbrains.annotations.NotNull
    java.lang.Object request, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super io.ktor.client.statement.HttpResponse> continuation);
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/flowerencee9/marketplace/model/networking/ktor/KtorService$Companion;", "", "()V", "create", "Lcom/flowerencee9/marketplace/model/networking/ktor/KtorService;", "context", "Landroid/content/Context;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.flowerencee9.marketplace.model.networking.ktor.KtorService create(@org.jetbrains.annotations.NotNull
        android.content.Context context) {
            return null;
        }
    }
}