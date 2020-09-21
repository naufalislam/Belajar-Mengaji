package com.pale.belajarmengaji;

import java.util.Random;

/**
 * Created by Naufal Islam 29 November 2018.
 */

public class Tanwin{
    private int listhuruf[] = {
            R.drawable.pop_fatahtain_ban,
            R.drawable.pop_fatahtain_dan,
            R.drawable.pop_fatahtain_fan,
            R.drawable.pop_fatahtain_ghan,
            R.drawable.pop_fatahtain_an,
            R.drawable.pop_fatahtain_ma,
            R.drawable.pop_fatahtain_qan,
            R.drawable.pop_fatahtain_tan,
            R.drawable.pop_fatahtain_san,
            R.drawable.pop_fatahtain_syan,
            R.drawable.pop_domahtain_khu,
            R.drawable.pop_domahtain_wun,
            R.drawable.pop_domahtain_tsun,
            R.drawable.pop_domahtain_jun,
            R.drawable.pop_domahtain_lun,
            R.drawable.pop_domahtain_qun,
            R.drawable.pop_domahtain_mun,
            R.drawable.pop_domahtain_hun,
            R.drawable.pop_domahtain_dzun,
            R.drawable.pop_kasroh_tain_hiin,
            R.drawable.pop_kasroh_tain_min,
            R.drawable.pop_kasroh_tain_rin,
            R.drawable.pop_kasroh_tain_syin,
            R.drawable.pop_kasroh_tain_yin,
            R.drawable.pop_kasroh_tain_tin,
            R.drawable.pop_kasroh_tain_din,
            R.drawable.pop_kasroh_tain_nin,
            R.drawable.pop_kasroh_tain_zin
    };

    private int listhuruf2[] = {
            R.drawable.tain_ban,
            R.drawable.tain_dan,
            R.drawable.tain_fan,
            R.drawable.tain_ghon,
            R.drawable.tain_an,
            R.drawable.tain_man,
            R.drawable.tain_qon,
            R.drawable.tain_tan,
            R.drawable.tain_san,
            R.drawable.tain_syan,
            R.drawable.domah_tain_kha,
            R.drawable.domah_tain_wawu,
            R.drawable.domah_tain_tsa,
            R.drawable.domah_tain_ja,
            R.drawable.domah_tain_lam,
            R.drawable.domah_tain_qof,
            R.drawable.domah_tain_mim,
            R.drawable.domah_tain_ha,
            R.drawable.domah_tain_dza,
            R.drawable.kasrohtain_hiin,
            R.drawable.kasrohtain_min,
            R.drawable.kasrohtain_rin,
            R.drawable.kasrohtain_syin,
            R.drawable.kasrohtain_yin,
            R.drawable.kasrohtain_tin,
            R.drawable.kasrohtain_din,
            R.drawable.kasrohtain_nin,
            R.drawable.kasrohtain_zin
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