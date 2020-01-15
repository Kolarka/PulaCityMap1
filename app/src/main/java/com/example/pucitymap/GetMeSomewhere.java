package com.example.pucitymap;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;


public class GetMeSomewhere extends AppCompatActivity  {

    private static final String TAG1 = "GetMeSomewhere";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_me_somewhere);

        ImageButton getmesomewhere = (ImageButton) findViewById(R.id.Im33);
        getmesomewhere.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGMS2();
            }
        });

    }

    private void openGMS2() {
        Intent intentGMS = new Intent(this, GetMeSomewhere2.class);
        startActivity(intentGMS);
    }


}
