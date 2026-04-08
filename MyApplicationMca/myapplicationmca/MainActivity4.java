// SHOW DATA OF INFORMATION FORM

package com.marwadi.myapplicationmca;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity4 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        TextView tv = findViewById(R.id.tv1);
        TextView tv2 = findViewById(R.id.tv2);
        TextView tv3 = findViewById(R.id.tv3);
        TextView tv4 = findViewById(R.id.tv4);
        TextView tv5 = findViewById(R.id.tv5);

        String str,str1,str2,str3,str4;
        str = getIntent().getStringExtra("fname");
        str1 = getIntent().getStringExtra("lname");
        str2 = getIntent().getStringExtra("mno");
        str3 = getIntent().getStringExtra("mail");
        str4 = getIntent().getStringExtra("pwd");

        tv.setText(str);
        tv2.setText(str1);
        tv3.setText(str2);
        tv4.setText(str3);
        tv5.setText(str4);
    }
}