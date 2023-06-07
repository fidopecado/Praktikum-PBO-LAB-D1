package Map;

/*
	Nama		: Firdaus Ravi Faizzani
	NIM		: 24060121130067
	Tanggal		: 31 Mei 2023
*/

import java.util.*;

public class MapTest {
	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap<Integer,String>();
		//mengassign elemen kunci dan nilai 
		map.put(01, "Juni");
		map.put(05, "Maret");
		//mengambil elemen pertama
		System.out.println(map.get(01));
		//mengambil keseluruhan kunci sebagai objek collection set
		Set<Integer> keys = map.keySet();
		//iterasi untuk menampilkan keseluruhan nilai collection set berdasarkan kuncinya
		for(Integer key: keys){
			System.out.println(key + " : " + map.get(key));
		}
	}   
}
