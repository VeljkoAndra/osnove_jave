package d19_09_2023;

public class Tetrapak extends Ambalaza {

    private boolean reciklaza;
    private double osnovnaCena;

    public Tetrapak(String barkod, String nazivArtikla, double netoTezina, double brutoTezina, boolean reciklaza, double osnovnaCena) {
        super(barkod, nazivArtikla, netoTezina, brutoTezina);
        this.reciklaza = reciklaza;
        this.osnovnaCena = osnovnaCena;
    }

    @Override
    public double cena() {
        double cenaProizvoda = 0;
        if (reciklaza){
            cenaProizvoda = tezinaPakovanja() * 1.5 + osnovnaCena;
        } else {
            cenaProizvoda = osnovnaCena;
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
        if (reciklaza == true){
            System.out.println("Tetrapak moze da se reciklira");
            System.out.println("Cena prozivoda je " + cena());
        } else {
            System.out.println("Tetrapak ne moze da se reciklira");
            System.out.println("Cena prozivoda je " + cena());
        }
        System.out.println();
    }

    public boolean isReciklaza() {
        return reciklaza;
    }

    public void setReciklaza(boolean reciklaza) {
        this.reciklaza = reciklaza;
    }

    public double getOsnovnaCena() {
        return osnovnaCena;
    }

    public void setOsnovnaCena(double osnovnaCena) {
        this.osnovnaCena = osnovnaCena;
    }
}
