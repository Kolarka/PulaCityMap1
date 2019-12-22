package com.example.pucitymap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class PU_BRIJ extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pu__brij);
        ImageButton pubrij_back = (ImageButton) findViewById(R.id.back_boat);
        pubrij_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open_Boatlines();
            }
        });
    }

    private void open_Boatlines() {
        Intent intentBoatli = new Intent(this, BoatLines.class);
        startActivity(intentBoatli);
    }
}
