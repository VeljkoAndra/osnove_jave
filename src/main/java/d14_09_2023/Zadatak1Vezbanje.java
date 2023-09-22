package d14_09_2023;

public class Zadatak1Vezbanje {
    public static void main(String[] args) {
        //Zadatak(Za vezbanje)
        //Za potrebe google istorije potrebno je kreirati sledece klase.
        //Klasu HistoryPage koja ima:
        //•	naziv stranice
        //•	link do stranice
        //•	vreme otvaranja stranice - sat i minut (2 atributa)
        //•	username i password sacuvani za ovu stranicu (kao objasnjene ovo su kao kolacici za neki sajt)
        //•	konstuktore koji su logicni
        //•	gettere i setter (username i password nemaju settere)
        //•	metodu sacuvaj kredencijale za ovu stranicu. Metoda kao parametre  prima username i password i setuje te atribute.
        //•	Metoda obrisi kolacice koja setuje username i password na null.
        //•	Metoda stampaj koja stampa podatke u formatu:
        //[sat] - [minut] - [ naziv ]…[ link ] [Ako postoje kredencijali stampa se zvezdica pored linka]
        //
        //
        //Klasu History koja ima:
        //•	niz stranica koje su posecene
        //•	metoda otvori stranicu koja dodaje novi historypage u niz.
        //•	metodu obrisi prema linku - metoda koja iz niza izbacuje stranicu prema linku
        //•	metoda obrisi kolacice za link - metoda koja za homepage brise kolacice
        //•	metoda obrisi istoriju - metoda brise celu istoriju
        //•	metoda sacuvajKredencija - od parametara se prima naziv stranice i username i password koji se cuvaju.
        //•	metoda pogledajIstoriju - stampa sve posecene stranice
        //•	metoda obrisiSveKolacice - metoda brise kredencijale za sve stranice.
        //•	metoda obrisiSveKolaciceZaSadnjihSatVremena-  brise kolacice za strnaice koje su ucitane u zadnjih sat vremena. Metoda kao parametar prima trenutno vreme (sat i minut)


        HistoryPage historyPage=new HistoryPage("Wikipedia", "www.wikipedia.com", 14, 34);
        HistoryPage historyPage2=new HistoryPage("Coca-cola", "www.coca-cola.com", 15, 4);
        HistoryPage historyPage3=new HistoryPage("Guarana", "www.guarana.rs", 15, 37);
        HistoryPage historyPage4=new HistoryPage("Monster", "www.monster.rs", 12, 14);
        HistoryPage historyPage5=new HistoryPage("Booster", "www.booster.rs", 13, 41);

        History history = new History();
        history.dodajStranicu(historyPage);
        history.dodajStranicu(historyPage2);
        history.dodajStranicu(historyPage3);
        history.dodajStranicu(historyPage4);
        history.dodajStranicu(historyPage5);

        history.pogledajIstoriju();

        history.sacuvajKred("Guarana","markonije@gmail.com","markojeste12345");
        System.out.println();
        history.pogledajIstoriju();
        System.out.println();

        history.izbrisiPremaLinku("www.monster.rs");
        history.pogledajIstoriju();

        history.obrisiSveKolaciceZaZadnjihSatVremena(16, 23);
    history.pogledajIstoriju();
    }
}
