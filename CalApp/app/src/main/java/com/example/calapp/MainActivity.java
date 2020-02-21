package com.example.calapp;

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
    private Button nine;
    private Button eight;
    private Button seven;
    private Button six;
    private Button five;
    private Button four;
    private Button three;
    private Button two;
    private Button one;
    private Button zero;
    private Button add;
    private Button sub;
    private Button div;
    private Button mul;
    private Button clear;
    private Button equal;
    private TextView t1;
    private TextView t2;
    private double num1=Double.NaN;
    private int num2;
    private final char equ='=';
    private char perform;
    private final char addition='+';
    private final char division='/';
    private final char multiply='*';
    private final char subtracton='-';
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        appview();
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1.setText(t1.getText().toString()+"9");
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1.setText(t1.getText().toString()+"8");
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1.setText(t1.getText().toString()+"7");
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1.setText(t1.getText().toString()+"6");
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1.setText(t1.getText().toString()+"5");
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1.setText(t1.getText().toString()+"4");
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1.setText(t1.getText().toString()+"3");
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1.setText(t1.getText().toString()+"2");
            }
        });
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1.setText(t1.getText().toString()+"1");
            }
        });
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1.setText(t1.getText().toString()+"0");
            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operation();
                perform=addition;
                t2.setText(String.valueOf(num1)+ "+");
                t1.setText(null);
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operation();
                perform=subtracton;
                t2.setText(String.valueOf(num1)+ "-");
                t1.setText(null);
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operation();
                perform=multiply;
                t2.setText(String.valueOf(num1)+ "+");
                t1.setText(null);
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operation();
                perform=division;
                t2.setText(String.valueOf(num1)+"/");
                t1.setText(null);
            }
        });
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operation();
                perform=equ;
                t2.setText(t1.getText().toString()+String.valueOf(num2)+"="+String.valueOf(num1));
                t1.setText(null);
            }
        });


    }
    private void appview(){
        nine=findViewById(R.id.btn9);
        eight=findViewById(R.id.btn8);
        seven=findViewById(R.id.btn7);
        six=findViewById(R.id.btn6);
        five=findViewById(R.id.btn5);
        four=findViewById(R.id.btn4);
        three=findViewById(R.id.btn3);
        two=findViewById(R.id.btn2);
        one=findViewById(R.id.btn1);
        zero=findViewById(R.id.btn0);
        add=findViewById(R.id.btnadd);
        sub=findViewById(R.id.btnsub);
        div=findViewById(R.id.btndiv);
        mul=findViewById(R.id.btnmul);
        clear=findViewById(R.id.btnclr);
        equal=findViewById(R.id.btneql);
        t1=findViewById(R.id.Resultview);
        t2=findViewById(R.id.Infoview);
    }
    private void operation(){
        if (!Double.isNaN(num1)){
            num2=Integer.parseInt(t1.getText().toString());
            switch (perform){
                case addition:
                    num1=num1+num2;
                    break;
                case subtracton:
                    num1=num1-num2;
                    break;
                case division:
                    num1=num1/num2;
                    break;
                case multiply:
                    num1=num1*num2;
                    break;
                case equ:
                    break;
            }
        }
        else {
            num1=Double.parseDouble(t1.getText().toString());
        }
    }


    }

