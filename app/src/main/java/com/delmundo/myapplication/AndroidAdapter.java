package com.delmundo.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class AndroidAdapter extends ArrayAdapter<AndroidVer> {
    private Context context;
    private int resources;

    public AndroidAdapter(Context context, int resources, List<AndroidVer> objects) {
        super(context,resources,objects);
        this.context = context;
        this.resources = resources;


    }


    @NonNull
    @Override
    public View getView(int i, @Nullable View convertView, @NonNull ViewGroup parent) {

        int logo = getItem(i).getLogo();
        String name = getItem(i).getName();
        String country = getItem(i).getCountry();
        String industry = getItem(i).getIndustry();
        String CEO = getItem(i).getCEO();

        LayoutInflater inflater = LayoutInflater.from(context);
        convertView = inflater.inflate(resources, parent, false);

        ImageView img = convertView.findViewById(R.id.imageView);
        TextView companyName = convertView.findViewById(R.id.CompanyName);
        TextView cCountry = convertView.findViewById(R.id.Country);
        TextView cIndustry = convertView.findViewById(R.id.Industry);
        TextView cCEO = convertView.findViewById(R.id.CEO);

        img.setImageResource(logo);
        companyName.setText(name);
        cCountry.setText("Country: " + country);
        cIndustry.setText("Industry: " + industry);
        cCEO.setText("CEO: " + CEO);
        return convertView;
    }
}
