package p25_08_2023;

import java.util.Scanner;

public class Zadatak6 {
    public static void main(String[] args) {
        //Napisati metodu koja vraca suprotno negativni broj od prosledjenog. Metoda prima broj N i vraca ga sa negativnom vrednoscu.
        //Primer: Ako se metoda pozove za N=10, vraca -10
        //	Ako se metoda pozove za N=-11, vraca 11
        Scanner s = new Scanner(System.in);
        System.out.print("Unesite broj N: ");
        int x = s.nextInt();
        System.out.println( number(x));



    }

    public static int number(int broj1){
        return -broj1;
    }





}
