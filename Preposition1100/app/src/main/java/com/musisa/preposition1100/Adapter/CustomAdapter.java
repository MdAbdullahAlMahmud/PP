package com.musisa.preposition1100.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.musisa.preposition1100.R;

public class CustomAdapter extends BaseAdapter {
    Context context;
    String[] value;
    String[] value1;
    LayoutInflater inflater;


    public CustomAdapter(Context context, String[] value, String[] value1) {
        this.context = context;
        this.value = value;
        this.value1 = value1;
    }

    @Override
    public int getCount() {
        return value.length;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


        if (convertView== null) {
            inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.liststyle, parent, false);
        }

        TextView upper = convertView.findViewById(R.id.upper);
        TextView down = convertView.findViewById(R.id.down);

        upper.setText(value[position]);
        down.setText(value1[position]);

        return convertView;
    }



}

