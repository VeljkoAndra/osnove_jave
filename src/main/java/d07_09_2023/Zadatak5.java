package d07_09_2023;

import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {
        //Zadatak 5: Kreiranje klase "Oprema"
        //Napišite klasu "Oprema" sa atributima: tip (String), marka (String) i cena (double). U glavnoj metodi kreirajte 3 objekta ove klase i postavite im vrednosti unosom sa tasture. Ispisati informacije o opremi.
        Scanner s = new Scanner(System.in);


        Oprema oprema1 = new Oprema();
        System.out.print("Uneiste tip opreme:");
        oprema1.tip=s.next();
        System.out.print("Unesite marku opreme:");
        oprema1.marka=s.next();
        System.out.print("Unesite cenu");
        oprema1.cena=s.nextDouble();

        System.out.println();

        Oprema oprema2 = new Oprema();
        System.out.print("Uneiste tip opreme:");
        oprema2.tip=s.next();
        System.out.print("Unesite marku opreme:");
        oprema2.marka=s.next();
        System.out.print("Unesite cenu");
        oprema2.cena=s.nextDouble();

        System.out.println();

        Oprema oprema3 = new Oprema();
        System.out.print("Uneiste tip opreme:");
        oprema3.tip=s.next();
        System.out.print("Unesite marku opreme:");
        oprema3.marka=s.next();
        System.out.print("Unesite cenu");
        oprema3.cena=s.nextDouble();

        System.out.println();

        System.out.println("Tip opreme je: "+ oprema1.tip+ ", Marka opreme: "+ oprema1.marka + ", Cena: " + oprema1.cena + ".");
        System.out.println();
        System.out.println("Tip opreme je: "+ oprema2.tip+ ", Marka opreme: "+ oprema2.marka + ", Cena: " + oprema2.cena + ".");
        System.out.println();
        System.out.println("Tip opreme je: "+ oprema3.tip+ ", Marka opreme: "+ oprema3.marka + ", Cena: " + oprema3.cena + ".");
    }
}
