package d25_08_2023;

import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {
        //4.	Metoda prima dva parametra N i karakter za stampu. Metoda stampa N karaktera.
        //Ako se za N prosledi 5 i za karakter prosledi npr kosa crta (/) stampa se
        /// / / / /
        //Napomena: Metoda nista ne vraca.

        Scanner s = new Scanner(System.in);

        System.out.print("Unesite broj N: ");
        int N = s.nextInt();
        System.out.print("Unesite karakter za stampu: ");
        String karakter = s.next();

        System.out.println(printing(N, karakter));
    }

    public static String printing(int ponavljanja, String karakter) {
        String x = "";
        for (int i = 0; i < ponavljanja; i++) {
            x = x + karakter + " ";
        }
        return x;
    }
}
