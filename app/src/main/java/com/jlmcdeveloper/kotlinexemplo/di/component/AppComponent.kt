package com.jlmcdeveloper.kotlinexemplo.di.component

import android.app.Application
import com.jlmcdeveloper.kotlinexemplo.AppApplication
import com.jlmcdeveloper.kotlinexemplo.di.builder.ActivityBuilder
import com.jlmcdeveloper.kotlinexemplo.di.module.AppModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import javax.inject.Singleton

@Singleton
@Component(modules = [AndroidInjectionModule::class,
    AppModule::class,
    ActivityBuilder::class])
interface AppComponent {

    fun inject(appApplication: AppApplication)

    @Component.Builder
    interface Builder{

        @BindsInstance
        fun application(application: Application) : Builder

        fun build() : AppComponent
    }
}