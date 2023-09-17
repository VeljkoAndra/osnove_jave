package d14_09_2023;

public class Zadatak1 {
    public static void main(String[] args) {
        //Napisati klasu Student koja ima
        //
        //●	broj indeksa
        //●	ime i prezime
        //●	tip studija (osnovne, master, doktorske)
        //●	niz ispita
        //●	konstuktore koje mislite da ce vam trebati
        //●	gettere i settere za indeks, ime i prezime, tip studija
        //●	getter za niz predmeta
        //●	metodu dodaj ispit u niz ispita
        //●	metodu koja racuna prosek na studijama (u prosek se ubrajaju samo polozeni ispiti)
        //●	metodu stampaj koja stampa u formatu:
        //(broj indeksa) - (ime i prezime) - (tip studija)
        //Predmeti:
        //(naziv predmeta) - (profesor) - (ocena)
        //(naziv predmeta) - (profesor) - (ocena)
        //(naziv predmeta) - (profesor) - (ocena)
        //Prosecna ocena: (prosecna ocena)
        //
        //
        //Napisati klasu Ispit koja ima
        //●	naziv predmeta
        //●	ocenu (u rasponu od 5 do 10)
        //●	Ime i prezime profesora koji predaje predmet
        //●	konstuktore koje mislite da ce vam trebati
        //●	gettere i settere za sve atribute
        //●	metodu koja kaze da li je ispit polozen (polozen je ako je ocena od 6 do 10)
        //●	metodu koja stampa ispit u formatu:
        //(naziv predmeta) - (profesor) - (ocena)
        Ispit ispit1= new Ispit("Sociologija", 6, "Marko Guduric");
        Ispit ispit2 = new Ispit("Odbrana od spoljnih napada", 10, "Aleksa Avramovic");
        Ispit ispit3 = new Ispit("Srpski jezik", 9, "Stojanka Vrtiloma");
        Ispit ispit4 = new Ispit("Engleski", 5, "Divna Carna");
        Ispit ispit5 = new Ispit("Fizicka aktivnost", 5, "Nikola Stena");
        Ispit ispit6 = new Ispit("Matematika", 7, "Goran Vesic");
        Ispit ispit7 = new Ispit("Likovno", 6, "Pikaso Rafaelo");
        Ispit ispit8 = new Ispit("Otorinolaringologija", 8, "Marinika tepic");

        Student student = new Student(1956, "Mali Alek", "Doktorske");
        student.dodajIspit(ispit1);
        student.dodajIspit(ispit2);
        student.dodajIspit(ispit3);
        student.dodajIspit(ispit4);
        student.dodajIspit(ispit5);
        student.dodajIspit(ispit6);
        student.dodajIspit(ispit7);
        student.dodajIspit(ispit8);

        student.stampaj();
    }
}
