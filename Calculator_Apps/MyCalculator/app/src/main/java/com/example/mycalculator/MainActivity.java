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
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView t1=findViewById(R.id.textView);
        TextView t2=findViewById(R.id.textView2);
        final TextView result=findViewById(R.id.textView3);
        final EditText e1=findViewById(R.id.editText);
        final EditText e2=findViewById(R.id.editText3);
        Button add=findViewById(R.id.button);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer n1=Integer.parseInt(e1.getText().toString());
                Integer n2=Integer.parseInt(e2.getText().toString());
                Integer resul=n1+n2;
                result.setText(Integer.toString(resul));

            }
        });


    }
}