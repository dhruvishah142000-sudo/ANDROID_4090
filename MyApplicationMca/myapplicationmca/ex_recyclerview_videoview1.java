package com.marwadi.myapplicationmca;

import android.annotation.SuppressLint;
import android.net.Uri;
import android.os.Bundle;
import android.widget.VideoView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ex_recyclerview_videoview1 extends AppCompatActivity {


    VideoView v;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex_recyclerview_videoview1);

        v = findViewById(R.id.videoView);

        int index = getIntent().getIntExtra("video_index", 0);

        // Example: same video for all OR you can change based on index
        Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.funny);

        v.setVideoURI(uri);
        v.start();
    }
}
