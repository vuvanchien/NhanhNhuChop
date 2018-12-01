package com.chiendeptrai.vuvanchien.nhanhnhuchop.View;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.chiendeptrai.vuvanchien.nhanhnhuchop.R;

import java.util.Timer;
import java.util.TimerTask;

public class Loadgame extends AppCompatActivity {
    private TextView tvvong;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_load_game);

        tvvong = findViewById(R.id.tvvong);
        Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/UVNBanhMi.TTF");
        tvvong.setTypeface(typeface);
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                startActivity(new Intent(Loadgame.this, RoundOne.class ));
            }
        }, 200);
    }
}
