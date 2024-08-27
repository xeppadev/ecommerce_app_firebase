package com.example.ecommerce_app_firebase.di.coroutine

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped
import kotlinx.coroutines.Dispatchers
import javax.inject.Qualifier


@Module
@InstallIn(ViewModelComponent::class)
object CoroutineModule {

    @IoDispatcher
    @Provides
    @ViewModelScoped
    fun providesIoDispatcher() = Dispatchers.IO
}

@Retention(AnnotationRetention.RUNTIME)
@Qualifier
annotation class IoDispatcher