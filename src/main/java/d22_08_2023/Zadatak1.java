package d22_08_2023;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
        //1.	Napisati program koji sabira brojeve koje korisnik unosi, pritom da suma ne predje 100.Na kraju programa ispisati sracunatu sumu.
        //Unesite vrednost: 20
        //Unesite vrednost: 50
        //Unesite vrednost: 50
        //Prekoracenje! Kraj programa. Sracunata suma je 70.

        Scanner s = new Scanner(System.in);
        int suma = 0;
        boolean kraj = true;

        while (kraj == true) {
            System.out.println("Unesite broj: ");
            int broj = s.nextInt();

            if (suma + broj < 100) {
                suma = suma + broj;
            } else {
                kraj = false;
            }
        }
        System.out.println("Prekoracenje! Kraj programa. Sracunata suma je " + suma);









    }
}
