package d25_08_2023;

import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {
//2.	Napisati funkciju koja za dva jednocifrena broja koja su ulazni parametri funkcije vraca novu vrednost koja se formira kao na primeru. METODA NISTA NE STAMPA.
//ako je prvi broj =2, a drugi =3 vraca novu vrednost 23.
//ako je prvi broj =6, a drugi =2 vraca novu vrednost 62.
        Scanner s= new Scanner(System.in);

        System.out.print("Upisite zeljenu vrednost za prvi broj: ");
        int x = s.nextInt();
        System.out.print("Upisite zeljenu vrednost za drugi broj: ");
        int y = s.nextInt();

        System.out.println(numbers(x,y));
    }

    public static String numbers(int broj1, int broj2){
        String newValue;
        return newValue = "Nova vrednost je "+ broj1 +broj2;
    }
}
