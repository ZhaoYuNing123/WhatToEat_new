package com.example.whattoeat;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imageViewEatWhat;
    Button eatOutside;
    Button eatInSchool;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        eatOutside = (Button)findViewById(R.id.eatOut);
        eatInSchool = (Button)findViewById(R.id.inSchool) ;
        eatOutside.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, eatOutside.class);
                startActivity(intent);
            }
        });
        eatInSchool.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, eatInSchool.class);
                startActivity(intent);
            }
        });

    }
}
