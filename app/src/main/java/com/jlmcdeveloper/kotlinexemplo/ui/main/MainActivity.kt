package com.jlmcdeveloper.kotlinexemplo.ui.main

import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.jlmcdeveloper.kotlinexemplo.BR
import com.jlmcdeveloper.kotlinexemplo.R
import com.jlmcdeveloper.kotlinexemplo.ViewModelProvideFactory
import com.jlmcdeveloper.kotlinexemplo.databinding.ActivityMainBinding
import com.jlmcdeveloper.kotlinexemplo.ui.base.BaseActivity
import java.lang.ref.WeakReference
import javax.inject.Inject

class MainActivity : BaseActivity<ActivityMainBinding, MainViewModel>(), MainNavigator {

    @Inject lateinit var factory: ViewModelProvideFactory
    override val bindingVariable = BR.viewModel
    override val layoutId = R.layout.activity_main

    private lateinit var mainViewModel: MainViewModel
    private var activityMainBinding: ActivityMainBinding? = null

    //----------
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityMainBinding = viewDataBinding
        mainViewModel.navigator = WeakReference(this)
    }

    override fun getViewModel(): MainViewModel {
        mainViewModel = ViewModelProvider(this, factory).get(MainViewModel::class.java)
        return mainViewModel
    }



}
