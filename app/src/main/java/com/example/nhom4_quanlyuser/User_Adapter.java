package com.example.nhom4_quanlyuser;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class User_Adapter extends ArrayAdapter {
    Context context;
    int resource;
    ArrayList<UserModel> data;
    private TextView id, name, url;
    private ImageView hinh;
    private String link;

    public User_Adapter(@NonNull Context context, int resource, ArrayList<UserModel> data) {
        super(context, resource, data);
        this.context = context;
        this.resource = resource;
        this.data = data;
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        convertView = LayoutInflater.from(context).inflate(resource, null);
        id = convertView.findViewById(R.id.id);
        name = convertView.findViewById(R.id.ten);
        hinh = convertView.findViewById(R.id.anh);
        url = convertView.findViewById(R.id.link);

        UserModel user = data.get(position);
        link = user.getAvatar_url();
        id.setText(user.getId());
        name.setText(user.getLogin());
        Picasso.get()
                .load(link)
                .into(hinh);
        url.setText(user.getUrl());
        return convertView;
    }


}
