package com.jlmcdeveloper.kotlinexemplo.di.module

import android.app.Application
import android.content.Context
import com.jlmcdeveloper.kotlinexemplo.data.Repository
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule {

    @Provides
    @Singleton
    fun provideContext(app: Application): Context = app

    @Provides
    @Singleton
    fun provideRepository() : Repository = Repository()
}