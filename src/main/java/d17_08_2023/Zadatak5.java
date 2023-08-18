package d17_08_2023;

import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //Napisati program koji u zavisnosti od operatora koji unosi korisnik sa tastature (operator je string i moze imati vrednosti +, - , *, /)
        // racuna  i ispisuje na ekranu odgovarajuci zbir, razliku, proizvod ili kolicnik za dva broja a i b uneta sa tastature.
        //Primer 1:                                              Primer 2:
        //Unestite a: 6                                        Unestite a: 6
        //Unesite b: 3                                         Unesite b: 3
        //Unesite operator: +                                  Unesite operator: /
        //Rezultat: 9                                          Rezultat: 2

        System.out.print("Unesite vrednost a: ");
        int a = s.nextInt();
        System.out.print("Unesite vrednost b: ");
        int b = s.nextInt();
        System.out.print("Unesite zeljeni oeprator: ");
        String operator = s.next();

        if (operator.equals("+")) {
            System.out.println("Rezultat je: " + (a +b));}
        if (operator.equals("-")) {
            System.out.println("Rezultat je: " + (a - b));}
        if (operator.equals("*")) {
                System.out.println("Rezultat je: " + (a * b));}
        if (operator.equals("/")) {
            System.out.println("Rezultat je: " + (a / b));}




    }
}