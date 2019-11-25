package com.example.repartosahuayo.Adapter;

import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.repartosahuayo.R;

import java.util.List;

public class AdapterReclyer extends RecyclerView.Adapter<AdapterReclyer.AnimeViewHolder> {
    private List<Datos> items;
    public static class AnimeViewHolder extends RecyclerView.ViewHolder{
        public TextView clave_producto,nombre_del_producto,total;
    public AnimeViewHolder(View v) {
        super(v);
        clave_producto = v.findViewById(R.id.clave);
        nombre_del_producto = v.findViewById(R.id.producto);
        total = v.findViewById(R.id.total);
        }
    }
    public AdapterReclyer(List<Datos>items){
        this.items = items;
    }

    @Override
    public int getItemCount(){
        return items.size();
    }
    @Override
    public AnimeViewHolder onCreateViewHolder(ViewGroup viewGroup, int i){
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.detalles, viewGroup, false);
        return new AnimeViewHolder(v);
    }
    @Override
    public void onBindViewHolder(AnimeViewHolder viewHolder, int i){
        viewHolder.clave_producto.setText(String.valueOf(items.get(i).getClave_producto()));
        viewHolder.nombre_del_producto.setText(items.get(i).getNombre_producto());
        viewHolder.total.setText(String.valueOf(items.get(i).getTotal()));
    }
}
