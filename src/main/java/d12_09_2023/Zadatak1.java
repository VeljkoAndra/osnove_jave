package d12_09_2023;

public class Zadatak1 {
    public static void main(String[] args) {
        //1.	Zadatak
        //Za potrebe agencije za nekretnine kreirati  klasu FizickoLice koje ima:
        //●	ime i prezime
        //●	broj licne karte
        //●	jmbg
        //●	podatak da li je osoba vec jednom kupovala nekretninu preko agencije (boolean)
        //●	konstuktore
        //●	gettere i settere, jmbg ne sme da se menja
        //●	metodu stampaj, koja stmpa podatke u formatu:
        //ime i prezime, broj licne karte
        //
        //	Kreirati klasu Ugovor koja ima:
        //●	godinu, dan i mesec sklapanja ugovora
        //●	osobu koja prodaje nekretninu (fizicko lice)
        //●	osobu koja kupuje nekretninu (fizicko lice)
        //●	cenu za koju se prodaje nekretnina
        //●	adresu nekretnine (ulica br., grad)
        //●	metodu koja vraca procenat zarade
        //○	za osobu koja je vec kupovale nekretninu preko agencije je 0.02 dok je za one koji nisu 0.03
        //●	metodu koja racuna zaradu agencije pri prodaji nekretninte koja ukljucujei poreze, takse i usluge agencije, prema formuli:
        //1000 + cena za koju se prodaje * procenat zarade
        //●	metodu koja stampa ugovor u formatu:
        FizickoLice prodavac = new FizickoLice("Marko Markovic", "121224533123", "7932512512", false);
        FizickoLice kupac= new FizickoLice("Nikola Nikolic", "12463435424323", "153316123", true);

        Ugovor prodaja = new Ugovor(prodavac, kupac);
        prodaja.setGodinaDanMesecUgovora("23.02.2020.");
        prodaja.setCenaNekretnine(89750);
        prodaja.setAdresaNekretnine("Palih boraca 31");

        prodaja.stampaUgovora();
    }
}
