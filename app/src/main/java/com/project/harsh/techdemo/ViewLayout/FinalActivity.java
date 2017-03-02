package com.project.harsh.techdemo.ViewLayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.project.harsh.techdemo.R;

import java.util.ArrayList;

public class FinalActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.single_final);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowCustomEnabled(true);


        final int gridPosition = getIntent().getIntExtra("gridposition", -1);
        int listPosition = getIntent().getIntExtra("listPosition", -1);
        int position = getIntent().getIntExtra("position", -1);
        if (position != -1 && gridPosition == 0 && listPosition == 0) {
            switch (position) {
                case 0:

                    ImageView image = (ImageView) findViewById(R.id.finalimage);
                    TextView title = (TextView) findViewById(R.id.finaltitle);
                    TextView location = (TextView) findViewById(R.id.finallocation);
                    TextView time = (TextView) findViewById(R.id.finaltime);
                    TextView tv1 = (TextView) findViewById(R.id.texttitle1);
                    TextView tv2 = (TextView) findViewById(R.id.texttitle2);
                    TextView tv3 = (TextView) findViewById(R.id.texttitle3);
                    TextView tv4 = (TextView) findViewById(R.id.texttitle4);
                    TextView tv5 = (TextView) findViewById(R.id.texttitle5);
                    TextView tv6 = (TextView) findViewById(R.id.texttitle6);
                    TextView tv7 = (TextView) findViewById(R.id.texttitle7);
                    TextView tv8 = (TextView) findViewById(R.id.texttitle8);
                    TextView tv10 = (TextView) findViewById(R.id.texttitle10);
                    TextView tv11 = (TextView) findViewById(R.id.winnigbold);
                    TextView tv12 = (TextView) findViewById(R.id.winning);
                    TextView tv13 = (TextView) findViewById(R.id.codinatebold);
                    TextView tv14 = (TextView) findViewById(R.id.cordinate);


                    image.setImageResource(R.drawable.tresbridge);
                    title.setText(R.string.trtitle);
                    location.setText("@CIVIL DEPARTMENT");
                    time.setText(R.string.trtime);
                    tv1.setText(R.string.tv1);
                    tv2.setText(R.string.tv2);
                    tv3.setText(R.string.tv3);
                    tv4.setText(R.string.tv4);
                    tv5.setText(R.string.tv5);
                    tv6.setText(R.string.tv6);
                    tv7.setText(R.string.tv7);
                    tv8.setText(R.string.tv8);
                    tv10.setText(R.string.tv10);
                    tv11.setText(R.string.tv11);
                    tv12.setText(R.string.tv12);
                    tv13.setText(R.string.tv13);
                    tv14.setText(R.string.tv14);

                    break;
            }
        } else if (position != -1 && gridPosition == 0 && listPosition == 1) {
            switch (position) {
                case 0:
                    ImageView image = (ImageView) findViewById(R.id.finalimage);
                    TextView title = (TextView) findViewById(R.id.finaltitle);
                    TextView location = (TextView) findViewById(R.id.finallocation);
                    TextView time = (TextView) findViewById(R.id.finaltime);
                    TextView tv1 = (TextView) findViewById(R.id.texttitle1);
                    TextView tv2 = (TextView) findViewById(R.id.texttitle2);
                    TextView tv3 = (TextView) findViewById(R.id.texttitle3);
                    TextView tv4 = (TextView) findViewById(R.id.texttitle4);
                    TextView tv5 = (TextView) findViewById(R.id.texttitle5);
                    TextView tv6 = (TextView) findViewById(R.id.texttitle6);
                    TextView tv7 = (TextView) findViewById(R.id.texttitle7);
                    TextView tv8 = (TextView) findViewById(R.id.texttitle8);
                    TextView tv9 = (TextView) findViewById(R.id.winnigbold);
                    TextView tv10 = (TextView) findViewById(R.id.winning);
                    TextView tv11 = (TextView) findViewById(R.id.codinatebold);
                    TextView tv12 = (TextView) findViewById(R.id.cordinate);

                    image.setImageResource(R.drawable.posterpr);
                    time.setText("10.00");
                    title.setText("TRUSS BRIDGE MODELLING");
                    location.setText("CIVIL DEPARTMENT");
                    break;
                case 1:
                    ImageView image1 = (ImageView) findViewById(R.id.finalimage);
                    TextView title1 = (TextView) findViewById(R.id.finaltitle);
                    TextView location1 = (TextView) findViewById(R.id.finallocation);
                    TextView time1 = (TextView) findViewById(R.id.finaltime);
//                            TextView tv1 = (TextView) findViewById(R.id.texttitle1);
//                            TextView tv2 = (TextView) findViewById(R.id.texttitle2);
//                            TextView tv3 = (TextView) findViewById(R.id.texttitle3);
//                            TextView tv4 = (TextView) findViewById(R.id.texttitle4);
//                            TextView tv5 = (TextView) findViewById(R.id.texttitle5);
//                            TextView tv6 = (TextView) findViewById(R.id.texttitle6);
//                            TextView tv7 = (TextView) findViewById(R.id.texttitle7);
//                            TextView tv8 = (TextView) findViewById(R.id.texttitle8);
//                            TextView tv9 = (TextView) findViewById(R.id.winnigbold);
//                            TextView tv10 = (TextView) findViewById(R.id.winning);
//                            TextView tv11 = (TextView) findViewById(R.id.codinatebold);
//                            TextView tv12 = (TextView) findViewById(R.id.cordinate);

                    image1.setImageResource(R.drawable.tresbridge);
                    time1.setText("10.00");
                    title1.setText("TRUSS BRIDGE MODELLING");
                    location1.setText("CIVIL DEPARTMENT");
                    break;
            }
        }
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

