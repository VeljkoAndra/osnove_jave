package d19_09_2023;

public class Zadatak1 {
    public static void main(String[] args) {
        //1.Zadatak
        //Kreirati abstraktnu klasu Ambalaza koja ima:
        //-	barkod (primer: 328232-2823)
        //-	naziv artikla
        //-	neto tezinu
        //-	bruto tezinu
        //-	konstuktore (default-ni i sa parametrima)
        //-	gettere i settere
        //-	metodu koja racuna tezinu pakovanja kao razliku bruto i neto tezine.
        //-	abstraktnu metodu koja vraca cenu artikla
        //-	abstraktnu metodu stampaj
        //Kreirati klasu Tetrapak koja nasledjuje klasu Ambalaza koja ima:
        //-	atribut koji kaze da li se moze reciklirati
        //-	osnovna cena
        //-	gettere i setter za atribute
        //-	konstuktori koji su vam potrebni
        //-	racuna cenu tako da ispunjava uslova:
        //-	ako je od recikliranog materijala, ( tezina pakovanja ) * 1.5 + (osnovna cena);
        //-	ako nije u cenu ulazi samo osnovna cena
        //-	metoda stampaj stampa sve podatke iz klase tetrapak.
        //Kreirati klasu StaklenaAmbalaza koja nasledjuje klasu Ambalaza koja ima:
        //-	kaucija za flasu
        //-	atribut koji kaze da li se za flasu placa kaucija
        //-	osnovna cena
        //-	gettere i setter za atribute
        //-	konstuktori koji su vam potrebni
        //-	racuna cenu
        //-	ako se kaucija placa, (osnovna cena) * 1.2 + (kaucija);
        //-	ako se ne placa, (osnovna cena) * 1.2
        //-	metoda stampaj stampa sve podatke iz klase staklena flasa.
        //Kreirati klasu SuperKartica koja ima:
        //-	broj kartice
        //-	ime i prezime vlasnika
        //-	popust (200, 500, … )
        //-	konstuktore (default-ni i sa parametrima)
        //-	gettere i settere
        //-	metodu stampaj koja stampa karticu u formatu:
        //(broj kartice), (ime i prezime)
        //Kreirati klasu Korpa koja ima:
        //-	niz ambalaza
        //-	metodu dodaj ambalazu
        //-	metodu izbaci ambalazu, u funkciju se prosledjuje barkod flase (String) koju treba izbaciti
        //-	privatnu metodu koja vraca cenu svih ambalaza sa popustom, metoda kao parametar prima popust.
        //-	metodu koja racuna i vraca ukupncu cenu korpe (sabira sve cene ambalze), kao parametar funkcije se prima Super karticu iz koje se cita popust.
        //U glavnom programu kreirati jednu Korpu i u nju dodati nekoliko Ambalaza razlicitih tipova i istestirati sve metode i ispisati ukupnu cenu sa popustom.

        Tetrapak tetrapak1= new Tetrapak("12451293112", "Sok ov visnje", 500, 567, true, 100);
        Tetrapak tetrapak2= new Tetrapak("12462434221", "Sok ov jabuke", 1000, 1150, false, 199.99);
        StaklenaAmbalaza staklenaAmbalaza1 = new StaklenaAmbalaza("871232748110", "Rosa voda", 1000, 1257, 70, true, 150);
        StaklenaAmbalaza staklenaAmbalaza2 = new StaklenaAmbalaza("823534623411", "Knjaz Milos", 1000, 1257, 50, false, 170);
        SuperKartica superKartica= new SuperKartica("158728931", "Marko Kralj", 500);

        Korpa korpa = new Korpa();
        korpa.dodajAmbalazu(tetrapak1);
        korpa.dodajAmbalazu(tetrapak2);
        korpa.dodajAmbalazu(staklenaAmbalaza1);
        korpa.dodajAmbalazu(staklenaAmbalaza2);

        double cenaBezPopusta= 0;
        for (int i = 0; i < korpa.ambalaze.size(); i++){
            korpa.ambalaze.get(i).stampaj();
            cenaBezPopusta= cenaBezPopusta + korpa.ambalaze.get(i).cena();
        }
        System.out.println("Ukupna cena bez popusta " + cenaBezPopusta);
        System.out.println("Cena sa popustom " + korpa.cenaSaPopustom(superKartica));





    }
}
