// AUTO COMPLETE TEXT VIEW

package com.marwadi.myapplicationmca;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity6 extends AppCompatActivity {

    AutoCompleteTextView actv;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        actv = findViewById(R.id.actv);

        String[] CountryNameList = {"INDIA","CHINA","KANADA","AUSTRALIA","US"};

        AutoCompleteTextView tv = findViewById(R.id.actv);
        ArrayAdapter ad = new ArrayAdapter(this, android.R.layout.simple_list_item_1,CountryNameList);
        tv.setAdapter(ad);



    }
}