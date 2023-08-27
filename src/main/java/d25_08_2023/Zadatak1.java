package d25_08_2023;

import java.util.Scanner;

public class Zadatak1 {
    //1.	Napisati metodu stampajVrednostZa10Vecu u kojoj se stampa prosledjena vrednost za 10 veca.Iz main-a pozvati izvrsenje metode za razlicite vrednosti.
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Upisite zeljenu vrednost: ");
        int x = s.nextInt();


        System.out.println("Uvecana vrednost iznosi: " + number(x));

    }

    public static int number(int broj1){
        return broj1= broj1+10;

    }
}
