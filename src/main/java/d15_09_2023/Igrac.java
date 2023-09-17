package d15_09_2023;

import java.util.ArrayList;

public class Igrac extends Osoba{
    private int brojDresa;
    private String pozicija;
    private boolean kapiten;


    public Igrac() {
    }

    public Igrac(String imeIPrezime, String jmbg, int godinaRodjenja, int brojDresa, String pozicija, boolean kapiten) {
        super(imeIPrezime, jmbg, godinaRodjenja);
        this.brojDresa = brojDresa;
        this.pozicija = pozicija;
        this.kapiten = kapiten;

    }

    @Override
    public void stampaj(){
        super.stampaj();
        System.out.println("Broj dresa: " + this.brojDresa);
        System.out.println("Pozicija: " + this.pozicija);
        if (kapiten==true){
            System.out.println("KAPITEN");
        }
        System.out.println();

    }
    public int getBrojDresa() {
        return brojDresa;
    }

    public void setBrojDresa(int brojDresa) {
        this.brojDresa = brojDresa;
    }

    public String getPozicija() {
        return pozicija;
    }

    public void setPozicija(String pozicija) {
        this.pozicija = pozicija;
    }

    public boolean isKapiten() {
        return kapiten;
    }

    public void setKapiten(boolean kapiten) {
        this.kapiten = kapiten;
    }

}
