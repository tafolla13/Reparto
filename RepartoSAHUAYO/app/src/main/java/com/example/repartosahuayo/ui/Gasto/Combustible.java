package com.example.repartosahuayo.ui.Gasto;


import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Chronometer;

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
    /*public Dialog onCreateDialog(View savedInstanceState){
        AlertDialog.Builder builder=new AlertDialog.Builder(getActivity());
        builder.setMessage(R.string.dialogo).setPositiveButton(R.string.fire, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                //DAR CLIK EN EL BOTON
            }
        });
        builder.setMessage();
        return builder.create();
    }*/
    public void Mensaje(View v){
        AlertDialog.Builder builder = new AlertDialog.Builder(this.getActivity());
        builder.setMessage("DIALOGO")
                .setTitle("DIALOG")
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
