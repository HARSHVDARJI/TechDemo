package com.project.harsh.techdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class DayOne extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day_one);

        ArrayList<MainCat> maincategory = new ArrayList<>();

        ArrayList<MainCat> catone = new ArrayList<>();
        MainCat catName1 = new MainCat();
        catName1.setImg(R.drawable.civil);
        catName1.setTitle("NIRMAAN");
        catName1.setImg(R.drawable.general);
        catName1.setTitle("GENERAL");
        catName1.setImg(R.drawable.workshop);
        catName1.setTitle("WORKSHOP");
        catName1.setImg(R.drawable.djp);
        catName1.setTitle("DJ PARTY");
        catone.add(catName1);

        ArrayList<MainCat> cattwo = new ArrayList<>();
        MainCat catName2 = new MainCat();
        catName2.setImg(R.drawable.civil);
        catName2.setTitle("NIRMAAN");
        catName2.setImg(R.drawable.comp);
        catName2.setTitle("CYBERNATIX");
        catName2.setImg(R.drawable.ec);
        catName2.setTitle("ECTRONICS");
        catName2.setImg(R.drawable.electronics);
        catName2.setTitle("ELECTRIC.CITY");
        catName2.setImg(R.drawable.general);
        catName2.setTitle("GENERAL");
        catName2.setImg(R.drawable.mechanical);
        catName2.setTitle("Mc~Avengers");
        cattwo.add(catName2);

        int position = getIntent().getIntExtra("position",-1);
        if(position != -1){
            switch (position){
                case 1:
                    maincategory = catone;
                    break;
                case 2:
                    maincategory = cattwo;
                    break;
            }
        }
        GridView gv = (GridView)findViewById(R.id.gridview);
        CustomGridAdapter adapter = new CustomGridAdapter(DayOne.this, maincategory);
        gv.setAdapter(adapter);
    }
}
