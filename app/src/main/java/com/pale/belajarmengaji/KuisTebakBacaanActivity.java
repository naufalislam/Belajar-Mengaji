package com.pale.belajarmengaji;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;

public class KuisTebakBacaanActivity extends AppCompatActivity {
    ImageButton pindah;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kuis_tebak_bacaan);
        //Untuk fullscreen layar
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        pindah = (ImageButton) findViewById(R.id.kuis_bacaan_hijaiyah);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(KuisTebakBacaanActivity.this,KuisTebakBacaanHijaiyahActivity.class);
                startActivity(intent);
            }
        });

        pindah = (ImageButton) findViewById(R.id.kuis_bacaan_harokat);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(KuisTebakBacaanActivity.this,KuisTebakBacaanHarokatActivity.class);
                startActivity(intent);
            }
        });

        pindah = (ImageButton) findViewById(R.id.kuis_bacaan_tanwin);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(KuisTebakBacaanActivity.this,KuisTebakBacaanTanwinActivity.class);
                startActivity(intent);
            }
        });

    }
}
