package p12_09_2023;

public class Zadatak1 {
    public static void main(String[] args) {
        ClanskaKartica prvaClanskaKartica = new ClanskaKartica(6, "41245-1251");
        Kupac prviKupac = new Kupac("Marko Markovic");
        Proizvod prviProizvod = new Proizvod();
        prviProizvod.setNazivProizvoda("Avokado");
        prviProizvod.setCenaIzradeProizvoda(1200);

        prviKupac.setClanskaKartica(prvaClanskaKartica);
        prviProizvod.setKupac(prviKupac);

        prviProizvod.stampanje();
    }
}
