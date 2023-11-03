package com.example.rpgjjbo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class ClasesArrayAdapter extends ArrayAdapter<EnumClassType> {
    private int itemLayout;

    private int dropdownItemLayout;
    private EnumClassType[] clases;

    private Context context;
    public ClasesArrayAdapter(@NonNull Context context, int resource, @NonNull EnumClassType[] clases) {
        super(context, resource, clases);
        itemLayout =resource;
        this.clases=clases;
        this.context=context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflador= LayoutInflater.from(context);
        View vFila = inflador.inflate(itemLayout,parent,false);
        ((TextView)vFila.findViewById(R.id.nombre)).setText(clases[position].getNombre());
        return vFila;
    }

    @Override
    public View getDropDownView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflador= LayoutInflater.from(context);
        View vFila = inflador.inflate(dropdownItemLayout,parent,false);
        ((TextView)vFila.findViewById(R.id.nombre)).setText(clases[position].getNombre());
        return vFila;
    }

    @Override
    public void setDropDownViewResource(int resource) {
        this.dropdownItemLayout =resource;
    }
}
