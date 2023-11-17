package com.example.musixmixhub;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class DashboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        CardView exit = findViewById(R.id.cardLOGOUT);
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DashboardActivity.this, MainActivity.class));
            }
        });

        CardView gospels = findViewById(R.id.cardFDGOSPELS);
        gospels.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DashboardActivity.this, GospelsActivity.class));
            }
        });

        CardView bongo = findViewById(R.id.cardFDBONGO);
        bongo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DashboardActivity.this, BongoActivity.class));
            }
        });

        CardView Rhumba = findViewById(R.id.cardFDRUMBA);
        Rhumba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DashboardActivity.this, RhumbaActivity.class));
            }
        });

        CardView regae = findViewById(R.id.cardFDREGAE);
        regae.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DashboardActivity.this, RegaeActivity.class));
            }
        });

        CardView Dancehall = findViewById(R.id.cardFDDANCEHALL);
        Dancehall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DashboardActivity.this, DanceHallActivity.class));
            }
        });

        CardView Afrobeats = findViewById(R.id.cardFDAFROBEATS);
        Afrobeats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DashboardActivity.this, AfroBeats.class));
            }
        });

        CardView Jazz = findViewById(R.id.cardJAZZ);
        Jazz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DashboardActivity.this, JazzActivity.class));
            }
        });

        CardView Rock = findViewById(R.id.cardROCK);
        Rock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DashboardActivity.this, RockActivity.class));
            }
        });

        CardView pop = findViewById(R.id.cardFDPOP);
        pop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DashboardActivity.this, PopActivity.class));
            }
        });

        CardView rnb = findViewById(R.id.cardRNB);
        rnb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DashboardActivity.this, RnBActivity.class));
            }
        });

        CardView Hiphop = findViewById(R.id.cardHIPHOP);
        Hiphop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DashboardActivity.this, HiphopActivity.class));
            }
        });

    }
}