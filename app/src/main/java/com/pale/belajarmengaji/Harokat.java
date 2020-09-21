package com.pale.belajarmengaji;
/**
 * Created by Naufal Islam 29 November 2018.
 */

import java.util.Random;

/**
 * Created by Ujang Wahyu on 04/06/2016.
 */
public class Harokat {

    private int listhuruf[] = {
            R.drawable.pop_fatah_a,
            R.drawable.pop_fatah_ain,
            R.drawable.pop_fatah_ba,
            R.drawable.pop_fatah_da,
            R.drawable.pop_fatah_dha,
            R.drawable.pop_fatah_dza,
            R.drawable.pop_fatah_dzaa,
            R.drawable.pop_fatah_fa,
            R.drawable.pop_fatah_gha,
            R.drawable.pop_kasroh_shi,
            R.drawable.pop_kasroh_ri,
            R.drawable.pop_kasroh_qi,
            R.drawable.pop_kasroh_mi,
            R.drawable.pop_kasroh_ni,
            R.drawable.pop_kasroh_li,
            R.drawable.pop_kasroh_ki,
            R.drawable.pop_kasroh_ji,
            R.drawable.pop_kasroh_ii,
            R.drawable.pop_domahtain_u,
            R.drawable.pop_domah_bu,
            R.drawable.pop_domahtain_tu,
            R.drawable.pop_domahtain_su,
            R.drawable.pop_domahtain_qu,
            R.drawable.pop_domahtain_lu,
            R.drawable.pop_domahtain_mu,
            R.drawable.pop_domahtain_khu,
            R.drawable.pop_domahtain_zu,
            R.drawable.pop_domahtain_ru
    };

    private int listhuruf2[] = {
            R.drawable.fatah_a,
            R.drawable.fatah_aa,
            R.drawable.fatah_ba,
            R.drawable.fatah_da,
            R.drawable.fatah_dho,
            R.drawable.fatah_dza,
            R.drawable.fatah_dzo,
            R.drawable.fatah_fa,
            R.drawable.fatah_gho,
            R.drawable.kasroh_shi,
            R.drawable.kasroh_ri,
            R.drawable.kasroh_qi,
            R.drawable.kasroh_mi,
            R.drawable.kasroh_nun,
            R.drawable.kasroh_li,
            R.drawable.kasroh_ki,
            R.drawable.kasroh_ji,
            R.drawable.kasroh_i,
            R.drawable.domah_u,
            R.drawable.domah_bu,
            R.drawable.domah_tu,
            R.drawable.domah_su,
            R.drawable.domah_qu,
            R.drawable.domah_lu,
            R.drawable.domah_mu,
            R.drawable.domah_hu,
            R.drawable.domah_zu,
            R.drawable.domah_ru
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
