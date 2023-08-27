package d25_08_2023;

import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {
        //3.	Zadatak
        //Napisati metodu koja stampa podatke o korisniku u formatu:
        //JMBG: [jmbg]
        //Ime: [ime]
        //Prezime: [prezime]
        //God. rodjenja: [god]
        //Aktivan: [true/false]
        //Metoda prima jmbg, ime, prezime, god rodjenja i da li je aktivan kao parametre metode.Metoda nista ne vraca.
        Scanner s= new Scanner(System.in);

        System.out.print("Unesite JMBG: ");
        String jmbg = s.next();
        System.out.print("Unesite ime: ");
        String firstName = s.next();
        System.out.print("Unesite prezime: ");
        String lastName = s.next();
        System.out.print("Unesite godinu rodjenja ");
        int yearOfBirth = s.nextInt();
        System.out.print("Da li je aktivan");
        boolean active = s.nextBoolean();



        System.out.println(data(jmbg, firstName, lastName, yearOfBirth, active));

    }
    public static String data(String JMBG,  String ime, String prezime, int godinaRodjenja, boolean aktivnost){

        String rezultat = "JMBG: " + JMBG + "\n";
        rezultat += "Ime: " + ime + "\n";
        rezultat += "Prezime: " + prezime + "\n";
        rezultat += "God. rodjenja: " + godinaRodjenja + "\n";
        rezultat += "Aktivnost: " + aktivnost;
        return rezultat;
    }
}
