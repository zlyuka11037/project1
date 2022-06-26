package com.example.eschoproekt;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.GridView;

import java.util.ArrayList;


public class fragment1 extends Fragment {

    GridView gridView;
    ArrayList<room> roomList = new ArrayList<room>();
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";


    private String mParam1;
    private String mParam2;

    public fragment1() {

    }


    public static fragment1 newInstance(String param1, String param2) {
        fragment1 fragment = new fragment1();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_fragment1, container, false);
        gridView = view.findViewById(R.id.gridView);
        room kitchen = new room("kitchen");
        roomList.add(kitchen);
        room garage = new room("garage");
        roomList.add(garage);
        room tv = new room("tv");
        roomList.add(tv);
        room kidroom = new room("kid room");
        roomList.add(kidroom);
        roomAdapter adapter = new roomAdapter(getContext(), 0, roomList);
        gridView.setAdapter(adapter);
        return view;
    }
}