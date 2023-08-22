package p21_08_2023;

import java.util.Scanner;

public class Zadatak10 {
    public static void main(String[] args) {
        //Napisati program koji sakriva uneti password..
        //Primer izvrsenja:
        //Unestite password: OvoJePassword123
        //Skriverni password: ****************
        Scanner s = new Scanner(System.in);

        System.out.print("Unesite sifru: ");
        String pass = s.next();
        int x= pass.length();

        System.out.print("Skriveni pasvord: ");
for (int i = 1; i <=x; i++) {
    System.out.print("*");
}






    }
}
