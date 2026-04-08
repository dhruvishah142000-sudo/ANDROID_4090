// Create an application to call specific entered number by user in the Edit Text.

package com.marwadi.myapplicationmca;

import android.content.Intent;
import android.Manifest;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.content.pm.PackageManager;
import android.net.Uri;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity14_UNIT2_PRO3 extends AppCompatActivity {

    EditText edt1;
    Button buttonCall;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity14_unit2_pro3);

        edt1 = findViewById(R.id.edt1);
        buttonCall = findViewById(R.id.buttonCall);

        buttonCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String number = edt1.getText().toString().trim();
                if (!number.isEmpty())
                { Intent intent = new Intent(Intent.ACTION_CALL);
                    intent.setData(Uri.parse("tel:" + number));
                    if (ActivityCompat.checkSelfPermission(MainActivity14_UNIT2_PRO3.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED)
                    {
                        ActivityCompat.requestPermissions(MainActivity14_UNIT2_PRO3.this, new String[]
                                {
                                        Manifest.permission.CALL_PHONE}, 1);
                                        return;
                                }
                    startActivity(intent);
                }
                else
                {
                    Toast.makeText(MainActivity14_UNIT2_PRO3.this, "Please enter a number", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}