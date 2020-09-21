package com.pale.belajarmengaji;

/**
 * Created by Naufal Islam 29 November 2018.
 */

import java.util.Random;

/**
 * Created by Naufal Islam 29 November 2018.
 */
public class BacaanTanwin { private int listhuruf[] = {
        R.drawable.c_domahtain_bun,
        R.drawable.c_domahtain_dun,
        R.drawable.c_domahtain_dzun,
        R.drawable.c_domahtain_hun,
        R.drawable.c_domahtain_jun,
        R.drawable.c_domahtain_khun,
        R.drawable.c_domahtain_tsun,
        R.drawable.c_domahtain_tun,
        R.drawable.c_domahtain_un,
        R.drawable.c_fatahtain_fan,
        R.drawable.c_fatahtain_haan,
        R.drawable.c_fatahtain_kan,
        R.drawable.c_fatahtain_lan,
        R.drawable.c_fatahtain_man,
        R.drawable.c_fatahtain_nan,
        R.drawable.c_fatahtain_qan,
        R.drawable.c_fatahtain_wan,
        R.drawable.c_fatahtain_yan,
        R.drawable.c_kasrohtain_dhin,
        R.drawable.c_kasrohtain_dzhin,
        R.drawable.c_kasrohtain_ghin,
        R.drawable.c_kasrohtain_iin,
        R.drawable.c_kasrohtain_rin,
        R.drawable.c_kasrohtain_shin,
        R.drawable.c_kasrohtain_sin,
        R.drawable.c_kasrohtain_syin,
        R.drawable.c_kasrohtain_tin,
        R.drawable.c_kasrohtain_zin

};

    private int listhuruf2[] = {
            R.drawable.domah_tain_ba,
            R.drawable.domah_tain_da,
            R.drawable.domah_tain_dza,
            R.drawable.domah_tain_haa,
            R.drawable.domah_tain_ja,
            R.drawable.domah_tain_kha,
            R.drawable.domah_tain_tsa,
            R.drawable.domah_tain_ta,
            R.drawable.domah_tain_alif,
            R.drawable.tain_fan,
            R.drawable.tain_han,
            R.drawable.tain_kan,
            R.drawable.tain_lan,
            R.drawable.tain_man,
            R.drawable.tain_nan,
            R.drawable.tain_qon,
            R.drawable.tain_wan,
            R.drawable.tain_yan,
            R.drawable.kasrohtain_dhin,
            R.drawable.kasrohtain_dzin,
            R.drawable.kasrohtain_gin,
            R.drawable.kasrohtain_ain,
            R.drawable.kasrohtain_rin,
            R.drawable.kasrohtain_shin,
            R.drawable.kasrohtain_sin,
            R.drawable.kasrohtain_syin,
            R.drawable.kasrohtain_tin,
            R.drawable.kasrohtain_zin,
    };



    public int[] getlist(){
        return listhuruf;
    }
    public int[] getlist2(){
        return listhuruf2;
    }

    public int getrandomhuruf(){
        int rnd = new Random().nextInt(listhuruf.length);
        return rnd;
    }

    public int getimagesoal(int i){
        return listhuruf[i];
    }

    public int getimagejwbn(int i){
        return listhuruf2[i];
    }

    public int getjumlah(){
        return listhuruf.length;
    }
    public int getjumlah2(){
        return listhuruf2.length;
    }
}