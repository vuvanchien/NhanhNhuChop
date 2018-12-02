package com.chiendeptrai.vuvanchien.nhanhnhuchop.View;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.TransitionManager;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.chiendeptrai.vuvanchien.nhanhnhuchop.R;

import java.util.Timer;
import java.util.TimerTask;

public class AnimationBlink extends AppCompatActivity {
    private RelativeLayout transitionsContainer;
    private ImageView imgLogo;
    private TextView tvVuiVe;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation_blink);
        imgLogo = findViewById(R.id.imgLogo);
        tvVuiVe = findViewById(R.id.tvVuiVe);

        Animation animation = AnimationUtils.loadAnimation(this, R.anim.blink);
        imgLogo.startAnimation(animation);
        tvVuiVe.startAnimation(animation);
        Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/UVNBanhMi.TTF");
        tvVuiVe.setTypeface(typeface);
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                startActivity(new Intent(AnimationBlink.this, RoundOne.class ));
            }
        }, 3000);
    }

    }

