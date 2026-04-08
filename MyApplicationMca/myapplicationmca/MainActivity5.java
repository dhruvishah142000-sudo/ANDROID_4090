// LISTVIEW , SPINNER

package com.marwadi.myapplicationmca;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity5 extends AppCompatActivity {

    ListView lst1;
    Spinner spn1;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        lst1 = findViewById(R.id.lst1);
        spn1 = findViewById(R.id.spn1);

        //Array
        String name[] = {"Dhruvi","Rutvi","Palak","Arti","Vidhi"};
        ArrayAdapter ad = new ArrayAdapter(this,android.R.layout.simple_list_item_1,name);
        lst1.setAdapter(ad);

        //Spinner
        ArrayAdapter<String> sa = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, name);
        sa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spn1.setAdapter(sa);

        // on click any element it returns in a toast

        lst1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String str = name[i];
                Toast.makeText(getApplicationContext(),str,Toast.LENGTH_LONG).show();
            }
        });

        spn1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String str = name[i];
                Toast.makeText(getApplicationContext(), str, Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                // Optional: handle case when nothing is selected
            }
        });


    }
}