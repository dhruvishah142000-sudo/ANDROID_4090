//Demonstrate WebView.

package com.marwadi.myapplicationmca;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity9 extends AppCompatActivity {

    EditText edt1;
    Button btn1;
    WebView wv1;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);

        edt1 = findViewById(R.id.edt1);
        btn1 = findViewById(R.id.btn1);
        wv1 = findViewById(R.id.wv1);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Openurl;

                Openurl = "https://www."+edt1.getText().toString()+".com";

                WebSettings webSettings = wv1.getSettings();
                webSettings.setJavaScriptEnabled(true);
                wv1.setWebViewClient(new WebViewClient());
                wv1.loadUrl(Openurl);


            }
        });

    }
}