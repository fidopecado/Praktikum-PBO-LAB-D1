// Nama	: Firdaus Ravi Faizzani
// NIM	: 24060121130067
// Lab	: PBO D1

public class Asersi1{
    public static void main(String[] args){
        int x=0;
        if(x>0){
            System.out.println("x adalah bilangan positif");
        }
        else{
            assert(x<0):"Ada kesalahan kode";
            System.out.println("x adalah bilangan negatif");
        }
    }
}