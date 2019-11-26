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
public class ApartadoEventosFragment extends Fragment {
    private ImageView combustible;

    public ApartadoEventosFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_apartado_eventos, container, false);
        Combustibles(rootView);
        return rootView;
    }
    public void Combustibles(View view){
        combustible = view.findViewById(R.id.imageView4);
        combustible.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment conta = new Combustible();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.nav_host_fragment, conta);
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });
    }

}
