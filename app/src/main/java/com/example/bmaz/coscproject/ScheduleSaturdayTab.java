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
                {getResources().getString(R.string.satThree)},
                {getResources().getString(R.string.satFour)},
                {getResources().getString(R.string.satFive)},
                {getResources().getString(R.string.satSix)},
                {getResources().getString(R.string.satSeven)},
                {getResources().getString(R.string.satEight)},
                {getResources().getString(R.string.satNine)},
                {getResources().getString(R.string.satTen)},
                {getResources().getString(R.string.satEleven)},
                {getResources().getString(R.string.satTwelve)},
                {getResources().getString(R.string.satThirteen)},
                {getResources().getString(R.string.satFourteen)}
        };
    }

}
