// Nama : Firdaus Ravi Faizzani
// NIM	: 24060121130067
// Tanggal : 22/02/23
package com.Praktikum;

 class Titik{
	double absis; //absis
	double ordinat; //ordinat
	static int counterTitik; //penghitung objek titik yang telah dibuat
	
	Titik(){
		counterTitik++;
		absis = 0;
		ordinat = 0;
	}

	Titik(double a, double o){
        counterTitik++;
        absis = a;
        ordinat = o;
    }
	
	void setAbsis(double a){
		absis = a;
	}
	
	void setOrdinat(double o){
		ordinat = o;
	}
	
	double getAbsis(){
		return absis;
	}
	
	double getOrdinat(){
		return ordinat;
	}
	
	int getCounterTitik(){
		return counterTitik;
	}

 }
 
 
 