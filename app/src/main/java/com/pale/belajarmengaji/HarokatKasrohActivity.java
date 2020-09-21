package com.pale.belajarmengaji;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.ImageView;

public class HarokatKasrohActivity extends AppCompatActivity {
    ImageView TampilGambar;
    ImageButton show,hide,help,next_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_harokat_kasroh);
        //Untuk fullscreen layar
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        TampilGambar = (ImageView)findViewById(R.id.tampil_hijaiyah3);
        show = (ImageButton)findViewById(R.id.kasroh_i);
        hide = (ImageButton)findViewById(R.id.kasroh_bi);
        final Animation animScale = AnimationUtils.loadAnimation(this, R.anim.anim_scale);
        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TampilGambar.setVisibility(View.VISIBLE);

            }
        });

        hide.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                TampilGambar.setVisibility(View.INVISIBLE);

            }
        });

        //Untuk Menambahkan Button Suara
        final MediaPlayer SuaraAlif = MediaPlayer.create(this, R.raw.kasroh_i); //Memanggil nama lagu
        final MediaPlayer SuaraBa = MediaPlayer.create(this, R.raw.kasroh_bi);
        final MediaPlayer SuaraTa = MediaPlayer.create(this, R.raw.kasroh_ti);
        final MediaPlayer SuaraSa = MediaPlayer.create(this, R.raw.kasroh_tsi);
        final MediaPlayer SuaraJim = MediaPlayer.create(this, R.raw.kasroh_ji);
        final MediaPlayer SuaraHa = MediaPlayer.create(this, R.raw.kasroh_hi);
        final MediaPlayer SuaraKho = MediaPlayer.create(this, R.raw.kasroh_khi);
        final MediaPlayer SuaraDal = MediaPlayer.create(this, R.raw.kasroh_di);
        final MediaPlayer SuaraDzal = MediaPlayer.create(this, R.raw.kasroh_dzi);
        final MediaPlayer SuaraRo = MediaPlayer.create(this, R.raw.kasroh_ri);
        final MediaPlayer SuaraJa = MediaPlayer.create(this, R.raw.kasroh_zi);
        final MediaPlayer SuaraSin = MediaPlayer.create(this, R.raw.kasroh_si);
        final MediaPlayer SuaraSyin = MediaPlayer.create(this, R.raw.kasroh_syi);
        final MediaPlayer SuaraShad = MediaPlayer.create(this, R.raw.kasroh_shi);
        final MediaPlayer SuaraDod = MediaPlayer.create(this, R.raw.kasroh_dhi);
        final MediaPlayer SuaraTo = MediaPlayer.create(this, R.raw.kasroh_thi);
        final MediaPlayer SuaraDo = MediaPlayer.create(this, R.raw.kasroh_dzii);
        final MediaPlayer SuaraAin = MediaPlayer.create(this, R.raw.kasroh_ii);
        final MediaPlayer SuaraGin = MediaPlayer.create(this, R.raw.kasroh_ghi);
        final MediaPlayer Suarafa = MediaPlayer.create(this, R.raw.kasroh_fi);
        final MediaPlayer SuaraKof = MediaPlayer.create(this, R.raw.kasroh_qi);
        final MediaPlayer SuaraKaf = MediaPlayer.create(this, R.raw.kasroh_ki);
        final MediaPlayer SuaraLam = MediaPlayer.create(this, R.raw.kasroh_li);
        final MediaPlayer SuaraMim = MediaPlayer.create(this, R.raw.kasroh_mi);
        final MediaPlayer SuaraNun = MediaPlayer.create(this, R.raw.kasroh_ni);
        final MediaPlayer SuaraWawu = MediaPlayer.create(this, R.raw.kasroh_wi);
        final MediaPlayer SuaraHA = MediaPlayer.create(this, R.raw.kasroh_hii);
        final MediaPlayer SuaraYa = MediaPlayer.create(this, R.raw.kasroh_yi);

        ImageButton ButtonSuara = (ImageButton) this.findViewById(R.id.kasroh_i); //fariabel button
        ImageButton ButtonSuara2 = (ImageButton) this.findViewById(R.id.kasroh_bi);
        ImageButton ButtonSuara3 = (ImageButton) this.findViewById(R.id.kasroh_ti);
        ImageButton ButtonSuara4 = (ImageButton) this.findViewById(R.id.kasroh_tsi);
        ImageButton ButtonSuara5 = (ImageButton) this.findViewById(R.id.kasroh_ji);
        ImageButton ButtonSuara6 = (ImageButton) this.findViewById(R.id.kasroh_hi);
        ImageButton ButtonSuara7 = (ImageButton) this.findViewById(R.id.kasroh_khi);
        ImageButton ButtonSuara8 = (ImageButton) this.findViewById(R.id.kasroh_di);
        ImageButton ButtonSuara9 = (ImageButton) this.findViewById(R.id.kasroh_dzi);
        ImageButton ButtonSuara10 = (ImageButton) this.findViewById(R.id.kasroh_ri);
        ImageButton ButtonSuara11 = (ImageButton) this.findViewById(R.id.kasroh_zi);
        ImageButton ButtonSuara12 = (ImageButton) this.findViewById(R.id.kasroh_si);
        ImageButton ButtonSuara13 = (ImageButton) this.findViewById(R.id.kasroh_syi);
        ImageButton ButtonSuara14 = (ImageButton) this.findViewById(R.id.kasroh_shi);
        ImageButton ButtonSuara15 = (ImageButton) this.findViewById(R.id.kasroh_dhi);
        ImageButton ButtonSuara16 = (ImageButton) this.findViewById(R.id.kasroh_thi);
        ImageButton ButtonSuara17 = (ImageButton) this.findViewById(R.id.kasroh_dzhi);
        ImageButton ButtonSuara18 = (ImageButton) this.findViewById(R.id.kasroh_ain);
        ImageButton ButtonSuara19 = (ImageButton) this.findViewById(R.id.kasroh_ghi);
        ImageButton ButtonSuara20 = (ImageButton) this.findViewById(R.id.kasroh_fi);
        ImageButton ButtonSuara21 = (ImageButton) this.findViewById(R.id.kasroh_qi);
        ImageButton ButtonSuara22 = (ImageButton) this.findViewById(R.id.kasroh_ki);
        ImageButton ButtonSuara23 = (ImageButton) this.findViewById(R.id.kasroh_li);
        ImageButton ButtonSuara24 = (ImageButton) this.findViewById(R.id.kasroh_mi);
        ImageButton ButtonSuara25 = (ImageButton) this.findViewById(R.id.kasroh_ni);
        ImageButton ButtonSuara26 = (ImageButton) this.findViewById(R.id.kasroh_wi);
        ImageButton ButtonSuara27 = (ImageButton) this.findViewById(R.id.kasroh_hii);
        ImageButton ButtonSuara28 = (ImageButton) this.findViewById(R.id.kasroh_yi);

        /*Menghidupkan Suara */
        ButtonSuara.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_kasroh_i);
                TampilGambar.startAnimation(animScale);
                SuaraAlif.start();
            }
        });

        ButtonSuara2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_kasroh_bi);
                TampilGambar.startAnimation(animScale);
                SuaraBa.start();
            }
        });

        ButtonSuara3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_kasroh_ti);
                TampilGambar.startAnimation(animScale);
                SuaraTa.start();
            }
        });

        ButtonSuara4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_kasroh_tsi);
                TampilGambar.startAnimation(animScale);
                SuaraSa.start();
            }
        });
        ButtonSuara5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_kasroh_ji);
                TampilGambar.startAnimation(animScale);
                SuaraJim.start();
            }
        });
        ButtonSuara6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_kasroh_hi);
                TampilGambar.startAnimation(animScale);
                SuaraHa.start();
            }
        });
        ButtonSuara7.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_kasroh_khi);
                TampilGambar.startAnimation(animScale);
                SuaraKho.start();
            }
        });

        ButtonSuara8.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_kasroh_di);
                TampilGambar.startAnimation(animScale);
                SuaraDal.start();
            }
        });

        ButtonSuara9.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_kasroh_dzi);
                TampilGambar.startAnimation(animScale);
                SuaraDzal.start();
            }
        });
        ButtonSuara10.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_kasroh_ri);
                TampilGambar.startAnimation(animScale);
                SuaraRo.start();
            }
        });
        ButtonSuara11.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_kasroh_zi);
                TampilGambar.startAnimation(animScale);
                SuaraJa.start();
            }
        });

        ButtonSuara12.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_kasroh_si);
                TampilGambar.startAnimation(animScale);
                SuaraSin.start();
            }
        });
        ButtonSuara13.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_kasroh_syi);
                TampilGambar.startAnimation(animScale);
                SuaraSyin.start();
            }
        });
        ButtonSuara14.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_kasroh_shi);
                TampilGambar.startAnimation(animScale);
                SuaraShad.start();
            }
        });

        ButtonSuara15.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_kasroh_dhi);
                TampilGambar.startAnimation(animScale);
                SuaraDod.start();
            }
        });
        ButtonSuara16.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_kasroh_thi);
                TampilGambar.startAnimation(animScale);
                SuaraTo.start();
            }
        });
        ButtonSuara17.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_kasroh_dzii);
                TampilGambar.startAnimation(animScale);
                SuaraDo.start();
            }
        });
        ButtonSuara18.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_kasroh_ii);
                TampilGambar.startAnimation(animScale);
                SuaraAin.start();
            }
        });

        ButtonSuara19.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_kasroh_ghi);
                TampilGambar.startAnimation(animScale);
                SuaraGin.start();
            }
        });
        ButtonSuara20.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_kasroh_fi);
                TampilGambar.startAnimation(animScale);
                Suarafa.start();
            }
        });
        ButtonSuara21.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_kasroh_qi);
                TampilGambar.startAnimation(animScale);
                SuaraKof.start();
            }
        });
        ButtonSuara22.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.pop_kasroh_ki);
                TampilGambar.startAnimation(animScale);
                // TODO Auto-generated method stub
                SuaraKaf.start();
            }
        });
        ButtonSuara23.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_kasroh_li);
                TampilGambar.startAnimation(animScale);
                SuaraLam.start();
            }
        });

        ButtonSuara24.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_kasroh_mi);
                TampilGambar.startAnimation(animScale);
                SuaraMim.start();
            }
        });
        ButtonSuara25.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_kasroh_ni);
                TampilGambar.startAnimation(animScale);

                SuaraNun.start();
            }
        });
        ButtonSuara26.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_kasroh_wi);
                TampilGambar.startAnimation(animScale);
                SuaraWawu.start();
            }
        });
        ButtonSuara27.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_kasroh_hii);
                TampilGambar.startAnimation(animScale);
                SuaraHA.start();
            }
        });
        ButtonSuara28.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_kasroh_yi);
                TampilGambar.startAnimation(animScale);
                SuaraYa.start();
            }
        });

    }
}
