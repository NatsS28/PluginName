package com.example.sample.plugin;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;


import android.location.Criteria;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;

public class NewActivity extends Activity {

    public double latitude;
    public double longitude;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String package_name = getApplication().getPackageName();
        setContentView(getApplication().getResources().getIdentifier("activity_new", "layout", package_name));


            Location location = lm.getLastKnownLocation(LocationManager.GPS_PROVIDER);
          if(location != null) {
            latitude = location.getLatitude();
            longitude = location.getLongitude();
            
          }
          System.out.println("latitude "+ latitude);
          System.out.println("longi "+ longitude);
          

          
    }
}