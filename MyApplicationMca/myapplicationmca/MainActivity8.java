package com.marwadi.myapplicationmca;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);

        TextView txt1 = findViewById(R.id.txt1);
        TextView txt2 = findViewById(R.id.txt2);
        TextView txt3 = findViewById(R.id.txt3);
        TextView txt4 = findViewById(R.id.txt4);
        TextView txt5 = findViewById(R.id.txt5);
        TextView txt6 = findViewById(R.id.txt6);

        String str1,str2,str3,str4,str5,str6;
        str1= getIntent().getStringExtra("name");
        str2 = getIntent().getStringExtra("bdate");
        str3 = getIntent().getStringExtra("age");
        str4 = getIntent().getStringExtra("city");
        str5 = getIntent().getStringExtra("mail");
        str6 = getIntent().getStringExtra("contact");


        txt1.setText(str1);
        txt2.setText(str2);
        txt3.setText(str3);
        txt4.setText(str4);
        txt4.setText(str4);
        txt4.setText(str4);


    }
}