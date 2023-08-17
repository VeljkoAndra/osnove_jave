package p17_08_2023;

import java.util.Scanner;

public class UvodScanner {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        //int b = s.nextInt();

        System.out.println("Unesite ime: ");
       String ime = s.next ();
        System.out.println("Unesite prezime: ");
        String prezime =s.next();
        System.out.println("Unesite kilazu: ");
        double kg = s.nextDouble();
        System.out.println("Unesite da li ste aktivni: ");
        boolean aktivan = s.hasNextBoolean();

        System.out.println("IME: " + ime);
        System.out.println("PREZIME: " + prezime);
        System.out.println("KILAZA: " + kg);
        System.out.println("AKTIVNOST: "+ aktivan);

    }
}
