package com.example.pucitymap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class PU_FRA extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pu__fr);
        Button direction_b1 = (Button) findViewById(R.id.direction_b);
        direction_b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFRAPU();
            }
        });

        ImageButton backboat = (ImageButton) findViewById(R.id.backfra);
        backboat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBoatLI();
            }
        });
    }

    private void openBoatLI() {
        Intent intentBoat = new Intent(this, BoatLines.class);
        startActivity(intentBoat);
    }

    private void openFRAPU() {
        Intent intentFRAPU = new Intent(this, FRA_PU.class);
        startActivity(intentFRAPU);
    }
}
