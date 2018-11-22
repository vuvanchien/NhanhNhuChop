package com.chiendeptrai.vuvanchien.nhanhnhuchop.View;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.chiendeptrai.vuvanchien.nhanhnhuchop.R;

public class HuongDanchoiVong2 extends AppCompatActivity {
    private TextView tvhuongdanvong2;
    private Button btnchoingay2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_huong_danchoi_vong2);


    }
    private void intit(){
        tvhuongdanvong2 = findViewById(R.id.tvhuongdanvong2);
        btnchoingay2 = findViewById(R.id.btnchoingay2);
        Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/UVNBanhMi.TTF");
        tvhuongdanvong2.setTypeface(typeface);
        btnchoingay2.setTypeface(typeface);
        btnchoingay2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HuongDanchoiVong2.this, Vong2.class));
            }
        });
    }
}
