package p17_08_2023;

import java.util.Scanner;

public class Zadatak8 {
    public static void main(String[] args) {
        //Napisati program koji ucitava stranice trougla a, b i c i ispisuje da li je trougao pravougli. Trougao je pravougli ako je
        //
        //Primer izvrsenja 1:
        //Unesite a: 3
        //Unesite b: 4
        //Unesite c: 5
        //Trougao je pravougli
        //
        //Primer izvrsenja 2:
        //Unesite a: 3
        //Unesite b: 4
        //Unesite c: 6
        //Trougao nije pravougli

        Scanner s = new Scanner(System.in);
        int a=s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();

        int a1= a*a;
        int b1= b*b;

        int c1 = c*c;


        if (a1 + b1 == c1)
        {
            System.out.println("Torugao je pravougli");
        }
        else
        {
            System.out.println("Torugao nije pravougli");
        }
    }
}
