package com.flowerencee9.marketplace.support.customui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\u0018\u00002\u00020\u0001:\u000234B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0006\u0010\u0016\u001a\u00020\u0017J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u0006\u0010\u001a\u001a\u00020\u001bJ\u000e\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0011\u001a\u00020\u001dJ\u000e\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020\u001bJ\u0006\u0010 \u001a\u00020\u0019J\u001f\u0010!\u001a\u00020\u00192\u0006\u0010\"\u001a\u00020\u00172\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0002\u0010$J\u000e\u0010%\u001a\u00020\u00192\u0006\u0010&\u001a\u00020\u0017J\u000e\u0010\'\u001a\u00020\u00192\u0006\u0010(\u001a\u00020\u0010J\u0018\u0010)\u001a\u00020\u00192\u0006\u0010*\u001a\u00020\t2\b\b\u0002\u0010+\u001a\u00020\tJ\u000e\u0010,\u001a\u00020\u00192\u0006\u0010-\u001a\u00020\u0012J\u000e\u0010.\u001a\u00020\u00192\u0006\u0010/\u001a\u00020\tJ\u000e\u00100\u001a\u00020\u00192\u0006\u00101\u001a\u00020\u0017J\u0006\u00102\u001a\u00020\u0019R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u0012\u0010\r\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0003X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00065"}, d2 = {"Lcom/flowerencee9/marketplace/support/customui/InputView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attributeSet", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defstyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "Lcom/flowerencee9/marketplace/databinding/LayoutInputBinding;", "inputLength", "Ljava/lang/Integer;", "inputType", "Lcom/flowerencee9/marketplace/support/customui/InputView$TYPE;", "listener", "Lcom/flowerencee9/marketplace/support/customui/InputView$InputListener;", "mContext", "textWatcher", "Landroid/text/TextWatcher;", "getText", "", "init", "", "isValid", "", "performListener", "Landroid/view/View$OnClickListener;", "setCleartext", "states", "setDisable", "setHelperText", "text", "color", "(Ljava/lang/String;Ljava/lang/Integer;)V", "setHint", "hint", "setInpuType", "type", "setLines", "lines", "max", "setListener", "inputListener", "setMinLength", "length", "setValue", "value", "setVisiblePassword", "InputListener", "TYPE", "app_debug"})
public final class InputView extends androidx.constraintlayout.widget.ConstraintLayout {
    private android.content.Context mContext;
    private com.flowerencee9.marketplace.databinding.LayoutInputBinding binding;
    private com.flowerencee9.marketplace.support.customui.InputView.InputListener listener;
    private com.flowerencee9.marketplace.support.customui.InputView.TYPE inputType = com.flowerencee9.marketplace.support.customui.InputView.TYPE.TEXT;
    private java.lang.Integer inputLength;
    private final android.text.TextWatcher textWatcher = null;
    
    public InputView(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    public InputView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.util.AttributeSet attributeSet) {
        super(null);
    }
    
    public InputView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attributeSet, int defstyleAttr) {
        super(null);
    }
    
    private final void init(android.content.Context context) {
    }
    
    public final void setMinLength(int length) {
    }
    
    public final void setHint(@org.jetbrains.annotations.NotNull()
    java.lang.String hint) {
    }
    
    public final void setHelperText(@org.jetbrains.annotations.NotNull()
    java.lang.String text, @org.jetbrains.annotations.Nullable()
    java.lang.Integer color) {
    }
    
    public final void setInpuType(@org.jetbrains.annotations.NotNull()
    com.flowerencee9.marketplace.support.customui.InputView.TYPE type) {
    }
    
    public final void setCleartext(boolean states) {
    }
    
    public final void setLines(int lines, int max) {
    }
    
    public final void setVisiblePassword() {
    }
    
    public final void setListener(@org.jetbrains.annotations.NotNull()
    com.flowerencee9.marketplace.support.customui.InputView.InputListener inputListener) {
    }
    
    public final void performListener(@org.jetbrains.annotations.NotNull()
    android.view.View.OnClickListener listener) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getText() {
        return null;
    }
    
    public final void setValue(@org.jetbrains.annotations.NotNull()
    java.lang.String value) {
    }
    
    public final boolean isValid() {
        return false;
    }
    
    public final void setDisable() {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b\u00a8\u0006\t"}, d2 = {"Lcom/flowerencee9/marketplace/support/customui/InputView$TYPE;", "", "(Ljava/lang/String;I)V", "TEXT", "PASSWORD", "EMAIL", "PHONE", "NUMBER", "SELECTOR", "app_debug"})
    public static enum TYPE {
        /*public static final*/ TEXT /* = new TEXT() */,
        /*public static final*/ PASSWORD /* = new PASSWORD() */,
        /*public static final*/ EMAIL /* = new EMAIL() */,
        /*public static final*/ PHONE /* = new PHONE() */,
        /*public static final*/ NUMBER /* = new NUMBER() */,
        /*public static final*/ SELECTOR /* = new SELECTOR() */;
        
        TYPE() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\u0007"}, d2 = {"Lcom/flowerencee9/marketplace/support/customui/InputView$InputListener;", "", "afterClickListener", "", "afterTextChanged", "input", "", "app_debug"})
    public static abstract interface InputListener {
        
        public abstract void afterTextChanged(@org.jetbrains.annotations.NotNull()
        java.lang.String input);
        
        public abstract void afterClickListener();
        
        @kotlin.Metadata(mv = {1, 7, 1}, k = 3)
        public static final class DefaultImpls {
            
            public static void afterClickListener(@org.jetbrains.annotations.NotNull()
            com.flowerencee9.marketplace.support.customui.InputView.InputListener $this) {
            }
        }
    }
}