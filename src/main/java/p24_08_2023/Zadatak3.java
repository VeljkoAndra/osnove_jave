package p24_08_2023;

import java.util.ArrayList;


public class Zadatak3 {
    public static void main(String[] args) {
        //Napisati program koji u sebi ima definisan niz od 5 broja (brojevi su proizvoljni) i koji zamenjuje vrednosti prvog (na poziciji nula) i zadnjeg elemnta niza.
        //Objasnjenje: Ako je niz 2,4,5,6,7 nakon izmene treba da bude 7,4,5,6,2
        //Napomena: U zadataku nakon kreiraanja niza, ne treba da se desi kod koji setuje fiksne vrednosti u niz.
        ArrayList<Integer> brojevi = new ArrayList<>();

        brojevi.add(10); // poz 0
        brojevi.add(20); // poz 1
        brojevi.add(30); // poz 2
        brojevi.add(40); // poz 3
        brojevi.add(50);

        int last= brojevi.get(brojevi.size()-1);
        int first = brojevi.get(0);

        brojevi.set(0, last);
        brojevi.set(brojevi.size()-1, first);


    }
}
