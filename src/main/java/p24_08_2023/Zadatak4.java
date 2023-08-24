package p24_08_2023;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {
        //Napisati program koji u sebi ima definisan niz od 5 broja (brojevi su proizvoljni) i koji prikazuje element na poziciji K. K unosi korisnik i smatrajte da unosi u opsegu od 0 do 4.
        //Primer:
        //Unesite pozicjiu: 2
        //Na pozicji 2 je vrednost 7.
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> brojevi = new ArrayList<>();

        brojevi.add(10); // poz 0
        brojevi.add(20); // poz 1
        brojevi.add(30); // poz 2
        brojevi.add(40); // poz 3
        brojevi.add(50);

        System.out.println("Unesite poziciju: ");
        int x = s.nextInt();
        int y = brojevi.get(x);
        System.out.println(y);


    }
}
