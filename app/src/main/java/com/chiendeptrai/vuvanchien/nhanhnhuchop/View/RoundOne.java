package com.chiendeptrai.vuvanchien.nhanhnhuchop.View;

import android.animation.ObjectAnimator;
import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.ColorDrawable;
import android.media.MediaPlayer;
import android.os.CountDownTimer;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.chiendeptrai.vuvanchien.nhanhnhuchop.Helper.QuestionHelper;
import com.chiendeptrai.vuvanchien.nhanhnhuchop.Mode.Question;
import com.chiendeptrai.vuvanchien.nhanhnhuchop.R;

import java.util.Collections;
import java.util.List;

public class RoundOne extends AppCompatActivity {
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
    private CheckBox imgVolume;
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
    private ImageView imgAnimation;
    private TextView tvXem50;
    Question currentQuestion;
    QuestionHelper questionHelper;
    List<Question> list;
    int qid = 0;
    int timeValue = 0;
    int coinValue = 0;
    AnimatedImageDrawable animatedImageDrawable;
    CountDownTimer countDownTimer;
    MediaPlayer bacgroudmuis = new MediaPlayer();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_round_one);
        khaibao();
        onClicktrogiup1();
        onClicktrogiup2();
        imgHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ReturnMenu();

            }
        });

            ObjectAnimator anim = ObjectAnimator.ofFloat(imgAnimation, "translationY", 0f, 650f);
            anim.setDuration(100);
            anim.start();


        bacgroudmuis = MediaPlayer.create(this, R.raw.bensoundinspire);
        bacgroudmuis.start();
        bacgroudmuis.setLooping(true);
        imgVolume.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    bacgroudmuis.pause();
                }else {
                    bacgroudmuis.start();
                    }
                }
        });
    }

    // Khởi tạo biến
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
        imgAnimation = findViewById(R.id.imganimation);
        imgVolume = findViewById(R.id.imgVolume);
        tvCauhoi = findViewById(R.id.tvCauhoi);
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
        tvThoiGian = findViewById(R.id.tvthoigian);
        tvXem50 = findViewById(R.id.Xem50s);
        tvXem100 = findViewById(R.id.tvxem100);


// Thiết lập kiểu chữ cho textview và nút
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
        tvXem100.setTypeface(typeface);
        tvXem50.setTypeface(typeface);
        tvdiem100.setTypeface(typeface);
        tv100d.setTypeface(typeface);
        tvdiem50.setTypeface(typeface);
        tv50d.setTypeface(typeface);


        // Khai báo cơ sở dũ liêu
        questionHelper = new QuestionHelper(this);
        questionHelper.getWritableDatabase();

// kiểm tra nếu ques, tùy chọn đã được thêm vào trong bảng hay không
// Nếu  không được thêm vào thì getAllOfTheQuestions () sẽ trả về một danh sách có kích thước bằng không
        if (questionHelper.getAllofTheQuestion().size() == 0) {

// Nếu không được thêm thì thêm ques, tùy chọn trong bảng
            questionHelper.allQuestion();
        }

// trả về  danh sách kiểu dữ liệu Question
        list = questionHelper.getAllofTheQuestion();

//  Xáo trộn các phần tử của danh sách để chúng ta sẽ nhận được câu hỏi ngẫu nhiên
        Collections.shuffle(list);

// currentQuestion sẽ giữ tùy chọn que, 4 và ans cho id cụ thể
        currentQuestion = list.get(qid);
        //countDownTimer
        countDownTimer = new CountDownTimer(120000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                tvThoiGian.setText(String.valueOf(timeValue) + "\tgiây");

// Với mỗi lần giảm dần thời gian bằng 1 giây
                timeValue -= -1;

//  hết thời gian để onFinished sẽ gọi sau lần lặp này
                if (timeValue == -1) {

// người dùng đã hết thời gian setText làm thời gian
                    tvThoiGian.setText("Hết giờ");
// Vì người dùng hết thời gian nên sẽ không thể nhấp vào bất kỳ nút nào
                    disableButton();
                }
            }

            // người dùng đã hết thời gian
            @Override
            public void onFinish() {
                timeUp();
            }
        }.start();

// Phương thức này sẽ đặt que và bốn tùy chọn
        updateQueAndOptions();


    }

