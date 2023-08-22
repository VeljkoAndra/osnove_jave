package p21_08_2023;

import java.util.Scanner;

public class Zadatak9Vezbanje {
    public static void main(String[] args) {
        //(Za vezbanje) Napisati program koji za sve petocifene brojeve radi mirror opciju.
        //Primer izvrsenja:
        //Unesite broj: 32492
        //Novi broj je 29423
        Scanner s = new Scanner(System.in);
        System.out.print("Unesite petocifren broj: ");
        int broj = s.nextInt();


        for (int i = 0; i < 5; i++) {
            int cifra = broj % 10;
            broj = broj / 10;
            System.out.print(cifra);
        }
    }
}