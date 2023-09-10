package p07_09_2023;

public class Zadatak1 {
    public static void main(String[] args) {
        //1.Zad
        ////		Kreirati klasu Racun koja ima
        ////		broj racuna (npr: 840-23932-323)
        ////		ime i prezime vlasnika
        ////		stanje na racunu
        ////		U mainu kreirati minimum dva racuna sa pratecim podacima i ostampati podatke za svaki objekat.

        Racun broj1 = new Racun();
        broj1.brojRacuna="12462394819";
        broj1.imeIprezime="Marko Markovic";
        broj1.iznos= 5063.56;

        Racun broj2 = new Racun();
        broj2.brojRacuna="7563452324";
        broj2.imeIprezime="Pera Markovic";
        broj2.iznos= 7834.6;

        System.out.println("Broj racuna je: "+ broj1.brojRacuna);
        System.out.println("Ime i prezine valasnia: "+ broj1.imeIprezime);
        System.out.println("Iznos racuna je: "+ broj1.iznos);
        System.out.println();
        System.out.println("Broj racuna je: "+ broj2.brojRacuna);
        System.out.println("Ime i prezine valasnia: "+ broj2.imeIprezime);
        System.out.println("Iznos racuna je: "+ broj2.iznos);
    }
}
