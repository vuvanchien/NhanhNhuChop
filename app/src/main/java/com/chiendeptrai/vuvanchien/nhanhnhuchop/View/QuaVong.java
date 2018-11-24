package com.chiendeptrai.vuvanchien.nhanhnhuchop.View;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import com.chiendeptrai.vuvanchien.nhanhnhuchop.R;

public class QuaVong extends AppCompatActivity {
    private Button platygaianbutton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qua_vong);
        platygaianbutton = findViewById(R.id.platygaianbutton);
        Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/UVNBanhMi.TTF");
        platygaianbutton.setTypeface(typeface);
        startActivity(new Intent(QuaVong.this, Vong2.class));
    }

    @Override
    public void onBackPressed() {
        finish();
    }
}
