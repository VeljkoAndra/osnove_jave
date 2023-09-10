package d08_09_2023;

public class Zadatak1 {
    public static void main(String[] args) {
        //1.	Napisati klasu Proizvod koja ima atribute
        //a.	naziv proizvoda (String)
        //b.	cenu proizvoda (double)
        //c.	težinu proizvoda u gramima. (double)
        //	i metode:
        //d.	stampaj - stampa podatke proizvoda u formatu {{naziv}}, {{cena}}, {{tezina}}
        //e.	povecajCenu - koja kao parametar funkcije prima vrednost povećanje za koju treba povećati cenu. Ova funkcija treba da menja atribut cena i ova funkcija nema povratnu vrednost.
        //f.	vratiCenuSaPopustom - koja kao ulazni parametar funkcije dobija popust, a povratnu vrednost je cena proizvoda kada se uračuna popust.Ova funkcije ne menja atribut cena. Smatrati da je parametar popust u opsegu od 0 do 100.
        //g.	racunajPostarinu - funkcije vraća koliko bi bila postarina da se proizvod šalje preko kurirske sluzbe. Funkcija je bez ulaznih parametara, a cena postarine se računa u zavisnosti od tezine:
        //-	za tezinu do 100g, postarina iznosi 200din
        //-	za tezinu od 101g do 500g, postarina iznosi 400din
        //-	za tezinu preko 500g, postarina iznosi 1000din
        //
        //U glavnom programu kreirati minimum 2 proizvoda i za svaki od njih pozvati svaku od definisanih funkcija.

        Proizvod prviArtikal = new Proizvod();
        prviArtikal.naziv="Pecenica";
        prviArtikal.cena = 1500;
        prviArtikal.tezina=956.78;

        Proizvod drugiArtikal=new Proizvod();
        drugiArtikal.naziv = "Knjiga";
        drugiArtikal.cena = 1250;
        drugiArtikal.tezina=245;

        prviArtikal.stampaj();
        prviArtikal.povecajCenu(200);
        System.out.println("Cena nakon poskupljenja iznosi: "+ prviArtikal.cena);
        System.out.println("Cena sa popustom iznosi: "+ prviArtikal.vratiCenuSaPopustom(20));
        System.out.println("Cena postarina je: "+ prviArtikal.postarina());
        System.out.println();
        System.out.println();
        drugiArtikal.stampaj();
        drugiArtikal.povecajCenu(120);
        System.out.println("Cena nakon poskupljenja iznosi: "+ drugiArtikal.cena);
        System.out.println("Cena sa popustom iznosi: "+ drugiArtikal.vratiCenuSaPopustom(50));
        System.out.println("Cena postarina je: "+ drugiArtikal.postarina());
    }
}
