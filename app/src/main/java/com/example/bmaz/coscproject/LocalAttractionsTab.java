package com.example.bmaz.coscproject;

import android.os.Bundle;
import android.support.v4.app.Fragment;

/**
 * A simple {@link Fragment} subclass.
 */
public class LocalAttractionsTab extends ParentFragmentLayout {

    public LocalAttractionsTab() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        presentors = getResources().getStringArray(R.array.LocalAttractions);

        presentorsInfo = new String[][]{
                {getResources().getString(R.string.attractOne)},
                {getResources().getString(R.string.attractTwo)},
                {getResources().getString(R.string.attractThree)},

        };
    }

}


