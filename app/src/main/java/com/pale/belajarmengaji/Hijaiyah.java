package com.pale.belajarmengaji;
/**
 * Created by Naufal Islam 29 November2018.
 */

import java.util.Random;
/**
 * Created by Ujang Wahyu on 03/06/2016.
 */
public class Hijaiyah {
    private int listhuruf[] = {
            R.drawable.pop_ain,
            R.drawable.pop_ba,
            R.drawable.pop_ta,
            R.drawable.pop_haa,
            R.drawable.pop_jim,
            R.drawable.pop_tha,
            R.drawable.pop_wawu,
            R.drawable.pop_tsa,
            R.drawable.pop_qaf,
            R.drawable.pop_lam,
            R.drawable.pop_mim,
            R.drawable.pop_nun,
            R.drawable.pop_ha,
            R.drawable.pop_alif,
            R.drawable.pop_ra,
            R.drawable.pop_zai,
            R.drawable.pop_ya,
            R.drawable.pop_kha,
            R.drawable.pop_dal,
            R.drawable.pop_shad
    };

    private int listhuruf2[] = {
            R.drawable.aa_ain,
            R.drawable.aa_ba,
            R.drawable.aa_ta,
            R.drawable.aa_haa,
            R.drawable.aa_ja,
            R.drawable.aa_tho,
            R.drawable.aa_wau,
            R.drawable.aa_tsa,
            R.drawable.aa_kof,
            R.drawable.aa_lam,
            R.drawable.aa_mim,
            R.drawable.aa_nun,
            R.drawable.aa_ha,
            R.drawable.aa_alif,
            R.drawable.aa_ro,
            R.drawable.aa_za,
            R.drawable.aa_ya,
            R.drawable.aa_kha,
            R.drawable.aa_da,
            R.drawable.aa_sod
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