package d22_08_2023;

import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {
//        2.	Napisati program koji ucitava brojeva od korisnika i za svaki broj prikazuje apsolutnu vrednost sve dok se ne unese nula.
//        Pomoc: Apsolutna vrednost je kada bilo koji broj pretvarate u pozitivan broj. Npr: -2 u 2 ili -4 u 4 dok pozitivni ostaju pozitivni npr: 9 ostaje 9
//        Primer izvrsenja:
//        Unesite broj: 3
//        Apsolutna vrednost je 3
//        Unesite broj: -1
//        Apsolutna vrednost je 1
//        Unesite broj: 0
//        Kraj programa jer je uneta nula.
        Scanner s = new Scanner(System.in);
        int unos = -1;
        boolean isZero = true;

        while (unos > 0 || unos < 0) {
            System.out.println("Unesite vrednost(ili 0 za izlazak): ");
            unos = s.nextInt();

            if (unos == 0) {
                isZero = true;
            }

            if (unos > 0) {
                System.out.println("Apsolutna vrednost je: " + unos);
            }

            int abs = unos;
            if (unos < 0) {
                abs = -unos;
                System.out.println("Apsolutna vrednost je: " + abs);
            }

        }
        System.out.println("Kraj programa");






    }
}
