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

public class HarokatFathahActivity extends AppCompatActivity {
    ImageView TampilGambar;
    ImageButton show,hide,help,next_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_harokat_fathah);
        //Untuk fullscreen layar
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        TampilGambar = (ImageView)findViewById(R.id.tampil_hijaiyah2);
        show = (ImageButton)findViewById(R.id.fatah_a);
        hide = (ImageButton)findViewById(R.id.fatah_ba);

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
        final MediaPlayer SuaraAlif = MediaPlayer.create(this, R.raw.fatah_a); //Memanggil nama lagu
        final MediaPlayer SuaraBa = MediaPlayer.create(this, R.raw.fatah_ba);
        final MediaPlayer SuaraTa = MediaPlayer.create(this, R.raw.fatah_ta);
        final MediaPlayer SuaraSa = MediaPlayer.create(this, R.raw.fatah_sa);
        final MediaPlayer SuaraJim = MediaPlayer.create(this, R.raw.fatah_ja);
        final MediaPlayer SuaraHa = MediaPlayer.create(this, R.raw.fatah_ha);
        final MediaPlayer SuaraKho = MediaPlayer.create(this, R.raw.fatah_kho);
        final MediaPlayer SuaraDal = MediaPlayer.create(this, R.raw.fatah_da);
        final MediaPlayer SuaraDzal = MediaPlayer.create(this, R.raw.fatah_dza);
        final MediaPlayer SuaraRo = MediaPlayer.create(this, R.raw.fatah_ro);
        final MediaPlayer SuaraJa = MediaPlayer.create(this, R.raw.fatah_za);
        final MediaPlayer SuaraSin = MediaPlayer.create(this, R.raw.fatah_sa);
        final MediaPlayer SuaraSyin = MediaPlayer.create(this, R.raw.fatah_sya);
        final MediaPlayer SuaraShad = MediaPlayer.create(this, R.raw.fatah_sho);
        final MediaPlayer SuaraDod = MediaPlayer.create(this, R.raw.fatah_dho);
        final MediaPlayer SuaraTo = MediaPlayer.create(this, R.raw.fatah_tho);
        final MediaPlayer SuaraDo = MediaPlayer.create(this, R.raw.fatah_dzo);
        final MediaPlayer SuaraAin = MediaPlayer.create(this, R.raw.fatah_aa);
        final MediaPlayer SuaraGin = MediaPlayer.create(this, R.raw.fatah_gho);
        final MediaPlayer Suarafa = MediaPlayer.create(this, R.raw.fatah_fa);
        final MediaPlayer SuaraKof = MediaPlayer.create(this, R.raw.fatah_qo);
        final MediaPlayer SuaraKaf = MediaPlayer.create(this, R.raw.fatah_ka);
        final MediaPlayer SuaraLam = MediaPlayer.create(this, R.raw.fatah_la);
        final MediaPlayer SuaraMim = MediaPlayer.create(this, R.raw.fatah_ma);
        final MediaPlayer SuaraNun = MediaPlayer.create(this, R.raw.fatah_na);
        final MediaPlayer SuaraWawu = MediaPlayer.create(this, R.raw.fatah_wa);
        final MediaPlayer SuaraHA = MediaPlayer.create(this, R.raw.fatah_haa);
        final MediaPlayer SuaraYa = MediaPlayer.create(this, R.raw.fatah_ya);

        ImageButton ButtonSuara = (ImageButton) this.findViewById(R.id.fatah_a); //fariabel button
        ImageButton ButtonSuara2 = (ImageButton) this.findViewById(R.id.fatah_ba);
        ImageButton ButtonSuara3 = (ImageButton) this.findViewById(R.id.fatah_ta);
        ImageButton ButtonSuara4 = (ImageButton) this.findViewById(R.id.fatah_tsa);
        ImageButton ButtonSuara5 = (ImageButton) this.findViewById(R.id.fatah_ja);
        ImageButton ButtonSuara6 = (ImageButton) this.findViewById(R.id.fatah_ha);
        ImageButton ButtonSuara7 = (ImageButton) this.findViewById(R.id.fatah_kha);
        ImageButton ButtonSuara8 = (ImageButton) this.findViewById(R.id.fatah_da);
        ImageButton ButtonSuara9 = (ImageButton) this.findViewById(R.id.fatah_dza);
        ImageButton ButtonSuara10 = (ImageButton) this.findViewById(R.id.fatah_ra);
        ImageButton ButtonSuara11 = (ImageButton) this.findViewById(R.id.fatah_za);
        ImageButton ButtonSuara12 = (ImageButton) this.findViewById(R.id.fatah_sa);
        ImageButton ButtonSuara13 = (ImageButton) this.findViewById(R.id.fatah_sya);
        ImageButton ButtonSuara14 = (ImageButton) this.findViewById(R.id.fatah_sha);
        ImageButton ButtonSuara15 = (ImageButton) this.findViewById(R.id.fatah_dha);
        ImageButton ButtonSuara16 = (ImageButton) this.findViewById(R.id.fatah_tha);
        ImageButton ButtonSuara17 = (ImageButton) this.findViewById(R.id.fatah_dzaa);
        ImageButton ButtonSuara18 = (ImageButton) this.findViewById(R.id.fatah_aa);
        ImageButton ButtonSuara19 = (ImageButton) this.findViewById(R.id.fatah_gha);
        ImageButton ButtonSuara20 = (ImageButton) this.findViewById(R.id.fatah_fa);
        ImageButton ButtonSuara21 = (ImageButton) this.findViewById(R.id.fatah_qa);
        ImageButton ButtonSuara22 = (ImageButton) this.findViewById(R.id.fatah_ka);
        ImageButton ButtonSuara23 = (ImageButton) this.findViewById(R.id.fatah_la);
        ImageButton ButtonSuara24 = (ImageButton) this.findViewById(R.id.fatah_ma);
        ImageButton ButtonSuara25 = (ImageButton) this.findViewById(R.id.fatah_na);
        ImageButton ButtonSuara26 = (ImageButton) this.findViewById(R.id.fatah_wa);
        ImageButton ButtonSuara27 = (ImageButton) this.findViewById(R.id.fatah_haa);
        ImageButton ButtonSuara28 = (ImageButton) this.findViewById(R.id.fatah_ya);

        /*Menghidupkan Suara */
        ButtonSuara.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_fatah_a);
                TampilGambar.startAnimation(animScale);
                SuaraAlif.start();
            }
        });

        ButtonSuara2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_fatah_ba);
                TampilGambar.startAnimation(animScale);
                SuaraBa.start();
            }
        });

        ButtonSuara3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_fatah_ta);
                TampilGambar.startAnimation(animScale);
                SuaraTa.start();
            }
        });

        ButtonSuara4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_fatah_tsa);
                TampilGambar.startAnimation(animScale);
                SuaraSa.start();
            }
        });
        ButtonSuara5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_fatah_ja);
                TampilGambar.startAnimation(animScale);
                SuaraJim.start();
            }
        });
        ButtonSuara6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_fatah_ha);
                TampilGambar.startAnimation(animScale);
                SuaraHa.start();
            }
        });
        ButtonSuara7.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_fatah_kha);
                TampilGambar.startAnimation(animScale);
                SuaraKho.start();
            }
        });

        ButtonSuara8.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_fatah_da);
                TampilGambar.startAnimation(animScale);
                SuaraDal.start();
            }
        });

        ButtonSuara9.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_fatah_dza);
                TampilGambar.startAnimation(animScale);
                SuaraDzal.start();
            }
        });
        ButtonSuara10.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_fatah_ra);
                TampilGambar.startAnimation(animScale);
                SuaraRo.start();
            }
        });
        ButtonSuara11.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_fatah_za);
                TampilGambar.startAnimation(animScale);
                SuaraJa.start();
            }
        });

        ButtonSuara12.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_fatah_sa);
                TampilGambar.startAnimation(animScale);
                SuaraSin.start();
            }
        });
        ButtonSuara13.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_fatah_sya);
                TampilGambar.startAnimation(animScale);
                SuaraSyin.start();
            }
        });
        ButtonSuara14.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_fatah_sha);
                TampilGambar.startAnimation(animScale);
                SuaraShad.start();
            }
        });

        ButtonSuara15.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_fatah_dha);
                TampilGambar.startAnimation(animScale);
                SuaraDod.start();
            }
        });
        ButtonSuara16.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_fatah_tha);
                TampilGambar.startAnimation(animScale);
                SuaraTo.start();
            }
        });
        ButtonSuara17.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_fatah_dzaa);
                TampilGambar.startAnimation(animScale);
                SuaraDo.start();
            }
        });
        ButtonSuara18.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_fatah_ain);
                TampilGambar.startAnimation(animScale);
                SuaraAin.start();
            }
        });

        ButtonSuara19.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_fatah_gha);
                TampilGambar.startAnimation(animScale);
                SuaraGin.start();
            }
        });
        ButtonSuara20.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_fatah_fa);
                TampilGambar.startAnimation(animScale);
                Suarafa.start();
            }
        });
        ButtonSuara21.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_fatah_qa);
                TampilGambar.startAnimation(animScale);
                SuaraKof.start();
            }
        });
        ButtonSuara22.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.pop_fatah_ka);
                TampilGambar.startAnimation(animScale);
                // TODO Auto-generated method stub
                SuaraKaf.start();
            }
        });
        ButtonSuara23.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_fatah_la);
                TampilGambar.startAnimation(animScale);
                SuaraLam.start();
            }
        });

        ButtonSuara24.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_fatah_ma);
                TampilGambar.startAnimation(animScale);
                SuaraMim.start();
            }
        });
        ButtonSuara25.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_fatah_na);
                TampilGambar.startAnimation(animScale);
                SuaraNun.start();
            }
        });
        ButtonSuara26.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_fatah_wa);
                TampilGambar.startAnimation(animScale);
                SuaraWawu.start();
            }
        });
        ButtonSuara27.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_fatah_haa);
                TampilGambar.startAnimation(animScale);
                SuaraHA.start();
            }
        });
        ButtonSuara28.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_fatah_ya);
                TampilGambar.startAnimation(animScale);
                SuaraYa.start();
            }
        });

    }
}
