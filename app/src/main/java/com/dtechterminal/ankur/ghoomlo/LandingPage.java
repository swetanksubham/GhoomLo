package com.dtechterminal.ankur.ghoomlo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class LandingPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.landing_page);
    }
    public void busfun(View view) {
        startActivity(new Intent(this,BusBooking.class));
    }
    public void carfun(View view) {
        startActivity(new Intent(this,CarBooking.class));
    }
    public void pkgfun(View view) {startActivity(new Intent(this,PackageBooking.class));}
    public void trainfun(View view) {
        startActivity(new Intent(this,TrainBooking.class));
    }
}
