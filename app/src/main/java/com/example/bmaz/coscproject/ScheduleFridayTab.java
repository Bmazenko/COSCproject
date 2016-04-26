package com.example.bmaz.coscproject;

import android.os.Bundle;
import android.support.v4.app.Fragment;

/**
 * A simple {@link Fragment} subclass.
 */
public class ScheduleFridayTab extends ParentFragmentLayout {

    public ScheduleFridayTab() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        presentors = getResources().getStringArray(R.array.Friday);

        presentorsInfo = new String[][]{
                {getResources().getString(R.string.eventOne)},
                {getResources().getString(R.string.eventTwo)},
                {getResources().getString(R.string.eventThree)},
                {getResources().getString(R.string.eventFour)},
                {getResources().getString(R.string.eventFive)},
                {getResources().getString(R.string.eventSix)}
        };
    }

}
