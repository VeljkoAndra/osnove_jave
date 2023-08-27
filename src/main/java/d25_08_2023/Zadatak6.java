package d25_08_2023;

import java.util.Scanner;

public class Zadatak6 {
    public static void main(String[] args) {
//6.	Napisati funkciju koja za pronalazi koliko ima celih brojeve izmedju brojeva M i N.
//
//Primer izvrsenja:
//izbroji(5, 10) ima za rezultat 4. Kako? 5 6 7 8 9 10
//izbroji(-5, 1) ima za rezultlat 5 . Kako? -5 -4 -3 -2 -1 0 1

        Scanner s = new Scanner(System.in);

        System.out.print("Unesite broj 1: ");
        int x = s.nextInt();
        System.out.print("Unesite broj 2: ");
        int y = s.nextInt();

        System.out.println("Ukupno ima "+ counter(x, y) + " cela broja.");
    }
    public static int counter(int broj1, int broj2){

        int brojac= 0;
        for (int i =broj1+ 1; i <broj2; i ++){
                brojac++;
            }
        return brojac;
    }
}
