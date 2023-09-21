package p15_09_2023;

public class Zadatak2 {
    public static void main(String[] args) {
        //Zadatak
        //  Napraviti klasu PlatnaKartica koja ima
        //●	  atribut suma  - cuva trenutnu sumu novca na kartici u dolarima
        //●	  atribut broj kartice  primer: 4012-1239-1221-3381
        //●	  atribut godina - godina do kada vazi kartica
        //●	  atribut mesec-  mesec do kada vazi kartica
        //●	  konstruktor sa parametrima
        //●	  gettere za sve atribute, bez settera
        //●	   metodu dodajSredstva koja povecava sumu za unetu vrednost
        //●	  metodu izvrsiTransakciju koja skida prosledjenu vrednost sa racuna.
        //●	  metodu koja stampa podatke o kartici u formatu:
        //	  4012-1239-1221-3381, 11/2019, $212
        //
        //	  Napraviti klasu VisaKartica koja nasledjuje klasu PlatnaKartica
        //●	 ovlaceno lice, cuva se ime i prezime osobe koja ima ovlascenje da podize novac u ekspozituri.
        //●	getter i setter za ovlasceno lice
        //●	konstruktor sa parametrima
        //●	  implementira metodu izvrsiTransakciju,  tako da na prosledjenu sumu dodaje proviziju od 1.8% sume. Najmanja provizija moze biti $4.
        //●	  implementira metodu koja stampa podatke o kartici u formatu:
        //	  Visa Card: 4012-1239-1221-3381, 11/2019, $212
        //
        //	  Napraviti klasu MasterKartica koja nasledjuje klasu PlatnaKartica
        //●	  konstruktor sa parametrima
        //●	  implementira metodu koja vrsi transakciju, tako da na prosledjenu sumu dodaje proviziju od 1.5 posto na sumu.
        //●	  metoda naplatiOdrzavanje, koja sa racuna skida $2.
        //●	  implementira metodu koja stampa podatke o kartici u formatu:
        //	  Master Card: 12/2019, 4012-1239-1221-3381, $232\

        VisaKartica visaKartica= new VisaKartica(14568.43, "1231-3431-1212", 2026, 11,"Marko MArkovic");
        MasterKartica masterKartica = new MasterKartica(41231, "2341-3512-4212", 2025, 4);

        visaKartica.stampaj();
        visaKartica.izvrsiTransakciju(345);
        visaKartica.dodajSredstva(100);
        visaKartica.stampaj();

        masterKartica.stampaj();
        masterKartica.izvrsiTransakciju(3576.78);
        masterKartica.naplatiOdrzavanje();
        masterKartica.stampaj();



    }
}
