package com.flowerencee9.marketplace.screens.main.cart.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u001aB?\u0012\u001e\u0010\u0003\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0004\u0012\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\b0\n\u00a2\u0006\u0002\u0010\fJ\b\u0010\u000f\u001a\u00020\u000bH\u0016J\u001c\u0010\u0010\u001a\u00020\b2\n\u0010\u0011\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u000bH\u0016J\u001c\u0010\u0013\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000bH\u0016J\u001e\u0010\u0017\u001a\u00020\b2\u0016\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u000ej\b\u0012\u0004\u0012\u00020\u0005`\u0019R&\u0010\u0003\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/flowerencee9/marketplace/screens/main/cart/adapter/CartParentAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/flowerencee9/marketplace/screens/main/cart/adapter/CartParentAdapter$ViewHolder;", "childActionListener", "Lkotlin/Function3;", "Lcom/flowerencee9/marketplace/model/data/objects/CartParent;", "Lcom/flowerencee9/marketplace/model/data/objects/CartChild;", "Lcom/flowerencee9/marketplace/screens/main/cart/adapter/CartChildAdapter$ACTION_TYPE;", "", "parentListener", "Lkotlin/Function2;", "", "(Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;)V", "listData", "Ljava/util/ArrayList;", "getItemCount", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setData", "list", "Lkotlin/collections/ArrayList;", "ViewHolder", "app_debug"})
public final class CartParentAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.flowerencee9.marketplace.screens.main.cart.adapter.CartParentAdapter.ViewHolder> {
    private final kotlin.jvm.functions.Function3<com.flowerencee9.marketplace.model.data.objects.CartParent, com.flowerencee9.marketplace.model.data.objects.CartChild, com.flowerencee9.marketplace.screens.main.cart.adapter.CartChildAdapter.ACTION_TYPE, kotlin.Unit> childActionListener = null;
    private final kotlin.jvm.functions.Function2<com.flowerencee9.marketplace.model.data.objects.CartParent, java.lang.Integer, kotlin.Unit> parentListener = null;
    private final java.util.ArrayList<com.flowerencee9.marketplace.model.data.objects.CartParent> listData = null;
    
    public CartParentAdapter(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function3<? super com.flowerencee9.marketplace.model.data.objects.CartParent, ? super com.flowerencee9.marketplace.model.data.objects.CartChild, ? super com.flowerencee9.marketplace.screens.main.cart.adapter.CartChildAdapter.ACTION_TYPE, kotlin.Unit> childActionListener, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function2<? super com.flowerencee9.marketplace.model.data.objects.CartParent, ? super java.lang.Integer, kotlin.Unit> parentListener) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.flowerencee9.marketplace.screens.main.cart.adapter.CartParentAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.flowerencee9.marketplace.screens.main.cart.adapter.CartParentAdapter.ViewHolder holder, int position) {
    }
    
    public final void setData(@org.jetbrains.annotations.NotNull
    java.util.ArrayList<com.flowerencee9.marketplace.model.data.objects.CartParent> list) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u00a8\u0006\t"}, d2 = {"Lcom/flowerencee9/marketplace/screens/main/cart/adapter/CartParentAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/flowerencee9/marketplace/screens/main/cart/adapter/CartParentAdapter;Landroid/view/View;)V", "bind", "Landroid/widget/Button;", "item", "Lcom/flowerencee9/marketplace/model/data/objects/CartParent;", "app_debug"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        
        public ViewHolder(@org.jetbrains.annotations.NotNull
        android.view.View itemView) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.Button bind(@org.jetbrains.annotations.NotNull
        com.flowerencee9.marketplace.model.data.objects.CartParent item) {
            return null;
        }
    }
}