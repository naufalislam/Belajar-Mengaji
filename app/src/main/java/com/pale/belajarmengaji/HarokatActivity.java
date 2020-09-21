package com.pale.belajarmengaji;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;

public class HarokatActivity extends AppCompatActivity {
    ImageButton pindah;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_harokat);
        //Untuk fullscreen layar
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        pindah = (ImageButton) findViewById(R.id.harokat_fathah);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                suaraButton.start();
                Intent intent = new Intent(HarokatActivity.this,HarokatFathahActivity.class);
                startActivity(intent);
//                mp.stop();
            }
        });

        pindah = (ImageButton) findViewById(R.id.harokat_kasroh);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                suaraButton.start();
                Intent intent = new Intent(HarokatActivity.this,HarokatKasrohActivity.class);
                startActivity(intent);
//                mp.stop();
            }
        });

        pindah = (ImageButton) findViewById(R.id.harokat_dhomah);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                suaraButton.start();
                Intent intent = new Intent(HarokatActivity.this,HarokatDomahActivity.class);
                startActivity(intent);
//                mp.stop();
            }
        });

    }
}
