package com.project.harsh.techdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button day1 = (Button)findViewById(R.id.btn1);
        Button day2 = (Button)findViewById(R.id.btn2);
        Button help = (Button)findViewById(R.id.help);

        day1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, DayOne.class);
                i.putExtra("position",1);
                startActivity(i);

            }
        });

        day2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, DayTwo.class);
                i.putExtra("position",2);
                startActivity(i);

            }
        });

        help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Help.class);
                i.putExtra("position",3);
                startActivity(i);

            }
        });
    }
}
