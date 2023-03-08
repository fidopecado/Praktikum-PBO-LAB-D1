// Nama : Firdaus Ravi Faizzani
// NIM	: 24060121130067
// Tanggal : 01/03/23
package com.Praktikum;

public class OperasiTitik {

    private static void refleksiSumbuX(Titik t){
        //t.ordinat = t.ordinat * -1;
        double x;
        x = t.getOrdinat();
        x *= -1;
        t.setOrdinat(x);
    }

    private static void refleksiSumbuY(Titik t){
       // t.absis = t.absis * -1;
       double x;
        x = t.getAbsis();
        x *= -1;
        t.setAbsis(x);
    }

    public double refleksiX(Titik t){
        double x;
        refleksiSumbuX(t);
        x = t.getOrdinat();
        return x;
    }

    public double refleksiY(Titik t){
        double x;
        refleksiSumbuY(t);
        x = t.getAbsis();
        return x;
    }
}
