package com.flowerencee9.marketplace.screens.main.explore.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00182\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0002\u0018\u0019B\u0019\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007J\u001c\u0010\u0010\u001a\u00020\u00062\n\u0010\u0011\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u001c\u0010\u0014\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0013H\u0016R\u001a\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\'\u0010\u000b\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00020\nj\b\u0012\u0004\u0012\u00020\u0002`\r0\f8F\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u001a"}, d2 = {"Lcom/flowerencee9/marketplace/screens/main/explore/adapter/ExploreAdapter;", "Landroidx/paging/PagingDataAdapter;", "Lcom/flowerencee9/marketplace/model/data/response/Product;", "Lcom/flowerencee9/marketplace/screens/main/explore/adapter/ExploreAdapter$ViewHolder;", "listener", "Lkotlin/Function1;", "", "(Lkotlin/jvm/functions/Function1;)V", "_snapshotData", "Landroidx/lifecycle/MutableLiveData;", "Ljava/util/ArrayList;", "snapshotData", "Landroidx/lifecycle/LiveData;", "Lkotlin/collections/ArrayList;", "getSnapshotData", "()Landroidx/lifecycle/LiveData;", "onBindViewHolder", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "Companion", "ViewHolder", "app_debug"})
public final class ExploreAdapter extends androidx.paging.PagingDataAdapter<com.flowerencee9.marketplace.model.data.response.Product, com.flowerencee9.marketplace.screens.main.explore.adapter.ExploreAdapter.ViewHolder> {
    private final kotlin.jvm.functions.Function1<com.flowerencee9.marketplace.model.data.response.Product, kotlin.Unit> listener = null;
    private final androidx.lifecycle.MutableLiveData<java.util.ArrayList<com.flowerencee9.marketplace.model.data.response.Product>> _snapshotData = null;
    @org.jetbrains.annotations.NotNull
    public static final com.flowerencee9.marketplace.screens.main.explore.adapter.ExploreAdapter.Companion Companion = null;
    @org.jetbrains.annotations.NotNull
    private static final androidx.recyclerview.widget.DiffUtil.ItemCallback<com.flowerencee9.marketplace.model.data.response.Product> DIFF_CALLBACK = null;
    
    public ExploreAdapter(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super com.flowerencee9.marketplace.model.data.response.Product, kotlin.Unit> listener) {
        super(null, null, null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.ArrayList<com.flowerencee9.marketplace.model.data.response.Product>> getSnapshotData() {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.flowerencee9.marketplace.screens.main.explore.adapter.ExploreAdapter.ViewHolder holder, int position) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.flowerencee9.marketplace.screens.main.explore.adapter.ExploreAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/flowerencee9/marketplace/screens/main/explore/adapter/ExploreAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/flowerencee9/marketplace/databinding/LayoutItemExploreBinding;", "context", "Landroid/content/Context;", "(Lcom/flowerencee9/marketplace/screens/main/explore/adapter/ExploreAdapter;Lcom/flowerencee9/marketplace/databinding/LayoutItemExploreBinding;Landroid/content/Context;)V", "bind", "", "item", "Lcom/flowerencee9/marketplace/model/data/response/Product;", "app_debug"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.flowerencee9.marketplace.databinding.LayoutItemExploreBinding binding = null;
        private final android.content.Context context = null;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull
        com.flowerencee9.marketplace.databinding.LayoutItemExploreBinding binding, @org.jetbrains.annotations.NotNull
        android.content.Context context) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull
        com.flowerencee9.marketplace.model.data.response.Product item) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lcom/flowerencee9/marketplace/screens/main/explore/adapter/ExploreAdapter$Companion;", "", "()V", "DIFF_CALLBACK", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/flowerencee9/marketplace/model/data/response/Product;", "getDIFF_CALLBACK", "()Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final androidx.recyclerview.widget.DiffUtil.ItemCallback<com.flowerencee9.marketplace.model.data.response.Product> getDIFF_CALLBACK() {
            return null;
        }
    }
}