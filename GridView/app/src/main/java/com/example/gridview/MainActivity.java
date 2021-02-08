package com.example.gridview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {

    private GridView gridView;
    private String[] countryNames;
    private int[] flags = {R.drawable.afghanistan, R.drawable.armenia, R.drawable.azerbaijan, R.drawable.bahrain,
            R.drawable.bangladesh, R.drawable.bhutan, R.drawable.china, R.drawable.india,
            R.drawable.japan, R.drawable.nepal, R.drawable.pakistan, R.drawable.srilanka};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gridView = findViewById(R.id.gridviewId);

        countryNames = getResources().getStringArray(R.array.country_names);

        GridViewAdapter adapter = new GridViewAdapter(this, countryNames, flags);
        gridView.setAdapter(adapter);
    }
}