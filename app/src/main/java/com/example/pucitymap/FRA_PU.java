package com.example.pucitymap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class FRA_PU extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fra__pu);
        Button direction_bt = (Button) findViewById(R.id.direction_aa);
        direction_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPUFRA();
            }
        });

        ImageButton backboat1 = (ImageButton) findViewById(R.id.backtoo);
        backboat1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBoatLINE();
            }
        });
    }

    private void openBoatLINE() {

        Intent intentBoatLi = new Intent(this, BoatLines.class);
        startActivity(intentBoatLi);
    }

    private void openPUFRA() {
        Intent intentPUFRA = new Intent(this, PU_FRA.class);
        startActivity(intentPUFRA);
    }
}
