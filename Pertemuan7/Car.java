// Nama	: Firdaus Ravi Faizzani
// NIM	: 24060121130067
// Lab	: PBO D1

public class Car extends Vehicle{
    void calRent(int jarak,float harga){
        float fare=jarak*harga;
        fare=fare-100.00f;
        System.out.println("Harga sewa mobil = "+fare);
    }
}
