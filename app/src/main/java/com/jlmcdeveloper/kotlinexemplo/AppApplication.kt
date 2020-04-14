package com.jlmcdeveloper.kotlinexemplo

import android.app.Application
import com.jlmcdeveloper.kotlinexemplo.di.activityModules
import com.jlmcdeveloper.kotlinexemplo.di.appModules
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class AppApplication : Application(){

    override fun onCreate() {
        super.onCreate()
        // get all modules
        val moduleList = appModules + activityModules
        // set the module list
        startKoin{
            androidLogger()
            // declare used Android context
            androidContext(this@AppApplication)
            // declare modules
            modules(moduleList)
        }
    }
}