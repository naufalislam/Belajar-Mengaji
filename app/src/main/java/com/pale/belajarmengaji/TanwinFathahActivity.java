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

public class TanwinFathahActivity extends AppCompatActivity {
    ImageView TampilGambar;
    ImageButton show,hide,help,next_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tanwin_fathah);
        //Untuk fullscreen layar
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        TampilGambar = (ImageView)findViewById(R.id.tampil_hijaiyah4);
        final Animation animScale = AnimationUtils.loadAnimation(this, R.anim.anim_scale);
        show = (ImageButton)findViewById(R.id.tain_an);
        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TampilGambar.setVisibility(View.VISIBLE);
            }
        });
        //Untuk Menambahkan Button Suara
        final MediaPlayer SuaraAlif = MediaPlayer.create(this, R.raw.tanwin_fatah_an); //Memanggil nama lagu
        final MediaPlayer SuaraBa = MediaPlayer.create(this, R.raw.tanwin_fatah_ban);
        final MediaPlayer SuaraTa = MediaPlayer.create(this, R.raw.tanwin_fatah_tan);
        final MediaPlayer SuaraSa = MediaPlayer.create(this, R.raw.tanwin_fatah_tsan);
        final MediaPlayer SuaraJim = MediaPlayer.create(this, R.raw.tanwin_fatah_jan);
        final MediaPlayer SuaraHa = MediaPlayer.create(this, R.raw.tanwin_fatah_han);
        final MediaPlayer SuaraKho = MediaPlayer.create(this, R.raw.tanwin_fatah_khon);
        final MediaPlayer SuaraDal = MediaPlayer.create(this, R.raw.tanwin_fatah_dan);
        final MediaPlayer SuaraDzal = MediaPlayer.create(this, R.raw.tanwin_fatah_dzan);
        final MediaPlayer SuaraRo = MediaPlayer.create(this, R.raw.tanwin_fatah_ron);
        final MediaPlayer SuaraJa = MediaPlayer.create(this, R.raw.tanwin_fatah_zan);
        final MediaPlayer SuaraSin = MediaPlayer.create(this, R.raw.tanwin_fatah_san);
        final MediaPlayer SuaraSyin = MediaPlayer.create(this, R.raw.tanwin_fatah_syan);
        final MediaPlayer SuaraShad = MediaPlayer.create(this, R.raw.button);
        final MediaPlayer SuaraDod = MediaPlayer.create(this, R.raw.tanwin_fatah_dhon);
        final MediaPlayer SuaraTo = MediaPlayer.create(this, R.raw.tanwin_fatah_thon);
        final MediaPlayer SuaraDo = MediaPlayer.create(this, R.raw.tanwin_fatah_dhon);
        final MediaPlayer SuaraAin = MediaPlayer.create(this, R.raw.tanwin_fatah_aan);
        final MediaPlayer SuaraGin = MediaPlayer.create(this, R.raw.tanwin_fatah_ghon);
        final MediaPlayer Suarafa = MediaPlayer.create(this, R.raw.tanwin_fatah_fan);
        final MediaPlayer SuaraKof = MediaPlayer.create(this, R.raw.tanwin_fatah_qon);
        final MediaPlayer SuaraKaf = MediaPlayer.create(this, R.raw.tanwin_fatah_kan);
        final MediaPlayer SuaraLam = MediaPlayer.create(this, R.raw.tanwin_fatah_lan);
        final MediaPlayer SuaraMim = MediaPlayer.create(this, R.raw.tanwin_fatah_man);
        final MediaPlayer SuaraNun = MediaPlayer.create(this, R.raw.tanwin_fatah_nan);
        final MediaPlayer SuaraWawu = MediaPlayer.create(this, R.raw.button);
        final MediaPlayer SuaraHA = MediaPlayer.create(this, R.raw.tanwin_fatah_haan);
        final MediaPlayer SuaraYa = MediaPlayer.create(this, R.raw.tanwin_fatah_yan);

        ImageButton ButtonSuara = (ImageButton) this.findViewById(R.id.tain_an); //fariabel button
        ImageButton ButtonSuara2 = (ImageButton) this.findViewById(R.id.tain_ban);
        ImageButton ButtonSuara3 = (ImageButton) this.findViewById(R.id.tain_tan);
        ImageButton ButtonSuara4 = (ImageButton) this.findViewById(R.id.tain_tsin);
        ImageButton ButtonSuara5 = (ImageButton) this.findViewById(R.id.tain_jan);
        ImageButton ButtonSuara6 = (ImageButton) this.findViewById(R.id.tain_han);
        ImageButton ButtonSuara7 = (ImageButton) this.findViewById(R.id.tain_khan);
        ImageButton ButtonSuara8 = (ImageButton) this.findViewById(R.id.tain_dan);
        ImageButton ButtonSuara9 = (ImageButton) this.findViewById(R.id.tain_dzan);
        ImageButton ButtonSuara10 = (ImageButton) this.findViewById(R.id.tain_ron);
        ImageButton ButtonSuara11 = (ImageButton) this.findViewById(R.id.tain_zan);
        ImageButton ButtonSuara12 = (ImageButton) this.findViewById(R.id.tain_san);
        ImageButton ButtonSuara13 = (ImageButton) this.findViewById(R.id.tain_syan);
        ImageButton ButtonSuara14 = (ImageButton) this.findViewById(R.id.tain_shon);
        ImageButton ButtonSuara15 = (ImageButton) this.findViewById(R.id.tain_dhon);
        ImageButton ButtonSuara16 = (ImageButton) this.findViewById(R.id.tain_thon);
        ImageButton ButtonSuara17 = (ImageButton) this.findViewById(R.id.tain_dzon);
        ImageButton ButtonSuara18 = (ImageButton) this.findViewById(R.id.tain_ain);
        ImageButton ButtonSuara19 = (ImageButton) this.findViewById(R.id.tain_ghon);
        ImageButton ButtonSuara20 = (ImageButton) this.findViewById(R.id.tain_fan);
        ImageButton ButtonSuara21 = (ImageButton) this.findViewById(R.id.tain_qon);
        ImageButton ButtonSuara22 = (ImageButton) this.findViewById(R.id.tain_kan);
        ImageButton ButtonSuara23 = (ImageButton) this.findViewById(R.id.tain_lan);
        ImageButton ButtonSuara24 = (ImageButton) this.findViewById(R.id.tain_man);
        ImageButton ButtonSuara25 = (ImageButton) this.findViewById(R.id.tain_nan);
        ImageButton ButtonSuara26 = (ImageButton) this.findViewById(R.id.tain_wan);
        ImageButton ButtonSuara27 = (ImageButton) this.findViewById(R.id.tain_hann);
        ImageButton ButtonSuara28 = (ImageButton) this.findViewById(R.id.tain_yan);

        /*Menghidupkan Suara */
        ButtonSuara.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_fatahtain_an);
                TampilGambar.startAnimation(animScale);
                SuaraAlif.start();
            }
        });

        ButtonSuara2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_fatahtain_ban);
                TampilGambar.startAnimation(animScale);
                SuaraBa.start();
            }
        });

        ButtonSuara3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_fatahtain_tan);
                TampilGambar.startAnimation(animScale);
                SuaraTa.start();
            }
        });

        ButtonSuara4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_fatahtain_tsan);
                TampilGambar.startAnimation(animScale);
                SuaraSa.start();
            }
        });
        ButtonSuara5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_fatahtain_jan);
                TampilGambar.startAnimation(animScale);
                SuaraJim.start();
            }
        });
        ButtonSuara6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_fatahtain_han);
                TampilGambar.startAnimation(animScale);
                SuaraHa.start();
            }
        });
        ButtonSuara7.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_fatahtain_khan);
                TampilGambar.startAnimation(animScale);
                SuaraKho.start();
            }
        });

        ButtonSuara8.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_fatahtain_dan);
                TampilGambar.startAnimation(animScale);
                SuaraDal.start();
            }
        });

        ButtonSuara9.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_fatahtain_dzan);
                TampilGambar.startAnimation(animScale);
                SuaraDzal.start();
            }
        });
        ButtonSuara10.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_fatahtain_ran);
                TampilGambar.startAnimation(animScale);
                SuaraRo.start();
            }
        });
        ButtonSuara11.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_fatahtain_zan);
                TampilGambar.startAnimation(animScale);
                SuaraJa.start();
            }
        });

        ButtonSuara12.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_fatahtain_san);
                TampilGambar.startAnimation(animScale);
                SuaraSin.start();
            }
        });
        ButtonSuara13.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_fatahtain_syan);
                TampilGambar.startAnimation(animScale);
                SuaraSyin.start();
            }
        });
        ButtonSuara14.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_fatahtain_shan);
                TampilGambar.startAnimation(animScale);
                SuaraShad.start();
            }
        });

        ButtonSuara15.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_fatahtain_dhan);
                TampilGambar.startAnimation(animScale);
                SuaraDod.start();
            }
        });
        ButtonSuara16.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_fatahtain_than);
                TampilGambar.startAnimation(animScale);
                SuaraTo.start();
            }
        });
        ButtonSuara17.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_fatahtain_dzan);
                TampilGambar.startAnimation(animScale);
                SuaraDo.start();
            }
        });
        ButtonSuara18.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_fatahtain_aan);
                TampilGambar.startAnimation(animScale);
                SuaraAin.start();
            }
        });

        ButtonSuara19.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_fatahtain_ghan);
                TampilGambar.startAnimation(animScale);
                SuaraGin.start();
            }
        });
        ButtonSuara20.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_fatahtain_fan);
                TampilGambar.startAnimation(animScale);
                Suarafa.start();
            }
        });
        ButtonSuara21.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_fatahtain_qan);
                TampilGambar.startAnimation(animScale);
                SuaraKof.start();
            }
        });
        ButtonSuara22.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.pop_fatahtain_kan);
                TampilGambar.startAnimation(animScale);
                // TODO Auto-generated method stub
                SuaraKaf.start();
            }
        });
        ButtonSuara23.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_fatahtain_lan);
                TampilGambar.startAnimation(animScale);
                SuaraLam.start();
            }
        });

        ButtonSuara24.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_fatahtain_ma);
                TampilGambar.startAnimation(animScale);
                SuaraMim.start();
            }
        });
        ButtonSuara25.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_fatahtain_nan);
                TampilGambar.startAnimation(animScale);

                SuaraNun.start();
            }
        });
        ButtonSuara26.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_fatahtain_wan);
                TampilGambar.startAnimation(animScale);
                SuaraWawu.start();
            }
        });
        ButtonSuara27.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_fatahtain_haan);
                TampilGambar.startAnimation(animScale);
                SuaraHA.start();
            }
        });
        ButtonSuara28.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_fatahtain_yan);
                TampilGambar.startAnimation(animScale);
                SuaraYa.start();
            }
        });
    }
}
