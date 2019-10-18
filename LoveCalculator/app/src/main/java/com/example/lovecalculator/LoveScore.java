package com.example.lovecalculator;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.TextView;

public class LoveScore extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_love_score);

        TextView Score=findViewById(R.id.textView);
        TextView commnt=findViewById(R.id.textView2);
        Intent love=getIntent();
        String result=love.getStringExtra("Score");
        Score.setText(result);
        if (Integer.parseInt(result)>=80){

            commnt.setText("Your Love is Eternal");
        }
        else if (Integer.parseInt(result)<=60){
            commnt.setText("Your Love is may be or may not be true");

        }
        else if (Integer.parseInt(result)<=40){
            commnt.setText("Your Love is Not True");

        }
    }

}
