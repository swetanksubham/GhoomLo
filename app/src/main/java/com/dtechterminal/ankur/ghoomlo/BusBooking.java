package com.dtechterminal.ankur.ghoomlo;

import android.app.DatePickerDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Calendar;

public class BusBooking extends AppCompatActivity {
    EditText source,destination,date;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bus_booking);
        source = findViewById(R.id.source);
        destination = findViewById(R.id.destination);
        date = findViewById(R.id.date);
    }
    boolean checkfn(){
        if(source.getText().toString().equals("") || destination.getText().toString().equals("") || date.getText().toString().equals(""))
            return true;
        else
            return false;
    }
    public void addDatepicker(View view)
    {
        final EditText date;
        final DatePickerDialog[] datePickerDialog = new DatePickerDialog[1];
        date=(EditText) findViewById(R.id.date);
        final Calendar c = Calendar.getInstance();
        int mYear = c.get(Calendar.YEAR); // current year
        int mMonth = c.get(Calendar.MONTH); // current month
        int mDay = c.get(Calendar.DAY_OF_MONTH); // current day
        // date picker dialog
        datePickerDialog[0] = new DatePickerDialog(BusBooking.this,
                new DatePickerDialog.OnDateSetListener() {

                    @Override
                    public void onDateSet(DatePicker view, int year,
                                          int monthOfYear, int dayOfMonth) {
                        date.setText(dayOfMonth + "/"
                                + (monthOfYear + 1) + "/" + year);

                    }
                }, mYear, mMonth, mDay);
        datePickerDialog[0].show();
    }
    public void swtchsds(View view){
        if(checkfn())
            Toast.makeText(this, "Please fill the required fields!!", Toast.LENGTH_SHORT).show();
        else{
            String temp;
            temp = source.getText().toString();
            source.setText(destination.getText().toString());
            destination.setText(temp);
        }
    }
    public void fnlbook(View view){
        if(checkfn())
            Toast.makeText(this, "Please fill the required fields!!", Toast.LENGTH_SHORT).show();
        else {
            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
            alertDialogBuilder.setMessage("Your Booking is confirmed for the Date:" + date.getText().toString() + " From:" + source.getText().toString() + " To: " + destination.getText().toString() + "! And the seat number is: B3. We hope you'll have an amazing trip! :)");
            alertDialogBuilder.setPositiveButton("Okay!",
                    new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface arg0, int arg1) {
                            Toast.makeText(BusBooking.this, "Thanks for choosing us!", Toast.LENGTH_LONG).show();
                            finish();
                        }
                    });
            alertDialogBuilder.setNegativeButton("Exit", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int x) {
                    finish();
                }
            });
            AlertDialog alertDialog = alertDialogBuilder.create();
            alertDialog.show();
        }
    }
}
