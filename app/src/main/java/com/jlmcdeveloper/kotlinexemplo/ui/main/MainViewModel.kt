package com.jlmcdeveloper.kotlinexemplo.ui.main

import com.jlmcdeveloper.kotlinexemplo.data.Repository
import com.jlmcdeveloper.kotlinexemplo.ui.base.BaseViewModel
import javax.inject.Inject

class MainViewModel @Inject constructor(repository: Repository)
    : BaseViewModel<MainNavigator>(repository){


}