package p15_09_2023;

public class PlatnaKartica {
    protected double suma;
    protected String brojKartice;
    protected int godinaDoKadVazi;
    protected int mesecDoKadVazi;

    public PlatnaKartica(double suma, String brojKartice, int godinaDoKadVazi, int mesecDoKadVazi) {
        this.suma = suma;
        this.brojKartice = brojKartice;
        this.godinaDoKadVazi = godinaDoKadVazi;
        this.mesecDoKadVazi = mesecDoKadVazi;
    }
    public void dodajSredstva(double uplata){
        suma = suma + uplata;
    }
    public void izvrsiTransakciju(double vrednost){
        suma = suma - vrednost;
    }

    public void stampaj (){
        System.out.println(brojKartice + ", " + mesecDoKadVazi+"/"+godinaDoKadVazi + ", $" + suma);
    }
    public double getSuma() {
        return suma;
    }

    public String getBrojKartice() {
        return brojKartice;
    }

    public int getGodinaDoKadVazi() {
        return godinaDoKadVazi;
    }

    public int getMesecDoKadVazi() {
        return mesecDoKadVazi;
    }
}
