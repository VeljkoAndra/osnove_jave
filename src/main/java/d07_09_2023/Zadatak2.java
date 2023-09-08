package d07_09_2023;

public class Zadatak2 {
    public static void main(String[] args) {//Zadatak 2: Kreiranje klase "Automobil"
       // Napišite klasu "Automobil" sa atributima: marka (String), model (String) i godinaProizvodnje (int). U glavnoj metodi kreirajte 2-3 objekta ove klase i postavite im vrednosti. Ispisati informacije o automobilima.

        Automobil auto1 = new Automobil();
        auto1.marka="Opel";
        auto1.model="Insignia";
        auto1.godinaProizvodnje=2014;

        Automobil auto2 = new Automobil();
        auto2.marka="BMW";
        auto2.model="X3";
        auto2.godinaProizvodnje=2007;

        Automobil auto3 = new Automobil();
        auto3.marka="Audi";
        auto3.model="A4";
        auto3.godinaProizvodnje=2007;

        System.out.println("Marka automobila: "+ auto1.marka);
        System.out.println("Model automobila: "+auto1.model);
        System.out.println("Godina prozivodnje auta: "+auto1.godinaProizvodnje);
        System.out.println();
        System.out.println("Marka automobila: "+ auto2.marka);
        System.out.println("Model automobila: "+auto2.model);
        System.out.println("Godina prozivodnje auta: "+auto2.godinaProizvodnje);
        System.out.println();
        System.out.println("Marka automobila: "+ auto3.marka);
        System.out.println("Model automobila: "+auto3.model);
        System.out.println("Godina prozivodnje auta: "+auto3.godinaProizvodnje);

    }
}
