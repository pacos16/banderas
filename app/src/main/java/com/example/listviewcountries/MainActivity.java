package com.example.listviewcountries;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private CountryParser countryParser;
    private CountryAdapter countryAdapter;
    private Country[] countries;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        countryParser=new CountryParser(this);
        countryParser.parse();
        countries=countryParser.getCountries();
        countryAdapter=new CountryAdapter(this,countries);
    }
}
