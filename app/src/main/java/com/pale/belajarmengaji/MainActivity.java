package com.pale.belajarmengaji;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton pindah;
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Untuk fullscreen layar
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        final MediaPlayer suaraButton = MediaPlayer.create(this,R.raw.button);
        mp = MediaPlayer.create(getBaseContext(),R.raw.backsound);
        mp.start();

        pindah = (ImageButton) findViewById(R.id.buttonBelajar);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suaraButton.start();
                Intent intent = new Intent(MainActivity.this,BelajarActivity.class);
                startActivity(intent);
                mp.stop();
            }
        });

        pindah = (ImageButton) findViewById(R.id.buttonKuis);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suaraButton.start();
                Intent intent = new Intent(MainActivity.this,KuisActivity.class);
                startActivity(intent);
                mp.stop();
            }
        });

        pindah = (ImageButton) findViewById(R.id.buttonExit);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suaraButton.start();
                Intent intent = new Intent(MainActivity.this,SplashActivity.class);
                startActivity(intent);
                mp.stop();

            }
        });

    }
}
