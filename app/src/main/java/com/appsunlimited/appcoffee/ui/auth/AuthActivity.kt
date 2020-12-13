package com.appsunlimited.appcoffee.ui.auth

import android.content.Intent
import android.os.Binder
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.appsunlimited.appcoffee.R
import com.appsunlimited.appcoffee.data.model.AuthUser
import com.appsunlimited.appcoffee.databinding.ActivityAuthBinding
import com.appsunlimited.appcoffee.ui.home.MainActivity

class AuthActivity : AppCompatActivity() {
    lateinit var binding: ActivityAuthBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_auth)
    }

    infix fun onSuccess(user: AuthUser?) {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish()

    }
}