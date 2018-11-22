package com.chiendeptrai.vuvanchien.nhanhnhuchop.View;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import com.chiendeptrai.vuvanchien.nhanhnhuchop.R;

public class Vong1 extends AppCompatActivity {
    private FrameLayout Framediem;
    private TextView tvdiem;
    private TextView tvdiemso;
    private TextView tvTroGiup;
    private TextView tvThem30s;
    private TextView tv100d;
    private FrameLayout frame100diem;
    private TextView tvdiem100;
    private TextView tv50d;
    private FrameLayout frame50diem;
    private TextView tvdiem50;
    private FrameLayout btnXemthem30s;
    private TextView tvDoiCauhoi;
    private FrameLayout btnDoiCauhoi;
    private ImageView imgHome;
    private ImageView imgVolume;
    private TextView tvCauhoi;
    private Button btnluachon;
    private FrameLayout FrameLayoutDapAnA;
    private TextView tvDapAnA;
    private FrameLayout FrameLayoutDapAnB;
    private TextView tvDapAnB;
    private FrameLayout FrameLayoutDapAnC;
    private TextView tvDapAnC;
    private FrameLayout FrameLayoutDapAnD;
    private TextView tvDapAnD;
    private ImageView score10;
    private TextView tvo10;
    private ImageView score9;
    private TextView tvo9;
    private ImageView score8;
    private TextView tvo8;
    private ImageView score7;
    private TextView tvo7;
    private ImageView score6;
    private TextView tvo6;
    private ImageView score5;
    private TextView tvo5;
    private ImageView score4;
    private TextView tvo4;
    private ImageView score3;
    private TextView tvo3;
    private ImageView score2;
    private TextView tvo2;
    private ImageView score1;
    private TextView tvo1;
    private TextView tvCautraLoi;
    private TextView tvThoiGian;
    private TextView tvXem100;
    private TextView tvXem50;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vong1);
        khaibao();
        imgHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ReturnMenu();
            }
        });

    }

    private void khaibao() {
        Framediem = findViewById(R.id.Framediem);
        tvdiem = findViewById(R.id.tvdiem);
        tv100d = findViewById(R.id.tv100d);
        tvdiem100 = findViewById(R.id.tvdiem100);
        frame50diem = findViewById(R.id.frame50diem);
        tv50d = findViewById(R.id.tv50d);
        tvdiem50 = findViewById(R.id.tvdiem50);
        frame100diem = findViewById(R.id.frame100diem);
        tvdiemso = findViewById(R.id.tvdiemso);
        tvTroGiup = findViewById(R.id.tvTroGiup);
        tvThem30s = findViewById(R.id.tvThem30s);
        btnXemthem30s = findViewById(R.id.btnXemthem30s);
        tvDoiCauhoi = findViewById(R.id.tvDoiCauhoi);
        btnDoiCauhoi = findViewById(R.id.btnDoiCauhoi);
        imgHome = findViewById(R.id.imgHome);
        imgVolume = findViewById(R.id.imgVolume);
        tvCauhoi = findViewById(R.id.tvCauhoi);
        btnluachon = findViewById(R.id.btnluachon);
        FrameLayoutDapAnA = findViewById(R.id.FrameLayout_DapAnA);
        tvDapAnA = findViewById(R.id.tvDapAn_A);
        FrameLayoutDapAnB = findViewById(R.id.FrameLayout_DapAnB);
        tvDapAnB = findViewById(R.id.tvDapAn_B);
        FrameLayoutDapAnC = findViewById(R.id.FrameLayout_DapAnC);
        tvDapAnC = findViewById(R.id.tvDapAn_C);
        FrameLayoutDapAnD = findViewById(R.id.FrameLayout_DapAnD);
        tvDapAnD = findViewById(R.id.tvDapAn_D);
        score10 = findViewById(R.id.score10);
        tvo10 = findViewById(R.id.tvo10);
        score9 = findViewById(R.id.score9);
        tvo9 = findViewById(R.id.tvo9);
        score8 = findViewById(R.id.score8);
        tvo8 = findViewById(R.id.tvo8);
        score7 = findViewById(R.id.score7);
        tvo7 = findViewById(R.id.tvo7);
        score6 = findViewById(R.id.score6);
        tvo6 = findViewById(R.id.tvo6);
        score5 = findViewById(R.id.score5);
        tvo5 = findViewById(R.id.tvo5);
        score4 = findViewById(R.id.score4);
        tvo4 = findViewById(R.id.tvo4);
        score3 = findViewById(R.id.score3);
        tvo3 = findViewById(R.id.tvo3);
        score2 = findViewById(R.id.score2);
        tvo2 = findViewById(R.id.tvo2);
        score1 = findViewById(R.id.score1);
        tvo1 = findViewById(R.id.tvo1);
        tvCautraLoi = findViewById(R.id.tvCauTraloi);
        tvThoiGian = findViewById(R.id.tvthoigian);
        tvXem50 = findViewById(R.id.Xem50s);
        tvXem100 = findViewById(R.id.tvxem100);


        Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/UVNBanhMi.TTF");
        tvCauhoi.setTypeface(typeface);
        tvDapAnA.setTypeface(typeface);
        tvDapAnB.setTypeface(typeface);
        tvDapAnC.setTypeface(typeface);
        tvDapAnD.setTypeface(typeface);
        tvdiem.setTypeface(typeface);
        tvdiemso.setTypeface(typeface);
        tvDoiCauhoi.setTypeface(typeface);
        tvo1.setTypeface(typeface);
        tvo2.setTypeface(typeface);
        tvo3.setTypeface(typeface);
        tvo4.setTypeface(typeface);
        tvo5.setTypeface(typeface);
        tvo6.setTypeface(typeface);
        tvo7.setTypeface(typeface);
        tvo8.setTypeface(typeface);
        tvo9.setTypeface(typeface);
        tvo10.setTypeface(typeface);
        tvThem30s.setTypeface(typeface);
        tvTroGiup.setTypeface(typeface);
        tvThoiGian.setTypeface(typeface);
        tvCautraLoi.setTypeface(typeface);
        tvXem100.setTypeface(typeface);
        tvXem50.setTypeface(typeface);
        tvdiem100.setTypeface(typeface);
        tv100d.setTypeface(typeface);
        tvdiem50.setTypeface(typeface);
        tv50d.setTypeface(typeface);


    }

    private void ReturnMenu() {
        final Dialog dialog = new Dialog(Vong1.this);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.dialoghome);
        dialog.show();
        TextView tvtextthoat;
        Button btnTiepTuc;
        Button btnMenu;

        tvtextthoat = dialog.findViewById(R.id.tvtextthoat);
        btnTiepTuc = dialog.findViewById(R.id.btnTiepTuc);
        btnMenu = dialog.findViewById(R.id.btnMenu);
        Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/UVNBanhMi.TTF");
        tvtextthoat.setTypeface(typeface);
        btnTiepTuc.setTypeface(typeface);
        btnMenu.setTypeface(typeface);
        btnMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Vong1.this, ManHinhBatDau.class));
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
