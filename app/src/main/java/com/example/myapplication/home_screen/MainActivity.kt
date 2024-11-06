package com.example.myapplication.home_screen

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.location.LocationManager
import android.net.ConnectivityManager
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.databinding.ActivityMainBinding
import com.example.myapplication.utility.App_preference

class MainActivity : AppCompatActivity() {


    lateinit var binding: ActivityMainBinding


//    val title: TextView by lazy { findViewById(R.id.titel_text) }
    class networkSwitchStateReceiver : BroadcastReceiver(){
    override fun onReceive(context: Context?, intent: Intent?) {
        val manager = context?.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        val info = manager.getNetworkInfo(manager.activeNetwork)
        if(info != null && info.isConnected){
             var hashMap = hashMapOf<String, Any>()
                 hashMap.put("isOnline",1)
            var mapStatus =

        }

      /*  ConnectivityManager manager = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo ni = manager.getActiveNetworkInfo();
        if (ni != null && ni.isConnected()) {
            HashMap<String, Object> hashMap = new HashMap<>();
            hashMap.put("isOnline", 1);
            int mapStatus = checkUserMapStatus();
            hashMap.put("gpsStatus", mapStatus);
            RealTimeDBController.setStatus(hashMap);
            hashMap.clear();
            RealTimeDBController.setOnDisconnectFirebase();
            Log.d("MainActivity", " setOnDisconnectFirebase");
            if (!isSyncDone && isNetworkDisconnected) {
                isNetworkDisconnected = false;
                retryCall();
            }
        } else {
            isNetworkDisconnected = true;
        }
    }*/
    }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
      binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar( binding.toolbar)
      val actionbar = supportActionBar
        if (actionbar != null) {
            actionbar.setDisplayShowHomeEnabled(true)
        }
        binding.titelText.text = "JOb"
         var s=binding.titelText.text.toString()



    }
    fun checkUserMapStatus(): Int{
          var status = 1
        val locationManager = getSystemService(Context.LOCATION_SERVICE) as LocationManager
        if(App_preference.getSharedprefInstance()?.getLoginRes())
    }
    /*private int checkUserMapStatus() {
        int status = 1;
        try {
            LocationManager locationManager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
            if (!App_preference.getSharedprefInstance().getLoginRes().getIsFWgpsEnable().equals("1")) {
                status = 6;
                return status;
            } else if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED
                    && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION)
                    != PackageManager.PERMISSION_GRANTED) {
                status = 5;
                return status;
            } else if (!locationManager.isProviderEnabled(LocationManager.GPS_PROVIDER)) {
                status = 4;
                return status;
            } else if (calculateRemaingTime(serverFormat.format(Calendar.getInstance().getTime())) == 0) {
                status = 7;
                return status;
            } else return status;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return status;
    }*/
}