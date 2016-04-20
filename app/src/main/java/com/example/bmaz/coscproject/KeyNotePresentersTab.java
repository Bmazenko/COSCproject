package com.example.bmaz.coscproject;

import android.os.Bundle;
import android.support.v4.app.Fragment;

/**
 * A simple {@link Fragment} subclass.
 */
public class KeyNotePresentersTab extends ParentFragmentLayout {

    public KeyNotePresentersTab() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        presentors = getResources().getStringArray(R.array.keynotePresentations);

        presentorsInfo = new String[][]{
                {getResources().getString(R.string.keynoteOne)},
                {getResources().getString(R.string.keynoteTwo)},
                {getResources().getString(R.string.keynoteThree)},
                {getResources().getString(R.string.keynoteFour)}
        };
    }

}
