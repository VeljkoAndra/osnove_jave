package p25_08_2023;

import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);

        System.out.print("Unesite broj N: ");
        int N = s.nextInt();
        for (int i = 1; i <= N; i++) {
            star(i);
        }

    }

    public static void star(int broj1){

        for (int i = 0; i <broj1; i++) {
            System.out.print("* ");
        }
        System.out.println();
    }


}
