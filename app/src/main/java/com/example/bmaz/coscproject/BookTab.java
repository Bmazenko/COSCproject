package com.example.bmaz.coscproject;

import android.os.Bundle;
import android.support.v4.app.Fragment;

/**
 * A simple {@link Fragment} subclass.
 */
public class BookTab extends ParentFragmentLayout {

    public BookTab() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        presentors = getResources().getStringArray(R.array.BookExhibits);

        presentorsInfo = new String[][]{
                {getResources().getString(R.string.bookOne)},
                {getResources().getString(R.string.bookTwo)},
                {getResources().getString(R.string.bookThree)}
        };
    }

}
