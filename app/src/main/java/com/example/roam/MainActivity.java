package com.example.roam;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {
    EditText etEmail, etPassword;
    Button btnSignup;
    TextView tvSignin;
    FirebaseAuth mFirebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mFirebaseAuth = FirebaseAuth.getInstance();
        etEmail = findViewById(R.id.etEmail);
        etPassword = findViewById(R.id.etPassword);
        btnSignup = findViewById(R.id.btnSignup);
        tvSignin = findViewById(R.id.tvSignin);
        btnSignup.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String email = etEmail.getText().toString();
                String pwd = etPassword.getText().toString();
                if(email.isEmpty()){
                    etEmail.setError("Please enter e-mail.");
                    etEmail.requestFocus();
                }
                else if(pwd.isEmpty()){
                    etPassword.setError("Please enter your password.");
                    etPassword.requestFocus();
                }
                else if(email.isEmpty() && pwd.isEmpty()){
                    Toast.makeText(MainActivity.this,"Fields are empty!",Toast.LENGTH_SHORT).show();
                }
                else if(!(email.isEmpty() && pwd.isEmpty())){
                    mFirebaseAuth.createUserWithEmailAndPassword(email,pwd).addOnCompleteListener(MainActivity.this, new OnCompleteListener<AuthResult>(){
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task){
                        if(!task.isSuccessful()){
                            Toast.makeText(MainActivity.this,"Signup unsuccessful, please try again.",Toast.LENGTH_SHORT).show();
                        }
                        else{
                            startActivity(new Intent(MainActivity.this,Homescreen.class));
                        }
                    }
                });

            }
            else{
                Toast.makeText(MainActivity.this,"Error Occurred",Toast.LENGTH_SHORT).show();
            }
        });
        tvSignin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i = new Intent(MainActivity.this,LoginActivity.class);
                startActivity(i);
            }
        });
    }
}




