package p18_09_2023;

public abstract class PlatnaKartica {
    protected double suma;
    protected String brojKartice;
    protected int doKadVazi;
    protected int mesecDoKadaVazi;

    public PlatnaKartica(double suma, String brojKartice, int doKadVazi, int mesecDoKadaVazi) {
        this.suma = suma;
        this.brojKartice = brojKartice;
        this.doKadVazi = doKadVazi;
        this.mesecDoKadaVazi = mesecDoKadaVazi;
    }
    public void dodajSredstva(double vrednost){
        suma=suma+vrednost;
    }
    public abstract void izvrsiTransakciju(double vrednost);

    public abstract void stampaj();
}
