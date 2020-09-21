package com.pale.belajarmengaji;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;

public class BelajarActivity extends AppCompatActivity {

    ImageButton pindah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_belajar);
        //Untuk fullscreen layar
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        pindah = (ImageButton) findViewById(R.id.menu_hijaiyah);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                suaraButton.start();
                Intent intent = new Intent(BelajarActivity.this,HijaiyahActivity.class);
                startActivity(intent);
//                mp.stop();
            }
        });

        pindah = (ImageButton) findViewById(R.id.menu_harokat);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                suaraButton.start();
                Intent intent = new Intent(BelajarActivity.this,HarokatActivity.class);
                startActivity(intent);
//                mp.stop();
            }
        });

        pindah = (ImageButton) findViewById(R.id.menu_tanwin);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                suaraButton.start();
                Intent intent = new Intent(BelajarActivity.this,TanwinActivity.class);
                startActivity(intent);
//                mp.stop();
            }
        });
    }
}
