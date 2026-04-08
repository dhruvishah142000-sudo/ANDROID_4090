package com.marwadi.myapplicationmca;

import android.annotation.SuppressLint;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity_videoview extends AppCompatActivity {

     Button btnvideo;
     VideoView v;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_videoview);

        v = findViewById(R.id.v);
        btnvideo = findViewById(R.id.btnvideo);

        btnvideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri localuri = Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.funny);
                v.setVideoURI(localuri);
                v.start();
            }
        });

        /*btnvideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri local = Uri.parse(("https://rr2---sn-pni5ooxunva-g5wz.googlevideo.com/videoplayback?expire=1773851330&ei=Yn66adaJJIW0ir4PsaDQwAo&ip=104.253.48.244&id=o-AAZ99FITpEb6-262bElYpzqYtdrvGgSDFNN_xCnPYMDJ&itag=18&source=youtube&requiressl=yes&xpc=EgVo2aDSNQ%3D%3D&rms=au%2Cau&bui=AVNa5-xGBkQz8gJ4HLkyJkB88XH1eq6PZDmrWyLaP-MtlfY-j9RXqbvJUAO7ckRKXt7It9PhZEtdxKgf&spc=6dlaFCw4vcB0lxCeEYWsSZ354eeML1o4Zp-YR-PIwK4hVam3XVu0SgoThHtjzZHfWTo&vprv=1&svpuc=1&mime=video%2Fmp4&rqh=1&gir=yes&clen=969920&ratebypass=yes&dur=12.992&lmt=1761041382837814&fexp=51565116,51565681,51791334&c=ANDROID&txp=6300224&sparams=expire%2Cei%2Cip%2Cid%2Citag%2Csource%2Crequiressl%2Cxpc%2Cbui%2Cspc%2Cvprv%2Csvpuc%2Cmime%2Crqh%2Cgir%2Cclen%2Cratebypass%2Cdur%2Clmt&sig=AHEqNM4wRQIgGn4F1db05vsr-SWPlTIslfTqdobZEtF5t-sTeEuBsSMCIQDQctLgpvefA07ShITq2GWcGFmzqTQjwnPbD0MoTfDARw%3D%3D&redirect_counter=1&rm=sn-tt1l676&rrc=104&req_id=77396aaf819aa3ee&cms_redirect=yes&cps=164&ipbypass=yes&met=1773829734,&mh=KQ&mip=119.160.199.91&mm=31&mn=sn-pni5ooxunva-g5wz&ms=au&mt=1773829251&mv=m&mvi=2&pl=24&lsparams=cps,ipbypass,met,mh,mip,mm,mn,ms,mv,mvi,pl,rms&lsig=APaTxxMwRQIhAJcSzWVz-yagyWxouJXObkStY_1Wb3WGVF3u3qNSM5efAiAtBspkY3pVWOWUDf0rNLQxFxc7GobSBuB2Rn3boCAu5w%3D%3D"));
                v.setVideoURI(local);
                v.start();


            }
        });*/

    }
}