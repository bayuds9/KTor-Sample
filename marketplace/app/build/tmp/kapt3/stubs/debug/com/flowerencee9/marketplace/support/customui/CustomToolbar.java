package com.flowerencee9.marketplace.support.customui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001 B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007B\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0006\u0010\u0010\u001a\u00020\u0011J\u001a\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0002J%\u0010\u0013\u001a\u00020\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\t2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00110\u0016\u00a2\u0006\u0002\u0010\u0017J%\u0010\u0018\u001a\u00020\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\t2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00110\u0016\u00a2\u0006\u0002\u0010\u0017J%\u0010\u001a\u001a\u00020\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\t2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00110\u0016\u00a2\u0006\u0002\u0010\u0017J\u000e\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u001dJ\u000e\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u000fR\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0003X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Lcom/flowerencee9/marketplace/support/customui/CustomToolbar;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "Lcom/flowerencee9/marketplace/databinding/LayoutCustomToolbarBinding;", "mContext", "searchListener", "Lcom/flowerencee9/marketplace/support/customui/CustomToolbar$ToolbarListener;", "clearSearchText", "", "init", "setLeftItem", "drawable", "leftClicked", "Lkotlin/Function0;", "(Ljava/lang/Integer;Lkotlin/jvm/functions/Function0;)V", "setRightItem", "rightClicked", "setRightItemTwo", "setTitle", "title", "", "showSearchText", "listener", "ToolbarListener", "app_debug"})
public final class CustomToolbar extends androidx.constraintlayout.widget.ConstraintLayout {
    private android.content.Context mContext;
    private com.flowerencee9.marketplace.databinding.LayoutCustomToolbarBinding binding;
    private com.flowerencee9.marketplace.support.customui.CustomToolbar.ToolbarListener searchListener;
    
    public CustomToolbar(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super(null);
    }
    
    public CustomToolbar(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    public CustomToolbar(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
    
    private final void init(android.content.Context context, android.util.AttributeSet attrs) {
    }
    
    public final void setTitle(@org.jetbrains.annotations.NotNull
    java.lang.String title) {
    }
    
    public final void setLeftItem(@org.jetbrains.annotations.Nullable
    java.lang.Integer drawable, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> leftClicked) {
    }
    
    public final void setRightItem(@org.jetbrains.annotations.Nullable
    java.lang.Integer drawable, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> rightClicked) {
    }
    
    public final void setRightItemTwo(@org.jetbrains.annotations.Nullable
    java.lang.Integer drawable, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> rightClicked) {
    }
    
    public final void showSearchText(@org.jetbrains.annotations.NotNull
    com.flowerencee9.marketplace.support.customui.CustomToolbar.ToolbarListener listener) {
    }
    
    public final void clearSearchText() {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/flowerencee9/marketplace/support/customui/CustomToolbar$ToolbarListener;", "", "afterChanged", "", "input", "", "app_debug"})
    public static abstract interface ToolbarListener {
        
        public abstract void afterChanged(@org.jetbrains.annotations.NotNull
        java.lang.String input);
    }
}