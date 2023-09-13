package d12_09_2023;

public class Zadatak3 {
    public static void main(String[] args) {
        //3.	Zadatak
        //Kreirati klasu Racun koja ima:
        //●	broj racuna (npr: 170-289328923-23)
        //●	ime i prezime osobe
        //●	trenutno stanje na racunu (npr: 100, 1220)
        //●	gettere i setter za sve atribute, sem settera za stanje na racunu
        //●	metodu uplatiNaRacun kojoj se dodaje prosledjena vrednost na stanje
        //●	metodu skiniSaRacunai kojom se stanje umanjuje za prosledjenja vrednost
        //●	metodu koja stampa podatke o racunu u formatu:
        //Ime i prezime  -  broj racuna
        //stanje na racunu je (trenutno stanje) rsd.
        //Kreirati klasu Transakcija koja ima:
        //●	id transakcije
        //●	racun sa kog se prenose sredstva
        //●	racun na koji se prenose sredstva
        //●	gettere i settere
        //●	konstruktore
        //●	metodu koja racuna i vraca proviziju za izvrsenje transakcije koja se racuna:
        //○	ako je prenos sredstava manji od 4500, provizija je fiksna 45
        //○	ako je prenos sredstava veci od 4500, provizija je 1%
        //○	S obzirom da se provizija racuna na osnovu visine transakcije, znaci da metoda prima parametar koji predstavlja visinu transakcije
        //○	Ukoliko ne znate da resite ...

        Racun posiljalac = new Racun("193-251325-24", "Dusan Novakovic", 23468.3);
        Racun primalac = new Racun("193-67813445-93", "Marko Grigorijevic", 14687);

        Transakcija prenos= new Transakcija("14523", posiljalac, primalac);

        posiljalac.stampajPodtake();
        System.out.println();
        primalac.stampajPodtake();
        System.out.println("__________________________________");

        prenos.transakcija(3000);
        prenos.stampaTransakciju();

        System.out.println("__________________________________");
        posiljalac.stampajPodtake();
        System.out.println();
        primalac.stampajPodtake();
    }
}
