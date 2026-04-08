package com.marwadi.myapplicationmca;

import android.content.SharedPreferences;
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

public class MainActivity_sqlitedemo extends AppCompatActivity {

    EditText editText;
    Button save,load;
    TextView textView;

    DBHelper dbHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main_sqlitedemo);

        editText = findViewById(R.id.edtext);
        save = findViewById(R.id.btnsave);
        load = findViewById(R.id.btnshow);
        textView = findViewById(R.id.result);
        dbHelper = new DBHelper(this);

        // Save Data
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = editText.getText().toString().trim();
                dbHelper.insertData(name);
                textView.setText("Data Saved in DB..");
            }
        });

        //Load Data
        load.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String data = dbHelper.getData();
                textView.setText(data);
            }
        });
    }
}