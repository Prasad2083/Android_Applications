package com.example.mycalculator;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final TextView t1 = findViewById(R.id.textView);
        btn1 = findViewById(R.id.button);
        btn2 = findViewById(R.id.button3);
        btn3 = findViewById(R.id.button5);
        btn4 = findViewById(R.id.button7);
        btn5 = findViewById(R.id.button9);
        btn6 = findViewById(R.id.button10);
        btn7 = findViewById(R.id.button6);
        btn1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                final String s1 = btn1.getText().toString();
                t1.setText(s1);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                final String s2 = btn2.getText().toString();
                if (s2.equals(1)) {
                    t1.setText(s2);
                }
            }
        });
    }
}



