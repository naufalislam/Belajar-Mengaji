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

public class TanwinKasrahActivity extends AppCompatActivity {
    ImageView TampilGambar;
    ImageButton show,hide,help,next_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tanwin_kasrah);
        //Untuk fullscreen layar
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        TampilGambar = (ImageView)findViewById(R.id.tampil_hijaiyah7);
        final Animation animScale = AnimationUtils.loadAnimation(this, R.anim.anim_scale);
        show = (ImageButton)findViewById(R.id.kasrohtain_in);
        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setVisibility(View.VISIBLE);
            }
        });

        //Untuk Menambahkan Button Suara
        final MediaPlayer SuaraAlif = MediaPlayer.create(this, R.raw.tanwin_kasroh_iin); //Memanggil nama lagu
        final MediaPlayer SuaraBa = MediaPlayer.create(this, R.raw.tanwin_kasroh_bin);
        final MediaPlayer SuaraTa = MediaPlayer.create(this, R.raw.tanwin_kasroh_tin);
        final MediaPlayer SuaraSa = MediaPlayer.create(this, R.raw.tanwin_kasroh_sin);
        final MediaPlayer SuaraJim = MediaPlayer.create(this, R.raw.tanwin_kasroh_jin);
        final MediaPlayer SuaraHa = MediaPlayer.create(this, R.raw.tanwin_kasroh_hin);
        final MediaPlayer SuaraKho = MediaPlayer.create(this, R.raw.tanwin_kasroh_khin);
        final MediaPlayer SuaraDal = MediaPlayer.create(this, R.raw.tanwin_kasroh_din);
        final MediaPlayer SuaraDzal = MediaPlayer.create(this, R.raw.tanwin_kasroh_dzin);
        final MediaPlayer SuaraRo = MediaPlayer.create(this, R.raw.button); //
        final MediaPlayer SuaraJa = MediaPlayer.create(this, R.raw.button);
        final MediaPlayer SuaraSin = MediaPlayer.create(this, R.raw.tanwin_kasroh_sin);
        final MediaPlayer SuaraSyin = MediaPlayer.create(this, R.raw.button);
        final MediaPlayer SuaraShad = MediaPlayer.create(this, R.raw.tanwin_kasroh_shin);
        final MediaPlayer SuaraDod = MediaPlayer.create(this, R.raw.tanwin_kasroh_dhin);
        final MediaPlayer SuaraTo = MediaPlayer.create(this, R.raw.tanwin_kasroh_thin);
        final MediaPlayer SuaraDo = MediaPlayer.create(this, R.raw.tanwin_kasroh_dziin);
        final MediaPlayer SuaraAin = MediaPlayer.create(this, R.raw.tanwin_kasroh_iin);
        final MediaPlayer SuaraGin = MediaPlayer.create(this, R.raw.tanwin_kasroh_ghin);
        final MediaPlayer Suarafa = MediaPlayer.create(this, R.raw.tanwin_kasroh_fin);
        final MediaPlayer SuaraKof = MediaPlayer.create(this, R.raw.tanwin_kasroh_qin);
        final MediaPlayer SuaraKaf = MediaPlayer.create(this, R.raw.tanwin_kasroh_kin);
        final MediaPlayer SuaraLam = MediaPlayer.create(this, R.raw.button);
        final MediaPlayer SuaraMim = MediaPlayer.create(this, R.raw.button);
        final MediaPlayer SuaraNun = MediaPlayer.create(this, R.raw.tanwin_kasroh_nin);
        final MediaPlayer SuaraWawu = MediaPlayer.create(this, R.raw.tanwin_kasroh_win);
        final MediaPlayer SuaraHA = MediaPlayer.create(this, R.raw.tanwin_kasroh_hiin);
        final MediaPlayer SuaraYa = MediaPlayer.create(this, R.raw.tanwin_kasroh_yin);

        ImageButton ButtonSuara = (ImageButton) this.findViewById(R.id.kasrohtain_in); //fariabel button
        ImageButton ButtonSuara2 = (ImageButton) this.findViewById(R.id.kasrohtain_bin);
        ImageButton ButtonSuara3 = (ImageButton) this.findViewById(R.id.kasrohtain_tin);
        ImageButton ButtonSuara4 = (ImageButton) this.findViewById(R.id.kasrohtain_tsin);
        ImageButton ButtonSuara5 = (ImageButton) this.findViewById(R.id.kasrohtain_jin);
        ImageButton ButtonSuara6 = (ImageButton) this.findViewById(R.id.kasrohtain_hin);
        ImageButton ButtonSuara7 = (ImageButton) this.findViewById(R.id.kasrohtain_khin);
        ImageButton ButtonSuara8 = (ImageButton) this.findViewById(R.id.kasrohtain_din);
        ImageButton ButtonSuara9 = (ImageButton) this.findViewById(R.id.kasrohtain_dzin);
        ImageButton ButtonSuara10 = (ImageButton) this.findViewById(R.id.kasrohtain_rin);
        ImageButton ButtonSuara11 = (ImageButton) this.findViewById(R.id.kasrohtain_zin);
        ImageButton ButtonSuara12 = (ImageButton) this.findViewById(R.id.kasrohtain_sin);
        ImageButton ButtonSuara13 = (ImageButton) this.findViewById(R.id.kasrohtain_syin);
        ImageButton ButtonSuara14 = (ImageButton) this.findViewById(R.id.kasrohtain_shin);
        ImageButton ButtonSuara15 = (ImageButton) this.findViewById(R.id.kasrohtain_dhin);
        ImageButton ButtonSuara16 = (ImageButton) this.findViewById(R.id.kasrohtain_thin);
        ImageButton ButtonSuara17 = (ImageButton) this.findViewById(R.id.kasrohtain_zhin);
        ImageButton ButtonSuara18 = (ImageButton) this.findViewById(R.id.kasrohtain_ain);
        ImageButton ButtonSuara19 = (ImageButton) this.findViewById(R.id.kasrohtain_gin);
        ImageButton ButtonSuara20 = (ImageButton) this.findViewById(R.id.kasrohtain_fin);
        ImageButton ButtonSuara21 = (ImageButton) this.findViewById(R.id.kasrohtain_qin);
        ImageButton ButtonSuara22 = (ImageButton) this.findViewById(R.id.kasrohtain_kin);
        ImageButton ButtonSuara23 = (ImageButton) this.findViewById(R.id.kasrohtain_lin);
        ImageButton ButtonSuara24 = (ImageButton) this.findViewById(R.id.kasrohtain_min);
        ImageButton ButtonSuara25 = (ImageButton) this.findViewById(R.id.kasrohtain_nin);
        ImageButton ButtonSuara26 = (ImageButton) this.findViewById(R.id.kasrohtain_win);
        ImageButton ButtonSuara27 = (ImageButton) this.findViewById(R.id.kasrohtain_hiin);
        ImageButton ButtonSuara28 = (ImageButton) this.findViewById(R.id.kasrohtain_yin);

        /*Menghidupkan Suara */
        ButtonSuara.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_kasroh_tain_in);
                TampilGambar.startAnimation(animScale);
                SuaraAlif.start();
            }
        });

        ButtonSuara2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_kasroh_tain_bin);
                TampilGambar.startAnimation(animScale);
                SuaraBa.start();
            }
        });

        ButtonSuara3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_kasroh_tain_tin);
                TampilGambar.startAnimation(animScale);
                SuaraTa.start();
            }
        });

        ButtonSuara4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_kasroh_tain_tsin);
                TampilGambar.startAnimation(animScale);
                SuaraSa.start();
            }
        });
        ButtonSuara5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_kasroh_tain_jin);
                TampilGambar.startAnimation(animScale);
                SuaraJim.start();
            }
        });
        ButtonSuara6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_kasroh_tain_hin);
                TampilGambar.startAnimation(animScale);
                SuaraHa.start();
            }
        });
        ButtonSuara7.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_kasroh_tain_khin);
                TampilGambar.startAnimation(animScale);
                SuaraKho.start();
            }
        });

        ButtonSuara8.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_kasroh_tain_din);
                TampilGambar.startAnimation(animScale);
                SuaraDal.start();
            }
        });

        ButtonSuara9.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_kasroh_tain_dzin);
                TampilGambar.startAnimation(animScale);
                SuaraDzal.start();
            }
        });
        ButtonSuara10.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_kasroh_tain_rin);
                TampilGambar.startAnimation(animScale);
                SuaraRo.start();
            }
        });
        ButtonSuara11.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_kasroh_tain_zin);
                TampilGambar.startAnimation(animScale);
                SuaraJa.start();
            }
        });

        ButtonSuara12.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_kasroh_tain_sin);
                TampilGambar.startAnimation(animScale);
                SuaraSin.start();
            }
        });
        ButtonSuara13.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_kasroh_tain_syin);
                TampilGambar.startAnimation(animScale);
                SuaraSyin.start();
            }
        });
        ButtonSuara14.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_kasroh_tain_shin);
                TampilGambar.startAnimation(animScale);
                SuaraShad.start();
            }
        });

        ButtonSuara15.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_kasroh_tain_dhin);
                TampilGambar.startAnimation(animScale);
                SuaraDod.start();
            }
        });
        ButtonSuara16.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_kasroh_tain_thin);
                TampilGambar.startAnimation(animScale);
                SuaraTo.start();
            }
        });
        ButtonSuara17.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_kasroh_tain_dziin);
                TampilGambar.startAnimation(animScale);
                SuaraDo.start();
            }
        });
        ButtonSuara18.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_kasroh_tain_ain);
                TampilGambar.startAnimation(animScale);
                SuaraAin.start();
            }
        });

        ButtonSuara19.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_kasroh_tain_ghin);
                TampilGambar.startAnimation(animScale);
                SuaraGin.start();
            }
        });
        ButtonSuara20.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_kasroh_tain_fin);
                TampilGambar.startAnimation(animScale);
                Suarafa.start();
            }
        });
        ButtonSuara21.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_kasroh_tain_qin);
                TampilGambar.startAnimation(animScale);
                SuaraKof.start();
            }
        });
        ButtonSuara22.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.pop_kasroh_tain_kin);
                TampilGambar.startAnimation(animScale);
                // TODO Auto-generated method stub
                SuaraKaf.start();
            }
        });
        ButtonSuara23.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_kasroh_tain_lin);
                TampilGambar.startAnimation(animScale);
                SuaraLam.start();
            }
        });

        ButtonSuara24.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_kasroh_tain_min);
                TampilGambar.startAnimation(animScale);
                SuaraMim.start();
            }
        });
        ButtonSuara25.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_kasroh_tain_nin);
                TampilGambar.startAnimation(animScale);

                SuaraNun.start();
            }
        });
        ButtonSuara26.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_kasroh_tain_win);
                TampilGambar.startAnimation(animScale);
                SuaraWawu.start();
            }
        });
        ButtonSuara27.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_kasroh_tain_hiin);
                TampilGambar.startAnimation(animScale);
                SuaraHA.start();
            }
        });
        ButtonSuara28.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_kasroh_tain_yin);
                TampilGambar.startAnimation(animScale);
                SuaraYa.start();
            }
        });

    }
}
