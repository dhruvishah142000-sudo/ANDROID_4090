package com.marwadi.myapplicationmca;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity13_UNIT2_PRO2 extends AppCompatActivity {

    TextView tv1,tv2;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity13_unit2_pro2);

        tv1 = findViewById(R.id.tv1);
        tv2 = findViewById(R.id.tv2);

        String str,str1;
        str = getIntent().getStringExtra("USERNAME");
        str1 = getIntent().getStringExtra("Password");

        tv1.setText(str);
        tv2.setText(str1);

    }
}