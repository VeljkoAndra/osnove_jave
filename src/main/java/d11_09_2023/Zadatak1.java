package d11_09_2023;

public class Zadatak1 {
    public static void main(String[] args) {
        //1.	Kreirati klasu Autor koja ima
        //-ime i prezime
        //-konstuktore koje mislite da su vam potrebni
        //-gettere i settere za atribute
        //-metodu print koja stampa u formatu:
        //(ime autora) (prezime autora)
        //
        //Kreirati klasu Knjiga koji ima:
        //-ISBN
        //-naziv
        //-godina izdanja
        //-autor
        //-konstuktore koje mislite da su vam potrebni
        //-gettere i settere za atribute
        //-metodu print koja stampa u formatu (izbegavati dupliranje koda):
        //(ISBN)
        //(naziv) - (godina izdanja)
        //autor: (ime autora) (prezime autora)
        //
        //	U glavnom programu napraviti vise autora sa vise knjiga.
        Autor prviAutor= new Autor();
        prviAutor.setImeAutora("Agata");
        prviAutor.setPrezimeAutora("Kristi");

        Autor drugiAutor = new Autor("Andzej","Spakovski");
        Autor treciAutor = new Autor("Carls","Dikens");

        Knjiga prvaKnjiga = new Knjiga("9 788660 121501", "N ili M",1941);
        Knjiga drugaKnjiga = new Knjiga("9 788660 121471", "Partneri u zlovinu", 1929);
        Knjiga trecaKnjiga = new Knjiga("978-89-7702-266-2", "Mac sudbine(Drugi deo sage o vescu",2015);
        Knjiga cetvrtaKnjiga = new Knjiga("978-86-7702-225-9","Krv vilenjaka(Treci deo sage o vescu)",2015);
        Knjiga petaKnjiga = new Knjiga("978-89-7674-235-6", "Ukleta kuca", 2016);

        prvaKnjiga.setAutorKnjige(prviAutor);
        drugaKnjiga.setAutorKnjige(prviAutor);
        trecaKnjiga.setAutorKnjige(drugiAutor);
        cetvrtaKnjiga.setAutorKnjige(drugiAutor);
        petaKnjiga.setAutorKnjige(treciAutor);

        prvaKnjiga.stampa();
        System.out.println();
        drugaKnjiga.stampa();
        System.out.println();
        trecaKnjiga.stampa();
        System.out.println();
        cetvrtaKnjiga.stampa();
        System.out.println();
        petaKnjiga.stampa();
    }
}
