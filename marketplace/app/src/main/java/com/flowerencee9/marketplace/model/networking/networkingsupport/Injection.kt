package com.flowerencee9.marketplace.model.networking.networkingsupport

import android.content.Context
import com.flowerencee9.marketplace.model.networking.ktor.KtorService
import com.flowerencee9.marketplace.model.networking.repositories.*
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object Injection {

    @Provides
    fun provideMain(@ApplicationContext context: Context) = MainRepository(KtorService.create(context))

    @Provides
    fun provideExplore(@ApplicationContext context: Context) = ExploreRepository(KtorService.create(context))

    @Provides
    fun provideUser(@ApplicationContext context: Context) = UserRepository(KtorService.create(context), context)

    @Provides
    fun provideCart(@ApplicationContext context: Context) = CartRepository(KtorService.create(context))

    @Provides
    fun provideTransaction(@ApplicationContext context: Context) = TransactionRepository(KtorService.create(context))

    @Provides
    fun provideReport(@ApplicationContext context: Context) = ReportRepository(KtorService.create(context))

    @Provides
    fun provideAuth(@ApplicationContext context: Context) = AuthRepository(KtorService.create(context), context)
}