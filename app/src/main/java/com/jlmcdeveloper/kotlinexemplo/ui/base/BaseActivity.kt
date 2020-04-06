package com.jlmcdeveloper.kotlinexemplo.ui.base

import android.os.Bundle
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import dagger.android.AndroidInjection

abstract class BaseActivity<T : ViewDataBinding, V : BaseViewModel<*>> : AppCompatActivity() {
    private var viewModel : V? = null
    var viewDataBinding : T? = null
        private set

    /**
     * Override for set binding variable
     * @return variable id
     */
    abstract val bindingVariable : Int

    /**
     * @return layout resource id
     */
    @get:LayoutRes
    abstract val layoutId: Int

    /**
     * Override for set view model
     * @return view model instance
     */
    abstract fun getViewModel() : V


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        performDependencyInjection()
        performDataBinding()
    }

    fun performDependencyInjection(){
        AndroidInjection.inject(this)
    }

    private fun performDataBinding(){
        viewDataBinding = DataBindingUtil.setContentView(this, layoutId)
        this.viewModel = if (viewModel != null) viewModel else getViewModel()

        (viewDataBinding as ViewDataBinding).setVariable(bindingVariable, viewModel)
        (viewDataBinding as ViewDataBinding).executePendingBindings()
    }

}
