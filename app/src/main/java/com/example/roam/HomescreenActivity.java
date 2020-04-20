package com.example.roam;

//import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class HomescreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homescreen);

        ImageView lisbonButton = (ImageView) findViewById(R.id.imgbtn_lisbon);
        lisbonButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(HomescreenActivity.this, "clicked", Toast.LENGTH_LONG).show();
                Intent lisbon = new Intent(HomescreenActivity.this, LisbonActivity.class);
                startActivity(lisbon);
            }//lisbon activity
        });

        ImageView lauterbrunnenButton = (ImageView) findViewById(R.id.imgbtn_lauterbrunnen);
        lauterbrunnenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(HomescreenActivity.this, "clicked", Toast.LENGTH_LONG).show();
                Intent lauterbrunnen = new Intent(HomescreenActivity.this, LauterbrunnenActivity.class);
                startActivity(lauterbrunnen);
            }
        });

        ImageView krakowButton = (ImageView) findViewById(R.id.imgbtn_krakow);
        krakowButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(HomescreenActivity.this, "clicked", Toast.LENGTH_LONG).show();
                Intent krakow = new Intent(HomescreenActivity.this, KrakowActivity.class);
                startActivity(krakow);
            }
        });

        ImageView tallinnButton = (ImageView) findViewById(R.id.imgbtn_tallinn);
        tallinnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(HomescreenActivity.this, "clicked", Toast.LENGTH_LONG).show();
                Intent tallinn = new Intent(HomescreenActivity.this, TallinnActivity.class);
                startActivity(tallinn);
            }
        });

        ImageView budapestButton = (ImageView) findViewById(R.id.imgbtn_budapest);
        budapestButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(HomescreenActivity.this, "clicked", Toast.LENGTH_LONG).show();

                Intent budapest = new Intent(HomescreenActivity.this, BudapestActivity.class);
                startActivity(budapest);
            }
        });

       ImageView edinburghButton = (ImageView) findViewById(R.id.imgbtn_edinburgh);
        edinburghButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(HomescreenActivity.this, "clicked", Toast.LENGTH_LONG).show();

                Intent edinburgh = new Intent(HomescreenActivity.this, EdinburghActivity.class);
                startActivity(edinburgh);
            }
        });

    }
}
