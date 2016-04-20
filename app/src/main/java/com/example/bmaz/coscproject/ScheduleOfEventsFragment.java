package com.example.bmaz.coscproject;

        import android.graphics.Color;
        import android.os.Bundle;
        import android.support.v4.app.Fragment;
        import android.support.v4.app.FragmentTabHost;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.FrameLayout;
        import android.widget.LinearLayout;
        import android.widget.TabWidget;

/**
 * A simple {@link Fragment} subclass.
 */
public class ScheduleOfEventsFragment extends Fragment {

    private FragmentTabHost mTabHost;

    public ScheduleOfEventsFragment() {

        // Required empty public constructor
    }


    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Create the TabWidget (the tabs)
        TabWidget tabWidget = new TabWidget(getContext());
        tabWidget.setId(android.R.id.tabs);
        // Create the FrameLayout (the content area)
        FrameLayout frame = new FrameLayout(getContext());
        frame.setId(android.R.id.tabcontent);
        LinearLayout.LayoutParams frameLayoutParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT, 1);
        frameLayoutParams.setMargins(1, 1, 1, 1);
        frame.setLayoutParams(frameLayoutParams);
        // Create the container for the above widgets
        LinearLayout tabHostLayout = new LinearLayout(getContext());
        tabHostLayout.setOrientation(LinearLayout.VERTICAL);
        tabHostLayout.addView(tabWidget);
        tabHostLayout.addView(frame);
        // Create FragmentTabHost
        mTabHost = new FragmentTabHost(getActivity());
        tabHostLayout.addView(mTabHost);
        mTabHost.setup(getActivity(), getChildFragmentManager(), android.R.id.tabcontent);

        // add the tabs
        mTabHost.getTabWidget().setShowDividers(TabWidget.SHOW_DIVIDER_MIDDLE);
        mTabHost.getTabWidget().setDividerDrawable(R.drawable.divider_vertical_dark);
        mTabHost.addTab(mTabHost.newTabSpec("friday").setIndicator("Friday"), ScheduleFridayTab.class, null);
        mTabHost.addTab(mTabHost.newTabSpec("saturday").setIndicator("Saturday"), ScheduleSaturdayTab.class, null);


        for(int i=0;i<mTabHost.getTabWidget().getChildCount();i++)
        {
            mTabHost.getTabWidget().getChildAt(i).setBackgroundColor(Color.parseColor("#7B241C"));
        }


        return tabHostLayout;

    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

    }
}