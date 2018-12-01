package com.chiendeptrai.vuvanchien.nhanhnhuchop.View;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.chiendeptrai.vuvanchien.nhanhnhuchop.R;

public class GameWon extends AppCompatActivity {
    private Button btntieptucchoicm;
    private TextView textView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_won);
        btntieptucchoicm = findViewById(R.id.btntieptucchoiCm);
        textView = findViewById(R.id.tvchucmung);
        Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/UVNBanhMi.TTF");
        btntieptucchoicm.setTypeface(typeface);
        textView.setTypeface(typeface);
        btntieptucchoicm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(GameWon.this, Overcome.class));
                textView.setText("Vòng 2");
            }
        });

    }

    @Override
    public void onBackPressed() {
        finish();
    }
}
