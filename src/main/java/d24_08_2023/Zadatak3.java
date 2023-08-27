package d24_08_2023;

import java.util.ArrayList;

public class Zadatak3 {
    public static void main(String[] args) {
//Zadatak
//Napisati progam koji stampa niz u obrnutom redosledu tj. od zadnjeg elementa do nultog.
//Ako je niz 1,2,4,5,7, stampa se 7,5,4,2,1
        ArrayList<Integer> brojevi = new ArrayList<>();
        brojevi.add(10);
        brojevi.add(20);
        brojevi.add(30);
        brojevi.add(40);
        brojevi.add(50);
        brojevi.add(60);
        brojevi.add(70);

        for (int i = brojevi.size() - 1; i >= 0; i--) {
            if (i > 0) {
                System.out.print(brojevi.get(i) + ", ");
            } else {
                System.out.println(brojevi.get(i));
            }
        }





    }
}
