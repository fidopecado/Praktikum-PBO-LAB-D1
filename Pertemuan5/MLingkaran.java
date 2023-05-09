// Nama	: Firdaus Ravi Faizzani
// NIM	: 24060121130067
// Lab	: PBO D1

import java.util.Scanner;

public class MLingkaran{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Masukkan panjang jari-jari lingkaran : ");
		double jariJari = scan.nextDouble();
		Lingkaran l = new Lingkaran(jariJari);
		System.out.println("Luas lingkaran dengan "+
			"jari-jari "+jariJari+" satuan adalah "+l.hitungLuas());
	}
 }
  