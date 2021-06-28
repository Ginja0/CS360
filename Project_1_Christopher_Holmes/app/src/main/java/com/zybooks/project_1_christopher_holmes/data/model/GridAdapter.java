package com.zybooks.project_1_christopher_holmes.data.model;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

public class GridAdapter extends BaseAdapter {


    Context context;
    private final String [] values;
    View view;
    LayoutInflater layoutInflater;

    public GridAdapter(String[] values) {
        this.values = values;
    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATOR_SERVICE);
        if(convertView == null){
            view = new View(context);
            view = layoutInflater.inflate
        }
    }
}
