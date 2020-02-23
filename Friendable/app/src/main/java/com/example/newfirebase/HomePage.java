package com.example.newfirebase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

import java.util.ArrayList;
import java.util.List;

public class HomePage extends AppCompatActivity {
    Button signout;
    TextView textView;
    Spinner spinner;
    String string;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        signout=findViewById(R.id.button2);
        textView=findViewById(R.id.textView2);
        Intent intent=getIntent();
        String str=intent.getStringExtra("name");
        textView.setText(str);
         spinner= findViewById(R.id.genderlist);
        List<String>gender=new ArrayList<>();
        gender.add(0,"Select Gender");
        gender.add("Male");
        gender.add("Female");
        gender.add("Not Specified");
        ArrayAdapter<String> myadapter;
        myadapter= new ArrayAdapter(this,android.R.layout.simple_spinner_item,gender);
        myadapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(myadapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if (adapterView.getItemAtPosition(i).equals("Select Gender")){

                }
                else{
                        string=adapterView.getItemAtPosition(i).toString();
                    Toast.makeText(adapterView.getContext(),"Gender Selected"+string,Toast.LENGTH_LONG).show();
                }
            }


            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        signout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirebaseAuth.getInstance().signOut();
                startActivity(new Intent(getApplicationContext(),MainActivity.class));

            }
        });

    }
}
