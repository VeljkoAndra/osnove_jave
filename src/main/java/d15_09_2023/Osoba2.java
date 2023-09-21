package d15_09_2023;

import java.util.ArrayList;

public class Osoba2 {
    protected String imeIPrezime;
    protected String jmbg;
    protected int godinaRodjenja;

    public Osoba2() {
    }

    public Osoba2(String imeIPrezime, String jmbg, int godinaRodjenja) {
        this.imeIPrezime = imeIPrezime;
        this.jmbg = jmbg;
        this.godinaRodjenja = godinaRodjenja;
    }

    public void stampaj() {
        System.out.println(this.imeIPrezime + ", " + this.jmbg + ", " + this.godinaRodjenja);
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public String getJmbg() {
        return jmbg;
    }

    public void setJmbg(String jmbg) {
        this.jmbg = jmbg;
    }

    public int getGodinaRodjenja() {
        return godinaRodjenja;
    }

    public void setGodinaRodjenja(int godinaRodjenja) {
        this.godinaRodjenja = godinaRodjenja;
    }
}
