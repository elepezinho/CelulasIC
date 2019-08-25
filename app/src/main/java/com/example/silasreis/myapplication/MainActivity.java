package com.example.silasreis.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class MainActivity extends AppCompatActivity {

    private GoogleMap mMap, mCel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync((OnMapReadyCallback) this);

        LatLng celula04 = new LatLng(-23.174601, -45.839513);
        mCel.addMarker(new MarkerOptions().position(celula04).title("Célula da Maria"));
        mCel.moveCamera(CameraUpdateFactory.newLatLng(celula04));
        mCel.setOnMarkerClickListener(new GoogleMap.OnMarkerClickListener(){
            @Override
            public boolean onMarkerClick(Marker marker2) {
                Intent intent = new Intent(MainActivity.this, Celula02.class);
                startActivity(intent);
                return false;
            }
        });

        LatLng celula01 = new LatLng(-23.173300, -45.821273);
        mMap.addMarker(new MarkerOptions().position(celula01).title("Célula do Rafael"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(celula01));
        mMap.setOnMarkerClickListener(new GoogleMap.OnMarkerClickListener(){
            @Override
            public boolean onMarkerClick(Marker marker) {
                Intent intent = new Intent(MainActivity.this, Celula01.class);
                startActivity(intent);
                return false;
            }
        });

    }
}
