/*
	Nama		: Firdaus Ravi Faizzani
	NIM			: 24060121130067
	Tanggal		: 31 Mei 2023
*/

public class MainDAO {
    public static void main(String[] args){
        Person person = new Person("Kurniawan");
        DAOManager m = new DAOManager();
        m.setPersonDAO(new MySQLPersonDAO());
        try{
            m.getPersonDAO().savePerson(person);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
