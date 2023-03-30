package com.flowerencee9.marketplace.screens.main.cart.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002\u001d\u001eB\u001f\u0012\u0018\u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0004\u00a2\u0006\u0002\u0010\bJ\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u001c\u0010\u0013\u001a\u00020\u00072\n\u0010\u0014\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0012H\u0016J\u001c\u0010\u0016\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0012H\u0016J\u001e\u0010\u001a\u001a\u00020\u00072\u0016\u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00020\u00050\nj\b\u0012\u0004\u0012\u00020\u0005`\u001cR \u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u00a8\u0006\u001f"}, d2 = {"Lcom/flowerencee9/marketplace/screens/main/cart/adapter/CartChildAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/flowerencee9/marketplace/screens/main/cart/adapter/CartChildAdapter$ViewHolder;", "actionListener", "Lkotlin/Function2;", "Lcom/flowerencee9/marketplace/model/data/objects/CartChild;", "Lcom/flowerencee9/marketplace/screens/main/cart/adapter/CartChildAdapter$ACTION_TYPE;", "", "(Lkotlin/jvm/functions/Function2;)V", "listData", "Ljava/util/ArrayList;", "modified", "", "getModified", "()Z", "setModified", "(Z)V", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setData", "list", "Lkotlin/collections/ArrayList;", "ACTION_TYPE", "ViewHolder", "app_debug"})
public final class CartChildAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.flowerencee9.marketplace.screens.main.cart.adapter.CartChildAdapter.ViewHolder> {
    private final kotlin.jvm.functions.Function2<com.flowerencee9.marketplace.model.data.objects.CartChild, com.flowerencee9.marketplace.screens.main.cart.adapter.CartChildAdapter.ACTION_TYPE, kotlin.Unit> actionListener = null;
    private boolean modified = false;
    private final java.util.ArrayList<com.flowerencee9.marketplace.model.data.objects.CartChild> listData = null;
    
    public CartChildAdapter(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function2<? super com.flowerencee9.marketplace.model.data.objects.CartChild, ? super com.flowerencee9.marketplace.screens.main.cart.adapter.CartChildAdapter.ACTION_TYPE, kotlin.Unit> actionListener) {
        super();
    }
    
    public final boolean getModified() {
        return false;
    }
    
    public final void setModified(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.flowerencee9.marketplace.screens.main.cart.adapter.CartChildAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.flowerencee9.marketplace.screens.main.cart.adapter.CartChildAdapter.ViewHolder holder, int position) {
    }
    
    public final void setData(@org.jetbrains.annotations.NotNull
    java.util.ArrayList<com.flowerencee9.marketplace.model.data.objects.CartChild> list) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/flowerencee9/marketplace/screens/main/cart/adapter/CartChildAdapter$ACTION_TYPE;", "", "(Ljava/lang/String;I)V", "DELETE", "BOOK_SINGLE", "CHECKED", "UNCHECKED", "app_debug"})
    public static enum ACTION_TYPE {
        /*public static final*/ DELETE /* = new DELETE() */,
        /*public static final*/ BOOK_SINGLE /* = new BOOK_SINGLE() */,
        /*public static final*/ CHECKED /* = new CHECKED() */,
        /*public static final*/ UNCHECKED /* = new UNCHECKED() */;
        
        ACTION_TYPE() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u00a8\u0006\t"}, d2 = {"Lcom/flowerencee9/marketplace/screens/main/cart/adapter/CartChildAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/flowerencee9/marketplace/screens/main/cart/adapter/CartChildAdapter;Landroid/view/View;)V", "bind", "", "item", "Lcom/flowerencee9/marketplace/model/data/objects/CartChild;", "app_debug"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        
        public ViewHolder(@org.jetbrains.annotations.NotNull
        android.view.View itemView) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull
        com.flowerencee9.marketplace.model.data.objects.CartChild item) {
        }
    }
}