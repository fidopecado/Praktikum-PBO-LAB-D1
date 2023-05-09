// Nama	: Firdaus Ravi Faizzani
// NIM	: 24060121130067
// Lab	: PBO D1

 import static java.lang.Math.PI;
 
 class Lingkaran implements IArea{
	private double jariJari;
	
	public Lingkaran(double r){
		jariJari = r;
	}
	
	public double hitungLuas(){
		return PI* jariJari * jariJari;
	}
 }
 
 