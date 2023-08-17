package p17_08_2023;

import java.util.Scanner;

public class Zadatak7 {
    public static void main(String[] args) {
        //Napisati program koji proverava da li je broj telefona validan. Program na pocetku ucitava broj telefona korisnika i ispisuje gresku ukoliko telefon nije validan.
        //Broj nije validan ukoliko nema +381 ili ako ima kosu crtu (/)
        //Primer izvrsenja:
        //Unesite broj telefona za proveru: 492820233
        //Broj nije validan.
        //
        //Primer izvrsenja:
        //Unesite broj telefona za proveru: +38163/23-93-32
        //Broj nije validan.
        //
        //Primer izvrsenja:
        //Unesite broj telefona za proveru: +3816323-93-32

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite broj a: ");
        String a = s.next();

        System.out.println("Unesite broj b: ");
       String b = s.next();

        System.out.println("Unesite broj c: ");
        String c = s.next();

        if (!a.contains("+381") || a.contains("/")) {System.out.println("Broj a je nevalidan");};
        if(!b.contains("+381") || b.contains("/" )) {System.out.println("Broj b je nevalidan");};
       if(!c.contains("+381") || c.contains("/" )) {System.out.println("Broj c je nevalidan");};

    }
}
