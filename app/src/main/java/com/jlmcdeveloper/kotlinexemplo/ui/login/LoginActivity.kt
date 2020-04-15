package com.jlmcdeveloper.kotlinexemplo.ui.login

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.jlmcdeveloper.kotlinexemplo.R
import kotlinx.android.synthetic.main.activity_login.*
import org.koin.android.ext.android.inject

class LoginActivity : AppCompatActivity(){
    private val loginViewModel: LoginViewModel by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_user)

    }



}
