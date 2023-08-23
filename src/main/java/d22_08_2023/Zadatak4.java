package d22_08_2023;

import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {
        //4.	Napisati program koji od korisnika ucitava brojeve sve dok ne unesu bar dve dvojke ili tri jedinice.
        //Primer izvrsenja 1:
        //Unesite broj:1
        //Unesite broj:2
        //Unesite broj:0
        //Unesite broj:2
        //Kraj programa.
        //(Objasnjenje: Kraj jer je uneto dve dvojke)
        //
        //Primer izvrsenja 1:
        //Unesite broj:1
        //Unesite broj:2
        //Unesite broj:1
        //Unesite broj:3
        //Unesite broj:1
        //Kraj programa.
        //(Objasnjenje: Kraj jer je uneto tri jedinice)
        Scanner scanner = new Scanner(System.in);
int broj2= 0;
int broj1= 0;

while (broj2<2 && broj1<3){
    System.out.print("Unesi broj: ");
    int broj= scanner.nextInt();

    if (broj==2) {
        broj2++;
    } else if (broj==1) {
        broj1++;
    }

}
        System.out.println("Kraj programa.");





    }
}
