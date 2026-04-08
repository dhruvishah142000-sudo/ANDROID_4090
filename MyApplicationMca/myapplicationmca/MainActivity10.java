
// CALCULATOR

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

public class MainActivity10 extends AppCompatActivity {

    EditText edt1,edt2;
    Button btn1;
    TextView tv1;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main10);

        edt1 = findViewById(R.id.edt1);
        edt2 = findViewById(R.id.edt2);
        btn1 = findViewById(R.id.btn1);
        tv1 = findViewById(R.id.tv1);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer a,b;

                a = Integer.parseInt(edt1.getText().toString().trim());
                b = Integer.parseInt(edt2.getText().toString().trim());

                int sum = a+b;
                int sub = a-b;
                int mul = a*b;
                float div = a/b;

                String result = "\n Addition is : "+ sum + "\n Subtraction is : "+ sub +"\n Multiplication is : "+ mul +"\n Division is : "+ div ;

                tv1.setText(result);


            }
        });
    }
}