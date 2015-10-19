package com.example.squid.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.squareup.picasso.Downloader;

/**
 * Created by squid on 10/19/2015.
 */
public class CustomAdapter extends BaseAdapter {

    private Context mContext;
    private LayoutInflater inflater;
    private List<Response.foodentity> item

    public CustomAdapter(List<Response.foodentity> item, Context mContext) {
        this.item = item;
        this.mContext = mContext;
    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return item.get(position)
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return null;
    }
}
