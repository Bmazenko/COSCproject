package com.example.bmaz.coscproject;

import android.os.Bundle;
import android.support.v4.app.Fragment;

/**
 * A simple {@link Fragment} subclass.
 */
public class ScheduleSaturdayTab extends ParentFragmentLayout {

    public ScheduleSaturdayTab() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        presentors = getResources().getStringArray(R.array.Saturday);

        presentorsInfo = new String[][]{
                {getResources().getString(R.string.satOne)},
                {getResources().getString(R.string.satTwo)},
                {getResources().getString(R.string.satThree)}
        };
    }

}
