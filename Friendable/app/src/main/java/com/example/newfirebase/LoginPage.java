package com.example.newfirebase;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
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

public class LoginPage extends AppCompatActivity {
    EditText email,password;
    Button login;
    TextView textView;
    FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);
        email=findViewById(R.id.emailtext);
        password=findViewById(R.id.passtext);
        textView=findViewById(R.id.signupbtn);
        login=findViewById(R.id.button11);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                firebaseAuth=FirebaseAuth.getInstance();
                final String mail=email.getText().toString();
                String pwd=password.getText().toString();
                if (TextUtils.isEmpty(mail)){
                    email.setError("Enter Email");
                }
                if (TextUtils.isEmpty(pwd)) {

                    password.setError("Enter Password");
                }
                if (pwd.length()>=10){
                    password.setError("Enter password < 10");
                }
                firebaseAuth.signInWithEmailAndPassword(mail,pwd).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()){
                            Toast.makeText(LoginPage.this,"Logged in",Toast.LENGTH_LONG).show();
                            Intent intent=new Intent(LoginPage.this,HomePage.class);
                            intent.putExtra("Email",mail);
                            startActivity(intent);
                        }
                        else {
                            Toast.makeText(LoginPage.this,"Failed Login",Toast.LENGTH_LONG).show();
                        }
                    }
                });
            }
        });
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),MainActivity.class));
            }
        });
    }
}
