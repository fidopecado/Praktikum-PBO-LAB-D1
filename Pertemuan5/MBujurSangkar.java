// Nama	: Firdaus Ravi Faizzani
// NIM	: 24060121130067
// Lab	: PBO D1

import java.util.Scanner;

public class MBujurSangkar{
	public static void main(String[] args){
		BujurSangkar bs = new BujurSangkar();
		Scanner scan = new Scanner(System.in);
		System.out.print("Masukkan panjang sisi bujur sangkar : ");
		double sisi = scan.nextDouble();
		System.out.println("Luas bujur sangkar dengan sisi "+sisi+
					" satuan adalah "+bs.hitungLuas(sisi));
	}
}
 
 
 