package d18_08_2023;

import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {
      //2.	Napisati program koji simulira stampanje ocitane licne karte u vise primeraka. Korisnik unosi podatke :
        //●	ime
        //●	prezime
        //●	jmbg
        //●	broj primeraka za stampu
        //Primer izvrsenja:
        //Unesite ime: Milan
        //Unesite prezime: Jovanovic
        //Unesite jmbg: 2109238932232
        //Unesite broj primeraka za stampu: 3
        //
        //Primerak 1
        //**********************************
        //Ime i prezime: Milan Jovanovic
        //JMBG: 2109238932232
        //**********************************
        //
        //Primerak 2
        //**********************************
        //Ime i prezime: Milan Jovanovic
        //JMBG: 2109238932232
        //**********************************
        //
        //Primerak 3
        //**********************************
        //Ime i prezime: Milan Jovanovic
        //JMBG: 2109238932232
        //**********************************
        Scanner s= new Scanner(System.in);
        System.out.println("Unesite Vase ime: ");
        String ime= s.next();

        System.out.println("Unesite Vase prezime: ");
        String prezime= s.next();

        System.out.println("Unesite Vas JMBG: ");
        String jmbg= s.next();

        System.out.println("Unesite zeljeni broj primeraka za stampu: ");
        int brojPrimeraka= s.nextInt();

for (int i = 1; i <= brojPrimeraka; i++ ){
    System.out.println("Primerak broj: " + i);
    System.out.println("*****************************************");
    System.out.println("Ime i prezime: " + ime + " " + prezime);
    System.out.println("JMBG: " + jmbg);
    System.out.println("*****************************************");
    System.out.println();
}




    }
}
