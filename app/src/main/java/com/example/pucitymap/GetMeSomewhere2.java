package com.example.pucitymap;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class GetMeSomewhere2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_me_somewhere2);
        ImageButton get_me_somewhere = (ImageButton) findViewById(R.id.Im303);
        get_me_somewhere.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMAP_direction();
            }
        });
    }

    private void openMAP_direction() {
        Intent intentGMS2 = new Intent(this, Map_Direction.class);
        startActivity(intentGMS2);
    }
}
