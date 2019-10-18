package com.example.lovecalculator;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;

import java.util.Random;
import java.util.Scanner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText Romeo=findViewById(R.id.editText);
        final EditText julliet=findViewById(R.id.editText2);
        Button Calculatelove=findViewById(R.id.button);
        Calculatelove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Romeo.getText().toString();
            julliet.getText().toString();
                Random lovesc=new Random();
                Integer lovescore=lovesc.nextInt(100);
                if (lovescore>80){
                    System.out.println("Your Love is Eternal");
                }
                else if (lovescore>40){
                    System.out.println("Your Love is just time pass");
                }
                else{
                    System.out.println("No Love between you both");
                }
                Intent lovescreen=new Intent(MainActivity.this,LoveScore.class);

                lovescreen.putExtra("Score",lovescore.toString());
                startActivity(lovescreen);
            }
        });
    }
}
