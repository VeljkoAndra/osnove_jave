package p21_08_2023;

import java.util.Scanner;

public class Zadatak7 {
    public static void main(String[] args) {
        //Napisati program koji od korisnika ucitava N brojeva  i ispisuje koliko je parnih brojeva uneo korisnik. N nam kaze koliko broja ce korisnik da unese.
        //Primer izvrsenja:
        //Unesite N: 6
        //Unesite broj: 2
        //Unesite broj: 4
        //Unesite broj: 9
        //Unesite broj: 12
        //Unesite broj: 8
        //Unesite broj: 1
        //		Uneto je 4 parna broja.

        Scanner s = new Scanner(System.in);

        System.out.print("Unesote broj N: ");
        int N = s.nextInt();
        int prod = 0;

        for (int i = 0 ; i < N ;i++) {
            System.out.println("Unesite broj: ");
            int broj = s.nextInt();

            if (broj % 2==0 ) {prod = prod +1; }

        }
        System.out.println("Broj parnih brojeva je: " + prod);



    }
}
