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
                    TextView tv11 = (TextView) findViewById(R.id.winnigbold);
                    TextView tv12 = (TextView) findViewById(R.id.winning);
                    TextView tv13 = (TextView) findViewById(R.id.codinatebold);
                    TextView tv14 = (TextView) findViewById(R.id.cordinate);

                    image.setImageResource(R.drawable.posterpr);
                    time.setText(R.string.pptime);
                    title.setText(R.string.pptitile);
                    location.setText("@All DEPARTMENT");
                    tv1.setText(R.string.pptv1);
                    tv2.setText(R.string.pptv2);
                    tv3.setText(R.string.pptv3);
                    tv4.setText(R.string.pptv4);
                    tv11.setText(R.string.pptv5);
                    tv12.setText(R.string.pptv6);
                    tv13.setText(R.string.pptv7);
                    tv14.setText(R.string.pptv8);

                    break;
                case 1:
                    ImageView image1 = (ImageView) findViewById(R.id.finalimage);
                    TextView title1 = (TextView) findViewById(R.id.finaltitle);
                    TextView location1 = (TextView) findViewById(R.id.finallocation);
                    TextView time1 = (TextView) findViewById(R.id.finaltime);
                    TextView tv111 = (TextView) findViewById(R.id.texttitle1);
                    TextView tv22 = (TextView) findViewById(R.id.texttitle2);
                    TextView tv33 = (TextView) findViewById(R.id.texttitle3);
                    TextView tv44 = (TextView) findViewById(R.id.texttitle4);
                    TextView tv115 = (TextView) findViewById(R.id.codinatebold);
                    TextView tv126 = (TextView) findViewById(R.id.cordinate);
                    TextView tv55 = (TextView) findViewById(R.id.winnigbold);
                    TextView tv66 = (TextView) findViewById(R.id.winning);

                    image1.setImageResource(R.drawable.techranga);
                    time1.setText(R.string.trtime1);
                    title1.setText(R.string.trtitile);
                    location1.setText("@COLLEGE");
                    tv111.setText(R.string.trtv1);
                    tv22.setText(R.string.trtv2);
                    tv33.setText(R.string.trtv3);
                    tv44.setText(R.string.trtv4);
                    tv115.setText(R.string.trtv5);
                    tv126.setText(R.string.trtv6);
                    tv55.setText(R.string.trwinpr);
                    tv66.setText(R.string.treinpr1);
                    break;
            }
        } else if (position != -1 && gridPosition == 0 && listPosition == 2) {
            switch (position) {
                case 0:
                    ImageView image = (ImageView) findViewById(R.id.finalimage);
                    TextView title = (TextView) findViewById(R.id.finaltitle);
                    TextView location = (TextView) findViewById(R.id.finallocation);
                    TextView time = (TextView) findViewById(R.id.finaltime);

                    image.setImageResource(R.drawable.robotics);
                    time.setText(R.string.aristime);
                    title.setText(R.string.aristitle);
                    location.setText("@CoE");

                case 1:
                    ImageView image1 = (ImageView) findViewById(R.id.finalimage);
                    TextView title1 = (TextView) findViewById(R.id.finaltitle);
                    TextView location1 = (TextView) findViewById(R.id.finallocation);
                    TextView time1 = (TextView) findViewById(R.id.finaltime);

                    image1.setImageResource(R.drawable.simocode);
                    time1.setText(R.string.aristime);
                    title1.setText(R.string.simtitle);
                    location1.setText("@CoE");
            }
        } else if (position != -1 && gridPosition == 1 && listPosition == 0) {
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
                    TextView tv11 = (TextView) findViewById(R.id.winnigbold);
                    TextView tv12 = (TextView) findViewById(R.id.winning);
                    TextView tv13 = (TextView) findViewById(R.id.codinatebold);
                    TextView tv14 = (TextView) findViewById(R.id.cordinate);

                    image.setImageResource(R.drawable.planomania);
                    title.setText(R.string.plantitle);
                    location.setText("@CIVIL DEPARTMENT");
                    time.setText(R.string.plantime);
                    tv1.setText(R.string.plan1);
                    tv2.setText(R.string.plan2);
                    tv3.setText(R.string.plan2);
                    tv4.setText(R.string.plan4);
                    tv5.setText(R.string.plan5);
                    tv6.setText(R.string.plan6);
                    tv11.setText(R.string.plan7);
                    tv12.setText(R.string.plan8);
                    tv13.setText(R.string.plan9);
                    tv14.setText(R.string.plan10);
            }
        } else if (position != -1 && gridPosition == 1 && listPosition == 1) {
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
                    TextView tv11 = (TextView) findViewById(R.id.winnigbold);
                    TextView tv12 = (TextView) findViewById(R.id.winning);
                    TextView tv13 = (TextView) findViewById(R.id.codinatebold);
                    TextView tv14 = (TextView) findViewById(R.id.cordinate);

                    image.setImageResource(R.drawable.codepediaimg);
                    title.setText(R.string.codetitle);
                    location.setText("@COMP. DEPARTMENT");
                    time.setText(R.string.codetime);
                    tv1.setText(R.string.code1);
                    tv2.setText(R.string.code2);
                    tv3.setText(R.string.code3);
                    tv4.setText(R.string.code4);
                    tv5.setText(R.string.code5);
                    tv6.setText(R.string.code6);
                    tv11.setText(R.string.code7);
                    tv12.setText(R.string.code8);
                    tv13.setText(R.string.code9);
                    tv14.setText(R.string.code10);

                case 1:
                    ImageView image1 = (ImageView) findViewById(R.id.finalimage);
                    TextView title1 = (TextView) findViewById(R.id.finaltitle);
                    TextView location1 = (TextView) findViewById(R.id.finallocation);
                    TextView time1 = (TextView) findViewById(R.id.finaltime);
                    TextView tv = (TextView) findViewById(R.id.texttitle1);
                    TextView tv21 = (TextView) findViewById(R.id.texttitle2);
                    TextView tv31 = (TextView) findViewById(R.id.texttitle3);
                    TextView tv41 = (TextView) findViewById(R.id.texttitle4);
                    TextView tv111 = (TextView) findViewById(R.id.winnigbold);
                    TextView tv121 = (TextView) findViewById(R.id.winning);
                    TextView tv131 = (TextView) findViewById(R.id.codinatebold);
                    TextView tv141 = (TextView) findViewById(R.id.cordinate);

                    image1.setImageResource(R.drawable.counterstrike);
                    title1.setText(R.string.stitle);
                    location1.setText("@COMP. DEPARTMENT");
                    time1.setText(R.string.stime);
                    tv.setText(R.string.stv1);
                    tv21.setText(R.string.stv2);
                    tv31.setText(R.string.stv3);
                    tv41.setText(R.string.stv4);
                    tv111.setText(R.string.stv5);
                    tv121.setText(R.string.stv6);
                    tv131.setText(R.string.stv7);
                    tv141.setText(R.string.stv9);

                case 2:
                    ImageView image10 = (ImageView) findViewById(R.id.finalimage);
                    TextView title10 = (TextView) findViewById(R.id.finaltitle);
                    TextView location10 = (TextView) findViewById(R.id.finallocation);
                    TextView time10 = (TextView) findViewById(R.id.finaltime);
                    TextView tv0 = (TextView) findViewById(R.id.texttitle1);
                    TextView tv210 = (TextView) findViewById(R.id.texttitle2);
                    TextView tv310 = (TextView) findViewById(R.id.texttitle3);
                    TextView tv410 = (TextView) findViewById(R.id.texttitle4);
                    TextView tv1110 = (TextView) findViewById(R.id.winnigbold);
                    TextView tv1210 = (TextView) findViewById(R.id.winning);
                    TextView tv1310 = (TextView) findViewById(R.id.codinatebold);
                    TextView tv1410 = (TextView) findViewById(R.id.cordinate);

                    image10.setImageResource(R.drawable.googlehunt);
                    title10.setText(R.string.ghtitle);
                    location10.setText("@COMP. DEPARTMENT");
                    time10.setText(R.string.ghtime);
                    tv0.setText(R.string.gh1);
                    tv210.setText(R.string.gh2);
                    tv310.setText(R.string.gh3);
                    tv410.setText(R.string.gh4);
                    tv1110.setText(R.string.gh5);
                    tv1210.setText(R.string.gh6);
                    tv1310.setText(R.string.gh7);
                    tv1410.setText(R.string.gh8);
            }
        } else if (position != -1 && gridPosition == 1 && listPosition == 2) {
            switch (position) {
                case 0:
                    ImageView image10 = (ImageView) findViewById(R.id.finalimage);
                    TextView title10 = (TextView) findViewById(R.id.finaltitle);
                    TextView location10 = (TextView) findViewById(R.id.finallocation);
                    TextView time10 = (TextView) findViewById(R.id.finaltime);
                    TextView tv0 = (TextView) findViewById(R.id.texttitle1);
                    TextView tv210 = (TextView) findViewById(R.id.texttitle2);
                    TextView tv310 = (TextView) findViewById(R.id.texttitle3);
                    TextView tv410 = (TextView) findViewById(R.id.texttitle4);
                    TextView tv1110 = (TextView) findViewById(R.id.winnigbold);
                    TextView tv1210 = (TextView) findViewById(R.id.winning);
                    TextView tv1310 = (TextView) findViewById(R.id.codinatebold);
                    TextView tv1410 = (TextView) findViewById(R.id.cordinate);

                    image10.setImageResource(R.drawable.pp);
                    title10.setText(R.string.prtitle);
                    location10.setText("@EC DEPARTMENT");
                    time10.setText(R.string.prtime);
                    tv0.setText(R.string.pr1);
                    tv210.setText(R.string.pr2);
                    tv310.setText(R.string.pr3);
                    tv410.setText(R.string.pr4);
                    tv1110.setText(R.string.pr5);
                    tv1210.setText(R.string.pr6);
                    tv1310.setText(R.string.pr7);
                    tv1410.setText(R.string.pr8);

                case 1:
                    ImageView image1 = (ImageView) findViewById(R.id.finalimage);
                    TextView title1 = (TextView) findViewById(R.id.finaltitle);
                    TextView location1 = (TextView) findViewById(R.id.finallocation);
                    TextView time1 = (TextView) findViewById(R.id.finaltime);
                    TextView tv = (TextView) findViewById(R.id.texttitle1);
                    TextView tv21 = (TextView) findViewById(R.id.texttitle2);
                    TextView tv31 = (TextView) findViewById(R.id.texttitle3);
                    TextView tv41 = (TextView) findViewById(R.id.texttitle4);
                    TextView tv411 = (TextView) findViewById(R.id.texttitle5);
                    TextView tv412 = (TextView) findViewById(R.id.texttitle6);
                    TextView tv413 = (TextView) findViewById(R.id.texttitle7);
                    TextView tv414 = (TextView) findViewById(R.id.texttitle8);
                    TextView tv111 = (TextView) findViewById(R.id.winnigbold);
                    TextView tv121 = (TextView) findViewById(R.id.winning);
                    TextView tv131 = (TextView) findViewById(R.id.codinatebold);
                    TextView tv141 = (TextView) findViewById(R.id.cordinate);

                    image1.setImageResource(R.drawable.projectronics);
                    title1.setText(R.string.pjtitle);
                    location1.setText("@EC. DEPARTMENT");
                    time1.setText(R.string.pjtime);
                    tv.setText(R.string.pj1);
                    tv21.setText(R.string.pj2);
                    tv31.setText(R.string.pj3);
                    tv41.setText(R.string.pj4);
                    tv411.setText(R.string.pj5);
                    tv412.setText(R.string.pj6);
                    tv413.setText(R.string.pj7);
                    tv414.setText(R.string.pj8);
                    tv111.setText(R.string.pj9);
                    tv121.setText(R.string.pj10);
                    tv131.setText(R.string.pj11);
                    tv141.setText(R.string.pj12);
            }
        } else if (position != -1 && gridPosition == 1 && listPosition == 3) {
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
                    TextView tv11 = (TextView) findViewById(R.id.winnigbold);
                    TextView tv12 = (TextView) findViewById(R.id.winning);
                    TextView tv13 = (TextView) findViewById(R.id.codinatebold);
                    TextView tv14 = (TextView) findViewById(R.id.cordinate);

                    image.setImageResource(R.drawable.electrohunt);
                    title.setText(R.string.eti);
                    location.setText("@ELE. DEPARTMENT");
                    time.setText(R.string.etime);
                    tv1.setText(R.string.e1);
                    tv2.setText(R.string.e2);
                    tv3.setText(R.string.e3);
                    tv4.setText(R.string.e4);
                    tv11.setText(R.string.e5);
                    tv12.setText(R.string.e6);
                    tv13.setText(R.string.e7);
                    tv14.setText(R.string.e8);

                case 1:
                    ImageView image1 = (ImageView) findViewById(R.id.finalimage);
                    TextView title1 = (TextView) findViewById(R.id.finaltitle);
                    TextView location1 = (TextView) findViewById(R.id.finallocation);
                    TextView time1 = (TextView) findViewById(R.id.finaltime);
                    TextView tv = (TextView) findViewById(R.id.texttitle1);
                    TextView tv21 = (TextView) findViewById(R.id.texttitle2);
                    TextView tv31 = (TextView) findViewById(R.id.texttitle3);
                    TextView tv41 = (TextView) findViewById(R.id.texttitle4);
                    TextView tv111 = (TextView) findViewById(R.id.winnigbold);
                    TextView tv121 = (TextView) findViewById(R.id.winning);
                    TextView tv131 = (TextView) findViewById(R.id.codinatebold);
                    TextView tv141 = (TextView) findViewById(R.id.cordinate);

                    image1.setImageResource(R.drawable.mock);
                    title1.setText(R.string.mti);
                    location1.setText("@ELE. DEPARTMENT");
                    time1.setText(R.string.mtime);
                    tv.setText(R.string.m1);
                    tv21.setText(R.string.m2);
                    tv31.setText(R.string.m3);
                    tv41.setText(R.string.m4);
                    tv111.setText(R.string.m5);
                    tv121.setText(R.string.m6);
                    tv131.setText(R.string.m7);
                    tv141.setText(R.string.m8);

                case 2:
                    ImageView image10 = (ImageView) findViewById(R.id.finalimage);
                    TextView title10 = (TextView) findViewById(R.id.finaltitle);
                    TextView location10 = (TextView) findViewById(R.id.finallocation);
                    TextView time10 = (TextView) findViewById(R.id.finaltime);
                    TextView tv0 = (TextView) findViewById(R.id.texttitle1);
                    TextView tv210 = (TextView) findViewById(R.id.texttitle2);
                    TextView tv310 = (TextView) findViewById(R.id.texttitle3);
                    TextView tv410 = (TextView) findViewById(R.id.texttitle4);
                    TextView tv1110 = (TextView) findViewById(R.id.winnigbold);
                    TextView tv1210 = (TextView) findViewById(R.id.winning);
                    TextView tv1310 = (TextView) findViewById(R.id.codinatebold);
                    TextView tv1410 = (TextView) findViewById(R.id.cordinate);

                    image10.setImageResource(R.drawable.sparkq);
                    title10.setText(R.string.qtitle);
                    location10.setText("@ELE. DEPARTMENT");
                    time10.setText(R.string.qtime);
                    tv0.setText(R.string.q1);
                    tv210.setText(R.string.q2);
                    tv310.setText(R.string.q3);
                    tv410.setText(R.string.q4);
                    tv1110.setText(R.string.q5);
                    tv1210.setText(R.string.q6);
                    tv1310.setText(R.string.q7);
                    tv1410.setText(R.string.q8);
            }
        } else if (position != -1 && gridPosition == 1 && listPosition == 4) {
            switch (position) {
                case 0:
                    ImageView image = (ImageView) findViewById(R.id.finalimage);
                    TextView title = (TextView) findViewById(R.id.finaltitle);
                    TextView location = (TextView) findViewById(R.id.finallocation);
                    TextView time = (TextView) findViewById(R.id.finaltime);
                    TextView tv1 = (TextView) findViewById(R.id.texttitle1);
                    TextView tv2 = (TextView) findViewById(R.id.texttitle2);
                    TextView tv11 = (TextView) findViewById(R.id.winnigbold);
                    TextView tv12 = (TextView) findViewById(R.id.winning);
                    TextView tv13 = (TextView) findViewById(R.id.codinatebold);
                    TextView tv14 = (TextView) findViewById(R.id.cordinate);

                    image.setImageResource(R.drawable.photography);
                    title.setText(R.string.phototitile);
                    location.setText("@ALL DEPARTMENT");
                    time.setText(R.string.phototime);
                    tv1.setText(R.string.photo1);
                    tv2.setText(R.string.photo2);
                    tv11.setText(R.string.photo3);
                    tv12.setText(R.string.photo4);
                    tv13.setText(R.string.photo5);
                    tv14.setText(R.string.photo6);

                case 1:
                    ImageView image10 = (ImageView) findViewById(R.id.finalimage);
                    TextView title10 = (TextView) findViewById(R.id.finaltitle);
                    TextView location10 = (TextView) findViewById(R.id.finallocation);
                    TextView time10 = (TextView) findViewById(R.id.finaltime);

                    image10.setImageResource(R.drawable.autocad);
                    title10.setText(R.string.autitile);
                    location10.setText("@ADMIN");
                    time10.setText(R.string.autime);
            }
        }else if (position != -1 && gridPosition == 1 && listPosition == 5) {
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
                    TextView tv11 = (TextView) findViewById(R.id.winnigbold);
                    TextView tv12 = (TextView) findViewById(R.id.winning);
                    TextView tv13 = (TextView) findViewById(R.id.codinatebold);
                    TextView tv14 = (TextView) findViewById(R.id.cordinate);

                    image.setImageResource(R.drawable.robowar);
                    title.setText(R.string.rdtitile);
                    location.setText("@MECH. DEPARTMENT");
                    time.setText(R.string.rdtime);
                    tv1.setText(R.string.rd1);
                    tv2.setText(R.string.rd2);
                    tv3.setText(R.string.rd3);
                    tv4.setText(R.string.rd4);
                    tv11.setText(R.string.rd5);
                    tv12.setText(R.string.rd6);
                    tv13.setText(R.string.rd7);
                    tv14.setText(R.string.rd8);

                case 1:
                    ImageView image1 = (ImageView) findViewById(R.id.finalimage);
                    TextView title1 = (TextView) findViewById(R.id.finaltitle);
                    TextView location1 = (TextView) findViewById(R.id.finallocation);
                    TextView time1 = (TextView) findViewById(R.id.finaltime);
                    TextView tv111 = (TextView) findViewById(R.id.texttitle1);
                    TextView tv21 = (TextView) findViewById(R.id.texttitle2);
                    TextView tv31 = (TextView) findViewById(R.id.texttitle3);
                    TextView tv41 = (TextView) findViewById(R.id.texttitle4);
                    TextView tv1111 = (TextView) findViewById(R.id.winnigbold);
                    TextView tv121 = (TextView) findViewById(R.id.winning);
                    TextView tv131 = (TextView) findViewById(R.id.codinatebold);
                    TextView tv141 = (TextView) findViewById(R.id.cordinate);

                    image1.setImageResource(R.drawable.roborace);
                    title1.setText(R.string.rrtitile);
                    location1.setText("@MECH. DEPARTMENT");
                    time1.setText(R.string.rrtime);
                    tv111.setText(R.string.rr1);
                    tv21.setText(R.string.rr2);
                    tv31.setText(R.string.rr3);
                    tv41.setText(R.string.rr4);
                    tv1111.setText(R.string.rr5);
                    tv121.setText(R.string.rr6);
                    tv131.setText(R.string.rr7);
                    tv141.setText(R.string.rr8);
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

