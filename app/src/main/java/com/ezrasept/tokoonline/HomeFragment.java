package com.ezrasept.tokoonline;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;


public class HomeFragment extends Fragment {


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        GridView androidGridView;

        final String[] merk = {
                "Mobil", "Rumah", "Camera",
                "Alram", "Android", "Mobile",
                "Alram", "Android", "Mobile",

        } ;
        final String[] harga = {
                "Rp. 300.000.000", "Rp. 900.000.000", "3.000.000",
                "Rp. 300.000.000", "Rp. 900.000.000", "3.000.000",
                "Rp. 300.000.000", "Rp. 900.000.000", "3.000.000",

        } ;
        int[] gridViewImageId = {
                R.drawable.ic_directions_car_black_24dp, R.drawable.ic_home_black_24dp, R.drawable.ic_menu_camera,
                R.drawable.ic_directions_car_black_24dp, R.drawable.ic_home_black_24dp, R.drawable.ic_menu_camera,
                R.drawable.ic_directions_car_black_24dp, R.drawable.ic_home_black_24dp, R.drawable.ic_menu_camera,

        };

        CustomGridViewActivity adapterViewAndroid = new CustomGridViewActivity(getActivity(), merk, harga, gridViewImageId);
        androidGridView=(GridView)view.findViewById(R.id.grid_view_image_text);
        androidGridView.setAdapter(adapterViewAndroid);
        androidGridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int i, long id) {
                Toast.makeText(getActivity(), merk[+i]+" bossss...", Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }
}


