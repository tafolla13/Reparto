package com.example.repartosahuayo.ui.Gasto;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.example.repartosahuayo.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Gastos extends Fragment {
    private ImageView maniobra;


    public Gastos() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.gastos, container, false);
        Maniobras(rootView);
        return rootView;
    }
    public void Maniobras(View view){
        maniobra = view.findViewById(R.id.imageView3);
        maniobra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment man = new Maniobras();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.nav_host_fragment, man);
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });
    }

}
