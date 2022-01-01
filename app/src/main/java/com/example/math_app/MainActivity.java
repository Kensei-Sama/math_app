package com.example.math_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {

    String[] classes = {"Material","Design","Components","Android","5.0 Lollipop"};

    AutoCompleteTextView autoCompleteTextView7;

    ArrayAdapter<String> adapterItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        autoCompleteTextView7 = findViewById(R.id.autoCompleteTextView7);

        adapterItems = new ArrayAdapter<String>(this,R.layout.dropdownitem,classes);

        autoCompleteTextView7.setAdapter(adapterItems);

        autoCompleteTextView7.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

            }
        });
    }
}