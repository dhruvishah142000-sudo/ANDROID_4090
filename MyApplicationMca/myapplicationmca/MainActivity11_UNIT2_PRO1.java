package com.marwadi.myapplicationmca;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity11_UNIT2_PRO1 extends AppCompatActivity {
    TextView tv1;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity11_unit2_pro1);

        tv1 = findViewById(R.id.tv1);
        String uname = getIntent().getStringExtra("USERNAME");
        tv1.setText("WELCOME " + uname + "!!");
    }
}