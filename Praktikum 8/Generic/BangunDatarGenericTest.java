package Generic;

/*
	Nama		: Firdaus Ravi Faizzani
	NIM			: 24060121140035
	Tanggal		: 31 Mei 2023
*/

public class BangunDatarGenericTest{
	public static void main(String[] args){
	Lingkaran Bulat = new Lingkaran(4);
	BangunDatarGeneric<Lingkaran> Datar1 = new BangunDatarGeneric<Lingkaran>();
	Datar1.set(Bulat);
	System.out.println("keliling lingkaran : " +Datar1.hitungKeliling());
	System.out.println("tipe generic : " +Datar1.get().getClass().getName());
	}
}