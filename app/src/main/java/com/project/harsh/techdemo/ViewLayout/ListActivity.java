package com.project.harsh.techdemo.ViewLayout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.project.harsh.techdemo.DjClass;
import com.project.harsh.techdemo.R;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity {
    int listPosition;

    String[] evname1 = new String[]{"BANNER/MODEL PRESENTATION", "TECH RANGA"};
    Integer[] evimg1 = {R.drawable.posterpr, R.drawable.techranga};

    String[] evname2 = new String[]{"ARISTO 6 AXIS ROBOT", "SIEMENS SIMOCODE"};
    Integer[] evimg2 = {R.drawable.robotics, R.drawable.simocode};

    String[] evname3 = new String[]{"Truss Bridge Modelling"};
    Integer[] evimg3 = {R.drawable.tresbridge};

    String[] evname4 = new String[]{"CodePedia", "Counter Strike", "Google Hunt"};
    Integer[] evimg4 = {R.drawable.codepediaimg, R.drawable.counterstrike, R.drawable.googlehunt};

    String[] evname5 = new String[]{"Picture Perception", "Projectronix"};
    Integer[] evimg5 = {R.drawable.pp, R.drawable.projectronics};

    String[] evname6 = new String[]{"Electro-hunt", "Mock interview", "Spark Quiz"};
    Integer[] evimg6 = {R.drawable.electrohunt, R.drawable.mock, R.drawable.sparkq};

    String[] evname7 = new String[]{"Robo Dangal", "Robo Race"};
    Integer[] evimg7 = {R.drawable.robowar, R.drawable.roborace};

    String[] evname8 = new String[]{"PHOTOGRAPHY", "AUTOCAD"};
    Integer[] evimg8 = {R.drawable.photography, R.drawable.autocad};

    String[] evname9 = new String[]{"Plan o mania"};
    Integer[] evimg9 = {R.drawable.planomania};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day_two);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowCustomEnabled(true);

        ArrayList<MainCat> subeve = new ArrayList<>();

        ArrayList<MainCat> subev1 = new ArrayList<>();
        for (int i = 0; i < evname1.length; i++) {
            MainCat item = new MainCat(evimg1[i], evname1[i]);
            subev1.add(item);
        }
        ArrayList<MainCat> subev2 = new ArrayList<>();
        for (int i = 0; i < evname2.length; i++) {
            MainCat item = new MainCat(evimg2[i], evname2[i]);
            subev2.add(item);
        }
        ArrayList<MainCat> subev3 = new ArrayList<>();
        for (int i = 0; i < evname3.length; i++) {
            MainCat item = new MainCat(evimg3[i], evname3[i]);
            subev3.add(item);
        }
        ArrayList<MainCat> subev4 = new ArrayList<>();
        for (int i = 0; i < evname4.length; i++) {
            MainCat item = new MainCat(evimg4[i], evname4[i]);
            subev4.add(item);
        }
        ArrayList<MainCat> subev5 = new ArrayList<>();
        for (int i = 0; i < evname5.length; i++) {
            MainCat item = new MainCat(evimg5[i], evname5[i]);
            subev5.add(item);
        }
        ArrayList<MainCat> subev6 = new ArrayList<>();
        for (int i = 0; i < evname6.length; i++) {
            MainCat item = new MainCat(evimg6[i], evname6[i]);
            subev6.add(item);
        }
        ArrayList<MainCat> subev7 = new ArrayList<>();
        for (int i = 0; i < evname8.length; i++) {
            MainCat item = new MainCat(evimg7[i], evname7[i]);
            subev7.add(item);
        }
        ArrayList<MainCat> subev8 = new ArrayList<>();
        for (int i = 0; i < evname8.length; i++) {
            MainCat item = new MainCat(evimg8[i], evname8[i]);
            subev8.add(item);
        }
        ArrayList<MainCat> subev9 = new ArrayList<>();
        for (int i = 0; i < evname9.length; i++) {
            MainCat item = new MainCat(evimg9[i], evname9[i]);
            subev9.add(item);
        }

        final int gridPosition = getIntent().getIntExtra("gridposition", -1);
        final int position = getIntent().getIntExtra("position", -1);
        if (position != -1 && gridPosition == 0) {
            switch (position) {
                case 0:
                    subeve = subev3;
                    listPosition = 0;
                    break;
                case 1:
                    subeve = subev1;
                    listPosition = 1;
                    break;
                case 2:
                    subeve = subev2;
                    listPosition = 2;
                    break;
                case 3:
                    Intent i = new Intent(ListActivity.this, DjClass.class);
                    startActivity(i);
                    if (position == 3)
                        onBackPressed();
                    return ;
//                 break;
            }
        } else if (position != -1 && gridPosition == 1)
//        position = getIntent().getIntExtra("day2", -1);
//        if(position != -1){
            switch (position) {
                case 0:
                    subeve = subev9;
                    listPosition = 0;
                    break;
                case 1:
                    subeve = subev4;
                    listPosition = 1;
                    break;
                case 2:
                    subeve = subev5;
                    listPosition = 2;
                    break;
                case 3:
                    subeve = subev6;
                    listPosition = 3;
                    break;
                case 4:
                    subeve = subev8;
                    listPosition = 4;
                    break;
                case 5:
                    subeve = subev7;
                    listPosition = 5;
                    break;
            }

        ListView lv = (ListView) findViewById(R.id.linearLL);
        CustomListAdapter adapter = new CustomListAdapter(ListActivity.this, subeve);
        lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (parent.getItemAtPosition(position) != null) {
                    switch (position) {
                        case 0:
                            Intent i = new Intent(ListActivity.this, FinalActivity.class);
                            i.putExtra("gridposition", gridPosition);
                            i.putExtra("listPosition", listPosition);
                            i.putExtra("position", position);
                            startActivity(i);
                            break;
                        case 1:
                            Intent i1 = new Intent(ListActivity.this, FinalActivity.class);
                            i1.putExtra("gridposition", gridPosition);
                            i1.putExtra("listPosition", listPosition);
                            i1.putExtra("position", position);
                            startActivity(i1);
                            break;
                        case 2:
                            Intent i2 = new Intent(ListActivity.this, FinalActivity.class);
                            i2.putExtra("gridposition", gridPosition);
                            i2.putExtra("listPosition", listPosition);
                            i2.putExtra("position", position);
                            startActivity(i2);
                            break;
                    }
                }
            }
        });
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