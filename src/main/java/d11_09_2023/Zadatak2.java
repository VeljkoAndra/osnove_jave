package d11_09_2023;

public class Zadatak2 {
    public static void main(String[] args) {
        //2.Zadatak
        //Kreirati klasu Korisnik koja ima
        //●	ime
        //●	prezime
        //●	gettere i settere za ime i prezime
        //●	konstuktore koje mislite da su vam potrebni
        //●	metoda koja stampa u formatu:
        //(ime) (prezime)
        //
        //Kreirati klasu FacebookPost
        //●	opis
        //●	korisnik (referenca na korisnika koji je kreirao post)
        //●	konstrukore koje mislite da su vam potrebni
        //●	metoda print, stampa u formatu:
        //(ime) (prezime)
        //(opis post-a)
        //
        //U main metodi, kreirati jedan facebook post i jednog korisnika i pozvati svaku od metoda

        Korisnik korisnik1 = new Korisnik("Marko", "Markovic");
        FacebookPost post1= new FacebookPost();

        post1.setOpisPosta("Srecna slava svima koji slave pa i meni, xexexexexexexe... <3");

        post1.setKorisnik(korisnik1);
        post1.stampanjePosta();

    }
}
