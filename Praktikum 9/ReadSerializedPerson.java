import java.io.*;

/*
	Nama		: Firdaus Ravi Faizzani
	NIM			: 24060121130067
	Tanggal		: 31 Mei 2023
*/

public class ReadSerializedPerson {
    public static void main(String[] args){
        Person person = null;
        try{
            FileInputStream f = new FileInputStream("person.ser");
            ObjectInputStream s = new ObjectInputStream(f);
            person = (Person)s.readObject();
            s.close();
            System.out.println("serial person name = "+person.getName());
        }
        catch(Exception ioe){
            ioe.printStackTrace();
        }
    }
}
