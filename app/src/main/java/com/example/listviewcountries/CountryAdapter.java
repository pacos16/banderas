package com.example.listviewcountries;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;


public class CountryAdapter extends ArrayAdapter {
    private Country[] countries;

    public CountryAdapter(@NonNull Context context,  Country[] countries) {
        super(context, R.layout.listitem_country, countries);
        this.countries = countries;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        convertView= LayoutInflater.from(this.getContext()).inflate(R.layout.listitem_country,null);
        Country country=countries[position];
        TextView tvCountry= (TextView) convertView.findViewById(R.id.tvCountry);
        tvCountry.setText(country.getCountryName());
        TextView tvCapital= (TextView) convertView.findViewById(R.id.tvCapital);
        tvCapital.setText(country.getCountryCapital());
        TextView tvPopulation= (TextView) convertView.findViewById(R.id.tvPopulation);
        tvPopulation.setText(""+country.getCountryPopulation());
        ImageView ivFlag= (ImageView) convertView.findViewById(R.id.ivFlag);
        int id = this.getContext().getResources().getIdentifier("_"+country.getCountryCode().toLowerCase(),
                "drawable", ivFlag.getContext().getPackageName());
        ivFlag.setImageResource(id);
        return convertView;

    }
}
