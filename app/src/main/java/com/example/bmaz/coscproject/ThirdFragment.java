package com.example.bmaz.coscproject;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTabHost;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TabWidget;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 */
public class ThirdFragment extends Fragment {

    View thirdView;
    ExpandableListView list;
    private String[] presentors;
    private String[][] presentorsInfo;
    private FragmentTabHost mTabHost;

    public ThirdFragment() {

        // Required empty public constructor
    }


    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // thirdView = inflater.inflate(R.layout.fragment_third, container, false);

        // Create the TabWidget (the tabs)
        TabWidget tabWidget = new TabWidget(getContext());
        tabWidget.setId(android.R.id.tabs);
        // Create the FrameLayout (the content area)
        FrameLayout frame = new FrameLayout(getContext());
        frame.setId(android.R.id.tabcontent);
        LinearLayout.LayoutParams frameLayoutParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.FILL_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT, 1);
        frameLayoutParams.setMargins(1, 1, 1, 1);
        frame.setLayoutParams(frameLayoutParams);
        // Create the container for the above widgets
        LinearLayout tabHostLayout = new LinearLayout(getContext());
        tabHostLayout.setOrientation(LinearLayout.VERTICAL);
        tabHostLayout.addView(tabWidget);
        tabHostLayout.addView(frame);
        // Create FragmentTabHost
        mTabHost = new FragmentTabHost(getActivity());
        // mTabHost.addView(tabHostLayout);
        tabHostLayout.addView(mTabHost);
        mTabHost.setup(getActivity(), getChildFragmentManager(), android.R.id.tabcontent);
        // add the tabs
        mTabHost.addTab(mTabHost.newTabSpec("students").setIndicator("Student Speakers"), StudentPresentersTab.class, null);
        mTabHost.addTab(mTabHost.newTabSpec("keynotes").setIndicator("Keynote Speakers"), KeyNotePresentersTab.class, null);
        mTabHost.addTab(mTabHost.newTabSpec("faculty").setIndicator("Faculty Speakers"), FacultyPresentersTab.class, null);
        return tabHostLayout;

    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

    }
}