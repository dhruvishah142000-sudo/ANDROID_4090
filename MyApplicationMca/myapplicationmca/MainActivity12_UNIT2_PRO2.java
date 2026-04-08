package com.marwadi.myapplicationmca;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity12_UNIT2_PRO2 extends AppCompatActivity {

    EditText edt1,edt2;
    Button btn1;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity12_unit2_pro2);

        edt1 = findViewById(R.id.edt1);
        edt2 = findViewById(R.id.edt2);
        btn1 = findViewById(R.id.btn1);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String uname = edt1.getText().toString().trim();
                String pwd = edt2.getText().toString().trim();

                if(uname.equals("Dhruvi") && pwd.equals("3007"))
                {
                    Intent i = new Intent(MainActivity12_UNIT2_PRO2.this, MainActivity13_UNIT2_PRO2.class);
                    i.putExtra("USERNAME",uname);
                    i.putExtra("Password",pwd);
                    startActivity(i);
                }
                else{
                    Toast.makeText(MainActivity12_UNIT2_PRO2.this, "Login Failed Try Again...", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}