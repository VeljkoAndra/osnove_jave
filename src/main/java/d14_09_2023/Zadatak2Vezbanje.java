package d14_09_2023;

public class Zadatak2Vezbanje {
    public static void main(String[] args) {
        //Napomena: U zadacima su brojevi od 1 do 39, i smatrajte da se brojevi unose u tim granicama. Znaci nije vam potrebna provera za opseg brojeva.
        //
        //Za potrebe Lotto igre na srecu potrebno je
        //Kreirati klasu Kombinacija koja ima:
        //●	id kombinacije (String)
        //●	niz brojeva - niz je od 7 broja (ArrayList<Integer>)
        //●	konstruktor koji prima id i 7 broja koji se u konstruktoru dodaju u niz.
        //●	gettere za atribute Kombinacija(String id, int jedan, int dva, …)
        //●	metodu koja proverava da li this kombinacija ima iste brojeve kao prosledjena kombinacija.
        //○	Zaglavlje metode je:
        //■	public boolean daLiJeIstaKombinacija( Kombinacija k)
        //○	metoda vraca true ako su svi elementi na istim pozicija isti
        //■	npr: this [0] == k [0], this [1] == k [1] ….
        //●	metodu za stampu koja stampa podatke u formatu
        //ID: id kombinacije
        //brojevi: 1, 3, 5, 14, 15, 21, 23
        //
        //
        //	Kreirati klasu Listic koja ima:
        //●	niz kombinacija - maksimalno 7 kombinacija
        //●	metodu dodaj kombinaciju, koja dodaje kombinaciju u niz
        //●	metodu koja vraca da li je kombinacija dobitna. Kao parametar se prosledjuje kombinacija za proveru. Metoda prolazi kroz sve elemente niza i proverava da li u nizu postoji prosledjena kombinacija. Za proveru jednakosti kombinacja koristi se metoda daLiJeIstaKombinacija
        //○	Zaglavlje metode
        //■	public boolean dobitna(Kombinacija dobitnaKombinacija)
        //●	metodu koja stampa listic u formatu
        //ID: id kombinacije
        //brojevi: 1, 3, 5, 14, 15, 21, 23
        //
        //ID: id kombinacije
        //brojevi: 1, 3, 5, 14, 15, 21, 23
        //
        //…… i tako za sve kombinacije

        Kombinacija kombinacija1=new Kombinacija("123456", 3,7,9,16,22,23,34);
        Kombinacija kombinacija2=new Kombinacija("642213", 1,6,17,19,27,30,39);
        Kombinacija kombinacija3=new Kombinacija("337113", 2,6,13,20,25,32,33);
        Kombinacija kombinacija4=new Kombinacija("814213", 6,10,17,19,27,30,32);
        Kombinacija kombinacija5=new Kombinacija("235251", 9,12,19,22,28,33,38);

        Listic listic=new Listic();
        listic.dodajKombinaciju(kombinacija1);
        listic.dodajKombinaciju(kombinacija2);
        listic.dodajKombinaciju(kombinacija3);
        listic.dodajKombinaciju(kombinacija4);
        listic.dodajKombinaciju(kombinacija5);

        Kombinacija dobitnaKombinacija = new Kombinacija("412341", 6,10,17,19,27,30,32);

        listic.stampaj();

        if (listic.daLiJeDobitnaKombinacija(dobitnaKombinacija)==true){
            System.out.println("Postoji pobednicki listic.");
        } else {
            System.out.println("Nema pobednickog listica.");
        }
        }
}
