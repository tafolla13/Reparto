package com.example.repartosahuayo.ui.Factura;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import com.example.repartosahuayo.Adapter.Datos;
import com.example.repartosahuayo.Adapter.ListAdapter;
import com.example.repartosahuayo.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class InformacionFragment extends Fragment {
    private ListView listView;
    private static ListAdapter adapter;
    ArrayList<Datos> items;


    public InformacionFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_informacion, container, false);
        Dato(rootView);
        return rootView;
    }
    public void Dato(View v){
        listView = v.findViewById(R.id.recycler);
        items = new ArrayList<>();
        items.add(new Datos("dcfdfds","dsds",2));
        items.add(new Datos("HA0717","Coca-cola",10));
        items.add(new Datos("G13G14","Pepsi",15));
        adapter = new ListAdapter(items,getActivity().getApplicationContext());
        listView.setAdapter(adapter);
    }

}
