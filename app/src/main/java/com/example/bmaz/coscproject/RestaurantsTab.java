package com.example.bmaz.coscproject;

import android.os.Bundle;
import android.support.v4.app.Fragment;

/**
 * A simple {@link Fragment} subclass.
 */
public class RestaurantsTab extends ParentFragmentLayout {

    public RestaurantsTab() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        presentors = getResources().getStringArray(R.array.Restaurant);

        presentorsInfo = new String[][]{
                {getResources().getString(R.string.restOne)},
                {getResources().getString(R.string.restTwo)},
                {getResources().getString(R.string.restThree)}
        };
    }

}


