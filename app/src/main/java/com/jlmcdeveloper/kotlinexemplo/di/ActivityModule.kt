package com.jlmcdeveloper.kotlinexemplo.di

import com.jlmcdeveloper.kotlinexemplo.ui.login.LoginViewModel
import com.jlmcdeveloper.kotlinexemplo.ui.main.MainViewModel
import com.jlmcdeveloper.kotlinexemplo.ui.newuser.NewUserViewModel
import com.jlmcdeveloper.kotlinexemplo.ui.note.NoteViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module


val mainModule = module{
    viewModel { MainViewModel(get()) }
}

val loginModule = module{
    viewModel { LoginViewModel(get()) }
}

val newUserModule = module{
    viewModel { NewUserViewModel(get()) }
}

val noteModule = module{
    viewModel { NoteViewModel(get()) }
}

val activityModules = listOf(mainModule, loginModule, noteModule, newUserModule)