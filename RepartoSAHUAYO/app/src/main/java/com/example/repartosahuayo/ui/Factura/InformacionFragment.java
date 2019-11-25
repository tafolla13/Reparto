package com.example.repartosahuayo.ui.Factura;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.repartosahuayo.Adapter.AdapterReclyer;
import com.example.repartosahuayo.Adapter.Datos;
import com.example.repartosahuayo.R;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class InformacionFragment extends Fragment {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager lManager;


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
        List items = new ArrayList<>();
        items.add(new Datos("dcfdfds","dsds",2));
        items.add(new Datos("HA0717","Coca-cola",10));
        items.add(new Datos("G13G14","Pepsi",15));
        recyclerView = v.findViewById(R.id.recycler);
        recyclerView.setHasFixedSize(true);
        lManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(lManager);

        adapter = new AdapterReclyer(items);
        recyclerView.setAdapter(adapter);

    }

}
