package com.example.bmaz.coscproject;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.*;


/**
 * A simple {@link Fragment} subclass.
 */
public class TestMapFragment extends Fragment {


    public TestMapFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_test_map, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        GoogleMap map;
        map = ((SupportMapFragment) getChildFragmentManager().findFragmentById(R.id. map)).getMap();
        map.addMarker(new MarkerOptions()
                .position(new LatLng(40.6200878, -79.158866))
                .title("Stright Hall"));
        map.addMarker(new MarkerOptions()
                .position(new LatLng(40.6175461, -79.1595629))
                .title("IUP Libraries"));
        map.addMarker(new MarkerOptions()
                .position(new LatLng(40.613155, -79.1757161))
                .title("Ironwood Grill"));
    }

}
