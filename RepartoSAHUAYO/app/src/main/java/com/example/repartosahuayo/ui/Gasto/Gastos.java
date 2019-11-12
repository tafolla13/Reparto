package com.example.repartosahuayo.ui.Gasto;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.repartosahuayo.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Gastos extends Fragment {


    public Gastos() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.gastos, container, false);
    }

}
