// Nama : Firdaus Ravi Faizzani
// NIM	: 24060121130067
// Tanggal : 01/03/23

package com.Praktikum;

public class MOperasiTitik {
    public static void main(String[] args) {
        Titik t = new Titik(4,4);
        OperasiTitik o = new OperasiTitik();
        System.out.println("Titik t : ("+t.getAbsis()+","+t.getOrdinat()+")");
        //Refleksi Terhadap Sumbu Y
        System.out.println("Titik t : ("+o.refleksiY(t)+","+t.getOrdinat()+")");
        //Refleksi Lagi Terhadap Sumbu X
        System.out.println("Titik t : ("+t.getAbsis()+","+o.refleksiX(t)+")");
        //Refleksi Terhadap Sumbu X dan Y
        System.out.println("Titik t : ("+o.refleksiY(t)+","+o.refleksiX(t)+")");
    }
}
