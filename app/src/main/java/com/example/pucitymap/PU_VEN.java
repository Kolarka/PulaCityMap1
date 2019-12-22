package com.example.pucitymap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class PU_VEN extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pu__ven);
        Button direction_b1 = (Button) findViewById(R.id.direction_be);
        direction_b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openVENPU();
            }
        });

        ImageButton backToboat = (ImageButton) findViewById(R.id.backven);
        backToboat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBoatLines();
            }
        });
    }

    private void openBoatLines() {
        Intent intentBoats = new Intent(this, BoatLines.class);
        startActivity(intentBoats);
    }

    private void openVENPU() {
        Intent intentVENPU = new Intent(this, VEN_PU.class);
        startActivity(intentVENPU);
    }
}
