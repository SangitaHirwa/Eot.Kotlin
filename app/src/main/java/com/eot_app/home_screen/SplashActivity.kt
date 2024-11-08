package com.eot_app.home_screen

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.eot_app.utility.App_preference
import com.example.myapplication.databinding.ActivitySplashBinding

open class SplashActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySplashBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashBinding.inflate(layoutInflater)
        val root = binding.root
         setContentView(root)
        if (App_preference.getSharedprefInstance().isLaunchFirst()) {
            val intent = Intent(
                this@SplashActivity,
                ProminentScreen::class.java
            )
            startActivity(intent)
            finish()
        }
        /* *Launch root/top activity**/
        if (!isTaskRoot) {
            val intent = intent
            val intentAction = intent.action
            if (intent.hasCategory(Intent.CATEGORY_LAUNCHER) && intentAction != null && intentAction == Intent.ACTION_MAIN) {
                finish()
                return
            }
        }
    }
}