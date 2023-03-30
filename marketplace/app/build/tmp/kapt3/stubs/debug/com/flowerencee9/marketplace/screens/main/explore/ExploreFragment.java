package com.flowerencee9.marketplace.screens.main.explore;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 -2\u00020\u0001:\u0001-B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0002J$\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\b\u0010\"\u001a\u00020\u0019H\u0016J\u0010\u0010#\u001a\u00020\u00192\u0006\u0010$\u001a\u00020%H\u0002J\u0010\u0010&\u001a\u00020\u00192\u0006\u0010\'\u001a\u00020(H\u0002J\u001a\u0010)\u001a\u00020\u00192\u0006\u0010*\u001a\u00020\u001b2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\b\u0010+\u001a\u00020\u0019H\u0002J\b\u0010,\u001a\u00020\u0019H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0017\u0010\n\u001a\u0004\b\u0015\u0010\u0016\u00a8\u0006."}, d2 = {"Lcom/flowerencee9/marketplace/screens/main/explore/ExploreFragment;", "Landroidx/fragment/app/Fragment;", "()V", "_binding", "Lcom/flowerencee9/marketplace/databinding/FragmentExploreBinding;", "adapterPromo", "Lcom/flowerencee9/marketplace/screens/main/explore/adapter/PromoAdapter;", "getAdapterPromo", "()Lcom/flowerencee9/marketplace/screens/main/explore/adapter/PromoAdapter;", "adapterPromo$delegate", "Lkotlin/Lazy;", "adapterTop", "Lcom/flowerencee9/marketplace/screens/main/explore/adapter/TopAdapter;", "getAdapterTop", "()Lcom/flowerencee9/marketplace/screens/main/explore/adapter/TopAdapter;", "adapterTop$delegate", "binding", "getBinding", "()Lcom/flowerencee9/marketplace/databinding/FragmentExploreBinding;", "viewModel", "Lcom/flowerencee9/marketplace/screens/main/explore/ExploreViewModel;", "getViewModel", "()Lcom/flowerencee9/marketplace/screens/main/explore/ExploreViewModel;", "viewModel$delegate", "initRequestData", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onItemClicked", "item", "Lcom/flowerencee9/marketplace/model/data/response/Product;", "onPromoClicked", "promo", "Lcom/flowerencee9/marketplace/model/data/objects/Promo;", "onViewCreated", "view", "setupLogic", "setupView", "Companion", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint
public final class ExploreFragment extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.NotNull
    public static final com.flowerencee9.marketplace.screens.main.explore.ExploreFragment.Companion Companion = null;
    private static final java.lang.String TAG = null;
    private com.flowerencee9.marketplace.databinding.FragmentExploreBinding _binding;
    private final kotlin.Lazy viewModel$delegate = null;
    private final kotlin.Lazy adapterTop$delegate = null;
    private final kotlin.Lazy adapterPromo$delegate = null;
    
    public ExploreFragment() {
        super();
    }
    
    private final com.flowerencee9.marketplace.databinding.FragmentExploreBinding getBinding() {
        return null;
    }
    
    private final com.flowerencee9.marketplace.screens.main.explore.ExploreViewModel getViewModel() {
        return null;
    }
    
    private final com.flowerencee9.marketplace.screens.main.explore.adapter.TopAdapter getAdapterTop() {
        return null;
    }
    
    private final com.flowerencee9.marketplace.screens.main.explore.adapter.PromoAdapter getAdapterPromo() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initRequestData() {
    }
    
    private final void setupView() {
    }
    
    private final void setupLogic() {
    }
    
    private final void onItemClicked(com.flowerencee9.marketplace.model.data.response.Product item) {
    }
    
    private final void onPromoClicked(com.flowerencee9.marketplace.model.data.objects.Promo promo) {
    }
    
    @java.lang.Override
    public void onDestroy() {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/flowerencee9/marketplace/screens/main/explore/ExploreFragment$Companion;", "", "()V", "TAG", "", "kotlin.jvm.PlatformType", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}