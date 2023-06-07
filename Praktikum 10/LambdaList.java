import java.util.ArrayList;

/*
	Nama		: Firdaus Ravi Faizzani
	NIM			: 24060121130067
	Tanggal		: 31 Mei 2023
*/

public class LambdaList {
    public static void main(String[] args){
        ArrayList<String> mahasiswaList = new ArrayList<>();
        mahasiswaList.add("Parto");
        mahasiswaList.add("Patrick");
        mahasiswaList.add("Herlambang");
        mahasiswaList.add("Jamal");
        mahasiswaList.forEach((nama) -> System.out.println(nama));
    }
}
