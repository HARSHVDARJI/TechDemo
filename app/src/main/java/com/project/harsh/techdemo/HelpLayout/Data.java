package com.project.harsh.techdemo.HelpLayout;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.project.harsh.techdemo.R;

/**
 * Created by harsh on 23/2/17.
 */

public class Data extends Fragment {
    Spinner materialBetterSpinner1 ;
    Spinner materialBetterSpinner2;

    String[] SPINNER_DATA = {"-SELECT FROM-","EC DEPARTMENT","CSE DEPARTMENT","ELECRTICAL DEPARTMENT",
            "CIVIL DEPARTMENT","MECHANICAL DEPARTMENT"};

    int item1;
    int item2;
    Bundle bundle;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.activity_help, container, false);
    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        materialBetterSpinner1 = (Spinner) getActivity().findViewById(R.id.from);
        materialBetterSpinner2 = (Spinner) getActivity().findViewById(R.id.to);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_dropdown_item_1line, SPINNER_DATA);

        materialBetterSpinner1.setAdapter(adapter);
        materialBetterSpinner2.setAdapter(adapter);

        materialBetterSpinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                item1 = position;
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        materialBetterSpinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                item2 = position;
                if(position >= 1 && item1 ==1 && item2 == 2) {
                    LocationAnimation location = new LocationAnimation();
                    FragmentManager fm = getFragmentManager();
                    FragmentTransaction ft = fm.beginTransaction();
                            ft.replace(R.id.help_layout,location)
                            .commit();
                }
                if(position >= 1 && item1 ==1 && item2 == 3) {
                    OnetoThree onetoThree = new OnetoThree();
                    FragmentManager fm = getFragmentManager();
                    FragmentTransaction ft = fm.beginTransaction();
                    ft.replace(R.id.help_layout,onetoThree)
                            .commit();
                }
                if(position >= 1 && item1 ==1 && item2 == 4) {
                    EcCivil ecCivil = new EcCivil();
                    FragmentManager fm = getFragmentManager();
                    FragmentTransaction ft = fm.beginTransaction();
                    ft.replace(R.id.help_layout,ecCivil)
                            .commit();
                }
                if(position >= 1 && item1 ==1 && item2 == 5) {
                    EcMech ecMech = new EcMech();
                    FragmentManager fm = getFragmentManager();
                    FragmentTransaction ft = fm.beginTransaction();
                    ft.replace(R.id.help_layout,ecMech)
                            .commit();
                }
                if(position >= 1 && item1 ==2 && item2 == 1) {
                    ComEc comEc = new ComEc();
                    FragmentManager fm = getFragmentManager();
                    FragmentTransaction ft = fm.beginTransaction();
                    ft.replace(R.id.help_layout,comEc)
                            .commit();
                }
                if(position >= 1 && item1 ==2 && item2 == 3) {
                    ComEle comEle = new ComEle();
                    FragmentManager fm = getFragmentManager();
                    FragmentTransaction ft = fm.beginTransaction();
                    ft.replace(R.id.help_layout,comEle)
                            .commit();
                }
                if(position >= 1 && item1 ==2 && item2 == 4) {
                    ComCivil comCivil = new ComCivil();
                    FragmentManager fm = getFragmentManager();
                    FragmentTransaction ft = fm.beginTransaction();
                    ft.replace(R.id.help_layout,comCivil)
                            .commit();
                }
                if(position >= 1 && item1 ==2 && item2 == 5) {
                    ComMech comMech = new ComMech();
                    FragmentManager fm = getFragmentManager();
                    FragmentTransaction ft = fm.beginTransaction();
                    ft.replace(R.id.help_layout,comMech)
                            .commit();
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

}
