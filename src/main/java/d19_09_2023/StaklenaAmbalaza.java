package d19_09_2023;

public class StaklenaAmbalaza extends Ambalaza {
    private double kaucijaZaAmbalazu;
    private boolean daLiImaKaucija;
    private double osnovnaCena;

    public StaklenaAmbalaza(String barkod, String nazivArtikla, double netoTezina, double brutoTezina, double kaucijaZaAmbalazu, boolean daLiImaKaucija, double osnovnaCena) {
        super(barkod, nazivArtikla, netoTezina, brutoTezina);
        this.kaucijaZaAmbalazu = kaucijaZaAmbalazu;
        this.daLiImaKaucija = daLiImaKaucija;
        this.osnovnaCena = osnovnaCena;
    }

    @Override
    public double cena() {
        double cenaProizvoda=0;
        if (daLiImaKaucija == true){
            cenaProizvoda = osnovnaCena * 1.2 + kaucijaZaAmbalazu;
        } else {
            cenaProizvoda = osnovnaCena * 1.2;
        }
        return cenaProizvoda;
    }

    @Override
    public void stampaj() {
        System.out.println("Barkod " + barkod);
        System.out.println("Naziv atrtikla " + nazivArtikla);
        System.out.println("Bruto tezina " + brutoTezina);
        System.out.println("Neto tezina " + netoTezina);
        System.out.println("Osnovna cena " + osnovnaCena);
        System.out.println("Cena prozioda je " + cena());
        System.out.println();
    }

    public double getKaucijaZaAmbalazu() {
        return kaucijaZaAmbalazu;
    }

    public void setKaucijaZaAmbalazu(double kaucijaZaAmbalazu) {
        this.kaucijaZaAmbalazu = kaucijaZaAmbalazu;
    }

    public boolean isDaLiImaKaucija() {
        return daLiImaKaucija;
    }

    public void setDaLiImaKaucija(boolean daLiImaKaucija) {
        this.daLiImaKaucija = daLiImaKaucija;
    }

    public double getOsnovnaCena() {
        return osnovnaCena;
    }

    public void setOsnovnaCena(double osnovnaCena) {
        this.osnovnaCena = osnovnaCena;
    }
}
