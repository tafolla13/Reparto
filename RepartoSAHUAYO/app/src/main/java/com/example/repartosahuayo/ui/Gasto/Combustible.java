package com.example.repartosahuayo.ui.Gasto;


import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Chronometer;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;

import com.example.repartosahuayo.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class Combustible extends Fragment {


    public Combustible() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView=inflater.inflate(R.layout.fragment_combustible, container, false);
        Chronometer simpleChronometer = (Chronometer)rootView.findViewById(R.id.simpleChronometer); // initiate a chronometer
        simpleChronometer.start();
        Mensaje(rootView);
        return rootView;
    }
//Cuando le de Retroceso mandar Alerta
    public void Mensaje(View v){
        AlertDialog.Builder builder = new AlertDialog.Builder(this.getActivity());
        builder.setMessage("NO PUEDE REGRESAR SIN ANTES TERMINAR EL PROCESO")
                .setTitle("ALERTA")
                .setCancelable(false)
                .setNeutralButton("Aceptar",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();
                            }
                        });
        AlertDialog alert = builder.create();
        alert.show();
    }

}
