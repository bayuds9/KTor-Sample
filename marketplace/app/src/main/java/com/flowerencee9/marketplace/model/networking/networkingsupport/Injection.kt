package com.flowerencee9.marketplace.model.networking.networkingsupport

import android.content.Context
import com.flowerencee9.marketplace.model.networking.ktor.KtorService
import com.flowerencee9.marketplace.model.networking.repositories.MainRepository
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
}