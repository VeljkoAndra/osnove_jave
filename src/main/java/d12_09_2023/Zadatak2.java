package d12_09_2023;

import p12_09_2023.Sastojci;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {
        //2.	Zadatak
        //Kreirati klasu ZeleniKarton koja ima:
        //●	ime i prezime studenta
        //●	broj indeksa
        //●	naziv predmeta
        //●	ime i prezime profesora
        //●	ocenu - od 5 do 10
        //●	gettere i settere
        //●	konstruktore
        //●	metodu koja vraca da li je ispit polozen ili ne (ispit je polozen ako je ocena veca od 5)
        //●	metodu stampaj koja stampa podatke u formatu:
        //		(naziv predmeta) - (ocena)
        //		Student: ime i prezime, broj indeksa
        //		Profesor: ime i prezime
        //
        //	U glavnoj klasi:
        //●	kreirati niz od 5 zelenih kartona za ispite i odstampati podatke za sve ispite
        //●	Zatim program pronalazi i ispisuje prosecnu ocenu za sve ispite
        ArrayList<ZeleniKarton> predmeti = new ArrayList<>();

        predmeti.add(new ZeleniKarton("Mirko Zlatanovic", 19345,"Sociologija","Marko Markovic", 6));
        predmeti.add(new ZeleniKarton("Marija Zecevic", 19675, "Informatika", "Zlatana Uskokovic", 9));
        predmeti.add(new ZeleniKarton("Nemanja Djurovic", 19168, "Psihologija", "Magdalena Lencarevic", 7));
        predmeti.add(new ZeleniKarton("Lazar Stojanovic", 12685, "Srski jezik", "Antonije Mrcanjevic", 10));
        predmeti.add(new ZeleniKarton("Veljko Nesic", 15367, "Matematika", "Marija Mirkovic", 5));


        int prosecnaOcenaZaSveIspite=0;

        for (int i = 0; i < predmeti.size(); i++){
            predmeti.get(i).stampanje();
            System.out.println();
            prosecnaOcenaZaSveIspite= prosecnaOcenaZaSveIspite + predmeti.get(i).getOcena();
        }
        prosecnaOcenaZaSveIspite=prosecnaOcenaZaSveIspite/ predmeti.size();
        System.out.println("Prosecna ocena za sve ispite je: "+ prosecnaOcenaZaSveIspite);



    }
}
