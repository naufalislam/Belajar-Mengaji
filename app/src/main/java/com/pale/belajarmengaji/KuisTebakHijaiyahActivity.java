package com.pale.belajarmengaji;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class KuisTebakHijaiyahActivity extends AppCompatActivity {
    ImageButton pilih;
    ImageButton jw1,jw2,jw3;
    ImageView soal;
    int s,s1,j1,j2,j3;
    int skor=0;

    Hijaiyah hijaiyah =  new Hijaiyah();
    int n = hijaiyah.getjumlah();

    boolean jawabanbenar = true;
    int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kuis_tebak_hijaiyah);
        //Untuk fullscreen layar
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        soal = (ImageView) findViewById(R.id.soal);
        jw1 = (ImageButton) findViewById(R.id.jawaban1);
        jw2 = (ImageButton) findViewById(R.id.jawaban2);
        jw3 = (ImageButton) findViewById(R.id.jawaban3);

        final MediaPlayer SuaraButton = MediaPlayer.create(this,R.raw.button);

        newlevel();

        jw1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isCorrect(j1 == s);
            }
        });

        jw2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isCorrect(j2 == s);
            }
        });

        jw3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isCorrect(j3 == s);
            }
        });

    }

    public void newlevel(){
        s = hijaiyah.getrandomhuruf();
        s1 = hijaiyah.getrandomhuruf();
        int i = new Random().nextInt(3) +1;

        if (i == 1){
            j1 = s;
        }else {
            j1 = hijaiyah.getrandomhuruf();
        }

        if (i ==2){
            j2=s;
        }else {
            j2 = hijaiyah.getrandomhuruf();
        }

        if (i==3){
            j3=s;
        }else {
            j3 =  hijaiyah.getrandomhuruf();
        }

        soal.setBackgroundResource(hijaiyah.getimagesoal(s));
        jw1.setBackgroundResource(hijaiyah.getimagesoal(j1));
        jw2.setBackgroundResource(hijaiyah.getimagesoal(j2));
        jw3.setBackgroundResource(hijaiyah.getimagesoal(j3));

    }

    public void isCorrect(boolean input){
        TextView tampilSkor = (TextView) findViewById(R.id.skor);

        if (input &&  i <n){
            MediaPlayer benar = MediaPlayer.create(getBaseContext(),R.raw.benar);
            skor +=10;
            benar.start();
            newlevel();
            i++;
        }else{
            MediaPlayer salah = MediaPlayer.create(getBaseContext(),R.raw.salah);
            skor -= 5 ;
            salah.start();

        }

        tampilSkor.setText("SKOR : "+skor);

    }
}
