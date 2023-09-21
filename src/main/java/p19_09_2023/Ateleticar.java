package p19_09_2023;

public abstract class Ateleticar {
    private String ime;
    private String prezime;
    protected double rezultat;

    public Ateleticar(String ime, String prezime, double rezultat) {
        this.ime = ime;
        this.prezime = prezime;
        this.rezultat = rezultat;
    }

    public abstract boolean poredenje(Ateleticar ateleticar);

    public void stampaj(){
        System.out.println(ime + " " +prezime + ", " + rezultat);
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public double getRezultat() {
        return rezultat;
    }

    public void setRezultat(double rezultat) {
        this.rezultat = rezultat;
    }
}
