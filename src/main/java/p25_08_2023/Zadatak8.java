package p25_08_2023;

import java.util.Scanner;

public class Zadatak8 {
    public static void main(String[] args) {
//Napisati metodu koja proverava da li je trougao pravougli. Metoda prima stranice trougla i hipotenuzu trougla. Ako je trougao pravougli onda vraca true, u suptrotnom vraca false.
//Trougao je pravougli ukoliko je a*a+b*b=c*c

        Scanner s = new Scanner(System.in);
        System.out.print("Unesite broj N: ");
        int x = s.nextInt();
        System.out.println( number(x));
    }

    public static String number(int broj1){
        if (broj1 == 1) {return  "I";}
        else if (broj1 == 2) {return "II";}
        else if (broj1 == 3) {return "III";}
        else if (broj1 == 4) {return "IV";}
        else if (broj1 == 5) {return "V";}
        else {return "0";}

    }
}
