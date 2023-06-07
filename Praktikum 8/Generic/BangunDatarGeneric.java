package Generic;

/*
	Nama		: Firdaus Ravi Faizzani
	NIM		: 24060121130067
	Tanggal		: 31 Mei 2023
*/

public class BangunDatarGeneric<A1 extends BangunDatar>{
	private A1 bangunDatar;
	
	public void set(A1 tipeBangunDatar){
		bangunDatar = tipeBangunDatar;
	}
	
	public A1 get(){
		return bangunDatar;
	}
	
	public double hitungKeliling(){
		return bangunDatar.hitungKeliling();
	}
}

