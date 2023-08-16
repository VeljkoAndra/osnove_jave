package p15_08_2023;

public class Zadatak4 {
    public static void main(String[] args) {
        //Napisati program koji na ekranu stampa podatke u formatu:
        //Sifra [SIFRA PROIZVODA]
        //[NAZIV PROIZVODA]  - $[CENA] - Popust [POPUST]%
        //[BOJA], [VELICINA]
        //
        //Svaku informaciju za proizvod je potrebno cuvati u okviru zasebne promenljive.
        //
        //Primer izvrsenja:
        //Sifra x932k20
        //Nike Patike - $90 - Popust 13.5%
        //Crna, 46.5

        String sifraProizvoda = "x945c512";
        String nazivPorizovda = "Adidas patike";
        int cena = 45 ;
        double popust = 15.5;
        String boja= "Bela";
        double velicina= 45.5;

        System.out.println("Sifra" + sifraProizvoda);
        System.out.print("Naziv proizvoda: " + nazivPorizovda + " , ");
        System.out.print("Cena proizvoda: " + "%" +cena + " , ");
        System.out.println("Popust: " + popust +"%" );
        System.out.print("Boja: " + boja + " , ");
        System.out.print("Velicina: " + velicina);



    }
}
