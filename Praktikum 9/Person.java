/*
	Nama		: Firdaus Ravi Faizzani
	NIM			: 24060121130067
	Tanggal		: 31 Mei 2023
*/

public class Person {
    private int id;
    private String name;
    public Person(String n){
        name = n;
    }
    public Person(int i, String n){
        id = i;
        name = n;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
}
