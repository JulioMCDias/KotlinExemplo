package com.jlmcdeveloper.kotlinexemplo.ui.base

import androidx.databinding.ObservableBoolean
import androidx.lifecycle.ViewModel
import com.jlmcdeveloper.kotlinexemplo.data.Repository
import io.reactivex.disposables.CompositeDisposable
import java.lang.ref.WeakReference

abstract class BaseViewModel<N> (val repository: Repository) : ViewModel() {

    lateinit var navigator : WeakReference<N>
    private val compositeDisposable : CompositeDisposable = CompositeDisposable()
    private val observableBoolean : ObservableBoolean = ObservableBoolean()


    override fun onCleared() {
        compositeDisposable.dispose()
        super.onCleared()
    }


}