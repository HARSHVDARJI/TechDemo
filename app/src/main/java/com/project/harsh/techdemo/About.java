package com.project.harsh.techdemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by harsh on 2/3/17.
 */
public class About extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowCustomEnabled(true);

        ImageView im = (ImageView)findViewById(R.id.mypic);
        TextView tv1 = (TextView)findViewById(R.id.myname);
        TextView tv2 = (TextView)findViewById(R.id.myemail);

        im.setImageResource(R.drawable.mypic);
        tv1.setText("Harsh Darji (#HD)");
        tv2.setText("harshdarji1995@gmail.com");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home) {
            onBackPressed();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
