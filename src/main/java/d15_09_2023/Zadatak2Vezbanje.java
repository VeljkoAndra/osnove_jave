package d15_09_2023;

public class Zadatak2Vezbanje {
    public static void main(String[] args) {
        //Kreirati klasu Karton koja ima:
        //-	tip kartona (crveni, zuti)
        //-	konstuktore za koje mislite da ce vam trebati
        //-	gettere i settere za karton
        //
        //Kreirati klasu Osoba koja ima:
        //-	ime i prezime
        //-	jmbg
        //-	godinu rodjenja
        //-	default-ni konstuktor
        //-	konstuktor sa parametrima
        //-	gettere i settere
        //-	metodu stampaj koja stampa u formatu:
        //(ime i prezime), (jmbg), (godina rodjenja)
        //
        //Kreirati klasu Igrac koja nasledjuje klasu Osoba i koja ima:
        //-	broj (broj koji igrac nosi)
        //-	poziciju koju igra (odbrambeni, napadac, … )
        //-	niz kartona
        //-	kapiten (promenljiva koja kaze da li je igrac kapiten tima, i tipa je boolean)
        //-	default-ni konstuktor
        //-	konstuktor sa parametrima
        //-	gettere i settere za broj, kapiten i poziciju
        //-	metodu dodaj karton, gde se dodaje karton u niz
        //-	metodu koja vraca broj zutih kartona
        //-	metodu koja vraca broj crvenih kartona
        //-	metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o igracu
        //
        //
        //U glavnom programu kreirati igraca i dodati mu nekoliko kartona.

        Igrac2 igrac1= new Igrac2("Marko Brzina", "192491512093", 1999, 1 , "Golman", false);
        //String imeIPrezime, String jmbg, int godinaRodjenja, int brojDresa, String pozicija, boolean kapiten
        Karton karton1=new Karton("zuti");
        Karton karton2=new Karton("zuti");
        Karton karton3=new Karton("zuti");
        Karton karton4=new Karton("crveni");
        Karton karton5=new Karton("crveni");
        Karton karton6=new Karton("crveni");

        igrac1.dodajKarton(karton1); igrac1.dodajKarton(karton2); igrac1.dodajKarton(karton3);
        igrac1.dodajKarton(karton4); igrac1.dodajKarton(karton5); igrac1.dodajKarton(karton6);

        igrac1.stampaj();
    }
}
