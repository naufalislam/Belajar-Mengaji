package com.pale.belajarmengaji;

/**
 * Created by Naufal Islam 29 November 2018
 */
import java.util.Random;

/**
 * Created by Naufal Islam 29 November 2018
 */
public class BacaanHarokat {
    private int listhuruf[] = {
            R.drawable.harokatdomah_fu,
            R.drawable.harokatdomah_huu,
            R.drawable.harokatdomah_ku,
            R.drawable.harokatdomah_lu,
            R.drawable.harokatdomah_mu,
            R.drawable.harokatdomah_nu,
            R.drawable.harokatdomah_qu,
            R.drawable.harokatdomah_wu,
            R.drawable.harokatfathah_a,
            R.drawable.harokatfathah_ba,
            R.drawable.harokatfathah_da,
            R.drawable.harokatfathah_dza,
            R.drawable.harokatfathah_ha,
            R.drawable.harokatfathah_ja,
            R.drawable.harokatfathah_kha,
            R.drawable.harokatfathah_ra,
            R.drawable.harokatfathah_ta,
            R.drawable.harokatfathah_tsa,
            R.drawable.harokatkasroh_ain,
            R.drawable.harokatkasroh_dhi,
            R.drawable.harokatkasroh_dzhi,
            R.drawable.harokatkasroh_ghi,
            R.drawable.harokatkasroh_shi,
            R.drawable.harokatkasroh_si,
            R.drawable.harokatkasroh_shi,
            R.drawable.harokatkasroh_thi,
            R.drawable.harokatkasroh_zi,

    };

    private int listhuruf2[] = {
            R.drawable.domah_fu,
            R.drawable.domah_huu,
            R.drawable.domah_ku,
            R.drawable.domah_lu,
            R.drawable.domah_mu,
            R.drawable.domah_nu,
            R.drawable.domah_qu,
            R.drawable.domah_wu,
            R.drawable.fatah_a,
            R.drawable.fatah_ba,
            R.drawable.fatah_da,
            R.drawable.fatah_dza,
            R.drawable.fatah_ha,
            R.drawable.fatah_ja,
            R.drawable.fatah_kha,
            R.drawable.fatah_ro,
            R.drawable.fatah_ta,
            R.drawable.fatah_tsa,
            R.drawable.kasroh_ain,
            R.drawable.kasroh_dhi,
            R.drawable.kasroh_dzhi,
            R.drawable.kasroh_ghi,
            R.drawable.kasroh_shi,
            R.drawable.kasroh_si,
            R.drawable.kasroh_shi,
            R.drawable.kasroh_thi,
            R.drawable.kasroh_za,
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
