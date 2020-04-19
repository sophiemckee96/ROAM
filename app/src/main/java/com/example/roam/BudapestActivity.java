package com.example.roam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BudapestActivity extends AppCompatActivity {

    Button btn_rateBudapest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_budapest);

        btn_rateBudapest = findViewById(R.id.btn_rateBudapest);
        btn_rateBudapest.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intentLoadNewActivity = new Intent(BudapestActivity.this, RateBudapestActivity.class);
                startActivity(intentLoadNewActivity);
            }
        });
    }
}
