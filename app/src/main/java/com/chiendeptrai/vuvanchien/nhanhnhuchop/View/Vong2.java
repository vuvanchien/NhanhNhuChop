package com.chiendeptrai.vuvanchien.nhanhnhuchop.View;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import com.chiendeptrai.vuvanchien.nhanhnhuchop.R;

public class Vong2 extends AppCompatActivity {
    private FrameLayout Framediem2;
    private TextView tvdiem2;
    private TextView tvdiemso2;
    private TextView tvthoigian2;
    private TextView tvgiay2;
    private TextView tvCauTraloi2;
    private TextView tvTroGiup;
    private TextView tvDoiCauhoi;
    private FrameLayout btnDoiCauhoi2;
    private TextView Xem100s2;
    private FrameLayout frame100diem2;
    private TextView tv100d2;
    private TextView tvdiem1002;
    private ImageView imgHome2;
    private ImageView imgVolume2;
    private TextView tvCauhoi2;
    private Button btnluachon2;
    private FrameLayout FrameLayoutDapAnA2;
    private TextView tvDapAnA2;
    private FrameLayout FrameLayoutDapAnB2;
    private TextView tvDapAnB2;
    private FrameLayout FrameLayoutDapAnC2;
    private TextView tvDapAnC2;
    private FrameLayout FrameLayoutDapAnD2;
    private TextView tvDapAnD2;
    private TextView tvmangso;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vong2);
        intit();
    }
    private void intit(){
        Framediem2 = findViewById(R.id.Framediem2);
        tvdiem2 = findViewById(R.id.tvdiem2);
        tvdiemso2 = findViewById(R.id.tvdiemso2);
        tvthoigian2 = findViewById(R.id.tvthoigian2);
        tvgiay2 = findViewById(R.id.tvgiay2);
        tvCauTraloi2 = findViewById(R.id.tvCauTraloi2);
        tvTroGiup = findViewById(R.id.tvTroGiup);
        tvDoiCauhoi = findViewById(R.id.tvDoiCauhoi);
        btnDoiCauhoi2 = findViewById(R.id.btnDoiCauhoi2);
        Xem100s2 = findViewById(R.id.Xem100s2);
        frame100diem2 = findViewById(R.id.frame100diem2);
        tv100d2 = findViewById(R.id.tv100d2);
        tvdiem1002 = findViewById(R.id.tvdiem1002);
        imgHome2 = findViewById(R.id.imgHome2);
        imgVolume2 = findViewById(R.id.imgVolume2);
        tvCauhoi2 = findViewById(R.id.tvCauhoi2);
        btnluachon2 = findViewById(R.id.btnluachon2);
        FrameLayoutDapAnA2 = findViewById(R.id.FrameLayout_DapAnA2);
        tvDapAnA2 = findViewById(R.id.tvDapAn_A2);
        FrameLayoutDapAnB2 = findViewById(R.id.FrameLayout_DapAnB2);
        tvDapAnB2 = findViewById(R.id.tvDapAn_B2);
        FrameLayoutDapAnC2 = findViewById(R.id.FrameLayout_DapAnC2);
        tvDapAnC2 = findViewById(R.id.tvDapAn_C2);
        FrameLayoutDapAnD2 = findViewById(R.id.FrameLayout_DapAnD2);
        tvDapAnD2 = findViewById(R.id.tvDapAn_D2);
        tvmangso = findViewById(R.id.tvmangso);
        Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/UVNBanhMi.TTF");
        tv100d2.setTypeface(typeface);
        tvCauhoi2.setTypeface(typeface);
        tvCauTraloi2.setTypeface(typeface);
        tvDoiCauhoi.setTypeface(typeface);
        tvdiem2.setTypeface(typeface);
        tvdiemso2.setTypeface(typeface);
        tvdiem1002.setTypeface(typeface);
        tvgiay2.setTypeface(typeface);
        tvTroGiup.setTypeface(typeface);
        tvthoigian2.setTypeface(typeface);
        tvDapAnA2.setTypeface(typeface);
        tvDapAnB2.setTypeface(typeface);
        tvDapAnC2.setTypeface(typeface);
        tvDapAnD2.setTypeface(typeface);
        tvmangso.setTypeface(typeface);
        Xem100s2.setTypeface(typeface);

    }
}
