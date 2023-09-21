package d19_09_2023;

public class Alpinista extends Planinar{
   private int poeni;

    public Alpinista(int celIndBroj, String imeiPrezime, int poeni) {
        super(celIndBroj, imeiPrezime);
        this.poeni = poeni;
    }

    public void dodajPoene(int brojPoena){
        this.poeni= poeni + brojPoena;
    }
    public void oduzmiPoene(int brojPoena){
        this.poeni= poeni-brojPoena;
    }

    @Override
    public void stampaj() {
        System.out.println("Alpinista, id: " + celIndBroj);
        System.out.println("Ime i prezime: " + imeiPrezime);
        System.out.println("Broj poena: " + poeni);
    }

    @Override
    public double clanarina() {
        int osnovica = 1500;
        int clanarina = 1500 - (poeni * 50);
        if (clanarina<0){
            clanarina = 0;
        }
        return clanarina;
    }

    @Override
    public boolean uspesanUspon(Planina planina) {
    if (planina.getVisinaPlanine()<=4000){
        return true;
    } else  {
        return false;
    }
    }
}
