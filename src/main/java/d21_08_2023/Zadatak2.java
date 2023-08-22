package d21_08_2023;

import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {
        //2.	Napisati program koji ucitava N brojeva od korisnika i sabira samo trocifrene brojeve.
        //Unesite N: 5
        //Unesite broj: 1
        //Unesite broj: 32
        //Unesite broj: 121
        //Unesite broj: 1333
        //Unesite broj: 144
        //Suma je: 265

        Scanner s = new Scanner(System.in);
        System.out.print("Upisite broj N: ");
        int N = s.nextInt();

int suma = 0;
        for (int i =0;i<N;i++){
            System.out.print("Unesite broj: ");
            int x =s.nextInt();
            if (x>=100 && x<1000) {suma= suma + x;}
        }

        System.out.println("Suma je: " + suma);


    }
}
