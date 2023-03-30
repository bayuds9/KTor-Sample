package com.flowerencee9.marketplace.support.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0007"}, d2 = {"Lcom/flowerencee9/marketplace/support/base/BaseConstants;", "", "()V", "ENDPOINT", "ERROR-CODE", "PARAM", "TEXT_VALUE_TYPE", "app_debug"})
public final class BaseConstants {
    @org.jetbrains.annotations.NotNull
    public static final com.flowerencee9.marketplace.support.base.BaseConstants INSTANCE = null;
    
    private BaseConstants() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/flowerencee9/marketplace/support/base/BaseConstants$ENDPOINT;", "", "Companion", "app_debug"})
    public static abstract interface ENDPOINT {
        @org.jetbrains.annotations.NotNull
        public static final com.flowerencee9.marketplace.support.base.BaseConstants.ENDPOINT.Companion Companion = null;
        @org.jetbrains.annotations.NotNull
        public static final java.lang.String DISCOVER = "product/getProductList";
        
        @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/flowerencee9/marketplace/support/base/BaseConstants$ENDPOINT$Companion;", "", "()V", "DISCOVER", "", "app_debug"})
        public static final class Companion {
            @org.jetbrains.annotations.NotNull
            public static final java.lang.String DISCOVER = "product/getProductList";
            
            private Companion() {
                super();
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/flowerencee9/marketplace/support/base/BaseConstants$TEXT_VALUE_TYPE;", "", "Companion", "app_debug"})
    public static abstract interface TEXT_VALUE_TYPE {
        @org.jetbrains.annotations.NotNull
        public static final com.flowerencee9.marketplace.support.base.BaseConstants.TEXT_VALUE_TYPE.Companion Companion = null;
        public static final int VALUE_TEXT = 0;
        public static final int VALUE_CURRENCY = 1;
        public static final int VALUE_AMOUNT = 2;
        public static final int VALUE_PHONE = 3;
        
        @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/flowerencee9/marketplace/support/base/BaseConstants$TEXT_VALUE_TYPE$Companion;", "", "()V", "VALUE_AMOUNT", "", "VALUE_CURRENCY", "VALUE_PHONE", "VALUE_TEXT", "app_debug"})
        public static final class Companion {
            public static final int VALUE_TEXT = 0;
            public static final int VALUE_CURRENCY = 1;
            public static final int VALUE_AMOUNT = 2;
            public static final int VALUE_PHONE = 3;
            
            private Companion() {
                super();
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/flowerencee9/marketplace/support/base/BaseConstants$PARAM;", "", "Companion", "app_debug"})
    public static abstract interface PARAM {
        @org.jetbrains.annotations.NotNull
        public static final com.flowerencee9.marketplace.support.base.BaseConstants.PARAM.Companion Companion = null;
        @org.jetbrains.annotations.NotNull
        public static final java.lang.String STORAGE_DIRECTORY = "storage";
        @org.jetbrains.annotations.NotNull
        public static final java.lang.String IMAGE_DIRECTORY = "/image";
        @org.jetbrains.annotations.NotNull
        public static final java.lang.String PUBLIC_IMAGE_DIRECTORY = "/public";
        @org.jetbrains.annotations.NotNull
        public static final java.lang.String USER_PROFILE = "/profile";
        @org.jetbrains.annotations.NotNull
        public static final java.lang.String PRODUCT = "/product";
        
        @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/flowerencee9/marketplace/support/base/BaseConstants$PARAM$Companion;", "", "()V", "IMAGE_DIRECTORY", "", "PRODUCT", "PUBLIC_IMAGE_DIRECTORY", "STORAGE_DIRECTORY", "USER_PROFILE", "app_debug"})
        public static final class Companion {
            @org.jetbrains.annotations.NotNull
            public static final java.lang.String STORAGE_DIRECTORY = "storage";
            @org.jetbrains.annotations.NotNull
            public static final java.lang.String IMAGE_DIRECTORY = "/image";
            @org.jetbrains.annotations.NotNull
            public static final java.lang.String PUBLIC_IMAGE_DIRECTORY = "/public";
            @org.jetbrains.annotations.NotNull
            public static final java.lang.String USER_PROFILE = "/profile";
            @org.jetbrains.annotations.NotNull
            public static final java.lang.String PRODUCT = "/product";
            
            private Companion() {
                super();
            }
        }
    }
}