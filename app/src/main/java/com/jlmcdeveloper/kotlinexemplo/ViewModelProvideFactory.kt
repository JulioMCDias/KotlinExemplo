package com.jlmcdeveloper.kotlinexemplo

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.jlmcdeveloper.kotlinexemplo.data.Repository
import com.jlmcdeveloper.kotlinexemplo.ui.login.LoginViewModel
import com.jlmcdeveloper.kotlinexemplo.ui.main.MainViewModel
import javax.inject.Inject

class ViewModelProvideFactory @Inject constructor(private val repository: Repository):
    ViewModelProvider.NewInstanceFactory() {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T =
        with(modelClass){
            when {
                isAssignableFrom(LoginViewModel::class.java) -> LoginViewModel(repository)
                isAssignableFrom(MainViewModel::class.java) -> MainViewModel(repository)

                else -> IllegalArgumentException("Unknown ViewModel class")
            }
        }  as T
}