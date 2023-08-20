package d17_08_2023;

import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //Napisati program koji proverava da li je kliknuto u okviru login forme za web stranicu. Korisnik unosi x i y koordinate za T1, T2 i M. Ispisati odgovarajuce poruke.
        //T1 i T2 su pozicije login forme. M je pozicija na koju je kliknuto
        //Primer izvrsenja 1:                   Primer izvrsenja 2:
        //Unesite x za T1: 10                   Unesite x za T1: 10
        //Unesite y za T1: 100                  Unesite y za T1: 100
        //Unesite x za T2: 100                  Unesite x za T2: 100
        //Unesite y za T2: 0                    Unesite y za T2: 0
        //Unestie x za M: 50                    Unestie x za M: 120
        //Unesite y za M: 50                    Unesite y za M: 50
        //Kliknuto je unutar forme              Nije kliknuto je unutar forme
        System.out.print("Unesite vrednost za t1x: ");
int t1x = s.nextInt();

        System.out.print("Unesite vrednost za t1y: ");
int t1y = s.nextInt();

        System.out.print("Unesite vrednost za t2x: ");
int t2x = s.nextInt();

        System.out.print("Unesite vrednost za t2y: ");
int t2y = s.nextInt();

        System.out.print("Unesite vrednost za mx: ");
int mx = s.nextInt();

        System.out.print("Unesite vrednost za my: ");
int my = s.nextInt();


if ((t1x >= 0 && t1x <= 100) && (t1y >= 0 && t1y<=100) && (t2x >= 0 && t2x <=100) && (t2y >= 0 &&t2y <= 100) && (mx >= 0 &&mx <=100) && (my >= 0 &&my <=100)){
            System.out.println("Klinuto je unutar forme.");
        } else {System.out.println("Nije kliknuto unutar forme.");}





    }
}
