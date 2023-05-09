// Nama	: Firdaus Ravi Faizzani
// NIM	: 24060121130067
// Lab	: PBO D1

package org.bangundatar;
import org.poligon.Poligon;

public class BujurSangkar extends Poligon{
	private double panjangSisi;
	public BujurSangkar(double panjangSisi){
		this.panjangSisi = panjangSisi;
	}
	public double hitungLuas(){
		return panjangSisi * panjangSisi;
	}
	public double getPanjangSisi(){
		return panjangSisi;
	}
}