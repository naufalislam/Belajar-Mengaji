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

public class TanwisnDomahActivity extends AppCompatActivity {
    ImageView TampilGambar;
    ImageButton show,hide,help,next_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tanwisn_domah);
        //Untuk fullscreen layar
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        TampilGambar = (ImageView)findViewById(R.id.tampil_hijaiyah6);
        final Animation animScale = AnimationUtils.loadAnimation(this, R.anim.anim_scale);

        show = (ImageButton)findViewById(R.id.domah_tain_alif);
        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setVisibility(View.VISIBLE);
            }
        });

        //Untuk Menambahkan Button Suara
        final MediaPlayer SuaraAlif = MediaPlayer.create(this, R.raw.tanwin_domah_un); //Memanggil nama lagu
        final MediaPlayer SuaraBa = MediaPlayer.create(this, R.raw.tanwin_domah_bun);
        final MediaPlayer SuaraTa = MediaPlayer.create(this, R.raw.tanwin_domah_tun);
        final MediaPlayer SuaraSa = MediaPlayer.create(this, R.raw.tanwin_domah_tsun);
        final MediaPlayer SuaraJim = MediaPlayer.create(this, R.raw.tanwin_domah_jun);
        final MediaPlayer SuaraHa = MediaPlayer.create(this, R.raw.tanwin_domah_hun);
        final MediaPlayer SuaraKho = MediaPlayer.create(this, R.raw.tanwin_domah_khun);
        final MediaPlayer SuaraDal = MediaPlayer.create(this, R.raw.tanwin_domah_dun);
        final MediaPlayer SuaraDzal = MediaPlayer.create(this, R.raw.tanwin_domah_dzun);
        final MediaPlayer SuaraRo = MediaPlayer.create(this, R.raw.tanwin_domah_run);
        final MediaPlayer SuaraJa = MediaPlayer.create(this, R.raw.tanwin_domah_zun);
        final MediaPlayer SuaraSin = MediaPlayer.create(this, R.raw.tanwin_domah_sun);
        final MediaPlayer SuaraSyin = MediaPlayer.create(this, R.raw.tanwin_domah_syun);
        final MediaPlayer SuaraShad = MediaPlayer.create(this, R.raw.tanwin_domah_shun);
        final MediaPlayer SuaraDod = MediaPlayer.create(this, R.raw.tanwin_domah_dhun);
        final MediaPlayer SuaraTo = MediaPlayer.create(this, R.raw.tanwin_domah_thun);
        final MediaPlayer SuaraDo = MediaPlayer.create(this, R.raw.tanwin_domah_dzuun);
        final MediaPlayer SuaraAin = MediaPlayer.create(this, R.raw.tanwin_domah_uun);
        final MediaPlayer SuaraGin = MediaPlayer.create(this, R.raw.tanwin_domah_ghun);
        final MediaPlayer Suarafa = MediaPlayer.create(this, R.raw.tanwin_domah_fun);
        final MediaPlayer SuaraKof = MediaPlayer.create(this, R.raw.tanwin_domah_qun);
        final MediaPlayer SuaraKaf = MediaPlayer.create(this, R.raw.tanwin_domah_kun);
        final MediaPlayer SuaraLam = MediaPlayer.create(this, R.raw.tanwin_domah_lun);
        final MediaPlayer SuaraMim = MediaPlayer.create(this, R.raw.tanwin_domah_mun);
        final MediaPlayer SuaraNun = MediaPlayer.create(this, R.raw.tanwin_domah_nun);
        final MediaPlayer SuaraWawu = MediaPlayer.create(this, R.raw.tanwin_domah_wun);
        final MediaPlayer SuaraHA = MediaPlayer.create(this, R.raw.tanwin_domah_huun);
        final MediaPlayer SuaraYa = MediaPlayer.create(this, R.raw.tanwin_domah_yun);

        ImageButton ButtonSuara = (ImageButton) this.findViewById(R.id.domah_tain_alif); //fariabel button
        ImageButton ButtonSuara2 = (ImageButton) this.findViewById(R.id.domah_tain_ba);
        ImageButton ButtonSuara3 = (ImageButton) this.findViewById(R.id.domah_tain_ta);
        ImageButton ButtonSuara4 = (ImageButton) this.findViewById(R.id.domah_tain_tsa);
        ImageButton ButtonSuara5 = (ImageButton) this.findViewById(R.id.domah_tain_ja);
        ImageButton ButtonSuara6 = (ImageButton) this.findViewById(R.id.domah_tain_ha);
        ImageButton ButtonSuara7 = (ImageButton) this.findViewById(R.id.domah_tain_kha);
        ImageButton ButtonSuara8 = (ImageButton) this.findViewById(R.id.domah_tain_da);
        ImageButton ButtonSuara9 = (ImageButton) this.findViewById(R.id.domah_tain_dza);
        ImageButton ButtonSuara10 = (ImageButton) this.findViewById(R.id.domah_tain_ra);
        ImageButton ButtonSuara11 = (ImageButton) this.findViewById(R.id.domah_tain_za);
        ImageButton ButtonSuara12 = (ImageButton) this.findViewById(R.id.domah_tain_sin);
        ImageButton ButtonSuara13 = (ImageButton) this.findViewById(R.id.domah_tain_syin);
        ImageButton ButtonSuara14 = (ImageButton) this.findViewById(R.id.domah_tain_shad);
        ImageButton ButtonSuara15 = (ImageButton) this.findViewById(R.id.domah_tain_dhad);
        ImageButton ButtonSuara16 = (ImageButton) this.findViewById(R.id.domah_tain_tha);
        ImageButton ButtonSuara17 = (ImageButton) this.findViewById(R.id.domah_tain_dha);
        ImageButton ButtonSuara18 = (ImageButton) this.findViewById(R.id.domah_tain_ain);
        ImageButton ButtonSuara19 = (ImageButton) this.findViewById(R.id.domah_tain_ghain);
        ImageButton ButtonSuara20 = (ImageButton) this.findViewById(R.id.domah_tain_fa);
        ImageButton ButtonSuara21 = (ImageButton) this.findViewById(R.id.domah_tain_qof);
        ImageButton ButtonSuara22 = (ImageButton) this.findViewById(R.id.domah_tain_kaf);
        ImageButton ButtonSuara23 = (ImageButton) this.findViewById(R.id.domah_tain_lam);
        ImageButton ButtonSuara24 = (ImageButton) this.findViewById(R.id.domah_tain_mim);
        ImageButton ButtonSuara25 = (ImageButton) this.findViewById(R.id.domah_tain_nun);
        ImageButton ButtonSuara26 = (ImageButton) this.findViewById(R.id.domah_tain_wawu);
        ImageButton ButtonSuara27 = (ImageButton) this.findViewById(R.id.domah_tain_haa);
        ImageButton ButtonSuara28 = (ImageButton) this.findViewById(R.id.domah_tain_ya);

        /*Menghidupkan Suara */
        ButtonSuara.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_domahtain_un);
                TampilGambar.startAnimation(animScale);
                SuaraAlif.start();
            }
        });

        ButtonSuara2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_domahtain_bun);
                TampilGambar.startAnimation(animScale);
                SuaraBa.start();
            }
        });

        ButtonSuara3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_domahtain_tun);
                TampilGambar.startAnimation(animScale);
                SuaraTa.start();
            }
        });

        ButtonSuara4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_domahtain_tsun);
                TampilGambar.startAnimation(animScale);
                SuaraSa.start();
            }
        });
        ButtonSuara5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_domahtain_jun);
                TampilGambar.startAnimation(animScale);
                SuaraJim.start();
            }
        });
        ButtonSuara6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_domahtain_hun);
                TampilGambar.startAnimation(animScale);
                SuaraHa.start();
            }
        });
        ButtonSuara7.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_domahtain_khun);
                TampilGambar.startAnimation(animScale);
                SuaraKho.start();
            }
        });

        ButtonSuara8.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_domahtain_dun);
                TampilGambar.startAnimation(animScale);
                SuaraDal.start();
            }
        });

        ButtonSuara9.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_domahtain_dzun);
                TampilGambar.startAnimation(animScale);
                SuaraDzal.start();
            }
        });
        ButtonSuara10.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_domahtain_run);
                TampilGambar.startAnimation(animScale);
                SuaraRo.start();
            }
        });
        ButtonSuara11.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_domahtain_zun);
                TampilGambar.startAnimation(animScale);
                SuaraJa.start();
            }
        });

        ButtonSuara12.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_domahtain_sun);
                TampilGambar.startAnimation(animScale);
                SuaraSin.start();
            }
        });
        ButtonSuara13.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_domahtain_syun);
                TampilGambar.startAnimation(animScale);
                SuaraSyin.start();
            }
        });
        ButtonSuara14.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_domahtain_shun);
                TampilGambar.startAnimation(animScale);
                SuaraShad.start();
            }
        });

        ButtonSuara15.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_domahtain_dhun);
                TampilGambar.startAnimation(animScale);
                SuaraDod.start();
            }
        });

        ButtonSuara16.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_domahtain_thun);
                TampilGambar.startAnimation(animScale);
                SuaraTo.start();
            }
        });
        ButtonSuara17.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_domahtain_dzuun);
                TampilGambar.startAnimation(animScale);
                SuaraDo.start();
            }
        });
        ButtonSuara18.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_domahtain_uun);
                TampilGambar.startAnimation(animScale);
                SuaraAin.start();
            }
        });

        ButtonSuara19.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_domahtain_ghun);
                TampilGambar.startAnimation(animScale);
                SuaraGin.start();
            }
        });
        ButtonSuara20.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_domahtain_fun);
                TampilGambar.startAnimation(animScale);
                Suarafa.start();
            }
        });
        ButtonSuara21.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_domahtain_qun);
                TampilGambar.startAnimation(animScale);
                SuaraKof.start();
            }
        });
        ButtonSuara22.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.pop_domahtain_kun);
                TampilGambar.startAnimation(animScale);
                // TODO Auto-generated method stub
                SuaraKaf.start();
            }
        });
        ButtonSuara23.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_domahtain_lun);
                TampilGambar.startAnimation(animScale);
                SuaraLam.start();
            }
        });

        ButtonSuara24.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_domahtain_mun);
                TampilGambar.startAnimation(animScale);
                SuaraMim.start();
            }
        });
        ButtonSuara25.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_domahtain_nun);
                TampilGambar.startAnimation(animScale);

                SuaraNun.start();
            }
        });
        ButtonSuara26.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_domahtain_wun);
                TampilGambar.startAnimation(animScale);
                SuaraWawu.start();
            }
        });
        ButtonSuara27.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_domahtain_huun);
                TampilGambar.startAnimation(animScale);
                SuaraHA.start();
            }
        });
        ButtonSuara28.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_domahtain_yun);
                TampilGambar.startAnimation(animScale);
                SuaraYa.start();
            }
        });

    }
}
