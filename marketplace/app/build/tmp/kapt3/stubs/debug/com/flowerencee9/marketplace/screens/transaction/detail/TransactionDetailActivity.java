package com.flowerencee9.marketplace.screens.transaction.detail;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0014J\b\u0010\u0012\u001a\u00020\u000fH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\f\u0010\b\u00a8\u0006\u0014"}, d2 = {"Lcom/flowerencee9/marketplace/screens/transaction/detail/TransactionDetailActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "binding", "Lcom/flowerencee9/marketplace/databinding/ActivityBillerBinding;", "status", "", "getStatus", "()Ljava/lang/String;", "status$delegate", "Lkotlin/Lazy;", "transactionId", "getTransactionId", "transactionId$delegate", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "setupView", "Companion", "app_debug"})
public final class TransactionDetailActivity extends androidx.appcompat.app.AppCompatActivity {
    @org.jetbrains.annotations.NotNull
    public static final com.flowerencee9.marketplace.screens.transaction.detail.TransactionDetailActivity.Companion Companion = null;
    private static final java.lang.String EXTRA_TRANSACTION = "EXTRA_TRANSACTION";
    private static final java.lang.String EXTRA_STATUS = "EXTRA_STATUS";
    private final kotlin.Lazy transactionId$delegate = null;
    private final kotlin.Lazy status$delegate = null;
    private com.flowerencee9.marketplace.databinding.ActivityBillerBinding binding;
    
    public TransactionDetailActivity() {
        super();
    }
    
    private final java.lang.String getTransactionId() {
        return null;
    }
    
    private final java.lang.String getStatus() {
        return null;
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setupView() {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/flowerencee9/marketplace/screens/transaction/detail/TransactionDetailActivity$Companion;", "", "()V", "EXTRA_STATUS", "", "EXTRA_TRANSACTION", "myIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "trxId", "type", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.content.Intent myIntent(@org.jetbrains.annotations.NotNull
        android.content.Context context, @org.jetbrains.annotations.NotNull
        java.lang.String trxId, @org.jetbrains.annotations.NotNull
        java.lang.String type) {
            return null;
        }
    }
}