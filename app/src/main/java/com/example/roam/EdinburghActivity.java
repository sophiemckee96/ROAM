package com.example.roam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EdinburghActivity extends AppCompatActivity {

    Button btn_rateEdinburgh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edinburgh);

        btn_rateEdinburgh = findViewById(R.id.btn_rateEdinburgh);
        btn_rateEdinburgh.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intentLoadNewActivity = new Intent(EdinburghActivity.this, RateEdinburghActivity.class);
                startActivity(intentLoadNewActivity);
            }
        });
    }
}
