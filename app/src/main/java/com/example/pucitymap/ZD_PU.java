package com.example.pucitymap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ZD_PU extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zd__pu);
        Button direction_a = (Button) findViewById(R.id.direction_a_btn);
        direction_a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPUZD();
            }
        });
    }

    private void openPUZD() {
        Intent intentPUZD = new Intent(this, PU_ZD.class);
        startActivity(intentPUZD);
    }
}
