package com.gify.di.module

import com.gify.di.scope.AppScope
import com.gify.data.network.GifAPI
import com.gify.data.repository.GifDataRepository
import dagger.Module
import dagger.Provides

@Module
open class RepositoryModule {
    @AppScope
    @Provides
   open fun provideGifRepository(api: GifAPI) =
        GifDataRepository(api)
}