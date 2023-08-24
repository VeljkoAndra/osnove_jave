package p24_08_2023;

import java.util.ArrayList;

public class Zadatak1 {
    public static void main(String[] args) {
//1.Zadatak
//Napisati program koji u sebi ima definisan niz od 5 broja (brojevi su proizvoljni) i prikazuje sumu nultog i zadnjeg elementa tog niza.
        ArrayList <Integer>brojevi = new ArrayList<>();
        brojevi.add(11);
        brojevi.add(22);
        brojevi.add(33);
        brojevi.add(44);
        brojevi.add(55);

        int x= brojevi.get(0);
        int y= brojevi.get(brojevi.size() - 1);
        int zbir= x + y;
        System.out.println("Zbir je: " + zbir);

    }
}
