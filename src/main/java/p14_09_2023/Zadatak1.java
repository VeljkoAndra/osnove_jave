package p14_09_2023;

public class Zadatak1 {
    public static void main(String[] args) {
        Pasta pasta= new Pasta();


        Sastojak sastojak1 = new Sastojak("Spagete", 156.8);
        Sastojak sastojak2 = new Sastojak("junece meso", 567.9);
        Sastojak sastojak3 = new Sastojak("so", 10);
        Sastojak sastojak4 = new Sastojak("Zejtin", 68.2);
        Sastojak sastojak5 = new Sastojak("Biber", 4.8);

        pasta.dodajSastojak(sastojak1);
        pasta.dodajSastojak(sastojak2);
        pasta.dodajSastojak(sastojak3);
        pasta.dodajSastojak(sastojak4);
        pasta.dodajSastojak(sastojak5);

        pasta.stapmanje();
        System.out.println();

        pasta.brisanje("Biber");
        pasta.stapmanje();
    }
}
