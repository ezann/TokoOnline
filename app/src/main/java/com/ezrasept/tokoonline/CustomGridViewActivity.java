package com.ezrasept.tokoonline;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

class CustomGridViewActivity extends BaseAdapter {

    private Context mContext;
    private final String[] merk;
    private final String[] harga;
    private final int[] gridViewImageId;

    public CustomGridViewActivity(Context context, String[] merk, String[] harga,int[] gridViewImageId) {
        mContext = context;
        this.gridViewImageId = gridViewImageId;
        this.merk = merk;
        this.harga = harga;
    }

    @Override
    public int getCount() {
        return merk.length;
    }
    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup parent) {
        View gridViewAndroid;
        LayoutInflater inflater = (LayoutInflater) mContext
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if (convertView == null) {

            gridViewAndroid = new View(mContext);
            gridViewAndroid = inflater.inflate(R.layout.content_home, null);
            TextView Merk = (TextView) gridViewAndroid.findViewById(R.id.android_gridview_merk_home);
            TextView Harga = (TextView) gridViewAndroid.findViewById(R.id.android_gridview_harga_home);
            ImageView imageViewAndroid = (ImageView) gridViewAndroid.findViewById(R.id.android_gridview_image_home);
            Merk.setText(merk[i]);
            Harga.setText(harga[i]);
            imageViewAndroid.setImageResource(gridViewImageId[i]);
        } else {
            gridViewAndroid = (View) convertView;
        }

        return gridViewAndroid;
    }
}