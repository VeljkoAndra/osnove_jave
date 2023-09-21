package p14_09_2023;

import java.util.ArrayList;

public class Reziser {
    private String fullName;

    private ArrayList<Film> filmovi;


    public Reziser() {
        this.filmovi = new ArrayList<>();
    }

    public Reziser(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public ArrayList<Film> getFilmovi() {
        return filmovi;
    }

    public void dodajFilm(Film newFilm) {
        this.filmovi.add(newFilm);
    }

    public void stampaj() {
        System.out.println("Reziser" + fullName);
        for (int i = 0; i < this.filmovi.size(); i++) {
            System.out.println("Film: " + filmovi.get(i));
        }
    }
}
