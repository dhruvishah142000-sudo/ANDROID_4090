//INFORMATION FORM

package com.marwadi.myapplicationmca;

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

public class MainActivity3 extends AppCompatActivity {

    EditText edt1,edt2,edt3,edt4,edt5;
    Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        edt1 = findViewById(R.id.edt1);
        edt2 = findViewById(R.id.edt2);
        edt3 = findViewById(R.id.edt3);
        edt4 = findViewById(R.id.edt4);
        edt5 = findViewById(R.id.edt5);
        btn1 = findViewById(R.id.btn1);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str,str1,str2,str3,str4;

                str = edt1.getText().toString().trim();
                str1 = edt2.getText().toString().trim();
                str2 = edt3.getText().toString().trim();
                str3 = edt4.getText().toString().trim();
                str4 = edt5.getText().toString().trim();
                //Toast.makeText(getApplicationContext(),str,Toast.LENGTH_LONG).show();

                Intent i = new Intent(MainActivity3.this, MainActivity4.class);
                i.putExtra("fname",str);
                i.putExtra("lname",str1);
                i.putExtra("mno",str2);
                i.putExtra("mail",str3);
                i.putExtra("pwd",str4);
                startActivity(i);
            }
        });





    }
}