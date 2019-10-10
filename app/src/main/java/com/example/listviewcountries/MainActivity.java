package com.example.listviewcountries;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    private CountryParser countryParser;
    private CountryAdapter countryAdapter;
    private Country[] countries;
    private ListView lvMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvMain= findViewById(R.id.lvMain);
        countryParser=new CountryParser(this);
        countryParser.parse();
        countries=countryParser.getCountries();
        countryAdapter=new CountryAdapter(this,countries);

        lvMain.setAdapter(countryAdapter);
    }
}
