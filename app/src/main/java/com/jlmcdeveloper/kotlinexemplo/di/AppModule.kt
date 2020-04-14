package com.jlmcdeveloper.kotlinexemplo.di

import com.jlmcdeveloper.kotlinexemplo.data.Repository
import org.koin.dsl.module


val dataModule = module {
    single{ Repository() }
}


val appModules = listOf(dataModule)