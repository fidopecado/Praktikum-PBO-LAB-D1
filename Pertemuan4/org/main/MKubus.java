// Nama	: Firdaus Ravi Faizzani
// NIM	: 24060121130067
// Lab	: PBO D1

package org.main;
import org.bangunruang.*;
import org.bangundatar.*;

public class MKubus{
	public static void main(String[] args){
		BujurSangkar persegi = new BujurSangkar(4);
		Kubus kubus = new Kubus(persegi);
		System.out.println("Volume Kubus : "+kubus.hitungVolume());
		System.out.println("Luas Alas Kubus : "+kubus.hitungLuasAlas());
	}
}