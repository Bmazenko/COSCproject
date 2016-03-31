package com.example.bmaz.coscproject;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class ThirdFragment extends Fragment {

    View thirdView;
    ExpandableListView list;
    private String[] presentors;
    private String[][] presentorsInfo;

    public ThirdFragment() {

        // Required empty public constructor
    }


    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        presentors = new String[] { "Presentor ", "Presentor 2", "Presentor 3", "Presentor 4" };

        presentorsInfo = new String [][] {
                { "First Info: This is where the topic and summary of the talk wil go..." +
                        "blah blah balhj blha worlds and stuff..."},
                { "second Info: This is where the topic and summary of the talk wil go..." +
                        "blah blah balhj blha worlds and stuff..." },
                { "Third Info: This is where the topic and summary of the talk wil go..." +
                        "blah blah balhj blha worlds and stuff... "},
                { "Fourth Info: This is where the topic and summary of the talk wil go..." +
                        "blah blah balhj blha worlds and stuff... "}
        };
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        thirdView = inflater.inflate(R.layout.fragment_third, container, false);
        return thirdView;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        list = (ExpandableListView) view.findViewById(R.id.expListView);
        list.setAdapter(new ExpandableListAdapter(presentors, presentorsInfo));
        list.setGroupIndicator(null);

    }

    public class ExpandableListAdapter extends BaseExpandableListAdapter {

        private final LayoutInflater inf;
        private String[] presenters;
        private String[][] presentersInformation;

        public ExpandableListAdapter(String[] groups, String[][] children) {
            this.presenters = groups;
            this.presentersInformation = children;
            inf = LayoutInflater.from(getActivity());
        }

        @Override
        public int getGroupCount() {
            return presenters.length;
        }

        @Override
        public int getChildrenCount(int groupPosition) {
            return presentersInformation[groupPosition].length;
        }

        @Override
        public Object getGroup(int groupPosition) {
            return presenters[groupPosition];
        }

        @Override
        public Object getChild(int groupPosition, int childPosition) {
            return presentersInformation[groupPosition][childPosition];
        }

        @Override
        public long getGroupId(int groupPosition) {
            return groupPosition;
        }

        @Override
        public long getChildId(int groupPosition, int childPosition) {
            return childPosition;
        }

        @Override
        public boolean hasStableIds() {
            return true;
        }

        @Override
        public View getChildView(int groupPosition, final int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {

            ViewHolder holder;
            if (convertView == null) {
                convertView = inf.inflate(R.layout.presentors_info, parent, false);
                holder = new ViewHolder();

                holder.text = (TextView) convertView.findViewById(R.id.childTxt);
                convertView.setTag(holder);
            } else {
                holder = (ViewHolder) convertView.getTag();
            }

            holder.text.setText(getChild(groupPosition, childPosition).toString());

            return convertView;
        }

        @Override
        public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
            ViewHolder holder;

            if (convertView == null) {
                convertView = inf.inflate(R.layout.presenters, parent, false);

                holder = new ViewHolder();
                holder.text = (TextView) convertView.findViewById(R.id.parentTxt);
                convertView.setTag(holder);
            } else {
                holder = (ViewHolder) convertView.getTag();
            }

            holder.text.setText(getGroup(groupPosition).toString());

            return convertView;
        }

        @Override
        public boolean isChildSelectable(int groupPosition, int childPosition) {
            return true;
        }

        private class ViewHolder {
            TextView text;
        }
    }

}
