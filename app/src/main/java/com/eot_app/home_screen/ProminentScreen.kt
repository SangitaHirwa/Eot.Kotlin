package com.eot_app.home_screen

import android.Manifest
import android.app.Activity
import android.content.Intent
import android.content.pm.PackageManager
import android.os.Build
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import com.eot_app.login_next.Login2Activity
import com.eot_app.utility.App_preference
import com.example.myapplication.databinding.ActivityProminentScreenBinding

class ProminentScreen : AppCompatActivity() {
    private lateinit var binding: ActivityProminentScreenBinding
    var UPLOAD_FILE: Int = 1
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       binding = ActivityProminentScreenBinding.inflate(layoutInflater)
        val root = binding.root
        setContentView(root)
        binding.btnDeny.setOnClickListener(View.OnClickListener {
            App_preference.getSharedprefInstance().setLaunchFirst()
            val intent = Intent(
                this@ProminentScreen,
                Login2Activity::class.java
            )
            startActivity(intent)
            finish()
        })
        binding.btnAllow.setOnClickListener(View.OnClickListener {
            if (Build.VERSION.SDK_INT > Build.VERSION_CODES.LOLLIPOP && Build.VERSION.SDK_INT < Build.VERSION_CODES.TIRAMISU) {
                if (ContextCompat.checkSelfPermission(
                        this@ProminentScreen,
                        Manifest.permission.ACCESS_FINE_LOCATION
                    ) != PackageManager.PERMISSION_GRANTED
                ) {
                    ActivityCompat.requestPermissions(
                        (this@ProminentScreen as Activity),
                        arrayOf<String>(
                            Manifest.permission.ACCESS_FINE_LOCATION
                        ), UPLOAD_FILE
                    )
                } else {
                    ActivityCompat.requestPermissions(
                        (this@ProminentScreen as Activity), arrayOf(
                            Manifest.permission.ACCESS_FINE_LOCATION
                        ), 1
                    )
                }
            } else if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
                if (ContextCompat.checkSelfPermission(
                        this@ProminentScreen,
                        Manifest.permission.ACCESS_FINE_LOCATION
                    ) != PackageManager.PERMISSION_GRANTED
                ) {
                    ActivityCompat.requestPermissions(
                        (this@ProminentScreen as Activity),
                        arrayOf<String>(
                            Manifest.permission.ACCESS_FINE_LOCATION,
                        ), UPLOAD_FILE
                    )
                } else {
                    ActivityCompat.requestPermissions(
                        (this@ProminentScreen as Activity), arrayOf(
                            Manifest.permission.ACCESS_FINE_LOCATION
                        ), 1
                    )
                }
            }
        })

    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray,
        deviceId: Int
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults, deviceId)
        if(requestCode == UPLOAD_FILE){
            App_preference.getSharedprefInstance().setLaunchFirst()
            val intent = Intent(
                this@ProminentScreen,
                Login2Activity::class.java
            )
            startActivity(intent)
            finish()
        }
    }
}
