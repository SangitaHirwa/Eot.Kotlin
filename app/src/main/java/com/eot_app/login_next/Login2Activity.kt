package com.eot_app.login_next

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.databinding.ActivityLogin2Binding

open class Login2Activity : AppCompatActivity() {
    private lateinit var binding: ActivityLogin2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLogin2Binding.inflate(layoutInflater)
        val root = binding.root
        setContentView(root)

    }
}