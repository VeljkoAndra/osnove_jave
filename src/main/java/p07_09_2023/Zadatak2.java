package p07_09_2023;

import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);


        Racun posiljalac = new Racun();
        posiljalac.brojRacuna="840-23932-323";
        posiljalac.imeIprezime="Milan Jovanovic";
        posiljalac.iznos=1000;
        Racun primalac = new Racun();
        primalac.brojRacuna="840-23932-334";
        primalac.imeIprezime="Marko Markovic";
        primalac.iznos=200;

        System.out.println("Unesite sumu za transakciju:");
        int x = s.nextInt();

        posiljalac.iznos= posiljalac.iznos - x;
        primalac.iznos= primalac.iznos + x;

        System.out.println("Broj racuna je: "+ posiljalac.brojRacuna);
        System.out.println("Ime i prezine valasnia: "+ posiljalac.imeIprezime);
        System.out.println("Iznos racuna je: "+ posiljalac.iznos);
        System.out.println();
        System.out.println("Broj racuna je: "+ primalac.brojRacuna);
        System.out.println("Ime i prezine valasnia: "+ primalac.imeIprezime);
        System.out.println("Iznos racuna je: "+ primalac.iznos);
    }
}
