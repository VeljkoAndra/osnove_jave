package p18_08_2023;

import java.util.Scanner;

public class Zadatak7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //Napisati program koji od korisnika ucitava jacinu zvuka (od 0 do 10) i stampa slikicu za zvuk sa brojem crtica koje je korisnik uneo.
//Primer izvrsenja;
//Unesite jacinu zvuka: 8
//< | | | | | | | |
        System.out.println("Unesite jacinu zvuka: ");
        int a = s.nextInt();
        System.out.print("<");

        for (int i = 0 ;i < a; i++) {
            System.out.print("|");
    }


    }

}
