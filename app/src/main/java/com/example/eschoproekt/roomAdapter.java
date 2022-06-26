package com.example.eschoproekt;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class roomAdapter extends ArrayAdapter<room> {
    public roomAdapter(Context context, int resource, List<room> list) {
        super(context, resource, list);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        room objectRoom = getItem(position);

        if(convertView==null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.card, parent,false);
        }
        TextView roomName = (TextView) convertView.findViewById(R.id.roomName);
        roomName.setText(objectRoom.getName());
        return convertView;
    }
}
