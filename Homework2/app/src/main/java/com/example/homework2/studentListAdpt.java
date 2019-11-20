package com.example.homework2;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

public class studentListAdpt extends BaseAdapter {


    @Override
    public int getCount() {
        return database.getInstance().getStudentList().size();
    }

    @Override
    public Object getItem(int position) {
        return database.getInstance().getStudentList().get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return null;
    }
}
