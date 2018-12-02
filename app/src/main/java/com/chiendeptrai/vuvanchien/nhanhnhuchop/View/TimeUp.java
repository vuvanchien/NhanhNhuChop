package com.chiendeptrai.vuvanchien.nhanhnhuchop.View;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.chiendeptrai.vuvanchien.nhanhnhuchop.R;

public class TimeUp extends AppCompatActivity {
    private TextView timeup;
    private ImageView imgTimeup;
    private Button btnTimeUp;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_up);
        timeup = findViewById(R.id.timeup);
        imgTimeup = findViewById(R.id.imgTimeup);
        btnTimeUp = findViewById(R.id.btnTimeUp);
        Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/UVNBanhMi.TTF");
        timeup.setTypeface(typeface);
        btnTimeUp.setTypeface(typeface);
        btnTimeUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TimeUp.this, Startscreen.class));
                finish();
            }
        });
    }

    @Override
    public void onBackPressed() {
        finish();
    }
}
