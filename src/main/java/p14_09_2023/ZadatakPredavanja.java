package p14_09_2023;

import java.util.ArrayList;

public class ZadatakPredavanja {
    public static void main(String[] args) {
       Reziser nikola = new Reziser();
       nikola.setFullName("Nikola Nikolic");
        Reziser veljko = new Reziser("Veljko Andriajsevic");

        Film film1 = new Film("Drakulla 1", 1982);
        Film film2 = new Film("Frakula 2", 2004);
        Film film3 = new Film("Frakula3", 2005);

       veljko.dodajFilm(film1);
        veljko.dodajFilm(film2);
    veljko.dodajFilm(film3);

        veljko.stampaj();

    }
}
