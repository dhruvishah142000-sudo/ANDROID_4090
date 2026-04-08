// REGESTRATION FORM

package com.marwadi.myapplicationmca;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity7 extends AppCompatActivity {

    TextView tv1 ;
    EditText edt1,edt2,edt3,edt4,edt5,edt6;

    Button btn1;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);

        tv1 = findViewById(R.id.tv1);
        edt1 = findViewById(R.id.edt1);
        edt2 = findViewById(R.id.edt2);
        edt3 = findViewById(R.id.edt3);
        edt4 = findViewById(R.id.edt4);
        edt5 = findViewById(R.id.edt5);
        edt6 = findViewById(R.id.edt6);
        btn1 = findViewById(R.id.btn1);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String str1,str2,str3,str4,str5,str6;

                str1 = edt1.getText().toString().trim();
                str2 = edt2.getText().toString().trim();
                str3 = edt3.getText().toString().trim();
                str4 = edt4.getText().toString().trim();
                str5 = edt5.getText().toString().trim();
                str6 = edt6.getText().toString().trim();

                Intent i = new Intent(MainActivity7.this,MainActivity8.class);
                i.putExtra("name",str1);
                i.putExtra("bdate",str2);
                i.putExtra("age",str3);
                i.putExtra("city",str4);
                i.putExtra("mail",str5);
                i.putExtra("contact",str6);
                startActivity(i);
            }
        });
    }
}