package p17_08_2023;

import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//Napisati program koji ispisuje da li je broj b manji od broja a. A i B unosimo sa tastature.
//Primer izvrsenja:
//Unesite a: 1
//Unesite b: 4
//
//Primer izvrsenja 2:
//Unesite a: 5
//Unesite b: 2
//B je manje.
        System.out.println("Unesite a: ");
        int a = s.nextInt();
        System.out.println("Unesite b");
        int b = s.nextInt();

        System.out.println();
        if (b < a) {
            System.out.println("b je manje od a");
        }
        System.out.println();

    }
}
