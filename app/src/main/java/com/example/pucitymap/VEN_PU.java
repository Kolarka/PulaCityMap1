package com.example.pucitymap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class VEN_PU extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ven__pu);
        Button direction_bii = (Button) findViewById(R.id.direction_AA);
        direction_bii.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPUVEN();
            }
        });

        ImageButton backToboat = (ImageButton) findViewById(R.id.backtoo_Bo);
        backToboat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBoatLines1();
            }
        });
    }

    private void openBoatLines1() {
        Intent intentBoats1 = new Intent(this, BoatLines.class);
        startActivity(intentBoats1);
    }

    private void openPUVEN() {
        Intent intentPUVEN = new Intent(this, PU_VEN.class);
        startActivity(intentPUVEN);
    }
}
