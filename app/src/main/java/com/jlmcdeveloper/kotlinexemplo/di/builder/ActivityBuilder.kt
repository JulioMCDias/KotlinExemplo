package com.jlmcdeveloper.kotlinexemplo.di.builder

import com.jlmcdeveloper.kotlinexemplo.ui.login.LoginActivity
import com.jlmcdeveloper.kotlinexemplo.ui.main.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuilder {

    @ContributesAndroidInjector
    abstract fun loginActivity() : LoginActivity

    @ContributesAndroidInjector
    abstract fun mainActivity() : MainActivity
}