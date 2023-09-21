package p12_09_2023;

public class Sastojci {
    private String naziv;
    private int cena;

    public Sastojci(String naziv, int cena){
        this.naziv=naziv;
        this.cena=cena;
    }
    public String getNaziv(){
        return this.naziv;
    }
    public int getCena(){
        return this.cena;
    }
}
