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
        Intent BUS = new Intent(this,BusBooking.class);
        startActivity(BUS);
    }
    public void carfun(View view) {
        Intent CAR = new Intent(this,CarBooking.class);
        startActivity(CAR);
    }
    public void pkgfun(View view) {
        Intent PKG = new Intent(this,PackageBooking.class);
        startActivity(PKG);
    }
    public void trainfun(View view) {
        Intent TRAIN = new Intent(this,TrainBooking.class);
        startActivity(TRAIN);
    }
}