private void onClicktrogiup1(){
    frame100diem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (coinValue < 100){
                    Toast.makeText(RoundOne.this, "Bạn chưa đủ điểm để dùng quyền trợ giúp này", Toast.LENGTH_SHORT).show();
                }else {
//                    String diem = tvdiemso.getText().toString().trim();
//                    String tg = tvThoiGian.getText().toString().trim();
//
//                    int a = Integer.parseInt(diem);
//                 //   int b = Integer.parseInt(tg);
//                    a-=100;
//                //    b-=30;
                    coinValue-=100;
                    timeValue-=30;
                }
            }
        });
}
private void onClicktrogiup2(){
        frame50diem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    if (coinValue < 100){
                        Toast.makeText(RoundOne.this, "Bạn chưa đủ điểm để dùng quyền trợ giúp này", Toast.LENGTH_SHORT).show();
                    }else {
                        list = questionHelper.getAllofTheQuestion();

                        Collections.shuffle(list);
                        coinValue-=100;

                    }

            }
        });
}
    private void ReturnMenu() {
        final Dialog dialog = new Dialog(RoundOne.this);
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
                startActivity(new Intent(RoundOne.this, Startscreen.class));
            }
        });
        btnTiepTuc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
            }
        });


    }

    private void updateQueAndOptions() {

        // Phương thức này sẽ setText cho hàng đợi và các tùy chọn
        tvCauhoi.setText(currentQuestion.getQuestion());
        tvDapAnA.setText(currentQuestion.getOpta());
        tvDapAnB.setText(currentQuestion.getOptb());
        tvDapAnC.setText(currentQuestion.getOptc());
        tvDapAnD.setText(currentQuestion.getOptd());


// Bây giờ, vì người dùng đã sửa lỗi chính xác, hãy đặt lại bộ hẹn giờ cho một hàng đợi khác bằng cách hủy và bắt đầu
        countDownTimer.cancel();
        countDownTimer.start();

        // đặt giá trị điểm
        tvdiemso.setText(String.valueOf(coinValue));

// tăng điểm
        coinValue+=50;

    }

    // Phương thức này được gọi khi hết thời gian
    private void timeUp() {
        Intent intent = new Intent(this, TimeUp.class);
        startActivity(intent);
        finish();
    }

    // Nếu người dùng nhấn nút home và vào game từ bộ nhớ thì
    // phương pháp sẽ tiếp tục hẹn giờ từ lần trước nó còn lại
    @Override
    protected void onRestart() {
        super.onRestart();
        countDownTimer.start();
    }

    // Khi hoạt động bị hủy thì thao tác này sẽ hủy hẹn giờ
    @Override
    protected void onStop() {
        super.onStop();
        countDownTimer.cancel();
    }


    // Điều này sẽ tạm dừng thời gian
    @Override
    protected void onPause() {
        super.onPause();
        countDownTimer.cancel();
    }


    @Override
    public void onBackPressed() {
        Intent intent = new Intent(this, Startscreen.class);
        startActivity(intent);
        finish();
    }

    // Phương thức này sẽ vô hiệu hóa tất cả các nút tùy chọn
    private void disableButton() {
        tvDapAnA.setEnabled(false);
        tvDapAnB.setEnabled(false);
        tvDapAnC.setEnabled(false);
        tvDapAnD.setEnabled(false);
    }

    // Phương thức này sẽ cho phép các nút tùy chọn
    private void enableButton() {
        tvDapAnA.setEnabled(true);
        tvDapAnB.setEnabled(true);
        tvDapAnC.setEnabled(true);
        tvDapAnD.setEnabled(true);
    }




    private void correctDialog() {
        final Dialog dialogCorrect = new Dialog(RoundOne.this);
        dialogCorrect.requestWindowFeature(Window.FEATURE_NO_TITLE);
        if (dialogCorrect.getWindow() != null) {
            ColorDrawable colorDrawable = new ColorDrawable(Color.TRANSPARENT);
            dialogCorrect.getWindow().setBackgroundDrawable(colorDrawable);
        }
        dialogCorrect.setContentView(R.layout.dialog_correct);
        dialogCorrect.setCancelable(false);
        dialogCorrect.show();


// Vì hộp thoại được hiển thị cho người dùng, chỉ cần tạm dừng bộ hẹn giờ ở chế độ nền
        onPause();


        TextView correctText = dialogCorrect.findViewById(R.id.correctText);
        Button buttonNext = dialogCorrect.findViewById(R.id.dialogNext);
        // Thiết lập kiểu chữ cho textview và nút
        Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/UVNBanhMi.TTF");
        correctText.setTypeface(typeface);
        buttonNext.setTypeface(typeface);

        //OnCLick listener
        buttonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

// loại bỏ hộp thoại
                dialogCorrect.dismiss();

// nó sẽ tăng số câu hỏi
                qid++;
//                if (qid == 2){
//                    gameWon();
//                }

// lấy tùy chọn que và 4 và lưu trữ trong currentQuestion
                currentQuestion = list.get(qid);
                updateQueAndOptions();

// thiết lập hàng đợi mới và 4 tùy chọn
                resetColor();
                //Enable button - remember we had disable them when user ans was correct in there particular button methods
                enableButton();
            }
        });
    }

    // thiet lap mau
    private void resetColor() {
        FrameLayoutDapAnA.setBackgroundResource(R.drawable.fom_start);
        FrameLayoutDapAnB.setBackgroundResource(R.drawable.fom_start);
        FrameLayoutDapAnC.setBackgroundResource(R.drawable.fom_start);
        FrameLayoutDapAnD.setBackgroundResource(R.drawable.fom_start);
    }
    //Onclick listener
    public void FrameLayout_DapAnA(View view) {

// so sánh tùy chọn với ans nếu có thì làm cho nút màu xanh lá cây
        if (currentQuestion.getOpta().equals(currentQuestion.getAnswer())) {
            FrameLayoutDapAnA.setBackgroundColor(ContextCompat.getColor(getApplicationContext(), R.color.colorOranger));

// Kiểm tra xem người dùng có vượt quá giới hạn que không
            if (qid < list.size() - 1) {


// Bây giờ vô hiệu hóa tất cả các nút tùy chọn vì ans của người dùng là chính xác
                // người dùng sẽ không thể nhấn nút tùy chọn khác sau khi nhấn một nút
                disableButton();

              // Hiển thị hộp thoại ans là chính xác
                correctDialog();
            }
            // Nếu người dùng vượt quá giới hạn que chỉ cần điều hướng anh ta đến hoạt động GameWon
        }   if (qid == 0) {
            score1.setBackgroundResource(R.drawable.anim4);
        }else if (qid == 1){
            ObjectAnimator anim = ObjectAnimator.ofFloat(imgAnimation, "translationY", 0f, 585f);
            anim.setDuration(10);
            anim.start();
            score2.setBackgroundResource(R.drawable.anim4);
        }else if (qid == 2){
            ObjectAnimator anim = ObjectAnimator.ofFloat(imgAnimation, "translationY", 0f, 510f);
            anim.setDuration(10);
            anim.start();
            score3.setBackgroundResource(R.drawable.anim4);
        }else if (qid == 3){
            ObjectAnimator anim = ObjectAnimator.ofFloat(imgAnimation, "translationY", 0f, 435f);
            anim.setDuration(10);
            anim.start();
            score4.setBackgroundResource(R.drawable.anim4);
        }else if (qid == 4){
            ObjectAnimator anim = ObjectAnimator.ofFloat(imgAnimation, "translationY", 0f, 360f);
            anim.setDuration(10);
            anim.start();
            score5.setBackgroundResource(R.drawable.anim4);
        }else if (qid == 5){
            ObjectAnimator anim = ObjectAnimator.ofFloat(imgAnimation, "translationY", 0f, 285);
            anim.setDuration(10);
            anim.start();
            score6.setBackgroundResource(R.drawable.anim4);
        }else if (qid == 6) {
            ObjectAnimator anim = ObjectAnimator.ofFloat(imgAnimation, "translationY", 0f, 210f);
            anim.setDuration(10);
            anim.start();
            score7.setBackgroundResource(R.drawable.anim4);
        }else if (qid == 7) {
            ObjectAnimator anim = ObjectAnimator.ofFloat(imgAnimation, "translationY", 0f, 135f);
            anim.setDuration(10);
            anim.start();
            score8.setBackgroundResource(R.drawable.anim4);
        }else if (qid == 8) {
            ObjectAnimator anim = ObjectAnimator.ofFloat(imgAnimation, "translationY", 0f, 60f);
            anim.setDuration(10);
            anim.start();
            score9.setBackgroundResource(R.drawable.anim4);
        }else if (qid == 9){
            ObjectAnimator anim = ObjectAnimator.ofFloat(imgAnimation, "translationY", 0f, 0f);
            anim.setDuration(10);
            anim.start();
            score10.setBackgroundResource(R.drawable.anim4);
            gameWon();
        }


// Ans người dùng sai rồi chỉ điều hướng anh ấy đến hoạt động PlayAgain
        else {

            gameLostPlayAgain();

        }
    }


    // Phương thức này được gọi khi người dùng ans sai
    // phương pháp này sẽ điều hướng người dùng đến hoạt động PlayAgain
    public void gameLostPlayAgain() {
        Intent intent = new Intent(this, PlayAgain.class);
        startActivity(intent);
        finish();
    }


    // Phương thức này sẽ điều hướng từ hoạt động hiện tại sang Qua vong
    public void gameWon() {
        Intent intent = new Intent(this, GameWon.class);
        startActivity(intent);
        finish();
    }
    //Onclick listener
    public void FrameLayout_DapAnB(View view) {
        FrameLayoutDapAnB.setBackgroundColor(ContextCompat.getColor(getApplicationContext(),R.color.colorOranger));

        if (currentQuestion.getOptb().equals(currentQuestion.getAnswer())) {
            if (qid < list.size() - 1) {
                disableButton();
                correctDialog();
            }
            if (qid == 0) {
                score1.setBackgroundResource(R.drawable.anim4);
            } else if (qid == 1) {
                ObjectAnimator anim = ObjectAnimator.ofFloat(imgAnimation, "translationY", 0f, 585f);
                anim.setDuration(10);
                anim.start();
                score2.setBackgroundResource(R.drawable.anim4);
            } else if (qid == 2) {
                ObjectAnimator anim = ObjectAnimator.ofFloat(imgAnimation, "translationY", 0f, 510f);
                anim.setDuration(10);
                anim.start();
                score3.setBackgroundResource(R.drawable.anim4);
            } else if (qid == 3) {
                ObjectAnimator anim = ObjectAnimator.ofFloat(imgAnimation, "translationY", 0f, 435f);
                anim.setDuration(10);
                anim.start();
                score4.setBackgroundResource(R.drawable.anim4);
            } else if (qid == 4) {
                ObjectAnimator anim = ObjectAnimator.ofFloat(imgAnimation, "translationY", 0f, 360f);
                anim.setDuration(10);
                anim.start();
                score5.setBackgroundResource(R.drawable.anim4);
            } else if (qid == 5) {
                ObjectAnimator anim = ObjectAnimator.ofFloat(imgAnimation, "translationY", 0f, 285);
                anim.setDuration(10);
                anim.start();
                score6.setBackgroundResource(R.drawable.anim4);
            } else if (qid == 6) {
                ObjectAnimator anim = ObjectAnimator.ofFloat(imgAnimation, "translationY", 0f, 210f);
                anim.setDuration(10);
                anim.start();
                score7.setBackgroundResource(R.drawable.anim4);
            } else if (qid == 7) {
                ObjectAnimator anim = ObjectAnimator.ofFloat(imgAnimation, "translationY", 0f, 135f);
                anim.setDuration(10);
                anim.start();
                score8.setBackgroundResource(R.drawable.anim4);
            } else if (qid == 8) {
                ObjectAnimator anim = ObjectAnimator.ofFloat(imgAnimation, "translationY", 0f, 60f);
                anim.setDuration(10);
                anim.start();
                score9.setBackgroundResource(R.drawable.anim4);
            } else if (qid == 9) {
                ObjectAnimator anim = ObjectAnimator.ofFloat(imgAnimation, "translationY", 0f, 0f);
                anim.setDuration(10);
                anim.start();
                score10.setBackgroundResource(R.drawable.anim4);
                gameWon();
            }
        }else {
            gameLostPlayAgain();

        }
    }
    //Onclick listener
    public void FrameLayout_DapAnC(View view) {
        FrameLayoutDapAnC.setBackgroundColor(ContextCompat.getColor(getApplicationContext(),R.color.colorOranger));

        if (currentQuestion.getOptc().equals(currentQuestion.getAnswer())) {
            if (qid < list.size() - 1) {
                disableButton();
                correctDialog();
            }   if (qid == 0) {
                score1.setBackgroundResource(R.drawable.anim4);
            }else if (qid == 1){
                ObjectAnimator anim = ObjectAnimator.ofFloat(imgAnimation, "translationY", 0f, 585f);
                anim.setDuration(10);
                anim.start();
                score2.setBackgroundResource(R.drawable.anim4);
            }else if (qid == 2){
                ObjectAnimator anim = ObjectAnimator.ofFloat(imgAnimation, "translationY", 0f, 510f);
                anim.setDuration(10);
                anim.start();
                score3.setBackgroundResource(R.drawable.anim4);
            }else if (qid == 3){
                ObjectAnimator anim = ObjectAnimator.ofFloat(imgAnimation, "translationY", 0f, 435f);
                anim.setDuration(10);
                anim.start();
                score4.setBackgroundResource(R.drawable.anim4);
            }else if (qid == 4){
                ObjectAnimator anim = ObjectAnimator.ofFloat(imgAnimation, "translationY", 0f, 360f);
                anim.setDuration(10);
                anim.start();
                score5.setBackgroundResource(R.drawable.anim4);
            }else if (qid == 5){
                ObjectAnimator anim = ObjectAnimator.ofFloat(imgAnimation, "translationY", 0f, 285);
                anim.setDuration(10);
                anim.start();
                score6.setBackgroundResource(R.drawable.anim4);
            }else if (qid == 6) {
                ObjectAnimator anim = ObjectAnimator.ofFloat(imgAnimation, "translationY", 0f, 210f);
                anim.setDuration(10);
                anim.start();
                score7.setBackgroundResource(R.drawable.anim4);
            }else if (qid == 7) {
                ObjectAnimator anim = ObjectAnimator.ofFloat(imgAnimation, "translationY", 0f, 135f);
                anim.setDuration(10);
                anim.start();
                score8.setBackgroundResource(R.drawable.anim4);
            }else if (qid == 8) {
                ObjectAnimator anim = ObjectAnimator.ofFloat(imgAnimation, "translationY", 0f, 60f);
                anim.setDuration(10);
                anim.start();
                score9.setBackgroundResource(R.drawable.anim4);
            }else if (qid == 9) {
                ObjectAnimator anim = ObjectAnimator.ofFloat(imgAnimation, "translationY", 0f, 0f);
                anim.setDuration(10);
                anim.start();
                score10.setBackgroundResource(R.drawable.anim4);
                gameWon();
            }

        } else {

            gameLostPlayAgain();
        }
    }
    //Onclick listener
    public void FrameLayout_DapAnD(View view) {
        FrameLayoutDapAnD.setBackgroundColor(ContextCompat.getColor(getApplicationContext(),R.color.colorOranger));

        if (currentQuestion.getOptd().equals(currentQuestion.getAnswer())) {
            if (qid < list.size() - 1) {
                disableButton();
                correctDialog();

            }    if (qid == 0) {
                score1.setBackgroundResource(R.drawable.anim4);
            }else if (qid == 1){
                ObjectAnimator anim = ObjectAnimator.ofFloat(imgAnimation, "translationY", 0f, 585f);
                anim.setDuration(10);
                anim.start();
                score2.setBackgroundResource(R.drawable.anim4);
            }else if (qid == 2){
                ObjectAnimator anim = ObjectAnimator.ofFloat(imgAnimation, "translationY", 0f, 510f);
                anim.setDuration(10);
                anim.start();
                score3.setBackgroundResource(R.drawable.anim4);
            }else if (qid == 3){
                ObjectAnimator anim = ObjectAnimator.ofFloat(imgAnimation, "translationY", 0f, 435f);
                anim.setDuration(10);
                anim.start();
                score4.setBackgroundResource(R.drawable.anim4);
            }else if (qid == 4){
                ObjectAnimator anim = ObjectAnimator.ofFloat(imgAnimation, "translationY", 0f, 360f);
                anim.setDuration(10);
                anim.start();
                score5.setBackgroundResource(R.drawable.anim4);
            }else if (qid == 5){
                ObjectAnimator anim = ObjectAnimator.ofFloat(imgAnimation, "translationY", 0f, 285);
                anim.setDuration(10);
                anim.start();
                score6.setBackgroundResource(R.drawable.anim4);
            }else if (qid == 6) {
                ObjectAnimator anim = ObjectAnimator.ofFloat(imgAnimation, "translationY", 0f, 210f);
                anim.setDuration(10);
                anim.start();
                score7.setBackgroundResource(R.drawable.anim4);
            }else if (qid == 7) {
                ObjectAnimator anim = ObjectAnimator.ofFloat(imgAnimation, "translationY", 0f, 135f);
                anim.setDuration(10);
                anim.start();
                score8.setBackgroundResource(R.drawable.anim4);
            }else if (qid == 8) {
                ObjectAnimator anim = ObjectAnimator.ofFloat(imgAnimation, "translationY", 0f, 60f);
                anim.setDuration(10);
                anim.start();
                score9.setBackgroundResource(R.drawable.anim4);
            }else if (qid == 9) {
                ObjectAnimator anim = ObjectAnimator.ofFloat(imgAnimation, "translationY", 0f, 0f);
                anim.setDuration(10);
                anim.start();
                score10.setBackgroundResource(R.drawable.anim4);
                gameWon();
            }

        } else {

            gameLostPlayAgain();
        }
    }


}
