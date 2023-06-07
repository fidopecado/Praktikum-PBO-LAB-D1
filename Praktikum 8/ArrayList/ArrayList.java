package ArrayList;

import java.util.ArrayList;

/*
	Nama		: Firdaus Ravi Faizzani
	NIM		: 24060121130067
	Tanggal		: 31 Mei 2023
*/

public class ArrayListTest {
    public static void main(String[] args) {
		//inisialisasi ArrayList yang hanya dapat berisi objek string
        ArrayList<String> arrString = new ArrayList<String>();
        // menambahkan elemen
        arrString.add("Nasi");
        arrString.add("Sate");
        arrString.add("dan Esteh");
        // menghapus elemen arrString
        arrString.remove("Sate");
		//iterasi untuk menampilkan pada keseluruhan isi ArrayList
        for(String s : arrString){
            System.out.print(s+" ");
        }
        
    }
}
