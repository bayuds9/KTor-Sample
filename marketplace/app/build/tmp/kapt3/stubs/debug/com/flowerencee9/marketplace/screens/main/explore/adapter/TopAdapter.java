package com.flowerencee9.marketplace.screens.main.explore.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0016B\u0019\u0012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u00a2\u0006\u0002\u0010\u0007J\b\u0010\n\u001a\u00020\u000bH\u0016J\u001c\u0010\f\u001a\u00020\u00062\n\u0010\r\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u000bH\u0016J\u001c\u0010\u000f\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000bH\u0016J\u001e\u0010\u0013\u001a\u00020\u00062\u0016\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u00050\tj\b\u0012\u0004\u0012\u00020\u0005`\u0015R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/flowerencee9/marketplace/screens/main/explore/adapter/TopAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/flowerencee9/marketplace/screens/main/explore/adapter/TopAdapter$ViewHolder;", "listener", "Lkotlin/Function1;", "Lcom/flowerencee9/marketplace/model/data/response/Product;", "", "(Lkotlin/jvm/functions/Function1;)V", "listData", "Ljava/util/ArrayList;", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setData", "list", "Lkotlin/collections/ArrayList;", "ViewHolder", "app_debug"})
public final class TopAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.flowerencee9.marketplace.screens.main.explore.adapter.TopAdapter.ViewHolder> {
    private final kotlin.jvm.functions.Function1<com.flowerencee9.marketplace.model.data.response.Product, kotlin.Unit> listener = null;
    private final java.util.ArrayList<com.flowerencee9.marketplace.model.data.response.Product> listData = null;
    
    public TopAdapter(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super com.flowerencee9.marketplace.model.data.response.Product, kotlin.Unit> listener) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.flowerencee9.marketplace.screens.main.explore.adapter.TopAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.flowerencee9.marketplace.screens.main.explore.adapter.TopAdapter.ViewHolder holder, int position) {
    }
    
    public final void setData(@org.jetbrains.annotations.NotNull
    java.util.ArrayList<com.flowerencee9.marketplace.model.data.response.Product> list) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u00a8\u0006\t"}, d2 = {"Lcom/flowerencee9/marketplace/screens/main/explore/adapter/TopAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/flowerencee9/marketplace/screens/main/explore/adapter/TopAdapter;Landroid/view/View;)V", "bind", "", "item", "Lcom/flowerencee9/marketplace/model/data/response/Product;", "app_debug"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        
        public ViewHolder(@org.jetbrains.annotations.NotNull
        android.view.View itemView) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull
        com.flowerencee9.marketplace.model.data.response.Product item) {
        }
    }
}