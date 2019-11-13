package com.example.repartosahuayo.ui.Factura;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.repartosahuayo.R;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

/**
 * A simple {@link Fragment} subclass.
 */
public class Llegada2Fragment extends Fragment implements OnMapReadyCallback {
    private GoogleMap map;


    public Llegada2Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
   View rootView=inflater.inflate(R.layout.fragment_llegada2, container, false);
        SupportMapFragment mapFragment = (SupportMapFragment)getChildFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
   return rootView;
    }
    public void onMapReady(GoogleMap googleMap){
        map=googleMap;
        LatLng sydney = new LatLng(19.6406592, -99.142452);
        map.addMarker(new MarkerOptions().position(sydney).title("Sahuayo Tultitlan"));
        map.moveCamera(CameraUpdateFactory.newLatLng(sydney));
    }

}
