package com.chiendeptrai.vuvanchien.nhanhnhuchop.View;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.chiendeptrai.vuvanchien.nhanhnhuchop.R;

import java.util.Timer;
import java.util.TimerTask;

public class HuongDanChoi extends AppCompatActivity {
private TextView tvhuongdan1;
private Button btnChoingay1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_huong_dan_choi);
        tvhuongdan1 = findViewById(R.id.tvhuongdan);
        btnChoingay1 = findViewById(R.id.btnchoingay1);
        Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/UVNBanhMi.TTF");
        tvhuongdan1.setTypeface(typeface);
        btnChoingay1.setTypeface(typeface);

        btnChoingay1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                        startActivity(new Intent(HuongDanChoi.this, Vong1.class));

            }
        });

    }
}
