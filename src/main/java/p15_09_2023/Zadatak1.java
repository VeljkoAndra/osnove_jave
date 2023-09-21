package p15_09_2023;



public class Zadatak1 {
    public static void main(String[] args) {
        //1.	Zadatak
        //		Kreirati klasu Osoba koja od atributa ima:
        //●	 ime i prezime
        //●	 jmbg
        //●	konstuktor sa parametrima
        //●	difoltni konstuktor
        //●	metodu stampaj koja stampa podatke u formatu
        //			ime prezime, jmbg
        //
        //
        //		Kreirati klasu Student koja nasledjuje klasu Osoba,
        //			koja od dodatnih atributa ima:
        //●	broj indeksa
        //●	dug za skolarinu
        //●	konstuktor sa parametrima
        //●	difoltni konstuktor
        //●	metodu uplati skolarinu koja umanjuje dug za prosledjenu vrednost. Metoda prima iznos uplate kao parametar metode.
        //●	Napisati metod stampajStudenta da stampa sve podatke o studentu
        //
        //
        //Kreirati klasu Profesor koja nasledjuje klasu Osoba,
        //			koja od dodatnih atributa ima:
        //●	naziv predmeta koji predaje
        //●	iznos plate
        //●	konstuktor sa parametrima
        //●	difoltni konstuktor
        //●	metodu povecaj platu. Metoda kao parametar prima procenat povecanja.
        //●	Napisati metodu stampajProfu da stampa sve podatke o profesoru
        //
        //
        //		U glavnom programu kreirati 2 studenta i 2 profesora.
        //
        //●	Prilagodite konstuktore
        //●	Overide-tujte metodu za stampu iz osnovne klase
        Studnet student1= new Studnet("Marko Uskokovic", "1235123123", 1198, 54645);
        Studnet student2= new Studnet("Marija Nestorovic", "12953192123", 10698, 134090);

        Profesor profesor1= new Profesor("Milutin Vrsava", "86323421235", "Sociologija", 145500);
        Profesor profesor2= new Profesor("Marta Bogicevic", "96412412312", "Kvantna fizika", 190430);

        profesor1.povecajPlatu(20);
        student2.smanjiSkolarnu(45000);

        student1.stampaj();
        student2.stampaj();
        profesor1.stampaj();
        profesor2.stampaj();
    }
}
