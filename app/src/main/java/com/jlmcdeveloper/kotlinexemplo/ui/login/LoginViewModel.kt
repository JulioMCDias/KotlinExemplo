package com.jlmcdeveloper.kotlinexemplo.ui.login

import com.jlmcdeveloper.kotlinexemplo.data.Repository
import com.jlmcdeveloper.kotlinexemplo.ui.base.BaseViewModel
import javax.inject.Inject


class LoginViewModel @Inject constructor(repository: Repository)
    : BaseViewModel<LoginNavigator>(repository) {


}