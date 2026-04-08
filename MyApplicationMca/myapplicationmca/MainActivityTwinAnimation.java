package com.marwadi.myapplicationmca;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivityTwinAnimation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_twin_animation);

        TextView txt1 = findViewById(R.id.txt1);
        Button alpha = findViewById(R.id.alpha);
        Button rotate = findViewById(R.id.rotate);
        Button scale = findViewById(R.id.scale);
        Button translate = findViewById(R.id.translate);

        alpha.setOnClickListener(v -> {
            Animation animation = AnimationUtils.loadAnimation(this,R.anim.alpha);
            txt1.startAnimation(animation);
        });

        rotate.setOnClickListener(v -> {
            Animation animation = AnimationUtils.loadAnimation(this,R.anim.rotate);
            txt1.startAnimation(animation);
        });

        scale.setOnClickListener(v -> {
            Animation animation = AnimationUtils.loadAnimation(this,R.anim.scale);
            txt1.startAnimation(animation);
        });

        translate.setOnClickListener(v -> {
            Animation animation = AnimationUtils.loadAnimation(this,R.anim.translate);
            txt1.startAnimation(animation);
        });

    }
}