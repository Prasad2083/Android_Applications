package com.example.mad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView priceview;
    String car = "25000";
    String Bike = "10000";
    String Plane = "950000";
    String Boat = "145500";
    EditText Quantity;
    TextView tax;
    TextView total;
    Button totalcal;
    Button samplemsg;
    Integer cartax,Biketax,Planetax,Boattax;
    Integer cartotal,Biketotal,Planetotal,Boattotal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        priceview = findViewById(R.id.pricefield);
        Quantity = findViewById(R.id.vehiclequant);
        tax = findViewById(R.id.taxesview);
        total=findViewById(R.id.totalview);
        totalcal=findViewById(R.id.calbutton);
        samplemsg=findViewById(R.id.intentbtn);

        totalcal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String quantstr = Quantity.getText().toString();
                if (priceview.getText().toString().equals(car)) {
                    cartax = (((Integer.parseInt(car) * Integer.parseInt(quantstr)) / 100) * 15);
                    cartotal = (Integer.parseInt(car) * Integer.parseInt(quantstr)) + cartax;
                    tax.setText(cartax.toString());
                    total.setText(cartotal.toString());

                } else if (priceview.getText().toString().equals(Bike)) {
                    Biketax = (((Integer.parseInt(Bike) * Integer.parseInt(quantstr)) / 100) * 15);
                    Biketotal = (Integer.parseInt(Bike) * Integer.parseInt(quantstr)) + Biketax;
                    tax.setText(Biketax.toString());
                    total.setText(Biketotal.toString());

                } else if (priceview.getText().toString().equals(Plane)) {
                    Planetax = (((Integer.parseInt(Plane) * Integer.parseInt(quantstr)) / 100) * 15);
                    Planetotal = (Integer.parseInt(Plane) * Integer.parseInt(quantstr)) + Planetax;
                    tax.setText(Planetax.toString());
                    total.setText(Planetotal.toString());
                }

                else if (priceview.getText().toString().equals(Boat)) {
                    Boattax = (((Integer.parseInt(Boat) * Integer.parseInt(quantstr)) / 100) * 15);
                    Boattotal = (Integer.parseInt(Boat) * Integer.parseInt(quantstr)) + Boattax;
                    tax.setText(Boattax.toString());
                    total.setText(Boattotal.toString());
                }
            }

        });
        samplemsg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in=new Intent(MainActivity.this,SecondActivity.class);
                startActivity(in);
            }
        });
    }

    public void selectVehicle(View view) {

        switch (view.getId()) {
            case R.id.radioButton:
                priceview.setText(car);
                break;
            case R.id.radioButton2:
                priceview.setText(Bike);
                break;
            case R.id.radioButton3:
                priceview.setText(Plane);
                break;
            case R.id.radioButton4:
                priceview.setText(Boat);
                break;
        }

    }


    }




