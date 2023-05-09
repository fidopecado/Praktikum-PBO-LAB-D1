// Nama	: Firdaus Ravi Faizzani
// NIM	: 24060121130067
// Lab	: PBO D1

package org.bangunruang;
import org.bangundatar.BujurSangkar;

public class Kubus{
	private BujurSangkar permukaan;
	public Kubus(BujurSangkar permukaan){
		this.permukaan = permukaan;
	}
	public double hitungVolume(){
		double panjangSisi = permukaan.getPanjangSisi();
		return panjangSisi * panjangSisi * panjangSisi;
	}
	public double hitungLuasAlas(){
		double panjangSisi = permukaan.getPanjangSisi();
		return panjangSisi * panjangSisi;
	}
}