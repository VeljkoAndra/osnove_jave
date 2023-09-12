package p11_09_2023;

public class Zadatak3 {
    public static void main(String[] args) {
        //3.Zadatak
        //Kreirati klasu Film koja ima:
        //naziv filma
        //iz koje godine je film
        //konstruktore, gettere i settere
        //metodu print koja stampa podatke u formatu
        //naziv filma, godina
        //
        //
        //Kreirati klasu Reziser koja ima:
        //ime i prezime rezisera
        //starost
        //konstruktore, gettere i settere koji su potrebni
        //metodu print koja stampa podatke u formatu
        //ime prezime, starost.god
        //
        //U main metodi, kreirati jedan film i jednog rezisera i pozvati svaku od metoda
        Film prviFilm = new Film();
        prviFilm.setGodinuIzlaska(1987);
        prviFilm.setImeFilma("Drakula");

        Reziser prviResizer = new Reziser();
        prviResizer.setImeReziser("Marko Markovic");
        prviResizer.setKolikoImaGodina(25);

        Reziser drugiReziser = new Reziser("Nikola Nikolic", 32);

        Film drugiFilm = new Film("Drakula remaster", 2015, drugiReziser );
        prviFilm.setKoGaJeRezirao(prviResizer);
        drugiFilm.setKoGaJeRezirao(drugiReziser);

        prviFilm.stampajFilm();

        System.out.println();

        drugiFilm.stampajFilm();




    }
}
