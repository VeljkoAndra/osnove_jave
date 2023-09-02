package mini_project;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {
        //5.	**Zadatak: Generisanje Random Passworda sa Specijalnim Karakterom**
        //
        //Kako biste saznali više o generisanju random brojeva u programiranju, preporučujemo da istražite sledeći link: random koristeci Random class. Ovaj resurs će vam pružiti detaljnije razumevanje kako programi generišu slučajne brojeve i kako ih možete koristiti u različitim situacijama.
        //
        //Napišite program koji simulira automatsko generisanje random passworda. Korisnik će uneti željenu dužinu passworda, a program će kreirati i ispisati password koji zadovoljava te parametre. Ovaj zadatak zahteva implementaciju različitih metoda za generisanje karaktera i passworda.
        //●	generisiRandomKarakter: Ova metoda generiše i vraća random karakter. Metoda koristi niz stringova sa elementima koji predstavljaju mala slova, velika slova i brojeve (niz je sa fiksnim vrednostima). Random bira jedan element iz niza i vraća ga kao povreatnu vrednost (string). Ova metoda nema ulazne parametre.
        //●	generisiRandomSpecijalanKarakter: Ova metoda generiše i vraća random specijalan karakter. Metoda koristi niz stringova sa elementima `@`, `#`, `&`, `*` i `!` (niz je sa fiksnim vrednostima). Random bira jedan element iz niza i vraća ga kao string. Ova metoda nema ulazne parametre.
        //
        //Napomena: Metode generisiRandomSpecijalanKarakter generisiRandomKarakter nemaju nikakvu stampu u sebi!
        //
        //Glavni program:
        //   - Korisnik unosi dužinu passworda i informaciju da li treba sadržati specijalan karakter.
        //   - Koristeći metodu `generisiPassword`, program generiše i ispisuje password.
        //
        //Primer izvršenja 1:
        //Unesite dužinu passworda: 10
        //Da li želite da sadrži specijalan karakter: true
        //Generisan password: eD9Kx0e@
        //
        //Primer izvršenja 2:
        //Unesite dužinu passworda: 10
        //Da li želite da sadrži specijalan karakter: false
        //Generisan password: eCxdwEeFEx
        Random random = new Random();
        Scanner s = new Scanner(System.in);
        System.out.print("Unesite zeljenu duzinu passworda: ");
        int duzina = s.nextInt();
        System.out.println("Da li želite da sadrži specijalan karakter: ");
        boolean specKarakter = s.nextBoolean();


        System.out.println(generisiPassword(duzina, specKarakter));


    }
    public static String generisiPassword (int duzina, boolean specKarakter) {

        String niz = "";
        if (specKarakter == true) {
            duzina = duzina - 1;
            for (int i = 0; i < duzina; i++) {
                niz = niz + randomSlovo();
            }
            niz = niz + specChar();
        } else {
            for (int i = 0; i < duzina; i++) {
                niz = niz + randomSlovo();
            }
        }
        return niz;

        }




    public static String randomSlovo (){
        Random random = new Random();
        String b = "";
        ArrayList<String> karakter = new ArrayList<>();
        karakter.add("a");karakter.add("A");karakter.add("b");karakter.add("B");karakter.add("c");karakter.add("C");karakter.add("x");karakter.add("X");karakter.add("z");karakter.add("Z");
        karakter.add("v");karakter.add("V");karakter.add("n");karakter.add("N");karakter.add("m");karakter.add("M");karakter.add("s");karakter.add("S");karakter.add("d");karakter.add("D");
        karakter.add("f");karakter.add("F");karakter.add("g");karakter.add("G");karakter.add("h");karakter.add("H");karakter.add("j");karakter.add("J");karakter.add("l");karakter.add("L");
        karakter.add("q");karakter.add("Q");karakter.add("w");karakter.add("W");karakter.add("e");karakter.add("E");karakter.add("t");karakter.add("T");karakter.add("u");karakter.add("U");

 return b = karakter.get(random.nextInt(karakter.size()));



    }
    public static String specChar(){
        Random random = new Random();
        String x = "";
        ArrayList<String> specKarakter = new ArrayList<>();
        specKarakter.add("#");specKarakter.add("%");specKarakter.add("^");specKarakter.add("&");specKarakter.add("?");specKarakter.add("!");
        return x = specKarakter.get(random.nextInt(specKarakter.size()));
    }
}
