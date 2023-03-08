/**
 * File : Titik.java 21/02/23
 * Penulis : Asisten Praktikum Lab D
 * Deskripsi : kelas yang berisi program untuk menjalankan kelas Titik.
 * 
 */ 
package com.Praktikum;

 class MTitik{
	 public static void main(String[] args){
		//titik t1=(1,2)
        Titik t1 = new Titik(1,2);
		//titik t2=(3,4)
        Titik t2 = new Titik(3,4);
		//titik t3=(5,6)
        Titik t3 = new Titik(5,6);
		
		//run program
        System.out.println("Jumlah objek titik : "+ t3.getCounterTitik());
        System.out.println("t1("+t1.getAbsis()+","+t1.getOrdinat()+")");
        System.out.println("t2("+t2.getAbsis()+","+t2.getOrdinat()+")");
        System.out.println("t3("+t3.getAbsis()+","+t3.getOrdinat()+")");
	 }
 }
 