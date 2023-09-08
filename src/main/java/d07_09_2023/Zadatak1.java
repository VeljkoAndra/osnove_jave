package d07_09_2023;

public class Zadatak1 {
    public static void main(String[] args) {
        //Napišite klasu "Student" koja ima sledeće atribute: ime (String), brojIndeksa (int) i fakultet (String). Kreirajte 2-3 objekta ove klase u glavnoj metodi i postavite im vrednosti. Ispisati informacije o studentima.

   Student student1 = new Student();
   student1.ime = "Marko Petrovic";
   student1.brojIndeksa = 1456;
   student1.imeFakulteta = "Elektronski fakultet.";

        Student student2 = new Student();
        student2.ime = "Petar Markovic";
        student2.brojIndeksa = 10978;
        student2.imeFakulteta = "Prirodno-matematicki faklutet.";

        Student student3 = new Student();
        student3.ime = "Mirko Mirkovic";
        student3.brojIndeksa = 10759;
        student3.imeFakulteta = "Pravni fakultet.";

        System.out.println("Ime studenta: " + student1.ime +", "+ "Broj indeksa: "+ student1.brojIndeksa+", "+ "Ime fakulteta: "+ student1.imeFakulteta);
        System.out.println("Ime studenta: " + student2.ime +", "+ "Broj indeksa: "+ student2.brojIndeksa+", "+ "Ime fakulteta: "+ student2.imeFakulteta);
        System.out.println("Ime studenta: " + student3.ime +", "+ "Broj indeksa: "+ student3.brojIndeksa+", "+ "Ime fakulteta: "+ student3.imeFakulteta);
    }
}
