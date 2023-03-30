package com.flowerencee9.marketplace.support.customui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\u00102\b\u0010\t\u001a\u0004\u0018\u00010\nR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/flowerencee9/marketplace/support/customui/MonthYearPickerDialog;", "Landroidx/fragment/app/DialogFragment;", "date", "Ljava/util/Date;", "(Ljava/util/Date;)V", "binding", "Lcom/flowerencee9/marketplace/databinding/MonthYearPickerDialogBinding;", "getDate", "()Ljava/util/Date;", "listener", "Landroid/app/DatePickerDialog$OnDateSetListener;", "onCreateDialog", "Landroid/app/Dialog;", "savedInstanceState", "Landroid/os/Bundle;", "setListener", "", "Companion", "app_debug"})
public final class MonthYearPickerDialog extends androidx.fragment.app.DialogFragment {
    @org.jetbrains.annotations.NotNull
    private final java.util.Date date = null;
    @org.jetbrains.annotations.NotNull
    public static final com.flowerencee9.marketplace.support.customui.MonthYearPickerDialog.Companion Companion = null;
    private static final int MAX_YEAR = 2099;
    private static final int MIN_YEAR = 2000;
    private com.flowerencee9.marketplace.databinding.MonthYearPickerDialogBinding binding;
    private android.app.DatePickerDialog.OnDateSetListener listener;
    
    public MonthYearPickerDialog() {
        super();
    }
    
    public MonthYearPickerDialog(@org.jetbrains.annotations.NotNull
    java.util.Date date) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.Date getDate() {
        return null;
    }
    
    public final void setListener(@org.jetbrains.annotations.Nullable
    android.app.DatePickerDialog.OnDateSetListener listener) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public android.app.Dialog onCreateDialog(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/flowerencee9/marketplace/support/customui/MonthYearPickerDialog$Companion;", "", "()V", "MAX_YEAR", "", "MIN_YEAR", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}