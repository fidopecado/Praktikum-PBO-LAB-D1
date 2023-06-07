import java.util.HashMap;
import java.util.Map;
/*
	Nama		: Firdaus Ravi Faizzani
	NIM			: 24060121130067
	Tanggal		: 31 Mei 2023
*/

public class LambdaHashmap 
{
    public static void main(String[] args) 
    {
        Map<Integer, String> mahasiswaMap = new HashMap<>();
        mahasiswaMap.put(234123, "Eci");
        mahasiswaMap.put(456322, "Wowo");
        mahasiswaMap.put(353477, "Lamo");
        mahasiswaMap.put(534528, "Danang");
        mahasiswaMap.put(664569, "Parto");
        mahasiswaMap.put(456451, "Hanna");
        mahasiswaMap.put(123242, "Patrick");
        mahasiswaMap.put(354364, "Herlambang");
        mahasiswaMap.put(835435, "Jamal");
        mahasiswaMap.put(534543, "Parmin");

        mahasiswaMap.forEach((nim, nama) -> System.out.println("NIM: " + nim + ", Nama: " + nama));
    }
}