package p11_09_2023;

public class Zadatak1 {
    public static void main(String[] args) {
        //. Zadatak
        //Kreirati klasu Student koja ima:
        //ime
        //prezime
        //broj indeksa (int)
        //da li je na budzetu
        //gettere i settere za sve atributge
        //(dopuna) Kreirati metodu za stampu koja stampa sve podatke studenta.
        Student prviStudent = new Student();

        prviStudent.setIme("Marko");
        prviStudent.setPrezime("Markovic");
        prviStudent.setBrIndeksa(1980);
        prviStudent.setBudzet(true);

        prviStudent.stampaj();




    }
}
