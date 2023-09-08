package d07_09_2023;

public class Zadatak3 {
    public static void main(String[] args) {
        //Zadatak 3: Kreiranje klase "Proizvod"
        //Napišite klasu "Proizvod" sa atributima: naziv (String) i cena (double). U glavnoj metodi kreirajte 3 objekta ove klase i postavite im vrednosti. Ispisati informacije o proizvodima.

        Proizvod proizvod1 = new Proizvod();
        proizvod1.naziv="Prolom pivo";
        proizvod1.cena=140;

        Proizvod proizvod2 = new Proizvod();
        proizvod2.naziv="Suvo meso(1kg)";
        proizvod2.cena=1450.99;


        Proizvod proizvod3 = new Proizvod();
        proizvod3.naziv="Hleb";
        proizvod3.cena=90.90;

        System.out.println("Naziv: "+ proizvod1.naziv+ "--"+ "Cena: "+ proizvod1.cena);
        System.out.println();
        System.out.println("Naziv: "+ proizvod2.naziv+ "--"+ "Cena: "+ proizvod2.cena);
        System.out.println();
        System.out.println("Naziv: "+ proizvod3.naziv+ "--"+ "Cena: "+ proizvod3.cena);
    }
}
