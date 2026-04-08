package com.marwadi.myapplicationmca;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity_sharepreference extends AppCompatActivity {

    EditText edtext;
    Button btnsave,btnshow;
    TextView txtdisplay;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main_sharepreference);

        edtext = findViewById(R.id.edtext);
        btnsave = findViewById(R.id.btnsave);
        btnshow = findViewById(R.id.btnshow);
        txtdisplay = findViewById(R.id.txtdisplay);

        btnsave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = edtext.getText().toString();
                SharedPreferences sp = getSharedPreferences("Mypref",MODE_PRIVATE);
                SharedPreferences.Editor editor = sp.edit();
                editor.putString("username",name);
                editor.apply();
                Toast.makeText(getApplicationContext(), "Name Saved !!", Toast.LENGTH_SHORT).show();
                txtdisplay.setText(name);
            }
        });

        btnshow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences sp = getSharedPreferences("Mypref",MODE_PRIVATE);
                String savedName = sp.getString("username","No Data");
                Toast.makeText(getApplicationContext(), "Saved Name : "+savedName, Toast.LENGTH_SHORT).show();
                txtdisplay.setText(savedName);
            }
        });

    }
}