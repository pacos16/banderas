package com.example.listviewcountries;


import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

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
        return super.getView(position, convertView, parent);


    }
}
