package d25_08_2023;

import java.util.Scanner;

public class Zadatak7 {
    public static void main(String[] args) {
        //7.	Napisati funkciju koja za tri prosledjena broja vraca najmanji od ta 3. U glavnom programu iskoristi funkciju i ispisti odgovarajucu poruku.
        //
        //Ako se proslede brojevi 4,6,1 u poziv metode, metoda vraca 1
        //Ako se proslede brojevi 4,6,33 u poziv metode, metoda vraca 4
        Scanner s = new Scanner(System.in);

        System.out.print("Unesite broj 1: ");
        int x = s.nextInt();
        System.out.print("Unesite broj 2: ");
        int y = s.nextInt();
        System.out.print("Unesite broj 3: ");
        int z = s.nextInt();

        System.out.println(theSmallestNumber(x,y,z));
    }
    public static int theSmallestNumber(int broj1, int broj2, int broj3) {
        int najmanjiBroj = broj1;
        if (broj2 < broj1) { najmanjiBroj=broj2;
            System.out.println("Nasjmanji broj je broj :" + broj2);
        } else if(broj3< broj1) {najmanjiBroj=broj3;
            System.out.println("Najmanji broj je broj: " + broj3);
        } else {
            System.out.println("Najmanji broj je broj: " + broj1);
        }
        return najmanjiBroj;
    }
}
