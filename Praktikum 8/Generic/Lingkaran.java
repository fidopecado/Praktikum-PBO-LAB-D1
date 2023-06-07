package Generic;

/*
	Nama		: Firdaus Ravi Faizzani
	NIM			: 24060121140035
	Tanggal		: 31 Mei 2023
*/

public class Lingkaran extends BangunDatar{
	private double Jari2;
	
	public Lingkaran(double Jari2){
		this.Jari2 = Jari2;
	}
	public double hitungKeliling(){
		return 2*Jari2*3.14;
	}
}