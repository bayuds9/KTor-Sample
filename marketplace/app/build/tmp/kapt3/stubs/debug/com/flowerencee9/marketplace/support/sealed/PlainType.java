package com.flowerencee9.marketplace.support.sealed;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0007\b\t\nB\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0004\u000b\f\r\u000e\u00a8\u0006\u000f"}, d2 = {"Lcom/flowerencee9/marketplace/support/sealed/PlainType;", "", "value", "", "(I)V", "getValue", "()I", "CURRENCY", "NUMBER", "PHONE", "TEXT", "Lcom/flowerencee9/marketplace/support/sealed/PlainType$CURRENCY;", "Lcom/flowerencee9/marketplace/support/sealed/PlainType$NUMBER;", "Lcom/flowerencee9/marketplace/support/sealed/PlainType$PHONE;", "Lcom/flowerencee9/marketplace/support/sealed/PlainType$TEXT;", "app_debug"})
public abstract class PlainType {
    private final int value = 0;
    
    private PlainType(int value) {
        super();
    }
    
    public final int getValue() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/flowerencee9/marketplace/support/sealed/PlainType$TEXT;", "Lcom/flowerencee9/marketplace/support/sealed/PlainType;", "()V", "app_debug"})
    public static final class TEXT extends com.flowerencee9.marketplace.support.sealed.PlainType {
        @org.jetbrains.annotations.NotNull
        public static final com.flowerencee9.marketplace.support.sealed.PlainType.TEXT INSTANCE = null;
        
        private TEXT() {
            super(0);
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/flowerencee9/marketplace/support/sealed/PlainType$CURRENCY;", "Lcom/flowerencee9/marketplace/support/sealed/PlainType;", "()V", "app_debug"})
    public static final class CURRENCY extends com.flowerencee9.marketplace.support.sealed.PlainType {
        @org.jetbrains.annotations.NotNull
        public static final com.flowerencee9.marketplace.support.sealed.PlainType.CURRENCY INSTANCE = null;
        
        private CURRENCY() {
            super(0);
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/flowerencee9/marketplace/support/sealed/PlainType$NUMBER;", "Lcom/flowerencee9/marketplace/support/sealed/PlainType;", "()V", "app_debug"})
    public static final class NUMBER extends com.flowerencee9.marketplace.support.sealed.PlainType {
        @org.jetbrains.annotations.NotNull
        public static final com.flowerencee9.marketplace.support.sealed.PlainType.NUMBER INSTANCE = null;
        
        private NUMBER() {
            super(0);
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/flowerencee9/marketplace/support/sealed/PlainType$PHONE;", "Lcom/flowerencee9/marketplace/support/sealed/PlainType;", "()V", "app_debug"})
    public static final class PHONE extends com.flowerencee9.marketplace.support.sealed.PlainType {
        @org.jetbrains.annotations.NotNull
        public static final com.flowerencee9.marketplace.support.sealed.PlainType.PHONE INSTANCE = null;
        
        private PHONE() {
            super(0);
        }
    }
}