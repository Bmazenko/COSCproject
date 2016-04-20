package com.example.bmaz.coscproject;

import android.os.Bundle;
import android.support.v4.app.Fragment;

/**
 * A simple {@link Fragment} subclass.
 */
public class StudentPresentersTab extends ParentFragmentLayout {

    public StudentPresentersTab() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        presentors = getResources().getStringArray(R.array.studentPresentations);

        presentorsInfo = new String[][]{
                {getResources().getString(R.string.studentOne)},
                {getResources().getString(R.string.studentTwo)},
                {getResources().getString(R.string.studentThree)},
                {getResources().getString(R.string.studentFour)}
        };
    }

}
