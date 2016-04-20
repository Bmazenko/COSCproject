package com.example.bmaz.coscproject;



import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.TextView;
/**
 * A simple {@link Fragment} subclass.
 */
public class ParentFragmentLayout extends Fragment {
    View thirdView;
    ExpandableListView list;
    String[] presentors;
    String[][] presentorsInfo;


    public ParentFragmentLayout() {
        // Required empty public constructor
    }


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

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        thirdView = inflater.inflate(R.layout.presentations_layout, container, false);
        return thirdView;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        list = (ExpandableListView) view.findViewById(R.id.expListView);
        list.setAdapter(new ExpandableListAdapter(presentors, presentorsInfo));
        list.setGroupIndicator(null);

    }

    //Used to fill the expandable list with arrays of text.
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
            holder.text.setText(getGroup(groupPosition).toString());
            TextView textView = (TextView)convertView.findViewById(R.id.parentTxt);
            textView.setTypeface(null, Typeface.BOLD);
            textView.setPadding(50, 50, 50, 50);

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



