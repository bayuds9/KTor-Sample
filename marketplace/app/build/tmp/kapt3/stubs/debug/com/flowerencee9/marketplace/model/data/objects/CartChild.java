package com.flowerencee9.marketplace.model.data.objects;

import java.lang.System;

@kotlinx.parcelize.Parcelize
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\t\u0010\u001a\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\tH\u00c6\u0003J;\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\tH\u00c6\u0001J\t\u0010 \u001a\u00020\u0006H\u00d6\u0001J\u0013\u0010!\u001a\u00020\t2\b\u0010\"\u001a\u0004\u0018\u00010#H\u00d6\u0003J\t\u0010$\u001a\u00020\u0006H\u00d6\u0001J\t\u0010%\u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010&\u001a\u00020\'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u0006H\u00d6\u0001R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0010\"\u0004\b\u0017\u0010\u0012R\u001a\u0010\u0007\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\f\"\u0004\b\u0019\u0010\u000e\u00a8\u0006+"}, d2 = {"Lcom/flowerencee9/marketplace/model/data/objects/CartChild;", "Landroid/os/Parcelable;", "idProduct", "", "productName", "amount", "", "totalPrice", "isChecked", "", "(Ljava/lang/String;Ljava/lang/String;IIZ)V", "getAmount", "()I", "setAmount", "(I)V", "getIdProduct", "()Ljava/lang/String;", "setIdProduct", "(Ljava/lang/String;)V", "()Z", "setChecked", "(Z)V", "getProductName", "setProductName", "getTotalPrice", "setTotalPrice", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_debug"})
public final class CartChild implements android.os.Parcelable {
    @org.jetbrains.annotations.NotNull
    private java.lang.String idProduct;
    @org.jetbrains.annotations.NotNull
    private java.lang.String productName;
    private int amount;
    private int totalPrice;
    private boolean isChecked;
    public static final android.os.Parcelable.Creator<com.flowerencee9.marketplace.model.data.objects.CartChild> CREATOR = null;
    
    @org.jetbrains.annotations.NotNull
    public final com.flowerencee9.marketplace.model.data.objects.CartChild copy(@org.jetbrains.annotations.NotNull
    java.lang.String idProduct, @org.jetbrains.annotations.NotNull
    java.lang.String productName, int amount, int totalPrice, boolean isChecked) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String toString() {
        return null;
    }
    
    public CartChild() {
        super();
    }
    
    public CartChild(@org.jetbrains.annotations.NotNull
    java.lang.String idProduct, @org.jetbrains.annotations.NotNull
    java.lang.String productName, int amount, int totalPrice, boolean isChecked) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getIdProduct() {
        return null;
    }
    
    public final void setIdProduct(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getProductName() {
        return null;
    }
    
    public final void setProductName(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    public final int component3() {
        return 0;
    }
    
    public final int getAmount() {
        return 0;
    }
    
    public final void setAmount(int p0) {
    }
    
    public final int component4() {
        return 0;
    }
    
    public final int getTotalPrice() {
        return 0;
    }
    
    public final void setTotalPrice(int p0) {
    }
    
    public final boolean component5() {
        return false;
    }
    
    public final boolean isChecked() {
        return false;
    }
    
    public final void setChecked(boolean p0) {
    }
    
    @java.lang.Override
    public int describeContents() {
        return 0;
    }
    
    @java.lang.Override
    public void writeToParcel(@org.jetbrains.annotations.NotNull
    android.os.Parcel parcel, int flags) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 3)
    public static final class Creator implements android.os.Parcelable.Creator<com.flowerencee9.marketplace.model.data.objects.CartChild> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public final com.flowerencee9.marketplace.model.data.objects.CartChild createFromParcel(@org.jetbrains.annotations.NotNull
        android.os.Parcel in) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public final com.flowerencee9.marketplace.model.data.objects.CartChild[] newArray(int size) {
            return null;
        }
    }
}