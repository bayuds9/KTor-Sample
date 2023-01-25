package com.flowerencee9.marketplace.model.data.response;

import java.lang.System;

@kotlinx.parcelize.Parcelize
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b*\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001By\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0012\b\u0002\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0002\u0010\u0010J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0013\u00102\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\tH\u00c6\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u00104\u001a\u0004\u0018\u00010\rH\u00c6\u0003\u00a2\u0006\u0002\u0010$J\u0010\u00105\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003\u00a2\u0006\u0002\u0010)J\u0082\u0001\u00106\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u0012\b\u0002\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u00c6\u0001\u00a2\u0006\u0002\u00107J\t\u00108\u001a\u00020\u000fH\u00d6\u0001J\u0013\u00109\u001a\u00020:2\b\u0010;\u001a\u0004\u0018\u00010<H\u00d6\u0003J\t\u0010=\u001a\u00020\u000fH\u00d6\u0001J\t\u0010>\u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020\u000fH\u00d6\u0001R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0012\"\u0004\b\u0016\u0010\u0014R \u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0012\"\u0004\b\u0018\u0010\u0014R \u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0012\"\u0004\b\u001a\u0010\u0014R \u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0012\"\u0004\b\u001c\u0010\u0014R(\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R \u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0012\"\u0004\b\"\u0010\u0014R\"\u0010\f\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\'\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\"\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010,\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+\u00a8\u0006D"}, d2 = {"Lcom/flowerencee9/marketplace/model/data/response/Product;", "Landroid/os/Parcelable;", "createdAt", "", "merchantId", "productCategory", "productDesc", "productId", "productImage", "", "Lcom/flowerencee9/marketplace/model/data/response/ProductImage;", "productName", "productPrice", "", "productStock", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Integer;)V", "getCreatedAt", "()Ljava/lang/String;", "setCreatedAt", "(Ljava/lang/String;)V", "getMerchantId", "setMerchantId", "getProductCategory", "setProductCategory", "getProductDesc", "setProductDesc", "getProductId", "setProductId", "getProductImage", "()Ljava/util/List;", "setProductImage", "(Ljava/util/List;)V", "getProductName", "setProductName", "getProductPrice", "()Ljava/lang/Double;", "setProductPrice", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "getProductStock", "()Ljava/lang/Integer;", "setProductStock", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Integer;)Lcom/flowerencee9/marketplace/model/data/response/Product;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_debug"})
public final class Product implements android.os.Parcelable {
    @org.jetbrains.annotations.Nullable
    @com.google.gson.annotations.SerializedName(value = "createdAt")
    private java.lang.String createdAt;
    @org.jetbrains.annotations.Nullable
    @com.google.gson.annotations.SerializedName(value = "merchantId")
    private java.lang.String merchantId;
    @org.jetbrains.annotations.Nullable
    @com.google.gson.annotations.SerializedName(value = "productCategory")
    private java.lang.String productCategory;
    @org.jetbrains.annotations.Nullable
    @com.google.gson.annotations.SerializedName(value = "productDesc")
    private java.lang.String productDesc;
    @org.jetbrains.annotations.Nullable
    @com.google.gson.annotations.SerializedName(value = "productId")
    private java.lang.String productId;
    @org.jetbrains.annotations.Nullable
    @com.google.gson.annotations.SerializedName(value = "productImage")
    private java.util.List<com.flowerencee9.marketplace.model.data.response.ProductImage> productImage;
    @org.jetbrains.annotations.Nullable
    @com.google.gson.annotations.SerializedName(value = "productName")
    private java.lang.String productName;
    @org.jetbrains.annotations.Nullable
    @com.google.gson.annotations.SerializedName(value = "productPrice")
    private java.lang.Double productPrice;
    @org.jetbrains.annotations.Nullable
    @com.google.gson.annotations.SerializedName(value = "productStock")
    private java.lang.Integer productStock;
    public static final android.os.Parcelable.Creator<com.flowerencee9.marketplace.model.data.response.Product> CREATOR = null;
    
    @org.jetbrains.annotations.NotNull
    public final com.flowerencee9.marketplace.model.data.response.Product copy(@org.jetbrains.annotations.Nullable
    java.lang.String createdAt, @org.jetbrains.annotations.Nullable
    java.lang.String merchantId, @org.jetbrains.annotations.Nullable
    java.lang.String productCategory, @org.jetbrains.annotations.Nullable
    java.lang.String productDesc, @org.jetbrains.annotations.Nullable
    java.lang.String productId, @org.jetbrains.annotations.Nullable
    java.util.List<com.flowerencee9.marketplace.model.data.response.ProductImage> productImage, @org.jetbrains.annotations.Nullable
    java.lang.String productName, @org.jetbrains.annotations.Nullable
    java.lang.Double productPrice, @org.jetbrains.annotations.Nullable
    java.lang.Integer productStock) {
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
    
    public Product() {
        super();
    }
    
    public Product(@org.jetbrains.annotations.Nullable
    java.lang.String createdAt, @org.jetbrains.annotations.Nullable
    java.lang.String merchantId, @org.jetbrains.annotations.Nullable
    java.lang.String productCategory, @org.jetbrains.annotations.Nullable
    java.lang.String productDesc, @org.jetbrains.annotations.Nullable
    java.lang.String productId, @org.jetbrains.annotations.Nullable
    java.util.List<com.flowerencee9.marketplace.model.data.response.ProductImage> productImage, @org.jetbrains.annotations.Nullable
    java.lang.String productName, @org.jetbrains.annotations.Nullable
    java.lang.Double productPrice, @org.jetbrains.annotations.Nullable
    java.lang.Integer productStock) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getCreatedAt() {
        return null;
    }
    
    public final void setCreatedAt(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getMerchantId() {
        return null;
    }
    
    public final void setMerchantId(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getProductCategory() {
        return null;
    }
    
    public final void setProductCategory(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getProductDesc() {
        return null;
    }
    
    public final void setProductDesc(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getProductId() {
        return null;
    }
    
    public final void setProductId(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.flowerencee9.marketplace.model.data.response.ProductImage> component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.flowerencee9.marketplace.model.data.response.ProductImage> getProductImage() {
        return null;
    }
    
    public final void setProductImage(@org.jetbrains.annotations.Nullable
    java.util.List<com.flowerencee9.marketplace.model.data.response.ProductImage> p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getProductName() {
        return null;
    }
    
    public final void setProductName(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Double component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Double getProductPrice() {
        return null;
    }
    
    public final void setProductPrice(@org.jetbrains.annotations.Nullable
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getProductStock() {
        return null;
    }
    
    public final void setProductStock(@org.jetbrains.annotations.Nullable
    java.lang.Integer p0) {
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
    public static final class Creator implements android.os.Parcelable.Creator<com.flowerencee9.marketplace.model.data.response.Product> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public final com.flowerencee9.marketplace.model.data.response.Product createFromParcel(@org.jetbrains.annotations.NotNull
        android.os.Parcel in) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public final com.flowerencee9.marketplace.model.data.response.Product[] newArray(int size) {
            return null;
        }
    }
}