package p24_08_2023;

import java.util.ArrayList;

public class Zadatak7 {
    public static void main(String[] args) {
//         Napisati program koji simulira digitalni meni za pasta bar. Program ima dva niza informacija paste i cene. Program stampa meni u formatu
//naziv paste ………………………….cena rsd
//Informacije su uparene po poziciji, to znaci da se je:
//pasta na poziciji 0, sa cenom sa pozicije 0
//pasta na poziciji 1, sa cenom sa pozicije 1
//…..
//
//Primer izvrsenja:
//AGLIO E OLIO ………………… 500 rsd
//PRIMAVERA…………………340 rsd
//ARRABBIATA ………………….420 rsd
//NAPOLITANA ………………….440 rsd
//POLLO E SPINACI ………………….550 rsd
//
        ArrayList<String> naziv_paste = new ArrayList<>();

        naziv_paste.add("AGLIO E OLIO"); // poz 0
        naziv_paste.add("PRIMAVERA"); // poz 1
        naziv_paste.add("ARRABBIATA"); // poz 2
        naziv_paste.add("NAPOLITANA"); // poz 3
        naziv_paste.add("POLLO E SPINACI");

        ArrayList<Integer> cene = new ArrayList<>();
        cene.add(10); // poz 0
        cene.add(20); // poz 1
        cene.add(30); // poz 2
        cene.add(40); // poz 3
        cene.add(50);

for (int i = 0 ; i < naziv_paste.size(); i++){
    String x = naziv_paste.get(i);
       int y=cene.get(i);
    System.out.println(x+"........................"+y);
}







    }
}
