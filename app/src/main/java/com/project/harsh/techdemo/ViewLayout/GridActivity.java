package com.project.harsh.techdemo.ViewLayout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import com.project.harsh.techdemo.R;

import java.util.ArrayList;

public class GridActivity extends AppCompatActivity {
    int gridPosition;
    String[] Title1 = new String[] { "NIRMAAN",
            "GENERAL", "WORKSHOP", "DJ PARTY" };
    Integer[] Img1 = { R.drawable.civil,
            R.drawable.general, R.drawable.workshop, R.drawable.djp };

    String[] Title2 = new String[] { "NIRMAAN",
            "CYBERNATIX", "ECTRONICS", "ELECTRIC.CITY","GENERAL","Mc~Avengers" };
    Integer[] Img2 = { R.drawable.civil,
            R.drawable.comp, R.drawable.ec, R.drawable.electronics,
            R.drawable.general, R.drawable.mechanical };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowCustomEnabled(true);

        setContentView(R.layout.activity_day_one);
        ArrayList<MainCat> mainArralist = new ArrayList<>();

        ArrayList<MainCat> maincat1 = new ArrayList<>();
        for (int i = 0; i < Title1.length; i++) {
            MainCat item = new MainCat(Img1[i], Title1[i]);
            maincat1.add(item);
        }

        ArrayList<MainCat> maincat2 = new ArrayList<>();
        for (int i = 0; i < Title2.length; i++) {
            MainCat item = new MainCat(Img2[i], Title2[i]);
            maincat2.add(item);
        }

        int position = getIntent().getIntExtra("position",-1);
        if(position != -1){
            switch (position){
                case 0:
                    mainArralist = maincat1;
                    gridPosition = 0;
                    break;
                case 1:
                    mainArralist = maincat2;
                    gridPosition = 1;
                    break;
            }
        }
        GridView gv = (GridView)findViewById(R.id.gridview);
        CustomGridAdapter adapter = new CustomGridAdapter(GridActivity.this, mainArralist);
        gv.setAdapter(adapter);

        gv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (parent.getItemAtPosition(position) != null) {
                    switch (position) {
                        case 0:
                            Intent i = new Intent(GridActivity.this, ListActivity.class);
                            i.putExtra("gridposition",gridPosition);
                            i.putExtra("position", position);
                            startActivity(i);
                            break;
                        case 1:
                            Intent i1 = new Intent(GridActivity.this, ListActivity.class);
                            i1.putExtra("gridposition",gridPosition);
                            i1.putExtra("position", position);
                            startActivity(i1);
                            break;
                        case 2:
                            Intent i2 = new Intent(GridActivity.this, ListActivity.class);
                            i2.putExtra("gridposition",gridPosition);
                            i2.putExtra("position", position);
                            startActivity(i2);
                            break;
                        case 3:
                            Intent i3 = new Intent(GridActivity.this, ListActivity.class);
                            i3.putExtra("gridposition",gridPosition);
                            i3.putExtra("position", position);
                            startActivity(i3);
                            break;
                        case 4:
                            Intent i4 = new Intent(GridActivity.this, ListActivity.class);
                            i4.putExtra("gridposition",gridPosition);
                            i4.putExtra("position", position);
                            startActivity(i4);
                            break;
                        case 5:
                            Intent i5 = new Intent(GridActivity.this, ListActivity.class);
                            i5.putExtra("gridposition",gridPosition);
                            i5.putExtra("position", position);
                            startActivity(i5);
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
