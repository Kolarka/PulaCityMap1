package com.example.pucitymap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class PU_ZD extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pu__zd);

        Button direction_b = (Button) findViewById(R.id.direction_b_btn);
        direction_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openZDPU();
            }
        });
        ImageButton backboatline = (ImageButton) findViewById(R.id.backto);
        backboatline.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBoatLIN();
            }
        });
    }

    private void openBoatLIN() {
        Intent intentBoLi = new Intent(this, BoatLines.class);
        startActivity(intentBoLi);
    }

    private void openZDPU() {
        Intent intentZDPU = new Intent(this, ZD_PU.class);
        startActivity(intentZDPU);
    }
}
