package p12_09_2023;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {
        //.Zadatak
        //Kreirati klasu Sastojak koja ima:
        //naziv sastojka
        //cenu
        //gettere i settere
        //konstuktore
        //
        //
        //--U glavnom programu kreirati 3 sastojka.
        // U glavnom programu kreirati niz sastojaka ucitavajuci ih od korisnika. Ucitavaju se N sastojaka i na kraju odstampati niz. Koristeci ArrayList-e
        ArrayList <Sastojci> sastojci = new ArrayList<>();
        Scanner s = new Scanner(System.in);

        System.out.print("Unesite koliko sastojaka zelite da upisete:");
        int broj= s.nextInt();

        for (int i = 0; i <broj; i++){
            System.out.println("Uneite ime i cenu proizvoda: ");
            System.out.print("Ime: ");
            String ime = s.next();
            System.out.print("Cena: ");
            int cena = s.nextInt();
           sastojci.add(new Sastojci(ime,cena));
        }


        for (int i = 0; i < sastojci.size(); i++){
            System.out.println("Ime i cena sastojka: "+ sastojci.get(i).getNaziv()+ " - "+ sastojci.get(i).getCena());
        }





    }
}
