package com.flowerencee9.marketplace.screens.auth.register;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\n\u0018\u0000 .2\u00020\u0001:\u0001.B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\u0012\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0014J-\u0010 \u001a\u00020\u001c2\u0006\u0010!\u001a\u00020\u00042\u000e\u0010\"\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0#2\u0006\u0010$\u001a\u00020%H\u0016\u00a2\u0006\u0002\u0010&J\b\u0010\'\u001a\u00020\u001cH\u0002J\b\u0010(\u001a\u00020\u001cH\u0002J\b\u0010)\u001a\u00020\u001cH\u0002J\b\u0010*\u001a\u00020\u001cH\u0002J\b\u0010+\u001a\u00020\u001cH\u0002J\b\u0010,\u001a\u00020\u001cH\u0002J\b\u0010-\u001a\u00020\u001cH\u0002R\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u001c\u0010\f\u001a\u0010\u0012\f\u0012\n \u000f*\u0004\u0018\u00010\u000e0\u000e0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0010\u001a\u0010\u0012\f\u0012\n \u000f*\u0004\u0018\u00010\u000e0\u000e0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016\u00a8\u0006/"}, d2 = {"Lcom/flowerencee9/marketplace/screens/auth/register/RegisterActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "accountType", "", "Ljava/lang/Integer;", "binding", "Lcom/flowerencee9/marketplace/databinding/ActivityAuthBinding;", "cal", "Ljava/util/Calendar;", "currentPhotoPath", "", "launcherIntentCamera", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "launcherIntentGallery", "path", "selectedDate", "viewModel", "Lcom/flowerencee9/marketplace/screens/auth/register/RegisterViewModel;", "getViewModel", "()Lcom/flowerencee9/marketplace/screens/auth/register/RegisterViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "allPermissionsGranted", "", "onBackPressed", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onRequestPermissionsResult", "requestCode", "permissions", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "openCamera", "openDateSelector", "openDialogSelector", "openGallery", "registerUser", "setupButtonStates", "setupView", "Companion", "app_debug"})
public final class RegisterActivity extends androidx.appcompat.app.AppCompatActivity {
    @org.jetbrains.annotations.NotNull
    public static final com.flowerencee9.marketplace.screens.auth.register.RegisterActivity.Companion Companion = null;
    private static final java.lang.String TAG = null;
    private static final java.lang.String[] REQUIRED_PERMISSIONS = {"android.permission.CAMERA"};
    private static final int REQUEST_CODE_PERMISSIONS = 10;
    private com.flowerencee9.marketplace.databinding.ActivityAuthBinding binding;
    private final kotlin.Lazy viewModel$delegate = null;
    private java.lang.Integer accountType;
    private java.lang.String currentPhotoPath;
    private java.lang.String path = "";
    private java.util.Calendar cal;
    private java.lang.String selectedDate = "";
    private final androidx.activity.result.ActivityResultLauncher<android.content.Intent> launcherIntentCamera = null;
    private final androidx.activity.result.ActivityResultLauncher<android.content.Intent> launcherIntentGallery = null;
    
    public RegisterActivity() {
        super();
    }
    
    private final com.flowerencee9.marketplace.screens.auth.register.RegisterViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override
    public void onRequestPermissionsResult(int requestCode, @org.jetbrains.annotations.NotNull
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull
    int[] grantResults) {
    }
    
    private final boolean allPermissionsGranted() {
        return false;
    }
    
    private final void setupView() {
    }
    
    private final void openDateSelector() {
    }
    
    private final void registerUser() {
    }
    
    private final void setupButtonStates() {
    }
    
    private final void openDialogSelector() {
    }
    
    private final void openCamera() {
    }
    
    private final void openGallery() {
    }
    
    @java.lang.Override
    public void onBackPressed() {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\bR\u0016\u0010\t\u001a\n \n*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/flowerencee9/marketplace/screens/auth/register/RegisterActivity$Companion;", "", "()V", "REQUEST_CODE_PERMISSIONS", "", "REQUIRED_PERMISSIONS", "", "", "[Ljava/lang/String;", "TAG", "kotlin.jvm.PlatformType", "myIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.content.Intent myIntent(@org.jetbrains.annotations.NotNull
        android.content.Context context) {
            return null;
        }
    }
}