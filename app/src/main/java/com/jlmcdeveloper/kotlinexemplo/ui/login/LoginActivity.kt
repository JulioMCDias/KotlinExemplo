package com.jlmcdeveloper.kotlinexemplo.ui.login

import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.jlmcdeveloper.kotlinexemplo.BR
import com.jlmcdeveloper.kotlinexemplo.R
import com.jlmcdeveloper.kotlinexemplo.ViewModelProvideFactory
import com.jlmcdeveloper.kotlinexemplo.databinding.ActivityLoginBinding
import com.jlmcdeveloper.kotlinexemplo.ui.base.BaseActivity
import java.lang.ref.WeakReference
import javax.inject.Inject

class LoginActivity : BaseActivity<ActivityLoginBinding, LoginViewModel>(), LoginNavigator {

    @Inject lateinit var factory : ViewModelProvideFactory
    override val bindingVariable = BR.viewModel
    override val layoutId = R.layout.activity_login

    private lateinit var loginViewModel: LoginViewModel
    private var activityLoginBinding : ActivityLoginBinding? = null

    override fun getViewModel(): LoginViewModel {
        loginViewModel = ViewModelProvider(this, factory).get(LoginViewModel::class.java)
        return loginViewModel
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityLoginBinding = viewDataBinding
        loginViewModel.navigator = WeakReference(this)
    }



}
