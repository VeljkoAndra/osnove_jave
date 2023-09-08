package d07_09_2023;

import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {
        //Zadatak 4: Kreiranje klase "Film"
        //Napišite klasu "Film" sa atributima: naslov (String), godinaIzdanja (int) i reziser (String). U glavnoj metodi kreirajte 2-3 objekta ove klase i postavite im vrednosti unosom sa tastature. Ispisati informacije o filmovima.
        Scanner s = new Scanner(System.in);

        Film film1 = new Film();
        System.out.print("Unesite ime filma :");
        film1.naslov=s.next();
        System.out.print("Unesite godinu izlaska: ");
        film1.godinaIzdanja=s.nextInt();
        System.out.print("Uneiste ko je reziser: ");
        film1.reziser=s.next();

        System.out.println();

        Film film2 = new Film();
        System.out.print("Unesite ime drugog filma");
        film2.naslov=s.next();
        System.out.print("Unesite godinu izlaska drugog filma: ");
        film2.godinaIzdanja=s.nextInt();
        System.out.print("Uneiste ko je reziser drugog filma: ");
        film2.reziser=s.next();

        System.out.println();

        Film film3 = new Film();
        System.out.print("Unesite ime treceg filma");
        film3.naslov=s.next();
        System.out.print("Unesite godinu izlaska treceg filma: ");
        film3.godinaIzdanja=s.nextInt();
        System.out.print("Uneiste ko je reziser treceg filma: ");
        film3.reziser=s.next();

        System.out.println();
        System.out.println("Ime filma: "+ film1.naslov+ ", Godina izlaska: "+ film1.godinaIzdanja + ", Reziser filma: "+ film1.reziser + ".");
        System.out.println();
        System.out.println("Ime filma: "+ film2.naslov+ ", Godina izlaska: "+ film2.godinaIzdanja + ", Reziser filma: "+ film2.reziser + ".");
        System.out.println();
        System.out.println("Ime filma: "+ film3.naslov+ ", Godina izlaska: "+ film3.godinaIzdanja + ", Reziser filma: "+ film3.reziser + ".");
    }
}
