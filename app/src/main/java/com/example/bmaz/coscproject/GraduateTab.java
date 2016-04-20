package com.example.bmaz.coscproject;

import android.os.Bundle;
import android.support.v4.app.Fragment;

/**
/**
 * A simple {@link Fragment} subclass.
 */
public class GraduateTab extends ParentFragmentLayout {

    public GraduateTab() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        presentors = getResources().getStringArray(R.array.GraduateExhibits);

        presentorsInfo = new String[][]{
                {getResources().getString(R.string.gradOne)},
                {getResources().getString(R.string.gradTwo)},
                {getResources().getString(R.string.gradThree)}
        };
    }

}
