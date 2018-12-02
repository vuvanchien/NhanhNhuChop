package com.chiendeptrai.vuvanchien.nhanhnhuchop.View;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.chiendeptrai.vuvanchien.nhanhnhuchop.R;

import java.util.Timer;
import java.util.TimerTask;

public class LoandGame2 extends AppCompatActivity {
    private TextView tvvong2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loand_game2);
        tvvong2 = findViewById(R.id.tvvong2);

        Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/UVNBanhMi.TTF");
        tvvong2.setTypeface(typeface);
    Timer timer = new Timer();
        timer.schedule(new TimerTask() {
        @Override
        public void run() {
            startActivity(new Intent(LoandGame2.this, RoundTwo.class ));
        }
    }, 2000);
}
    }

