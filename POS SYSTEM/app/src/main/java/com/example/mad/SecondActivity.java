package com.example.mad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        final EditText edit1=findViewById(R.id.entertxt);
        Button btn1=findViewById(R.id.sendbtn);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in=new Intent(SecondActivity.this,ThirdActivity.class);
                in.putExtra("sent",edit1.getText().toString());
                startActivity(in);
            }
        });
    }
}
