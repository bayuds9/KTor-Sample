package com.flowerencee9.marketplace.screens.auth.createpassword;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000  2\u00020\u0001:\u0001 B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0006H\u0002J\b\u0010\u0018\u001a\u00020\u0016H\u0002J\b\u0010\u0019\u001a\u00020\u0016H\u0016J\u0012\u0010\u001a\u001a\u00020\u00162\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0014J\b\u0010\u001d\u001a\u00020\u0016H\u0002J\b\u0010\u001e\u001a\u00020\u0016H\u0002J\b\u0010\u001f\u001a\u00020\u0016H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0014\u0010\n\u001a\u0004\b\u0012\u0010\u0013\u00a8\u0006!"}, d2 = {"Lcom/flowerencee9/marketplace/screens/auth/createpassword/CreatePasswordActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "binding", "Lcom/flowerencee9/marketplace/databinding/ActivityAuthBinding;", "token", "", "getToken", "()Ljava/lang/String;", "token$delegate", "Lkotlin/Lazy;", "type", "Lcom/flowerencee9/marketplace/screens/auth/createpassword/CreatePasswordActivity$Companion$PWD;", "getType", "()Lcom/flowerencee9/marketplace/screens/auth/createpassword/CreatePasswordActivity$Companion$PWD;", "type$delegate", "viewModel", "Lcom/flowerencee9/marketplace/screens/auth/createpassword/CreatePasswordViewModel;", "getViewModel", "()Lcom/flowerencee9/marketplace/screens/auth/createpassword/CreatePasswordViewModel;", "viewModel$delegate", "changePassword", "", "oldPassword", "createNewPassword", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "setupButtonStates", "setupView", "showPasswordConfirmation", "Companion", "app_debug"})
public final class CreatePasswordActivity extends androidx.appcompat.app.AppCompatActivity {
    @org.jetbrains.annotations.NotNull
    public static final com.flowerencee9.marketplace.screens.auth.createpassword.CreatePasswordActivity.Companion Companion = null;
    private static final java.lang.String EXTRA_TOKEN = "EXTRA_TOKEN";
    private static final java.lang.String EXTRA_TYPE = "EXTRA_TYPE";
    private static final java.lang.String TAG = null;
    private com.flowerencee9.marketplace.databinding.ActivityAuthBinding binding;
    private final kotlin.Lazy viewModel$delegate = null;
    private final kotlin.Lazy token$delegate = null;
    private final kotlin.Lazy type$delegate;
    
    public CreatePasswordActivity() {
        super();
    }
    
    private final com.flowerencee9.marketplace.screens.auth.createpassword.CreatePasswordViewModel getViewModel() {
        return null;
    }
    
    private final java.lang.String getToken() {
        return null;
    }
    
    private final com.flowerencee9.marketplace.screens.auth.createpassword.CreatePasswordActivity.Companion.PWD getType() {
        return null;
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setupView() {
    }
    
    private final void showPasswordConfirmation() {
    }
    
    private final void changePassword(java.lang.String oldPassword) {
    }
    
    private final void setupButtonStates() {
    }
    
    private final void createNewPassword() {
    }
    
    @java.lang.Override
    public void onBackPressed() {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u000fB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n \u0007*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/flowerencee9/marketplace/screens/auth/createpassword/CreatePasswordActivity$Companion;", "", "()V", "EXTRA_TOKEN", "", "EXTRA_TYPE", "TAG", "kotlin.jvm.PlatformType", "myIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "token", "type", "", "PWD", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.content.Intent myIntent(@org.jetbrains.annotations.NotNull
        android.content.Context context, @org.jetbrains.annotations.NotNull
        java.lang.String token, int type) {
            return null;
        }
        
        @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/flowerencee9/marketplace/screens/auth/createpassword/CreatePasswordActivity$Companion$PWD;", "", "(Ljava/lang/String;I)V", "CREATE", "CHANGE", "app_debug"})
        public static enum PWD {
            /*public static final*/ CREATE /* = new CREATE() */,
            /*public static final*/ CHANGE /* = new CHANGE() */;
            
            PWD() {
            }
        }
    }
}