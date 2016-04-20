package com.example.bmaz.coscproject;

import android.os.Bundle;
import android.support.v4.app.Fragment;

/**
 * A simple {@link Fragment} subclass.
 */
public class HotelTab extends ParentFragmentLayout {

    public HotelTab() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        presentors = getResources().getStringArray(R.array.Hotel);

        presentorsInfo = new String[][]{
                {getResources().getString(R.string.hotelOne)},
                {getResources().getString(R.string.hotelTwo)},
                {getResources().getString(R.string.hotelThree)},

        };
    }

}
