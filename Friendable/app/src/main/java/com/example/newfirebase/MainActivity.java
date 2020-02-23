package com.example.newfirebase;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {
    EditText Email,Password,Name;
    TextView signinview;
    Button register;
    FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Email=findViewById(R.id.emailtext);
        Password=findViewById(R.id.passtext);
        Name=findViewById(R.id.nametext);
        signinview=findViewById(R.id.loginbtn);
        register=findViewById(R.id.button11);
        //firebaseAuth=FirebaseAuth.getInstance();
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                firebaseAuth=FirebaseAuth.getInstance();
                final String mail=Email.getText().toString();
                String pwd=Password.getText().toString();
                String nm=Name.getText().toString();
                if (TextUtils.isEmpty(mail)){
                 Email.setError("Enter Email");
                 return;
                }
                if (TextUtils.isEmpty(pwd)){
                    Password.setError("Enter Password");
                    return;
                }
                if (pwd.length()>=8){
                    Password.setError("Enter Password <=8");
                    return;
                }
                if (TextUtils.isEmpty(nm)){
                    Name.setError("Enter Name");
                    return;
                }
                firebaseAuth.createUserWithEmailAndPassword(mail,pwd).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()){
                            Toast.makeText(MainActivity.this,"User Created",Toast.LENGTH_LONG).show();
                            Intent intent=new Intent(MainActivity.this,HomePage.class);
                            intent.putExtra("name",mail);
                            startActivity(intent);
                        }
                        else {
                            Toast.makeText(MainActivity.this,"Registration failed",Toast.LENGTH_LONG).show();
                        }
                    }

                });
            }
        });
        signinview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),LoginPage.class));
            }
        });
    }
}
