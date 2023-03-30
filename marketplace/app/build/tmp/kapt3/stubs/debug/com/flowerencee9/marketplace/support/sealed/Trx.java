package com.flowerencee9.marketplace.support.sealed;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0007\b\tB\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0003\n\u000b\f\u00a8\u0006\r"}, d2 = {"Lcom/flowerencee9/marketplace/support/sealed/Trx;", "", "value", "", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "FINISHED", "PROGRESS", "WAITING", "Lcom/flowerencee9/marketplace/support/sealed/Trx$FINISHED;", "Lcom/flowerencee9/marketplace/support/sealed/Trx$PROGRESS;", "Lcom/flowerencee9/marketplace/support/sealed/Trx$WAITING;", "app_debug"})
public abstract class Trx {
    @org.jetbrains.annotations.NotNull
    private final java.lang.String value = null;
    
    private Trx(java.lang.String value) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getValue() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/flowerencee9/marketplace/support/sealed/Trx$WAITING;", "Lcom/flowerencee9/marketplace/support/sealed/Trx;", "()V", "app_debug"})
    public static final class WAITING extends com.flowerencee9.marketplace.support.sealed.Trx {
        @org.jetbrains.annotations.NotNull
        public static final com.flowerencee9.marketplace.support.sealed.Trx.WAITING INSTANCE = null;
        
        private WAITING() {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/flowerencee9/marketplace/support/sealed/Trx$PROGRESS;", "Lcom/flowerencee9/marketplace/support/sealed/Trx;", "()V", "app_debug"})
    public static final class PROGRESS extends com.flowerencee9.marketplace.support.sealed.Trx {
        @org.jetbrains.annotations.NotNull
        public static final com.flowerencee9.marketplace.support.sealed.Trx.PROGRESS INSTANCE = null;
        
        private PROGRESS() {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/flowerencee9/marketplace/support/sealed/Trx$FINISHED;", "Lcom/flowerencee9/marketplace/support/sealed/Trx;", "()V", "app_debug"})
    public static final class FINISHED extends com.flowerencee9.marketplace.support.sealed.Trx {
        @org.jetbrains.annotations.NotNull
        public static final com.flowerencee9.marketplace.support.sealed.Trx.FINISHED INSTANCE = null;
        
        private FINISHED() {
            super(null);
        }
    }
}