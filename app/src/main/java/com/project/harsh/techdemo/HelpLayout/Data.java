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

    String[] SPINNER_DATA = {"-SELECT DEPARTMENT-","EC DEPARTMENT","CSE DEPARTMENT","ELECRTICAL DEPARTMENT",
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
//                item1 = String.valueOf(parent.getItemAtPosition(position));
                item2 = position;
                if(position >= 1 && item1 ==2 && item2 == 4) {
//                    TextView tv = (TextView)getActivity().findViewById(R.id.finaltxt);
//                    tv.setText("from " + item1 + "to " + item2);
                    LocationAnimation location = new LocationAnimation();
                    FragmentManager fm = getFragmentManager();
                    FragmentTransaction ft = fm.beginTransaction();
                            ft.replace(R.id.empty,location)
                            .commit();
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

}
