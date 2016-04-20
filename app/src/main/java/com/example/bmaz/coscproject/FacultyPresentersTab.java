package com.example.bmaz.coscproject;

import android.os.Bundle;
import android.support.v4.app.Fragment;

/**
 * A simple {@link Fragment} subclass.
 */
public class FacultyPresentersTab extends ParentFragmentLayout {

    public FacultyPresentersTab() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        presentors = getResources().getStringArray(R.array.facultyPresentations);

        presentorsInfo = new String[][]{
                {getResources().getString(R.string.facultyOne)},
                {getResources().getString(R.string.facultyTwo)},
                {getResources().getString(R.string.facultyThree)},
                {getResources().getString(R.string.facultyFour)}
        };
    }

}
