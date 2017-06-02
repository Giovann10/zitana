package com.greenfoxacademy.p2pchat;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;


public class MessageAdapter extends ArrayAdapter<Message> {

    public MessageAdapter(Context context) {
        super(context, 0);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Message current = getItem(position);
        convertView = LayoutInflater.from(getContext()).inflate(R.layout.message, parent, false);
        return super.getView(position, convertView, parent);
    }
}
