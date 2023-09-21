package p19_09_2023;

public class Zadatak1 {
    public static void main(String[] args) {
        //Zadatak 1.. Kreirati abstraktnu klasu Objekat ciji su zasticeni atributi. NE NAZIVAJTE KLASU OBJECT !!
        //adresa (ulica i broj)
        //povrsina objekta
        //zona (1, 2 ili 3)
        //konstuktore, gettere i settere
        //metodu koja vraca koeficijent koji ce se koristiti za racunanje poreza u zavisnosti u kojoj zoni se nalazi objekat
        //zona 1, koeficijent je 1.4
        //zona 2, koeficijent je 1.1
        //zona 3, koeficijent je 1.05
        //abstraktnu metodu koja racuna i vraca porez objekta
        //abstraktnu metodu stampaj
        //
        //	Kreirati klasu Kuca koja nasledjuje klasu Objekat koja ima broj clanova koji zive u tom objektu,
        //konstuktore, gettere i setter
        //porez racuna po formuli: koeficijent * povrsina.
        //prepisati metodu stampaj tako da stampa sve podatke vezane za kucu
        //	Kreirati klasu Zgrada koja nasledjuje klasu Objekat koja ima
        //broj stanova
        //konstuktore, gettere i setter
        //porez racuna po formuli koeficijent * povrsina * broj stanova
        //prepisati metodu stampaj tako da stampa sve podatke vezane za zgradu
        //	Kreirati klasu Lokal koja naslejduje klasu Objekat koja od metoda ima:
        //konstuktore
        //porez racuna po formuli koeficijent * povrsina * 1.3
        //prepisati metodu stampaj tako da stampa sve podatke vezane za lokal
        //	Kreirati klasu PoreskaUprava koja za atribute ima:
        //ime grada u kom se nalazi
        //niz objekata
        //metodu dodaj objekat
        //metodu koja vraca objekat sa najvecim porezom public Objekat najveciPorez
        //metodu koja vraca objekat sa najmanjim porezom
        //metodu koja racuna ukupan porez za ceo grad
        //metodu koja stampa sve objekte
        //U glavnom programu napraviti jednu poresku upravu i u nju dodati minimum 5 razlicita objekta i istestirati sve metode.

        Kuca kuca1= new Kuca("Kralja nekog 12", 123, 2, 8 );
        Kuca kuca2= new Kuca("Kralja drugog nekog 67", 256, 1, 5 );
        Zgrada zgrad1= new Zgrada("Palih boraca 67", 87, 3, 14);
        Zgrada zgrad2= new Zgrada("Palih boraca 34", 78, 2, 24);
        Lokal lokal1 = new Lokal("Kralja Aleksandra 23", 178, 1);
        Lokal lokal2 = new Lokal("Kralja Aleksandra 56", 45, 1);

        PoreskaUprava beograd = new PoreskaUprava("Beograd");
        beograd.dodajObjekat(kuca1);
        beograd.dodajObjekat(kuca2);
        beograd.dodajObjekat(zgrad1);
        beograd.dodajObjekat(zgrad2);
        beograd.dodajObjekat(lokal1);
        beograd.dodajObjekat(lokal2);

        beograd.porezGrada();
        System.out.println();

        beograd.stampaj();
        System.out.println();

        beograd.najveciPorez();
        beograd.najmanjiPorez();
    }
}
