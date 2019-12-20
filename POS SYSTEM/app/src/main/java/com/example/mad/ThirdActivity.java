package com.example.mad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        TextView t1=findViewById(R.id.textView2);
        TextView show=findViewById(R.id.textView3);
        Intent in=getIntent();
        String recieve=in.getStringExtra("sent");
        show.setText(recieve);

    }
}
