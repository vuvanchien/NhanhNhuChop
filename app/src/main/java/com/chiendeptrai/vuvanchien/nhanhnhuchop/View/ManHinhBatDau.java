package com.chiendeptrai.vuvanchien.nhanhnhuchop.View;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

import com.chiendeptrai.vuvanchien.nhanhnhuchop.R;

public class ManHinhBatDau extends AppCompatActivity {
Button btnBatDau;
    private Button btnthoat;
MediaPlayer nhacnen = new MediaPlayer();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_man_hinh_bat_dau);
        btnBatDau = findViewById(R.id.btnbatdau);
        btnthoat = findViewById(R.id.btnthoat);
        nhacnen = MediaPlayer.create(this, R.raw.backgroutmp3);
        nhacnen.start();
        Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/UVNBanhMi.TTF");
        btnBatDau.setTypeface(typeface);
        btnthoat.setTypeface(typeface);
        btnBatDau.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ManHinhBatDau.this, HuongDanChoi.class));
            }
        });
        btnthoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Exitdialog();
            }
        });
    }
    private void Exitdialog(){
        final Dialog dialog = new Dialog(ManHinhBatDau.this);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.dialoghome);
        dialog.show();
        TextView tvtextthoat;
         Button btnTiepTuc;
         Button btnMenu;

        tvtextthoat = dialog.findViewById(R.id.tvtextthoat);
        btnTiepTuc = dialog.findViewById(R.id.btnTiepTuc);
        btnMenu = dialog.findViewById(R.id.btnMenu);

       tvtextthoat.setText("Bạn có muốn thoát không ???");
        btnMenu.setText("Thoát");

        Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/UVNBanhMi.TTF");
        tvtextthoat.setTypeface(typeface);
        btnTiepTuc.setTypeface(typeface);
        btnMenu.setTypeface(typeface);
        btnMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ManHinhBatDau.class);
                startActivity(intent);
                Intent startMain = new Intent(Intent.ACTION_MAIN);
                startMain.addCategory(Intent.CATEGORY_HOME);
                startActivity(startMain);
                finish();
            }
        });
        btnTiepTuc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
            }
        });


    }
}
